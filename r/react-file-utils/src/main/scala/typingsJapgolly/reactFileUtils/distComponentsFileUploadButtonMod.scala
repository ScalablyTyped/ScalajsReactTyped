package typingsJapgolly.reactFileUtils

import org.scalajs.dom.File
import org.scalajs.dom.FileList
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsFileUploadButtonMod {
  
  @JSImport("react-file-utils/dist/components/FileUploadButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FileUploadButton(
    hasDisabledMultipleChildrenHandleFilesAcceptsResetOnChange: PropsWithChildren[FileUploadButtonProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileUploadButton")(hasDisabledMultipleChildrenHandleFilesAcceptsResetOnChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait FileUploadButtonProps extends StObject {
    
    var accepts: js.UndefOr[String | js.Array[String]] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def handleFiles(files: js.Array[File]): Unit = js.native
    def handleFiles(files: FileList): Unit = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var resetOnChange: js.UndefOr[Boolean] = js.native
  }
}
