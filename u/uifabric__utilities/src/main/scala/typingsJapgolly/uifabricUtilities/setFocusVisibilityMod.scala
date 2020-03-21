package typingsJapgolly.uifabricUtilities

import org.scalajs.dom.raw.Element
import typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.`ms-Fabric--isFocusHidden`
import typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.`ms-Fabric--isFocusVisible`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/setFocusVisibility", JSImport.Namespace)
@js.native
object setFocusVisibilityMod extends js.Object {
  val IsFocusHiddenClassName: `ms-Fabric--isFocusHidden` = js.native
  val IsFocusVisibleClassName: `ms-Fabric--isFocusVisible` = js.native
  def setFocusVisibility(enabled: Boolean): Unit = js.native
  def setFocusVisibility(enabled: Boolean, target: Element): Unit = js.native
}

