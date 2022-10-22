package typingsJapgolly.asn1js.mod

import typingsJapgolly.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent asn1js.asn1js.ValueBlockParams */
/* Inlined parent asn1js.asn1js.HexBlockParams */
/* Inlined parent std.Partial<asn1js.asn1js.ILocalBooleanValueBlock> */
trait LocalBooleanValueBlockParams extends StObject {
  
  var blockLength: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[String] = js.undefined
  
  var isHexOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  var value: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueBeforeDecode: js.UndefOr[BufferSource] = js.undefined
  
  var valueHex: js.UndefOr[BufferSource] = js.undefined
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object LocalBooleanValueBlockParams {
  
  inline def apply(): LocalBooleanValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBooleanValueBlockParams]
  }
  
  extension [Self <: LocalBooleanValueBlockParams](x: Self) {
    
    inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    inline def setBlockLengthUndefined: Self = StObject.set(x, "blockLength", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIsHexOnly(value: scala.Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
    
    inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
    
    inline def setValue(value: scala.Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecode(value: BufferSource): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
    
    inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
    
    inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
