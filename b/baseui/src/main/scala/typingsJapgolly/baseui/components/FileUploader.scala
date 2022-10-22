package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.File
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.fileUploaderTypesMod.DataTransferEvent
import typingsJapgolly.baseui.fileUploaderTypesMod.FileUploaderOverrides
import typingsJapgolly.baseui.fileUploaderTypesMod.FileUploaderProps
import typingsJapgolly.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FileUploader {
  
  @JSImport("baseui/file-uploader", "FileUploader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accept(value: String | js.Array[String]): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def acceptVarargs(value: String*): this.type = set("accept", js.Array(value*))
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def disableClick(value: Boolean): this.type = set("disableClick", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def getDataTransferItems(value: /* event */ DataTransferEvent => js.Promise[js.Array[File | DataTransferItem]]): this.type = set("getDataTransferItems", js.Any.fromFunction1(value))
    
    inline def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def minSize(value: Double): this.type = set("minSize", value.asInstanceOf[js.Any])
    
    inline def multiple(value: Boolean): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactFocusEventFrom[HTMLElement] => Any): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    inline def onCancel(value: CallbackTo[Any]): this.type = set("onCancel", value.toJsFn)
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLElement] => Any): this.type = set("onClick", js.Any.fromFunction1(value))
    
    inline def onDragEnter(value: /* event */ ReactDragEventFrom[HTMLElement] => Any): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    inline def onDragLeave(value: /* event */ ReactDragEventFrom[HTMLElement] => Any): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    inline def onDragOver(value: /* event */ ReactDragEventFrom[HTMLElement] => Any): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    inline def onDragStart(value: /* event */ ReactDragEventFrom[HTMLElement] => Any): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    inline def onDrop(
      value: (/* accepted */ js.Array[File], /* rejected */ js.Array[File], /* event */ ReactDragEventFrom[HTMLElement]) => Any
    ): this.type = set("onDrop", js.Any.fromFunction3(value))
    
    inline def onDropAccepted(
      value: (/* acceptedOrRejected */ js.Array[File], /* event */ ReactDragEventFrom[HTMLElement]) => Any
    ): this.type = set("onDropAccepted", js.Any.fromFunction2(value))
    
    inline def onDropRejected(
      value: (/* acceptedOrRejected */ js.Array[File], /* event */ ReactDragEventFrom[HTMLElement]) => Any
    ): this.type = set("onDropRejected", js.Any.fromFunction2(value))
    
    inline def onFileDialogCancel(value: CallbackTo[Any]): this.type = set("onFileDialogCancel", value.toJsFn)
    
    inline def onFocus(value: /* event */ ReactFocusEventFrom[HTMLElement] => Any): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def onKeyDown(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Any): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    inline def onRetry(value: CallbackTo[Any]): this.type = set("onRetry", value.toJsFn)
    
    inline def overrides(value: FileUploaderOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def preventDropOnDocument(value: Boolean): this.type = set("preventDropOnDocument", value.asInstanceOf[js.Any])
    
    inline def progressAmount(value: Double): this.type = set("progressAmount", value.asInstanceOf[js.Any])
    
    inline def progressMessage(value: String): this.type = set("progressMessage", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FileUploader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FileUploaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
