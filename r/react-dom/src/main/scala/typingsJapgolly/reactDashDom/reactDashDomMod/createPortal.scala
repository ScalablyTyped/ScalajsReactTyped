package typingsJapgolly.reactDashDom.reactDashDomMod

import typingsJapgolly.react.reactMod.ReactNode
import typingsJapgolly.react.reactMod.ReactPortal
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "createPortal")
@js.native
object createPortal extends js.Object {
  def apply(children: ReactNode, container: Element): ReactPortal = js.native
  def apply(children: ReactNode, container: Element, key: String): ReactPortal = js.native
}

