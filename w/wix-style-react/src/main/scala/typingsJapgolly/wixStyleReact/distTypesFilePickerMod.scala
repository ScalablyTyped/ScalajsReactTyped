package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.File
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFilePickerMod {
  
  @JSImport("wix-style-react/dist/types/FilePicker", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FilePickerProps, js.Object, Any]
  
  type FilePicker = PureComponent[FilePickerProps, js.Object, Any]
  
  trait FilePickerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String | Node] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var mainLabel: js.UndefOr[String] = js.undefined
    
    var maxSize: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* file */ File, Unit]] = js.undefined
    
    var subLabel: js.UndefOr[String] = js.undefined
    
    var supportedFormats: js.UndefOr[String] = js.undefined
  }
  object FilePickerProps {
    
    inline def apply(): FilePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePickerProps]
    }
    
    extension [Self <: FilePickerProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeader(value: String | Node): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeaderVdomElement(value: VdomElement): Self = StObject.set(x, "header", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMainLabel(value: String): Self = StObject.set(x, "mainLabel", value.asInstanceOf[js.Any])
      
      inline def setMainLabelUndefined: Self = StObject.set(x, "mainLabel", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* file */ File => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* file */ File) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSubLabel(value: String): Self = StObject.set(x, "subLabel", value.asInstanceOf[js.Any])
      
      inline def setSubLabelUndefined: Self = StObject.set(x, "subLabel", js.undefined)
      
      inline def setSupportedFormats(value: String): Self = StObject.set(x, "supportedFormats", value.asInstanceOf[js.Any])
      
      inline def setSupportedFormatsUndefined: Self = StObject.set(x, "supportedFormats", js.undefined)
    }
  }
}
