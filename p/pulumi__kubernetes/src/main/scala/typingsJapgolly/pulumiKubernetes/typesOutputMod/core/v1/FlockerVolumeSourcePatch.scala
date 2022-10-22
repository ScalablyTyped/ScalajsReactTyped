package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
  */
trait FlockerVolumeSourcePatch extends StObject {
  
  /**
    * datasetName is Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
    */
  var datasetName: String
  
  /**
    * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
    */
  var datasetUUID: String
}
object FlockerVolumeSourcePatch {
  
  inline def apply(datasetName: String, datasetUUID: String): FlockerVolumeSourcePatch = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any], datasetUUID = datasetUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlockerVolumeSourcePatch]
  }
  
  extension [Self <: FlockerVolumeSourcePatch](x: Self) {
    
    inline def setDatasetName(value: String): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetUUID(value: String): Self = StObject.set(x, "datasetUUID", value.asInstanceOf[js.Any])
  }
}
