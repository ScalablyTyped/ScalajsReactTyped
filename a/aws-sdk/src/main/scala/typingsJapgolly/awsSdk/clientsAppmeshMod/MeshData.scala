package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshData extends StObject {
  
  /**
    * The name of the service mesh.
    */
  var meshName: ResourceName
  
  /**
    * The associated metadata for the service mesh.
    */
  var metadata: ResourceMetadata
  
  /**
    * The associated specification for the service mesh.
    */
  var spec: MeshSpec
  
  /**
    * The status of the service mesh.
    */
  var status: MeshStatus
}
object MeshData {
  
  inline def apply(meshName: ResourceName, metadata: ResourceMetadata, spec: MeshSpec, status: MeshStatus): MeshData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshData]
  }
  
  extension [Self <: MeshData](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: MeshSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: MeshStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
