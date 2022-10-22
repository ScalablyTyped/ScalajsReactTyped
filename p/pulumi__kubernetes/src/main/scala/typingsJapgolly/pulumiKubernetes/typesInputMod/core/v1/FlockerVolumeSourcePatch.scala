package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var datasetName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * datasetUUID is the UUID of the dataset. This is unique identifier of a Flocker dataset
    */
  var datasetUUID: js.UndefOr[Input[String]] = js.undefined
}
object FlockerVolumeSourcePatch {
  
  inline def apply(): FlockerVolumeSourcePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlockerVolumeSourcePatch]
  }
  
  extension [Self <: FlockerVolumeSourcePatch](x: Self) {
    
    inline def setDatasetName(value: Input[String]): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetNameUndefined: Self = StObject.set(x, "datasetName", js.undefined)
    
    inline def setDatasetUUID(value: Input[String]): Self = StObject.set(x, "datasetUUID", value.asInstanceOf[js.Any])
    
    inline def setDatasetUUIDUndefined: Self = StObject.set(x, "datasetUUID", js.undefined)
  }
}
