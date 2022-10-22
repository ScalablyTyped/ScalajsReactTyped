package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyStepButtonClasskey
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonStepButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Steppers](https://mui.com/components/steppers/)
    *
    * API:
    *
    * - [StepButton API](https://mui.com/api/step-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/StepButton/StepButton", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[StepButtonTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.touchRipple
  */
  trait StepButtonClasskey extends StObject
  object StepButtonClasskey {
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def touchRipple: typingsJapgolly.materialUiCore.materialUiCoreStrings.touchRipple = "touchRipple".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.touchRipple]
    
    inline def vertical: typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical]
  }
  
  type StepButtonIcon = Node
  
  type StepButtonProps[D /* <: ElementType */, P] = OverrideProps[StepButtonTypeMap[P, D], D]
  
  type StepButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyStepButtonClasskey[P, D]]
  
  type _To = ExtendButtonBase[StepButtonTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonStepButtonMod.foo` */
  override def _to: ExtendButtonBase[StepButtonTypeMap[js.Object, button]] = default
}
