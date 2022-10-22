package typingsJapgolly.jssha.anon

import typingsJapgolly.jssha.distSha3Mod.EncodingType
import typingsJapgolly.jssha.distSha3Mod.GenericInputType
import typingsJapgolly.jssha.jsshaStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueString
  extends StObject
     with GenericInputType {
  
  var encoding: js.UndefOr[EncodingType] = js.undefined
  
  var format: TEXT
  
  var value: String
}
object ValueString {
  
  inline def apply(value: String): ValueString = {
    val __obj = js.Dynamic.literal(format = "TEXT", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueString]
  }
  
  extension [Self <: ValueString](x: Self) {
    
    inline def setEncoding(value: EncodingType): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFormat(value: TEXT): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
