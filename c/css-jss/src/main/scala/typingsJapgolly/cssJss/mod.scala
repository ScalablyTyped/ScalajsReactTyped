package typingsJapgolly.cssJss

import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.JssStyle
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-jss", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val create: CreateCss = js.native
  val default: ReturnType[CreateCss] = js.native
  type CreateCss = js.Function1[/* jss */ js.UndefOr[Jss], Css]
  type Css = js.Function1[/* repeated */ StyleArg, String]
  type StyleArg = JssStyle | js.Array[JssStyle]
}

