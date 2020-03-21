package typingsJapgolly.cesium.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "CreditDisplay")
@js.native
class CreditDisplay protected () extends js.Object {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: String) = this()
  def this(container: HTMLElement, delimiter: String, viewport: HTMLElement) = this()
  var container: HTMLElement = js.native
  def addCredit(credit: Credit): Unit = js.native
  def addDefaultCredit(credit: Credit): Unit = js.native
  def beginFrame(credit: Credit): Unit = js.native
  def destroy(): Unit = js.native
  def endFrame(credit: Credit): Unit = js.native
  def isDestroyed(): Boolean = js.native
  def removeDefaultCredit(credit: Credit): Unit = js.native
  def update(): Unit = js.native
}

/* static members */
@JSImport("cesium", "CreditDisplay")
@js.native
object CreditDisplay extends js.Object {
  var cesiumCredit: Credit = js.native
}

