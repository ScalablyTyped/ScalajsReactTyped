package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Encodable
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.LineEncodeEntry
import typingsJapgolly.vegaTypings.vegaTypingsStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineMark
  extends StObject
     with BaseMark
     with Encodable[LineEncodeEntry]
     with Mark {
  
  var `type`: line
}
object LineMark {
  
  inline def apply(): LineMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[LineMark]
  }
  
  extension [Self <: LineMark](x: Self) {
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
