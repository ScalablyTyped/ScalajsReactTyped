package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionInfo...
  */
trait IGenericDimensionInfo extends StObject {
  
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * The default value is false.
    */
  var qAndMode: Boolean
  
  /**
    * Length of the longest value in the field.
    */
  var qApprMaxGlyphCount: Double
  
  /**
    * Number of distinct field values
    */
  var qCardinal: Double
  
  /**
    * If set to true, it means that the field is a semantic.
    */
  var qIsSemantic: Boolean
  
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String]
}
object IGenericDimensionInfo {
  
  inline def apply(
    qAndMode: Boolean,
    qApprMaxGlyphCount: Double,
    qCardinal: Double,
    qIsSemantic: Boolean,
    qTags: js.Array[String]
  ): IGenericDimensionInfo = {
    val __obj = js.Dynamic.literal(qAndMode = qAndMode.asInstanceOf[js.Any], qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionInfo]
  }
  
  extension [Self <: IGenericDimensionInfo](x: Self) {
    
    inline def setQAndMode(value: Boolean): Self = StObject.set(x, "qAndMode", value.asInstanceOf[js.Any])
    
    inline def setQApprMaxGlyphCount(value: Double): Self = StObject.set(x, "qApprMaxGlyphCount", value.asInstanceOf[js.Any])
    
    inline def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    inline def setQIsSemantic(value: Boolean): Self = StObject.set(x, "qIsSemantic", value.asInstanceOf[js.Any])
    
    inline def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    inline def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value*))
  }
}
