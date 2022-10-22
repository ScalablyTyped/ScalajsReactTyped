package typingsJapgolly.wordpressComponents

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.anon.OmitHTMLPropsHTMLSelectEl
import typingsJapgolly.wordpressComponents.anon.OnChange
import typingsJapgolly.wordpressComponents.baseControlMod.BaseControl.ControlProps
import typingsJapgolly.wordpressComponents.selectControlMod.SelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectControlMod {
  
  object default {
    
    inline def apply[T /* <: String | js.Array[String] */](// tslint:disable-next-line:no-unnecessary-generics
    props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/components/select-control", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object SelectControl {
    
    trait Option extends StObject {
      
      /**
        * Whether or not the option should have the disabled attribute.
        *
        * @defaultValue false
        */
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The label to be shown to the user.
        */
      var label: String
      
      /**
        * The internal value used to choose the selected value. This is also
        * the value passed to `onChange` when the option is selected.
        */
      var value: String
    }
    object Option {
      
      inline def apply(label: String, value: String): Option = {
        val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Option]
      }
      
      extension [Self <: Option](x: Self) {
        
        inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    type Props[T /* <: String | js.Array[String] */] = OmitHTMLPropsHTMLSelectEl & ControlProps & OnChange[T] & (/* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<string> ? {  multiple :true} : {  multiple :false | undefined} */ js.Any)
  }
}
