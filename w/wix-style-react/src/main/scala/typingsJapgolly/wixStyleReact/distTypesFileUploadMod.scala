package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.FileList
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ClassicElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.environment
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFileUploadMod {
  
  @JSImport("wix-style-react/dist/types/FileUpload", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[FileUploadProps, js.Object, Any]
  
  type FileUpload = PureComponent[FileUploadProps, js.Object, Any]
  
  trait FileUploadChildrenProps extends StObject {
    
    var openFileUploadDialog: MouseEventHandler[HTMLElement]
  }
  object FileUploadChildrenProps {
    
    inline def apply(openFileUploadDialog: ReactMouseEventFrom[HTMLElement & Element] => Callback): FileUploadChildrenProps = {
      val __obj = js.Dynamic.literal(openFileUploadDialog = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => openFileUploadDialog(t0).runNow()))
      __obj.asInstanceOf[FileUploadChildrenProps]
    }
    
    extension [Self <: FileUploadChildrenProps](x: Self) {
      
      inline def setOpenFileUploadDialog(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "openFileUploadDialog", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    }
  }
  
  trait FileUploadProps extends StObject {
    
    var accept: js.UndefOr[String] = js.undefined
    
    var capture: js.UndefOr[user | environment | none_] = js.undefined
    
    def children(params: FileUploadChildrenProps): ClassicElement[Any]
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    def onChange(fileList: FileList): Unit
  }
  object FileUploadProps {
    
    inline def apply(children: FileUploadChildrenProps => ClassicElement[Any], onChange: FileList => Callback): FileUploadProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), onChange = js.Any.fromFunction1((t0: FileList) => onChange(t0).runNow()))
      __obj.asInstanceOf[FileUploadProps]
    }
    
    extension [Self <: FileUploadProps](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setCapture(value: user | environment | none_): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setChildren(value: FileUploadChildrenProps => ClassicElement[Any]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: FileList => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: FileList) => value(t0).runNow()))
    }
  }
}
