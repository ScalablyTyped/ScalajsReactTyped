package typingsJapgolly.feathersjsExpress

import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.bodyParser.mod.OptionsUrlencoded
import typingsJapgolly.connect.mod.NextHandleFunction
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.RouterOptions
import typingsJapgolly.expressServeStaticCore.mod.Handler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.feathersjsFeathers.mod.Application
import typingsJapgolly.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofself extends js.Object {
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("json")
  var json_Original: FnCall = js.native
  @JSName("rest")
  val rest_Original: AnonCall = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSName("static")
  var static_Original: AnonMime = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSName("urlencoded")
  var urlencoded_Original: FnCallOptions = js.native
  def Router(): typingsJapgolly.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typingsJapgolly.expressServeStaticCore.mod.Router = js.native
  def default[T](app: Application[T]): typingsJapgolly.feathersjsExpress.mod.Application[T] = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary] = js.native
  def errorHandler(options: AnonHtml): ErrorRequestHandler[ParamsDictionary] = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  def json(options: OptionsJson): NextHandleFunction = js.native
  def notFound(): RequestHandler[ParamsDictionary] = js.native
  def rest(): js.Function0[Unit] = js.native
  def rest(handler: RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  def static(root: String, options: ServeStaticOptions): Handler = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(): NextHandleFunction = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
}

