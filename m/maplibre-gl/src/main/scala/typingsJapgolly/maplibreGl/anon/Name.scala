package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.maplibreGlStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name
  extends StObject
     with typingsJapgolly.maplibreGl.mod.InterpolationType
     with typingsJapgolly.maplibreGl.distStyleSpecMod.InterpolationType {
  
  var name: linear
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "linear")
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(value: linear): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
