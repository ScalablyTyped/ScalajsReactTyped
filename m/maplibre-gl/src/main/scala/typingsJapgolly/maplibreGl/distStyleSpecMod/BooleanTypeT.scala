package typingsJapgolly.maplibreGl.distStyleSpecMod

import typingsJapgolly.maplibreGl.maplibreGlStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanTypeT
  extends StObject
     with Type {
  
  var kind: boolean
}
object BooleanTypeT {
  
  inline def apply(): BooleanTypeT = {
    val __obj = js.Dynamic.literal(kind = "boolean")
    __obj.asInstanceOf[BooleanTypeT]
  }
  
  extension [Self <: BooleanTypeT](x: Self) {
    
    inline def setKind(value: boolean): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
