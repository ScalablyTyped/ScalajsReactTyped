package typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSamplingResponse extends StObject {
  
  /**
    * Recorded sampling heap profile.
    */
  var profile: SamplingHeapProfile
}
object StopSamplingResponse {
  
  inline def apply(profile: SamplingHeapProfile): StopSamplingResponse = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopSamplingResponse]
  }
  
  extension [Self <: StopSamplingResponse](x: Self) {
    
    inline def setProfile(value: SamplingHeapProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
