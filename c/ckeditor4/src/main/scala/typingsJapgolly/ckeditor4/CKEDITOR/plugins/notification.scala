package typingsJapgolly.ckeditor4.CKEDITOR.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditor4.CKEDITOR.dom.element
import typingsJapgolly.ckeditor4.CKEDITOR.editor
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.updateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait notification extends StObject {
  
  val area: typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.area
  
  val duration: Double
  
  val editor: typingsJapgolly.ckeditor4.CKEDITOR.editor
  
  val element: typingsJapgolly.ckeditor4.CKEDITOR.dom.element
  
  def hide(): Unit
  
  val id: Double
  
  def isVisible(): Boolean
  
  val message: String
  
  val progress: Double
  
  def show(): Unit
  
  val `type`: typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.`type`
  
  def update(options: updateOptions): Unit
}
object notification {
  
  inline def apply(
    area: area,
    duration: Double,
    editor: editor,
    element: element,
    hide: Callback,
    id: Double,
    isVisible: CallbackTo[Boolean],
    message: String,
    progress: Double,
    show: Callback,
    `type`: `type`,
    update: updateOptions => Callback
  ): notification = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], hide = hide.toJsFn, id = id.asInstanceOf[js.Any], isVisible = isVisible.toJsFn, message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], show = show.toJsFn, update = js.Any.fromFunction1((t0: updateOptions) => update(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[notification]
  }
  
  trait area extends StObject {
    
    def add(notification: notification): Unit
    
    val editor: typingsJapgolly.ckeditor4.CKEDITOR.editor
    
    val element: typingsJapgolly.ckeditor4.CKEDITOR.dom.element
    
    val notifications: js.Array[notification]
    
    def remove(notification: notification): Unit
  }
  object area {
    
    inline def apply(
      add: notification => Callback,
      editor: editor,
      element: element,
      notifications: js.Array[notification],
      remove: notification => Callback
    ): area = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: notification) => add(t0).runNow()), editor = editor.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], remove = js.Any.fromFunction1((t0: notification) => remove(t0).runNow()))
      __obj.asInstanceOf[area]
    }
    
    extension [Self <: area](x: Self) {
      
      inline def setAdd(value: notification => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: notification) => value(t0).runNow()))
      
      inline def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
      
      inline def setElement(value: element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: js.Array[notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsVarargs(value: notification*): Self = StObject.set(x, "notifications", js.Array(value*))
      
      inline def setRemove(value: notification => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: notification) => value(t0).runNow()))
    }
  }
  
  extension [Self <: notification](x: Self) {
    
    inline def setArea(value: area): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setElement(value: element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: updateOptions => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: updateOptions) => value(t0).runNow()))
  }
  
  trait options
    extends StObject
       with optionsBase {
    
    var message: String
  }
  object options {
    
    inline def apply(message: String): options = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait optionsBase extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var progress: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[typingsJapgolly.ckeditor4.CKEDITOR.plugins.notification.`type`] = js.undefined
  }
  object optionsBase {
    
    inline def apply(): optionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[optionsBase]
    }
    
    extension [Self <: optionsBase](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditor4.ckeditor4Strings.info
    - typingsJapgolly.ckeditor4.ckeditor4Strings.warning
    - typingsJapgolly.ckeditor4.ckeditor4Strings.success
    - typingsJapgolly.ckeditor4.ckeditor4Strings.progress
  */
  trait `type` extends StObject
  object `type` {
    
    inline def info: typingsJapgolly.ckeditor4.ckeditor4Strings.info = "info".asInstanceOf[typingsJapgolly.ckeditor4.ckeditor4Strings.info]
    
    inline def progress: typingsJapgolly.ckeditor4.ckeditor4Strings.progress = "progress".asInstanceOf[typingsJapgolly.ckeditor4.ckeditor4Strings.progress]
    
    inline def success: typingsJapgolly.ckeditor4.ckeditor4Strings.success = "success".asInstanceOf[typingsJapgolly.ckeditor4.ckeditor4Strings.success]
    
    inline def warning: typingsJapgolly.ckeditor4.ckeditor4Strings.warning = "warning".asInstanceOf[typingsJapgolly.ckeditor4.ckeditor4Strings.warning]
  }
  
  trait updateOptions
    extends StObject
       with optionsBase {
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object updateOptions {
    
    inline def apply(): updateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[updateOptions]
    }
    
    extension [Self <: updateOptions](x: Self) {
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
