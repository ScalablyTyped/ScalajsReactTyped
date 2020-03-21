package typingsJapgolly.istanbulMiddleware

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-middleware", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createClientHandler(root: String): js.Any = js.native
  def createClientHandler(root: String, opts: AnonMatcher): js.Any = js.native
  def createHandler(): js.Any = js.native
  def createHandler(opts: AnonResetOnGet): js.Any = js.native
  def hookLoader(matcherOrRoot: String): Unit = js.native
  def hookLoader(matcherOrRoot: String, opts: AnonPostLoadHook): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher): Unit = js.native
  def hookLoader(matcherOrRoot: Matcher, opts: AnonPostLoadHook): Unit = js.native
  type ClientMatcher = js.Function1[/* req */ Request_[ParamsDictionary], Boolean]
  type Matcher = js.Function1[/* file */ String, Boolean]
  type PathTransformer = js.Function1[/* req */ Request_[ParamsDictionary], String]
  type PostLoadHook = js.Function3[
    /* matcherfn */ Matcher, 
    /* transformer */ js.Any, 
    /* verbose */ Boolean, 
    PostLoadHookFn
  ]
  type PostLoadHookFn = js.Function1[/* file */ js.Any, js.Object]
}

