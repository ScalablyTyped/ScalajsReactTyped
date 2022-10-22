package typingsJapgolly.jssha.anon

import typingsJapgolly.jssha.jsshaStrings.B64
import typingsJapgolly.jssha.jsshaStrings.BYTES
import typingsJapgolly.jssha.jsshaStrings.HEX
import typingsJapgolly.jssha.mod.GenericInputType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with GenericInputType
     with typingsJapgolly.jssha.distSha1Mod.GenericInputType
     with typingsJapgolly.jssha.distSha3Mod.GenericInputType
     with typingsJapgolly.jssha.distSha256Mod.GenericInputType
     with typingsJapgolly.jssha.distSha512Mod.GenericInputType {
  
  var format: B64 | HEX | BYTES
  
  var value: String
}
object Value {
  
  inline def apply(format: B64 | HEX | BYTES, value: String): Value = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setFormat(value: B64 | HEX | BYTES): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
