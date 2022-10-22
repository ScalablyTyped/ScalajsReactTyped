package typingsJapgolly.wixUiCore

import org.scalajs.dom.File
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsFilePickerButtonTestFilePickerButtonTestFixtureMod {
  
  @js.native
  sealed trait DataHook extends StObject
  @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/test/FilePickerButtonTestFixture", "DataHook")
  @js.native
  object DataHook extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DataHook & String] = js.native
    
    @js.native
    sealed trait FileNames
      extends StObject
         with DataHook
    /* "file-names" */ val FileNames: typingsJapgolly.wixUiCore.distEsSrcComponentsFilePickerButtonTestFilePickerButtonTestFixtureMod.DataHook.FileNames & String = js.native
    
    @js.native
    sealed trait FilePickerButton
      extends StObject
         with DataHook
    /* "file-picker-button" */ val FilePickerButton: typingsJapgolly.wixUiCore.distEsSrcComponentsFilePickerButtonTestFilePickerButtonTestFixtureMod.DataHook.FilePickerButton & String = js.native
    
    @js.native
    sealed trait OnChangeCount
      extends StObject
         with DataHook
    /* "on-change-count" */ val OnChangeCount: typingsJapgolly.wixUiCore.distEsSrcComponentsFilePickerButtonTestFilePickerButtonTestFixtureMod.DataHook.OnChangeCount & String = js.native
    
    @js.native
    sealed trait ResetButton
      extends StObject
         with DataHook
    /* "reset-button" */ val ResetButton: typingsJapgolly.wixUiCore.distEsSrcComponentsFilePickerButtonTestFilePickerButtonTestFixtureMod.DataHook.ResetButton & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/file-picker-button/test/FilePickerButtonTestFixture", "FilePickerButtonTestFixture")
  @js.native
  open class FilePickerButtonTestFixture protected ()
    extends Component[js.Object, FilePickerButtonTestFixtureState, Any] {
    def this(props: Any) = this()
    
    /* private */ val filePickerButtonRef: Any = js.native
    
    /* private */ val handleFilePickerButtonOnChange: Any = js.native
    
    /* private */ val handleResetButtonClick: Any = js.native
  }
  
  trait FilePickerButtonTestFixtureState extends StObject {
    
    var onChangeCount: Double
    
    var selectedFiles: js.Array[File]
  }
  object FilePickerButtonTestFixtureState {
    
    inline def apply(onChangeCount: Double, selectedFiles: js.Array[File]): FilePickerButtonTestFixtureState = {
      val __obj = js.Dynamic.literal(onChangeCount = onChangeCount.asInstanceOf[js.Any], selectedFiles = selectedFiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePickerButtonTestFixtureState]
    }
    
    extension [Self <: FilePickerButtonTestFixtureState](x: Self) {
      
      inline def setOnChangeCount(value: Double): Self = StObject.set(x, "onChangeCount", value.asInstanceOf[js.Any])
      
      inline def setSelectedFiles(value: js.Array[File]): Self = StObject.set(x, "selectedFiles", value.asInstanceOf[js.Any])
      
      inline def setSelectedFilesVarargs(value: File*): Self = StObject.set(x, "selectedFiles", js.Array(value*))
    }
  }
}
