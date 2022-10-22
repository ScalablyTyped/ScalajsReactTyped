package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Encodable
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.TrailEncodeEntry
import typingsJapgolly.vegaTypings.vegaTypingsStrings.trail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrailMark
  extends StObject
     with BaseMark
     with Encodable[TrailEncodeEntry]
     with Mark {
  
  var `type`: trail
}
object TrailMark {
  
  inline def apply(): TrailMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("trail")
    __obj.asInstanceOf[TrailMark]
  }
  
  extension [Self <: TrailMark](x: Self) {
    
    inline def setType(value: trail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
