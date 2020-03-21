package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.spinButtonTypesMod.ISpinButtonStyles
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", JSImport.Namespace)
@js.native
object spinButtonStylesMod extends js.Object {
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean): IButtonStyles = js.native
  def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean, customSpecificArrowStyles: PartialIButtonStyles): IButtonStyles = js.native
  def getStyles(theme: ITheme): ISpinButtonStyles = js.native
  def getStyles(theme: ITheme, customStyles: PartialISpinButtonStyles): ISpinButtonStyles = js.native
}

