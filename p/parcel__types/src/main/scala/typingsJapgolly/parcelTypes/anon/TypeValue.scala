package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.BundleGraphTraversable
import typingsJapgolly.parcelTypes.mod.BundleTraversable
import typingsJapgolly.parcelTypes.parcelTypesStrings.asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValue
  extends StObject
     with BundleGraphTraversable
     with BundleTraversable {
  
  val `type`: asset
  
  var value: typingsJapgolly.parcelTypes.mod.Asset
}
object TypeValue {
  
  inline def apply(value: typingsJapgolly.parcelTypes.mod.Asset): TypeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("asset")
    __obj.asInstanceOf[TypeValue]
  }
  
  extension [Self <: TypeValue](x: Self) {
    
    inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typingsJapgolly.parcelTypes.mod.Asset): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
