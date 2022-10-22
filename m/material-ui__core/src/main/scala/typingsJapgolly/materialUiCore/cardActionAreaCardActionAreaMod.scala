package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyCardActionAreaClassKey
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaCardActionAreaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardActionArea API](https://mui.com/api/card-action-area/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/CardActionArea/CardActionArea", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusHighlight
  */
  trait CardActionAreaClassKey extends StObject
  object CardActionAreaClassKey {
    
    inline def focusHighlight: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusHighlight = "focusHighlight".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusHighlight]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type CardActionAreaProps[D /* <: ElementType */, P] = OverrideProps[CardActionAreaTypeMap[P, D], D]
  
  type CardActionAreaTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyCardActionAreaClassKey[P, D]]
  
  type _To = ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionAreaCardActionAreaMod.foo` */
  override def _to: ExtendButtonBase[CardActionAreaTypeMap[js.Object, button]] = default
}
