package typingsJapgolly.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePageRequest extends StObject {
  
  /**
    * The ID of the engagement to a contact channel.
    */
  var PageId: SsmContactsArn
}
object DescribePageRequest {
  
  inline def apply(PageId: SsmContactsArn): DescribePageRequest = {
    val __obj = js.Dynamic.literal(PageId = PageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePageRequest]
  }
  
  extension [Self <: DescribePageRequest](x: Self) {
    
    inline def setPageId(value: SsmContactsArn): Self = StObject.set(x, "PageId", value.asInstanceOf[js.Any])
  }
}
