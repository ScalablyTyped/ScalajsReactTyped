package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface enables the object to be registered as interceptor to change context menus or prevent them from being executed. */
trait XContextMenuInterceptor
  extends StObject
     with XInterface {
  
  /**
    * notifies the interceptor about the request to execute a ContextMenu. The interceptor has to decide whether the menu should be executed with or without
    * being modified or may ignore the call.
    */
  def notifyContextMenuExecute(aEvent: ContextMenuExecuteEvent): ContextMenuInterceptorAction
}
object XContextMenuInterceptor {
  
  inline def apply(
    acquire: Callback,
    notifyContextMenuExecute: ContextMenuExecuteEvent => ContextMenuInterceptorAction,
    queryInterface: `type` => Any,
    release: Callback
  ): XContextMenuInterceptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, notifyContextMenuExecute = js.Any.fromFunction1(notifyContextMenuExecute), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContextMenuInterceptor]
  }
  
  extension [Self <: XContextMenuInterceptor](x: Self) {
    
    inline def setNotifyContextMenuExecute(value: ContextMenuExecuteEvent => ContextMenuInterceptorAction): Self = StObject.set(x, "notifyContextMenuExecute", js.Any.fromFunction1(value))
  }
}
