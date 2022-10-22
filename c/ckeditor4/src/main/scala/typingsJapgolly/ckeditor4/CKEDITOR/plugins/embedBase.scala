package typingsJapgolly.ckeditor4.CKEDITOR.plugins

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.notificationAggregator.task
import typingsJapgolly.ckeditor4.CKEDITOR.plugins.widget.definition
import typingsJapgolly.ckeditor4.CKEDITOR.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embedBase {
  
  @js.native
  trait baseDefinition
    extends StObject
       with definition {
    
    def getErrorMessage(messageTypeOrMessage: String): String = js.native
    def getErrorMessage(messageTypeOrMessage: String, url: String): String = js.native
    def getErrorMessage(messageTypeOrMessage: String, url: String, suffix: String): String = js.native
    def getErrorMessage(messageTypeOrMessage: String, url: Unit, suffix: String): String = js.native
    
    def isUrlValid(url: String): Boolean = js.native
    
    def loadContent(url: String): request = js.native
    def loadContent(url: String, callback: js.Function0[Unit]): request = js.native
    def loadContent(url: String, callback: js.Function0[Unit], errorCallback: js.Function1[/* error */ String, Unit]): request = js.native
    def loadContent(
      url: String,
      callback: js.Function0[Unit],
      errorCallback: js.Function1[/* error */ String, Unit],
      noNotifications: Boolean
    ): request = js.native
    def loadContent(url: String, callback: js.Function0[Unit], errorCallback: Unit, noNotifications: Boolean): request = js.native
    def loadContent(url: String, callback: Unit, errorCallback: js.Function1[/* error */ String, Unit]): request = js.native
    def loadContent(
      url: String,
      callback: Unit,
      errorCallback: js.Function1[/* error */ String, Unit],
      noNotifications: Boolean
    ): request = js.native
    def loadContent(url: String, callback: Unit, errorCallback: Unit, noNotifications: Boolean): request = js.native
    
    var providerUrl: template = js.native
    
    var urlRegExp: js.RegExp = js.native
  }
  
  trait request extends StObject {
    
    def callback(): Unit
    
    def cancel(): Unit
    
    def errorCallback(error: String): Unit
    
    var response: StringDictionary[String]
    
    var task: typingsJapgolly.ckeditor4.CKEDITOR.plugins.notificationAggregator.task
    
    var url: String
  }
  object request {
    
    inline def apply(
      callback: Callback,
      cancel: Callback,
      errorCallback: String => Callback,
      response: StringDictionary[String],
      task: task,
      url: String
    ): request = {
      val __obj = js.Dynamic.literal(callback = callback.toJsFn, cancel = cancel.toJsFn, errorCallback = js.Any.fromFunction1((t0: String) => errorCallback(t0).runNow()), response = response.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[request]
    }
    
    extension [Self <: request](x: Self) {
      
      inline def setCallback(value: Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setErrorCallback(value: String => Callback): Self = StObject.set(x, "errorCallback", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setResponse(value: StringDictionary[String]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setTask(value: task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
