package typingsJapgolly.reactDom

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/node-stream", JSImport.Namespace)
@js.native
object nodeStreamMod extends js.Object {
  val version: String = js.native
  def renderToStaticStream(element: Element): js.Any = js.native
  def renderToStream(element: Element): js.Any = js.native
}

