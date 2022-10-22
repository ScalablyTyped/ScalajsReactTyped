package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describe a container image
  */
trait ContainerImagePatch extends StObject {
  
  /**
    * Names by which this image is known. e.g. ["kubernetes.example/hyperkube:v1.0.7", "cloud-vendor.registry.example/cloud-vendor/hyperkube:v1.0.7"]
    */
  var names: js.Array[String]
  
  /**
    * The size of the image in bytes.
    */
  var sizeBytes: Double
}
object ContainerImagePatch {
  
  inline def apply(names: js.Array[String], sizeBytes: Double): ContainerImagePatch = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], sizeBytes = sizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerImagePatch]
  }
  
  extension [Self <: ContainerImagePatch](x: Self) {
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
  }
}
