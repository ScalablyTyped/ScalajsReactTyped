package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormFormItemInputMod extends Shortcut {
  
  @JSImport("antd/lib/form/FormItemInput", JSImport.Default)
  @js.native
  val default: FC[FormItemInputProps & FormItemInputMiscProps] = js.native
  
  trait FormItemInputMiscProps extends StObject {
    
    var children: Node
    
    var errors: js.Array[Node]
    
    var marginBottom: js.UndefOr[Double | Null] = js.undefined
    
    var onErrorVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var prefixCls: String
    
    var warnings: js.Array[Node]
  }
  object FormItemInputMiscProps {
    
    inline def apply(errors: js.Array[Node], prefixCls: String, warnings: js.Array[Node]): FormItemInputMiscProps = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[FormItemInputMiscProps]
    }
    
    extension [Self <: FormItemInputMiscProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Node]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Node*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomNull: Self = StObject.set(x, "marginBottom", null)
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setOnErrorVisibleChanged(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onErrorVisibleChanged", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnErrorVisibleChangedUndefined: Self = StObject.set(x, "onErrorVisibleChanged", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[Node]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: Node*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait FormItemInputProps extends StObject {
    
    var extra: js.UndefOr[Node] = js.undefined
    
    var fieldId: js.UndefOr[String] = js.undefined
    
    var help: js.UndefOr[Node] = js.undefined
    
    var status: js.UndefOr[ValidateStatus] = js.undefined
    
    var wrapperCol: js.UndefOr[ColProps] = js.undefined
  }
  object FormItemInputProps {
    
    inline def apply(): FormItemInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormItemInputProps]
    }
    
    extension [Self <: FormItemInputProps](x: Self) {
      
      inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setHelp(value: VdomNode): Self = StObject.set(x, "help", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHelpNull: Self = StObject.set(x, "help", null)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHelpVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "help", js.Array(value*))
      
      inline def setHelpVdomElement(value: VdomElement): Self = StObject.set(x, "help", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatus(value: ValidateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setWrapperCol(value: ColProps): Self = StObject.set(x, "wrapperCol", value.asInstanceOf[js.Any])
      
      inline def setWrapperColUndefined: Self = StObject.set(x, "wrapperCol", js.undefined)
    }
  }
  
  type _To = FC[FormItemInputProps & FormItemInputMiscProps]
  
  /* This means you don't have to write `default`, but can instead just say `libFormFormItemInputMod.foo` */
  override def _to: FC[FormItemInputProps & FormItemInputMiscProps] = default
}
