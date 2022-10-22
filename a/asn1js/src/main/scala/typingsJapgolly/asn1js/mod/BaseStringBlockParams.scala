package typingsJapgolly.asn1js.mod

import typingsJapgolly.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.asn1js.mod.LocalStringValueBlockParams because var conflicts: blockLength, error, valueBeforeDecode, warnings. Inlined valueHex, value */ trait BaseStringBlockParams
  extends StObject
     with BaseBlockParams {
  
  var value: js.UndefOr[String] = js.undefined
  
  var valueHex: js.UndefOr[BufferSource] = js.undefined
}
object BaseStringBlockParams {
  
  inline def apply(): BaseStringBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseStringBlockParams]
  }
  
  extension [Self <: BaseStringBlockParams](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
