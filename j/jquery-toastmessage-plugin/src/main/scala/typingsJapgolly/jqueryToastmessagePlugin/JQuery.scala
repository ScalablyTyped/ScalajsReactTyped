package typingsJapgolly.jqueryToastmessagePlugin

import typingsJapgolly.jqueryToastmessagePlugin.JQueryToastmessage.ShowToastCommand
import typingsJapgolly.jqueryToastmessagePlugin.JQueryToastmessage.ToastOptions
import typingsJapgolly.jqueryToastmessagePlugin.JQueryToastmessage.ToastmessageStatic
import typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.removeToast
import typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /* shows a toast message of the specified type */
  def toastmessage(command: ShowToastCommand, message: String): JQuery
  /** configures the default toast options */
  def toastmessage(toastOpts: ToastOptions): Unit
  @JSName("toastmessage")
  var toastmessage_Original: ToastmessageStatic
  /** removes the specified toast and returns it */
  @JSName("toastmessage")
  def toastmessage_removeToast(command: removeToast, toast: JQuery): Unit
  @JSName("toastmessage")
  def toastmessage_removeToast(command: removeToast, toast: JQuery, closeOpts: ToastOptions): Unit
  /** shows a custom toast */
  @JSName("toastmessage")
  def toastmessage_showToast(command: showToast, toastOpts: ToastOptions): JQuery
}
object JQuery {
  
  inline def apply(toastmessage: ToastmessageStatic): JQuery = {
    val __obj = js.Dynamic.literal(toastmessage = toastmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setToastmessage(value: ToastmessageStatic): Self = StObject.set(x, "toastmessage", value.asInstanceOf[js.Any])
  }
}
