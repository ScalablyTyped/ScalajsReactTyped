package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyIconButtonClassKey
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonMod extends Shortcut {
  
  /**
    * Refer to the [Icons](https://mui.com/components/icons/) section of the documentation
    * regarding the available icon options.
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/IconButton/IconButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[IconButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.edgeStart
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.edgeEnd
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.label
  */
  trait IconButtonClassKey extends StObject
  object IconButtonClassKey {
    
    inline def colorInherit: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def colorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def edgeEnd: typingsJapgolly.materialUiCore.materialUiCoreStrings.edgeEnd = "edgeEnd".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.edgeEnd]
    
    inline def edgeStart: typingsJapgolly.materialUiCore.materialUiCoreStrings.edgeStart = "edgeStart".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.edgeStart]
    
    inline def label: typingsJapgolly.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.label]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def sizeSmall: typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.sizeSmall]
  }
  
  type IconButtonProps[D /* <: ElementType */, P] = OverrideProps[IconButtonTypeMap[P, D], D]
  
  type IconButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyIconButtonClassKey[P, D]]
  
  type _To = ExtendButtonBase[IconButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonIconButtonMod.foo` */
  override def _to: ExtendButtonBase[IconButtonTypeMap[js.Object, button]] = default
}
