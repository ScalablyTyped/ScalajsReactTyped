package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationEfsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS file system location that you want information about.
    */
  var LocationArn: typingsJapgolly.awsSdk.clientsDatasyncMod.LocationArn
}
object DescribeLocationEfsRequest {
  
  inline def apply(LocationArn: LocationArn): DescribeLocationEfsRequest = {
    val __obj = js.Dynamic.literal(LocationArn = LocationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationEfsRequest]
  }
  
  extension [Self <: DescribeLocationEfsRequest](x: Self) {
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
  }
}
