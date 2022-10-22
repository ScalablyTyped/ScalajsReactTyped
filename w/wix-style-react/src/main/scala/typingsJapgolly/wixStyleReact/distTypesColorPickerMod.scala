package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.ReturnType
import typingsJapgolly.wixStyleReact.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorPickerMod {
  
  @JSImport("wix-style-react/dist/types/ColorPicker", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ColorPickerProps, js.Object, Any]
  
  type ColorInstance = ReturnType[FnCall]
  
  type ColorPicker = japgolly.scalajs.react.facade.React.Component[ColorPickerProps & js.Object, js.Object]
  
  trait ColorPickerProps extends StObject {
    
    var addTooltipContent: js.UndefOr[Node] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var emptyPlaceholder: js.UndefOr[String] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var onCancel: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var onConfirm: js.UndefOr[js.Function1[/* color */ String | ColorInstance, Unit]] = js.undefined
    
    var showConverter: js.UndefOr[Boolean] = js.undefined
    
    var showHistory: js.UndefOr[Boolean] = js.undefined
    
    var showInput: js.UndefOr[Boolean] = js.undefined
    
    var value: String | ColorInstance
  }
  object ColorPickerProps {
    
    inline def apply(value: String | ColorInstance): ColorPickerProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPickerProps]
    }
    
    extension [Self <: ColorPickerProps](x: Self) {
      
      inline def setAddTooltipContent(value: VdomNode): Self = StObject.set(x, "addTooltipContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAddTooltipContentNull: Self = StObject.set(x, "addTooltipContent", null)
      
      inline def setAddTooltipContentUndefined: Self = StObject.set(x, "addTooltipContent", js.undefined)
      
      inline def setAddTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "addTooltipContent", js.Array(value*))
      
      inline def setAddTooltipContentVdomElement(value: VdomElement): Self = StObject.set(x, "addTooltipContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEmptyPlaceholder(value: String): Self = StObject.set(x, "emptyPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setEmptyPlaceholderUndefined: Self = StObject.set(x, "emptyPlaceholder", js.undefined)
      
      inline def setOnAdd(value: /* color */ String | ColorInstance => Callback): Self = StObject.set(x, "onAdd", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnCancel(value: /* color */ String | ColorInstance => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* color */ String | ColorInstance => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnConfirm(value: /* color */ String | ColorInstance => Callback): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setShowConverter(value: Boolean): Self = StObject.set(x, "showConverter", value.asInstanceOf[js.Any])
      
      inline def setShowConverterUndefined: Self = StObject.set(x, "showConverter", js.undefined)
      
      inline def setShowHistory(value: Boolean): Self = StObject.set(x, "showHistory", value.asInstanceOf[js.Any])
      
      inline def setShowHistoryUndefined: Self = StObject.set(x, "showHistory", js.undefined)
      
      inline def setShowInput(value: Boolean): Self = StObject.set(x, "showInput", value.asInstanceOf[js.Any])
      
      inline def setShowInputUndefined: Self = StObject.set(x, "showInput", js.undefined)
      
      inline def setValue(value: String | ColorInstance): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
