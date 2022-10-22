package typingsJapgolly.pkijs.mod

import typingsJapgolly.std.AesCbcParams
import typingsJapgolly.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.std.Algorithm because Already inherited
- typingsJapgolly.std.AesDerivedKeyParams because var conflicts: name. Inlined length */ trait ContentEncryptionAesCbcParams
  extends StObject
     with AesCbcParams
     with ContentEncryptionAlgorithm {
  
  /* standard dom */
  var length: Double
}
object ContentEncryptionAesCbcParams {
  
  inline def apply(iv: BufferSource, length: Double, name: String): ContentEncryptionAesCbcParams = {
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncryptionAesCbcParams]
  }
  
  extension [Self <: ContentEncryptionAesCbcParams](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
