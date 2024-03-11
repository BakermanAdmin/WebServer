import zio._
import zio.http._

object WebHttpServer extends ZIOAppDefault {

  val app: HttpApp[Any] =
    Routes(
      Method.GET / "text" -> handler(Response.text("Welcome to MASTER CONTROL program. Don't get ERASED. HAHA!\n\n"))
    ).toHttpApp

  override val run =
    Server.serve(app).provide(Server.default)
}