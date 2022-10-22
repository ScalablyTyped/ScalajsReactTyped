package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails extends StObject {
  
  /**
    * Whether the container has read-only access to the volume.
    */
  var ReadOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of another container within the same task definition from which to mount volumes.
    */
  var SourceContainer: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails {
  
  inline def apply(): AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails]
  }
  
  extension [Self <: AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails](x: Self) {
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setSourceContainer(value: NonEmptyString): Self = StObject.set(x, "SourceContainer", value.asInstanceOf[js.Any])
    
    inline def setSourceContainerUndefined: Self = StObject.set(x, "SourceContainer", js.undefined)
  }
}
