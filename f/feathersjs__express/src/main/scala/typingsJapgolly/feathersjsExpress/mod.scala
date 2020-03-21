package typingsJapgolly.feathersjsExpress

import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.bodyParser.mod.OptionsUrlencoded
import typingsJapgolly.connect.mod.NextHandleFunction
import typingsJapgolly.express.Typeofm
import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.IRouterHandler
import typingsJapgolly.express.mod.RouterOptions
import typingsJapgolly.expressServeStaticCore.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.Handler
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.PathParams
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.RequestHandlerParams
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.feathersjsExpress.feathersjsExpressStrings.use
import typingsJapgolly.serveStatic.mod.ServeStaticOptions
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof express.express.Application, 'use'> ]: express.express.Application[P]}
  - Dropped {[ P in std.Exclude<keyof @feathersjs/feathers.@feathersjs/feathers.Application<T>, 'use'> ]: @feathersjs/feathers.@feathersjs/feathers.Application<T>[P]} */ @js.native
  trait Application[T] extends js.Object {
    @JSName("use")
    var use_Original: FeathersApplicationRequestHandler[T] = js.native
    def use(
      handlers: ((RequestHandler[ParamsDictionary, _, _]) | (RequestHandlerParams[ParamsDictionary, _, _]))*
    ): T = js.native
    def use(
      path: PathParams,
      handlers: ((RequestHandler[ParamsDictionary, _, _]) | (RequestHandlerParams[ParamsDictionary, _, _]) | PartialServiceMethodsanyS | Application[_])*
    ): T = js.native
  }
  
  val default: (js.Function1[/* app */ typingsJapgolly.feathersjsFeathers.mod.Application[_], Application[_]]) with Typeofself = js.native
  val original: js.Function0[Express] with Typeofexpress = js.native
  def Router(): typingsJapgolly.expressServeStaticCore.mod.Router = js.native
  def Router(options: RouterOptions): typingsJapgolly.expressServeStaticCore.mod.Router = js.native
  def errorHandler(): ErrorRequestHandler[ParamsDictionary] = js.native
  def errorHandler(options: AnonHtml): ErrorRequestHandler[ParamsDictionary] = js.native
  def notFound(): typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @js.native
  object json extends js.Object {
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsJson): NextHandleFunction = js.native
  }
  
  @js.native
  object rest extends js.Object {
    @JSName("formatter")
    var formatter_Original: typingsJapgolly.express.mod.RequestHandler[ParamsDictionary] = js.native
    def apply(): js.Function0[Unit] = js.native
    def apply(handler: typingsJapgolly.express.mod.RequestHandler[ParamsDictionary]): js.Function0[Unit] = js.native
    def formatter(req: Request[ParamsDictionary, _, _], res: Response[_], next: NextFunction): js.Any = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @js.native
  object static extends js.Object {
    var mime: Typeofm = js.native
    def apply(root: String): Handler = js.native
    def apply(root: String, options: ServeStaticOptions): Handler = js.native
    def serveStatic(root: String): Handler = js.native
    def serveStatic(root: String, options: ServeStaticOptions): Handler = js.native
  }
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @js.native
  object urlencoded extends js.Object {
    def apply(): NextHandleFunction = js.native
    def apply(options: OptionsUrlencoded): NextHandleFunction = js.native
  }
  
  // TypeScript methods cannot be overloaded with a different signature. Derive two application types without the use methods.
  type ExpressAndFeathersApplicationWithoutUse[T] = (Omit[Application_, use]) with (Omit[typingsJapgolly.feathersjsFeathers.mod.Application[T], use])
  type FeathersApplicationRequestHandler[T] = IRouterHandler[T] with FeathersRouterMatcher[T] with (js.Function1[/* repeated */ RequestHandlerParams[ParamsDictionary, _, _], T])
  type FeathersRouterMatcher[T] = js.Function2[
    /* path */ PathParams, 
    /* repeated */ (RequestHandler[ParamsDictionary, js.Any, js.Any]) | (RequestHandlerParams[ParamsDictionary, js.Any, js.Any]) | PartialServiceMethodsanyS | Application[js.Any], 
    T
  ]
  type FeathersServiceOptions = js.Any
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}

