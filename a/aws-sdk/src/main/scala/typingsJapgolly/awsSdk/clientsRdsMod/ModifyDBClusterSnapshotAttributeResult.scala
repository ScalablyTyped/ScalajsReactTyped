package typingsJapgolly.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterSnapshotAttributeResult extends StObject {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typingsJapgolly.awsSdk.clientsRdsMod.DBClusterSnapshotAttributesResult] = js.undefined
}
object ModifyDBClusterSnapshotAttributeResult {
  
  inline def apply(): ModifyDBClusterSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
  }
  
  extension [Self <: ModifyDBClusterSnapshotAttributeResult](x: Self) {
    
    inline def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = StObject.set(x, "DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributesResult", js.undefined)
  }
}
