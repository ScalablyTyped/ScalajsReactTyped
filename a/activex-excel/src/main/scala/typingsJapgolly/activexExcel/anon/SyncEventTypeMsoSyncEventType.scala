package typingsJapgolly.activexExcel.anon

import typingsJapgolly.activexOffice.Office.MsoSyncEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncEventTypeMsoSyncEventType extends StObject {
  
  val SyncEventType: MsoSyncEventType
}
object SyncEventTypeMsoSyncEventType {
  
  inline def apply(SyncEventType: MsoSyncEventType): SyncEventTypeMsoSyncEventType = {
    val __obj = js.Dynamic.literal(SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventTypeMsoSyncEventType]
  }
  
  extension [Self <: SyncEventTypeMsoSyncEventType](x: Self) {
    
    inline def setSyncEventType(value: MsoSyncEventType): Self = StObject.set(x, "SyncEventType", value.asInstanceOf[js.Any])
  }
}
