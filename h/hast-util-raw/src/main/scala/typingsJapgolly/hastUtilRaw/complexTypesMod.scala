package typingsJapgolly.hastUtilRaw

import typingsJapgolly.hast.mod.Literal
import typingsJapgolly.hastUtilRaw.hastUtilRawStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexTypesMod {
  
  trait Raw
    extends StObject
       with Literal {
    
    @JSName("type")
    var type_Raw: raw
  }
  object Raw {
    
    inline def apply(value: Any): Raw = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("raw")
      __obj.asInstanceOf[Raw]
    }
    
    extension [Self <: Raw](x: Self) {
      
      inline def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object hastAugmentingMod {
    
    trait ElementContentMap extends StObject {
      
      var raw: Raw
    }
    object ElementContentMap {
      
      inline def apply(raw: Raw): ElementContentMap = {
        val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[ElementContentMap]
      }
      
      extension [Self <: ElementContentMap](x: Self) {
        
        inline def setRaw(value: Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
    
    trait RootContentMap extends StObject {
      
      var raw: Raw
    }
    object RootContentMap {
      
      inline def apply(raw: Raw): RootContentMap = {
        val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
        __obj.asInstanceOf[RootContentMap]
      }
      
      extension [Self <: RootContentMap](x: Self) {
        
        inline def setRaw(value: Raw): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      }
    }
  }
}
