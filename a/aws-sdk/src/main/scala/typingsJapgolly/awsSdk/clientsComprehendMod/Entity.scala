package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /**
    * The zero-based offset from the beginning of the source text to the first character in the entity.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The zero-based offset from the beginning of the source text to the last character in the entity.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The text of the entity.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * The entity's type.
    */
  var Type: js.UndefOr[EntityType] = js.undefined
}
object Entity {
  
  inline def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  
  extension [Self <: Entity](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setType(value: EntityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
