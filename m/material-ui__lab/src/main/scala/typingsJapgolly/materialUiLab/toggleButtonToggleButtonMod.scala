package typingsJapgolly.materialUiLab

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.materialUiLab.anon.DefaultComponent
import typingsJapgolly.materialUiLab.materialUiLabStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonToggleButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/lab/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiLab.materialUiLabStrings.root
    - typingsJapgolly.materialUiLab.materialUiLabStrings.disabled
    - typingsJapgolly.materialUiLab.materialUiLabStrings.selected
    - typingsJapgolly.materialUiLab.materialUiLabStrings.label
    - typingsJapgolly.materialUiLab.materialUiLabStrings.sizeSmall
    - typingsJapgolly.materialUiLab.materialUiLabStrings.sizeLarge
  */
  trait ToggleButtonClassKey extends StObject
  object ToggleButtonClassKey {
    
    inline def disabled: typingsJapgolly.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.disabled]
    
    inline def label: typingsJapgolly.materialUiLab.materialUiLabStrings.label = "label".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.label]
    
    inline def root: typingsJapgolly.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.root]
    
    inline def selected: typingsJapgolly.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.selected]
    
    inline def sizeLarge: typingsJapgolly.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.sizeLarge]
    
    inline def sizeSmall: typingsJapgolly.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.sizeSmall]
  }
  
  type ToggleButtonProps[D /* <: ElementType */, P] = OverrideProps[ToggleButtonTypeMap[P, D], D]
  
  type ToggleButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[DefaultComponent[P, D]]
  
  type _To = ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `toggleButtonToggleButtonMod.foo` */
  override def _to: ExtendButtonBase[ToggleButtonTypeMap[js.Object, button]] = default
}
