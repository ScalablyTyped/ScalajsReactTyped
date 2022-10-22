package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeSnapshotAccessResult extends StObject {
  
  var Snapshot: js.UndefOr[typingsJapgolly.awsSdk.clientsRedshiftMod.Snapshot] = js.undefined
}
object AuthorizeSnapshotAccessResult {
  
  inline def apply(): AuthorizeSnapshotAccessResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeSnapshotAccessResult]
  }
  
  extension [Self <: AuthorizeSnapshotAccessResult](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}
