package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOn extends StObject {
  
  /**
    * The name of the add-on.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The next daily time an automatic snapshot will be created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined
  
  /**
    * The daily time when an automatic snapshot is created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined
  
  /**
    * The status of the add-on.
    */
  var status: js.UndefOr[String] = js.undefined
}
object AddOn {
  
  inline def apply(): AddOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOn]
  }
  
  extension [Self <: AddOn](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextSnapshotTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "nextSnapshotTimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setNextSnapshotTimeOfDayUndefined: Self = StObject.set(x, "nextSnapshotTimeOfDay", js.undefined)
    
    inline def setSnapshotTimeOfDay(value: TimeOfDay): Self = StObject.set(x, "snapshotTimeOfDay", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTimeOfDayUndefined: Self = StObject.set(x, "snapshotTimeOfDay", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
