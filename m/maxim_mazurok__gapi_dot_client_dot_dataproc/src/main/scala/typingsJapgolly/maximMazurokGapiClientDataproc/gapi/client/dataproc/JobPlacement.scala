package typingsJapgolly.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPlacement extends StObject {
  
  /** Optional. Cluster labels to identify a cluster where the job will be submitted. */
  var clusterLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. The name of the cluster where the job will be submitted. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** Output only. A cluster UUID generated by the Dataproc service when the job is submitted. */
  var clusterUuid: js.UndefOr[String] = js.undefined
}
object JobPlacement {
  
  inline def apply(): JobPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobPlacement]
  }
  
  extension [Self <: JobPlacement](x: Self) {
    
    inline def setClusterLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "clusterLabels", value.asInstanceOf[js.Any])
    
    inline def setClusterLabelsUndefined: Self = StObject.set(x, "clusterLabels", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setClusterUuid(value: String): Self = StObject.set(x, "clusterUuid", value.asInstanceOf[js.Any])
    
    inline def setClusterUuidUndefined: Self = StObject.set(x, "clusterUuid", js.undefined)
  }
}
