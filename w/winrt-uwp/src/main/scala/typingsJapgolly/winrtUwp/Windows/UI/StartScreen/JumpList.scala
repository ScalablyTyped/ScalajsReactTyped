package typingsJapgolly.winrtUwp.Windows.UI.StartScreen

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for selecting the type of system-managed jump list that is used by an app, adding custom task entry points to an app's jump list, and adding custom groups to an app's jump list. A jump list consists of an optional system-provided list of items, as well as optional app-provided items. Not all device families support jump lists. */
trait JumpList extends StObject {
  
  /** Gets the list of JumpListItem 's for the jump list. Items is of type IVector(JumpListItem) . */
  var items: IVector[JumpListItem]
  
  /**
    * Asynchronously saves changes to the jump list and its items.
    * @return Returns an IAsyncAction object that is used to control the asynchronous operation. If the system does not support jump lists, the SaveAsync method has no effect and future calls to LoadCurrentAsync will produce an empty jump list. An app can check for this case using the IsSupported method.
    */
  def saveAsync(): IPromiseWithIAsyncAction
  
  /** Gets or sets the current type of the system managed jump list group. */
  var systemGroupKind: JumpListSystemGroupKind
}
object JumpList {
  
  inline def apply(
    items: IVector[JumpListItem],
    saveAsync: CallbackTo[IPromiseWithIAsyncAction],
    systemGroupKind: JumpListSystemGroupKind
  ): JumpList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], saveAsync = saveAsync.toJsFn, systemGroupKind = systemGroupKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[JumpList]
  }
  
  extension [Self <: JumpList](x: Self) {
    
    inline def setItems(value: IVector[JumpListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSaveAsync(value: CallbackTo[IPromiseWithIAsyncAction]): Self = StObject.set(x, "saveAsync", value.toJsFn)
    
    inline def setSystemGroupKind(value: JumpListSystemGroupKind): Self = StObject.set(x, "systemGroupKind", value.asInstanceOf[js.Any])
  }
}
