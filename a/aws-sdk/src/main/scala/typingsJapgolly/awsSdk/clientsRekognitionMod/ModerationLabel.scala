package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModerationLabel extends StObject {
  
  /**
    * Specifies the confidence that Amazon Rekognition has that the label has been correctly identified. If you don't specify the MinConfidence parameter in the call to DetectModerationLabels, the operation returns labels with a confidence value greater than or equal to 50 percent.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The label name for the type of unsafe content detected in the image.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the parent label. Labels at the top level of the hierarchy have the parent label "".
    */
  var ParentName: js.UndefOr[String] = js.undefined
}
object ModerationLabel {
  
  inline def apply(): ModerationLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModerationLabel]
  }
  
  extension [Self <: ModerationLabel](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setParentName(value: String): Self = StObject.set(x, "ParentName", value.asInstanceOf[js.Any])
    
    inline def setParentNameUndefined: Self = StObject.set(x, "ParentName", js.undefined)
  }
}
