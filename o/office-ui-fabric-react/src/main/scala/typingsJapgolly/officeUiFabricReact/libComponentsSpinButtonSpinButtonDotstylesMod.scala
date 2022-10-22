package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.anon.PartialIButtonStyles
import typingsJapgolly.officeUiFabricReact.anon.PartialISpinButtonStyles
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonStyles
import typingsJapgolly.officeUiFabricReact.libComponentsSpinButtonSpinButtonDottypesMod.ISpinButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSpinButtonSpinButtonDotstylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SpinButton/SpinButton.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowButtonStyles")(theme.asInstanceOf[js.Any], isUpArrow.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  inline def getArrowButtonStyles(theme: ITheme, isUpArrow: Boolean, customSpecificArrowStyles: PartialIButtonStyles): IButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getArrowButtonStyles")(theme.asInstanceOf[js.Any], isUpArrow.asInstanceOf[js.Any], customSpecificArrowStyles.asInstanceOf[js.Any])).asInstanceOf[IButtonStyles]
  
  inline def getStyles(theme: ITheme): ISpinButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[ISpinButtonStyles]
  inline def getStyles(theme: ITheme, customStyles: PartialISpinButtonStyles): ISpinButtonStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(theme.asInstanceOf[js.Any], customStyles.asInstanceOf[js.Any])).asInstanceOf[ISpinButtonStyles]
}
