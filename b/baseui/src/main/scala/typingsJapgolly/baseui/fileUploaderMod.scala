package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.input
import typingsJapgolly.baseui.fileUploaderTypesMod.FileUploaderProps
import typingsJapgolly.baseui.fileUploaderTypesMod.StyleProps
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileUploaderMod {
  
  object FileUploader {
    
    inline def apply(props: FileUploaderProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("baseui/file-uploader", "FileUploader")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("baseui/file-uploader", "FileUploader.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("baseui/file-uploader", "FileUploader.defaultProps.disableClick")
      @js.native
      def disableClick: Boolean = js.native
      inline def disableClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClick")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/file-uploader", "StyledContentMessage")
  @js.native
  val StyledContentMessage: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/file-uploader", "StyledContentSeparator")
  @js.native
  val StyledContentSeparator: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/file-uploader", "StyledErrorMessage")
  @js.native
  val StyledErrorMessage: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/file-uploader", "StyledFileDragAndDrop")
  @js.native
  val StyledFileDragAndDrop: StyletronComponent[div, StyleProps] = js.native
  
  @JSImport("baseui/file-uploader", "StyledHiddenInput")
  @js.native
  val StyledHiddenInput: StyletronComponent[input, js.Object] = js.native
  
  @JSImport("baseui/file-uploader", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, StyleProps] = js.native
}
