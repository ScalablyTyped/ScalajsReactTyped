package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeThemePermissionsRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the theme that you're describing.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID for the theme that you want to describe permissions for.
    */
  var ThemeId: RestrictiveResourceId
}
object DescribeThemePermissionsRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, ThemeId: RestrictiveResourceId): DescribeThemePermissionsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], ThemeId = ThemeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThemePermissionsRequest]
  }
  
  extension [Self <: DescribeThemePermissionsRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
  }
}
