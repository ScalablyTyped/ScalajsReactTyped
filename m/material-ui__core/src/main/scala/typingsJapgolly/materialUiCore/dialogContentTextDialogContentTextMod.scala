package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Align
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiCore.materialUiCoreStrings.span
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTextDialogContentTextMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dialogs](https://mui.com/components/dialogs/)
    *
    * API:
    *
    * - [DialogContentText API](https://mui.com/api/dialog-content-text/)
    * - inherits [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@material-ui/core/DialogContentText/DialogContentText", JSImport.Default)
  @js.native
  val default: OverridableComponent[DialogContentTextTypeMap[js.Object, span]] = js.native
  
  type DialogContentTextClassKey = root
  
  type DialogContentTextProps[D /* <: ElementType */, P] = OverrideProps[DialogContentTextTypeMap[P, D], D]
  
  trait DialogContentTextTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: DialogContentTextClassKey
    
    var defaultComponent: D
    
    var props: P & js.Object & Align
  }
  object DialogContentTextTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: DialogContentTextClassKey, defaultComponent: D, props: P & js.Object & Align): DialogContentTextTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentTextTypeMap[P, D]]
    }
    
    extension [Self <: DialogContentTextTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (DialogContentTextTypeMap[P, D])) {
      
      inline def setClassKey(value: DialogContentTextClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & js.Object & Align): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[DialogContentTextTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `dialogContentTextDialogContentTextMod.foo` */
  override def _to: OverridableComponent[DialogContentTextTypeMap[js.Object, span]] = default
}
