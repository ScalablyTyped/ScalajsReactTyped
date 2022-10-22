package typingsJapgolly.maplibreGl.distStyleSpecMod

import typingsJapgolly.maplibreGl.maplibreGlStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberTypeT
  extends StObject
     with Type {
  
  var kind: number
}
object NumberTypeT {
  
  inline def apply(): NumberTypeT = {
    val __obj = js.Dynamic.literal(kind = "number")
    __obj.asInstanceOf[NumberTypeT]
  }
  
  extension [Self <: NumberTypeT](x: Self) {
    
    inline def setKind(value: number): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
