package typingsJapgolly.rxjs.distTypesInternalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.NextNotification[T]
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorNotification
  - typingsJapgolly.rxjs.distTypesInternalTypesMod.CompleteNotification
*/
trait ObservableNotification[T] extends StObject
object ObservableNotification {
  
  inline def CompleteNotification(): typingsJapgolly.rxjs.distTypesInternalTypesMod.CompleteNotification = {
    val __obj = js.Dynamic.literal(kind = "C")
    __obj.asInstanceOf[typingsJapgolly.rxjs.distTypesInternalTypesMod.CompleteNotification]
  }
  
  inline def ErrorNotification(error: Any): typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorNotification = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], kind = "E")
    __obj.asInstanceOf[typingsJapgolly.rxjs.distTypesInternalTypesMod.ErrorNotification]
  }
  
  inline def NextNotification[T](value: T): typingsJapgolly.rxjs.distTypesInternalTypesMod.NextNotification[T] = {
    val __obj = js.Dynamic.literal(kind = "N", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.rxjs.distTypesInternalTypesMod.NextNotification[T]]
  }
}
