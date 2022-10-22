package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.BundleGraphTraversable
import typingsJapgolly.parcelTypes.mod.BundleTraversable
import typingsJapgolly.parcelTypes.parcelTypesStrings.dependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueDependency
  extends StObject
     with BundleGraphTraversable
     with BundleTraversable {
  
  val `type`: dependency
  
  var value: typingsJapgolly.parcelTypes.mod.Dependency
}
object ValueDependency {
  
  inline def apply(value: typingsJapgolly.parcelTypes.mod.Dependency): ValueDependency = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dependency")
    __obj.asInstanceOf[ValueDependency]
  }
  
  extension [Self <: ValueDependency](x: Self) {
    
    inline def setType(value: dependency): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typingsJapgolly.parcelTypes.mod.Dependency): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
