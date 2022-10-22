package typingsJapgolly.reactFileInput

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-input", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[FileInputProps, js.Object, Any]
  
  type FileInput = japgolly.scalajs.react.facade.React.Component[FileInputProps & js.Object, js.Object]
  
  trait FileInputProps extends StObject {
    
    var accept: String
    
    var className: String
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    def onChange(event: ReactEventFrom[Any & Element]): Unit
    
    var placeholder: String
  }
  object FileInputProps {
    
    inline def apply(
      accept: String,
      className: String,
      name: String,
      onChange: ReactEventFrom[Any & Element] => Callback,
      placeholder: String
    ): FileInputProps = {
      val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => onChange(t0).runNow()), placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInputProps]
    }
    
    extension [Self <: FileInputProps](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: ReactEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
