package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.parcelTypesStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var `type`: asset
  
  var value: typingsJapgolly.parcelTypes.mod.Asset
}
object Value {
  
  inline def apply(value: typingsJapgolly.parcelTypes.mod.Asset): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typingsJapgolly.parcelTypes.mod.Asset): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
