package typingsJapgolly.inkSelectInput

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-select-input", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SelectInputProps[ItemOfSelectInput], js.Object, Any]
  
  trait ItemOfSelectInput extends StObject {
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var label: String
    
    var value: Any
  }
  object ItemOfSelectInput {
    
    inline def apply(label: String, value: Any): ItemOfSelectInput = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemOfSelectInput]
    }
    
    extension [Self <: ItemOfSelectInput](x: Self) {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectInput = japgolly.scalajs.react.facade.React.Component[SelectInputProps[ItemOfSelectInput] & js.Object, js.Object]
  
  trait SelectInputProps[T /* <: ItemOfSelectInput */] extends StObject {
    
    var focus: js.UndefOr[Boolean] = js.undefined
    
    var indicatorComponent: js.UndefOr[japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var itemComponent: js.UndefOr[japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]] = js.undefined
    
    var items: js.UndefOr[js.Array[T]] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* item */ T, Unit]] = js.undefined
  }
  object SelectInputProps {
    
    inline def apply[T /* <: ItemOfSelectInput */](): SelectInputProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectInputProps[T]]
    }
    
    extension [Self <: SelectInputProps[?], T /* <: ItemOfSelectInput */](x: Self & SelectInputProps[T]) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setIndicatorComponent(value: japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]): Self = StObject.set(x, "indicatorComponent", value.asInstanceOf[js.Any])
      
      inline def setIndicatorComponentUndefined: Self = StObject.set(x, "indicatorComponent", js.undefined)
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setItemComponent(value: japgolly.scalajs.react.facade.React.Component[js.Object, js.Object]): Self = StObject.set(x, "itemComponent", value.asInstanceOf[js.Any])
      
      inline def setItemComponentUndefined: Self = StObject.set(x, "itemComponent", js.undefined)
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOnSelect(value: /* item */ T => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* item */ T) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    }
  }
}
