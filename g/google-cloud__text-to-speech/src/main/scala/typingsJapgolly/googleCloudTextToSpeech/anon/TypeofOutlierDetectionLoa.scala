package typingsJapgolly.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable7
import typingsJapgolly.googleGax.mod.grpc.experimental.OutlierDetectionLoadBalancingConfig
import typingsJapgolly.grpcGrpcJs.anon.PartialFailurePercentageE
import typingsJapgolly.grpcGrpcJs.anon.PartialSuccessRateEjectio
import typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerMod.LoadBalancingConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOutlierDetectionLoa
  extends StObject
     with Instantiable7[
      /* intervalMs */ Double | Null, 
      /* baseEjectionTimeMs */ Double | Null, 
      /* maxEjectionTimeMs */ Double | Null, 
      /* maxEjectionPercent */ Double | Null, 
      /* successRateEjection */ PartialSuccessRateEjectio | Null, 
      /* failurePercentageEjection */ PartialFailurePercentageE | Null, 
      /* childPolicy */ js.Array[LoadBalancingConfig], 
      OutlierDetectionLoadBalancingConfig
    ] {
  
  def createFromJson(obj: Any): typingsJapgolly.grpcGrpcJs.buildSrcLoadBalancerOutlierDetectionMod.OutlierDetectionLoadBalancingConfig = js.native
}
