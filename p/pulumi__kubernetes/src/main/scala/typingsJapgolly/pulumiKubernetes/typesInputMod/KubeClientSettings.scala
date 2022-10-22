package typingsJapgolly.pulumiKubernetes.typesInputMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubeClientSettings extends StObject {
  
  /**
    * Maximum burst for throttle. Default value is 10.
    */
  var burst: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Maximum queries per second (QPS) to the API server from this client. Default value is 5.
    */
  var qps: js.UndefOr[Input[Double]] = js.undefined
}
object KubeClientSettings {
  
  inline def apply(): KubeClientSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubeClientSettings]
  }
  
  extension [Self <: KubeClientSettings](x: Self) {
    
    inline def setBurst(value: Input[Double]): Self = StObject.set(x, "burst", value.asInstanceOf[js.Any])
    
    inline def setBurstUndefined: Self = StObject.set(x, "burst", js.undefined)
    
    inline def setQps(value: Input[Double]): Self = StObject.set(x, "qps", value.asInstanceOf[js.Any])
    
    inline def setQpsUndefined: Self = StObject.set(x, "qps", js.undefined)
  }
}
