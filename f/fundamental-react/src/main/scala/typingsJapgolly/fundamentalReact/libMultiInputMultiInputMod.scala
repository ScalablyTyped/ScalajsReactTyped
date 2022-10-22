package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.anon.Text
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMultiInputMultiInputMod {
  
  @JSImport("fundamental-react/lib/MultiInput/MultiInput", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MultiInputProps, js.Object, Any]
  
  type MultiInput = japgolly.scalajs.react.facade.React.Component[MultiInputProps & js.Object, js.Object]
  
  trait MultiInputProps
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var buttonProps: js.UndefOr[Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var compact: js.UndefOr[Boolean] = js.undefined
    
    var data: js.Array[Any]
    
    var disableStyles: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[Any] = js.undefined
    
    var listProps: js.UndefOr[Any] = js.undefined
    
    var onTagsUpdate: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[Any] = js.undefined
    
    var tagProps: js.UndefOr[Any] = js.undefined
    
    var validationState: js.UndefOr[Text] = js.undefined
  }
  object MultiInputProps {
    
    inline def apply(data: js.Array[Any]): MultiInputProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiInputProps]
    }
    
    extension [Self <: MultiInputProps](x: Self) {
      
      inline def setButtonProps(value: Any): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDisableStyles(value: Boolean): Self = StObject.set(x, "disableStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesUndefined: Self = StObject.set(x, "disableStyles", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInputProps(value: Any): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setListProps(value: Any): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      inline def setListPropsUndefined: Self = StObject.set(x, "listProps", js.undefined)
      
      inline def setOnTagsUpdate(value: /* repeated */ Any => Any): Self = StObject.set(x, "onTagsUpdate", js.Any.fromFunction1(value))
      
      inline def setOnTagsUpdateUndefined: Self = StObject.set(x, "onTagsUpdate", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: Any): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setTagProps(value: Any): Self = StObject.set(x, "tagProps", value.asInstanceOf[js.Any])
      
      inline def setTagPropsUndefined: Self = StObject.set(x, "tagProps", js.undefined)
      
      inline def setValidationState(value: Text): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
      
      inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    }
  }
}
