package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgorithmValidationProfile extends StObject {
  
  /**
    * The name of the profile for the algorithm. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var ProfileName: EntityName
  
  /**
    * The TrainingJobDefinition object that describes the training job that SageMaker runs to validate your algorithm.
    */
  var TrainingJobDefinition: typingsJapgolly.awsSdk.clientsSagemakerMod.TrainingJobDefinition
  
  /**
    * The TransformJobDefinition object that describes the transform job that SageMaker runs to validate your algorithm.
    */
  var TransformJobDefinition: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.TransformJobDefinition] = js.undefined
}
object AlgorithmValidationProfile {
  
  inline def apply(ProfileName: EntityName, TrainingJobDefinition: TrainingJobDefinition): AlgorithmValidationProfile = {
    val __obj = js.Dynamic.literal(ProfileName = ProfileName.asInstanceOf[js.Any], TrainingJobDefinition = TrainingJobDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmValidationProfile]
  }
  
  extension [Self <: AlgorithmValidationProfile](x: Self) {
    
    inline def setProfileName(value: EntityName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobDefinition(value: TrainingJobDefinition): Self = StObject.set(x, "TrainingJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setTransformJobDefinition(value: TransformJobDefinition): Self = StObject.set(x, "TransformJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setTransformJobDefinitionUndefined: Self = StObject.set(x, "TransformJobDefinition", js.undefined)
  }
}
