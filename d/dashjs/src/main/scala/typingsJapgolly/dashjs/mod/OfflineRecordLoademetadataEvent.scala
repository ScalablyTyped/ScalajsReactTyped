package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.public_offlineRecordLoadedmetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineRecordLoademetadataEvent
  extends StObject
     with Event {
  
  var madiaInfos: js.Array[MediaInfo]
  
  @JSName("type")
  var type_OfflineRecordLoademetadataEvent: public_offlineRecordLoadedmetadata
}
object OfflineRecordLoademetadataEvent {
  
  inline def apply(madiaInfos: js.Array[MediaInfo]): OfflineRecordLoademetadataEvent = {
    val __obj = js.Dynamic.literal(madiaInfos = madiaInfos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_offlineRecordLoadedmetadata")
    __obj.asInstanceOf[OfflineRecordLoademetadataEvent]
  }
  
  extension [Self <: OfflineRecordLoademetadataEvent](x: Self) {
    
    inline def setMadiaInfos(value: js.Array[MediaInfo]): Self = StObject.set(x, "madiaInfos", value.asInstanceOf[js.Any])
    
    inline def setMadiaInfosVarargs(value: MediaInfo*): Self = StObject.set(x, "madiaInfos", js.Array(value*))
    
    inline def setType(value: public_offlineRecordLoadedmetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
