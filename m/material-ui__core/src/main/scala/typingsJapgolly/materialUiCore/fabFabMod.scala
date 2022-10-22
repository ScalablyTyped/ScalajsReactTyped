package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyFabClassKeyDefaultComponentD
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabFabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Floating Action Button](https://mui.com/components/floating-action-button/)
    *
    * API:
    *
    * - [Fab API](https://mui.com/api/fab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Fab/Fab", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[FabTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.label
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.extended
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeMedium
  */
  trait FabClassKey extends StObject
  object FabClassKey {
    
    inline def colorInherit: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def extended: typingsJapgolly.materialUiCore.materialUiCoreStrings.extended = "extended".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.extended]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def label: typingsJapgolly.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.label]
    
    inline def primary: typingsJapgolly.materialUiCore.materialUiCoreStrings.primary = "primary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.primary]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def secondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary]
    
    inline def sizeMedium: typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeMedium = "sizeMedium".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeMedium]
    
    inline def sizeSmall: typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall]
  }
  
  type FabProps[D /* <: ElementType */, P] = OverrideProps[FabTypeMap[P, D], D]
  
  type FabTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyFabClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[FabTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `fabFabMod.foo` */
  override def _to: ExtendButtonBase[FabTypeMap[js.Object, button]] = default
}
