package typingsJapgolly.vegaTypings.typesSpecMarkMod

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Encodable
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ShapeEncodeEntry
import typingsJapgolly.vegaTypings.vegaTypingsStrings.shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeMark
  extends StObject
     with BaseMark
     with Encodable[ShapeEncodeEntry]
     with Mark {
  
  var `type`: shape
}
object ShapeMark {
  
  inline def apply(): ShapeMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("shape")
    __obj.asInstanceOf[ShapeMark]
  }
  
  extension [Self <: ShapeMark](x: Self) {
    
    inline def setType(value: shape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
