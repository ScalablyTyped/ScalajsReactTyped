package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.File
import typingsJapgolly.react.mod.Component
import typingsJapgolly.wixUiCore.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsFilePickerButtonFilePickerButtonMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/FilePickerButton", "FilePickerButton")
  @js.native
  open class FilePickerButton protected () extends Component[FilePickerButtonProps, FilePickerButtonState, Any] {
    def this(props: Any) = this()
    
    def blur(): Unit = js.native
    
    /* private */ val chooseFileButtonRef: Any = js.native
    
    /* private */ val fileInputRef: Any = js.native
    
    def focus(): Unit = js.native
    
    /* private */ val handleChooseFileButtonBlur: Any = js.native
    
    /* private */ val handleChooseFileButtonClick: Any = js.native
    
    /* private */ val handleChooseFileButtonFocus: Any = js.native
    
    /* private */ val handleFileInputChange: Any = js.native
    
    def reset(): Unit = js.native
  }
  /* static members */
  object FilePickerButton {
    
    @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/FilePickerButton", "FilePickerButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/FilePickerButton", "FilePickerButton.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/FilePickerButton", "FilePickerButton.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait FilePickerButtonProps extends StObject {
    
    /** A string that defines the file types the file input should accept. */
    var accept: js.UndefOr[String] = js.undefined
    
    /** Elements to render inside the button. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Allows overriding the component's styles. */
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onBlur: js.UndefOr[js.Function] = js.undefined
    
    /** Triggered when the user finishes selecting files through a native OS file picker dialog. */
    var onChange: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object FilePickerButtonProps {
    
    inline def apply(): FilePickerButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePickerButtonProps]
    }
    
    extension [Self <: FilePickerButtonProps](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* files */ js.Array[File] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* files */ js.Array[File]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait FilePickerButtonState extends StObject {
    
    var selectedFiles: js.Array[File]
  }
  object FilePickerButtonState {
    
    inline def apply(selectedFiles: js.Array[File]): FilePickerButtonState = {
      val __obj = js.Dynamic.literal(selectedFiles = selectedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePickerButtonState]
    }
    
    extension [Self <: FilePickerButtonState](x: Self) {
      
      inline def setSelectedFiles(value: js.Array[File]): Self = StObject.set(x, "selectedFiles", value.asInstanceOf[js.Any])
      
      inline def setSelectedFilesVarargs(value: File*): Self = StObject.set(x, "selectedFiles", js.Array(value*))
    }
  }
}
