package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAssociationOutputUrl extends StObject {
  
  /**
    * The URL of S3 bucket where you want to store the results of this request.
    */
  var S3OutputUrl: js.UndefOr[typingsJapgolly.awsSdk.clientsSsmMod.S3OutputUrl] = js.undefined
}
object InstanceAssociationOutputUrl {
  
  inline def apply(): InstanceAssociationOutputUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAssociationOutputUrl]
  }
  
  extension [Self <: InstanceAssociationOutputUrl](x: Self) {
    
    inline def setS3OutputUrl(value: S3OutputUrl): Self = StObject.set(x, "S3OutputUrl", value.asInstanceOf[js.Any])
    
    inline def setS3OutputUrlUndefined: Self = StObject.set(x, "S3OutputUrl", js.undefined)
  }
}
