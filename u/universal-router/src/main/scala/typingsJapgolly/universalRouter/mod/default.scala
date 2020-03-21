package typingsJapgolly.universalRouter.mod

import typingsJapgolly.pathToRegexp.mod.Key
import typingsJapgolly.pathToRegexp.mod.ParseOptions
import typingsJapgolly.pathToRegexp.mod.Path
import typingsJapgolly.pathToRegexp.mod.RegExpOptions
import typingsJapgolly.universalRouter.AnonCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router", JSImport.Default)
@js.native
class default[C /* <: Context */, R] protected () extends UniversalRouter[C, R] {
  def this(routes: Route[C, R]) = this()
  def this(routes: Routes[C, R]) = this()
  def this(routes: Route[C, R], options: Options[C, R]) = this()
  def this(routes: Routes[C, R], options: Options[C, R]) = this()
}

/* static members */
@JSImport("universal-router", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("pathToRegexp")
  var pathToRegexp_Original: AnonCall = js.native
  def pathToRegexp(path: Path): js.RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key]): js.RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): js.RegExp = js.native
}

