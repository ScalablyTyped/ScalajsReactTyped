package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyTabClassKeyDefaultComponentD
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tab API](https://mui.com/api/tab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/Tab/Tab", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[TabTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.labelIcon
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorInherit
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.selected
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapped
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapper
  */
  trait TabClassKey extends StObject
  object TabClassKey {
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def fullWidth: typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fullWidth]
    
    inline def labelIcon: typingsJapgolly.materialUiCore.materialUiCoreStrings.labelIcon = "labelIcon".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.labelIcon]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typingsJapgolly.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.selected]
    
    inline def textColorInherit: typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorInherit = "textColorInherit".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorInherit]
    
    inline def textColorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorPrimary = "textColorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorPrimary]
    
    inline def textColorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorSecondary = "textColorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.textColorSecondary]
    
    inline def wrapped: typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapped = "wrapped".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapped]
    
    inline def wrapper: typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapper = "wrapper".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapper]
  }
  
  type TabProps[D /* <: ElementType */, P] = OverrideProps[TabTypeMap[P, D], D]
  
  type TabTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyTabClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[TabTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `tabTabMod.foo` */
  override def _to: ExtendButtonBase[TabTypeMap[js.Object, div]] = default
}
