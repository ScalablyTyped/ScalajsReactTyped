package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkteamRequest extends StObject {
  
  /**
    * The name of the work team to return a description of.
    */
  var WorkteamName: typingsJapgolly.awsSdk.clientsSagemakerMod.WorkteamName
}
object DescribeWorkteamRequest {
  
  inline def apply(WorkteamName: WorkteamName): DescribeWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkteamRequest]
  }
  
  extension [Self <: DescribeWorkteamRequest](x: Self) {
    
    inline def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
