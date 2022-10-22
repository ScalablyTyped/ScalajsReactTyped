package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDistributionResult extends StObject {
  
  /**
    * The distribution's information.
    */
  var Distribution: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.Distribution] = js.undefined
  
  /**
    * The current version of the distribution created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified URI of the new distribution resource just created.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateDistributionResult {
  
  inline def apply(): CreateDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDistributionResult]
  }
  
  extension [Self <: CreateDistributionResult](x: Self) {
    
    inline def setDistribution(value: Distribution): Self = StObject.set(x, "Distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "Distribution", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
