package typingsJapgolly.uifabricStyling

import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.uifabricMergeStyles.libIrawstyleMod.IRawStyle
import typingsJapgolly.uifabricStyling.libInterfacesIgetfocusstylesMod.IGetFocusStylesOptions
import typingsJapgolly.uifabricStyling.uifabricStylingStrings.absolute
import typingsJapgolly.uifabricStyling.uifabricStylingStrings.border
import typingsJapgolly.uifabricStyling.uifabricStylingStrings.borderBottom
import typingsJapgolly.uifabricStyling.uifabricStylingStrings.relative
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesGetFocusStyleMod {
  
  @JSImport("@uifabric/styling/lib/styles/getFocusStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def focusClear(): IRawStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("focusClear")().asInstanceOf[IRawStyle]
  
  inline def getFocusOutlineStyle(theme: ITheme): IRawStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any]).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Unit, color: String): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Unit, width: Double): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Unit, width: Double, color: String): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusOutlineStyle(theme: ITheme, inset: Unit, width: Unit, color: String): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusOutlineStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], width.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  
  inline def getFocusStyle(theme: ITheme): IRawStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusStyle")(theme.asInstanceOf[js.Any]).asInstanceOf[IRawStyle]
  inline def getFocusStyle(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative | absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusStyle")(theme.asInstanceOf[js.Any], inset.asInstanceOf[js.Any], position.asInstanceOf[js.Any], highContrastStyle.asInstanceOf[js.Any], borderColor.asInstanceOf[js.Any], outlineColor.asInstanceOf[js.Any], isFocusedOnly.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusStyle")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  
  inline def getInputFocusStyle(borderColor: String, borderRadius: String): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(borderColor: String, borderRadius: String, borderType: border | borderBottom): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(
    borderColor: String,
    borderRadius: String,
    borderType: border | borderBottom,
    borderPosition: Double
  ): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderPosition.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(borderColor: String, borderRadius: String, borderType: Unit, borderPosition: Double): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderPosition.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(borderColor: String, borderRadius: Double): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(borderColor: String, borderRadius: Double, borderType: border | borderBottom): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(
    borderColor: String,
    borderRadius: Double,
    borderType: border | borderBottom,
    borderPosition: Double
  ): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderPosition.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
  inline def getInputFocusStyle(borderColor: String, borderRadius: Double, borderType: Unit, borderPosition: Double): IRawStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getInputFocusStyle")(borderColor.asInstanceOf[js.Any], borderRadius.asInstanceOf[js.Any], borderType.asInstanceOf[js.Any], borderPosition.asInstanceOf[js.Any])).asInstanceOf[IRawStyle]
}
