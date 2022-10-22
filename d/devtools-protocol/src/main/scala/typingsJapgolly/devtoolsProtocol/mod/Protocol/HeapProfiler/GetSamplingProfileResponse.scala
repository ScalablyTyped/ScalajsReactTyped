package typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSamplingProfileResponse extends StObject {
  
  /**
    * Return the sampling profile being collected.
    */
  var profile: SamplingHeapProfile
}
object GetSamplingProfileResponse {
  
  inline def apply(profile: SamplingHeapProfile): GetSamplingProfileResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSamplingProfileResponse]
  }
  
  extension [Self <: GetSamplingProfileResponse](x: Self) {
    
    inline def setProfile(value: SamplingHeapProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
