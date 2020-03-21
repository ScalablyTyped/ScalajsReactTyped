package typingsJapgolly.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.mod.DevExpress.animationConfig
import typingsJapgolly.devextreme.mod._Global_.JQueryPromise
import typingsJapgolly.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "fx")
@js.native
object fx extends js.Object {
  def animate(element: Element, config: animationConfig): Promise[Unit] with JQueryPromise[Unit] = js.native
  def isAnimating(element: Element): Boolean = js.native
  def stop(element: Element, jumpToEnd: Boolean): Unit = js.native
}

