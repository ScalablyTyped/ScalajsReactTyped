package typingsJapgolly.ejWebAll.anon

import typingsJapgolly.ejWebAll.ej.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTile extends StObject {
  
  /* static member */
  var Locale: Any
  
  /* static member */
  var fn: Tile
}
object TypeofTile {
  
  inline def apply(Locale: Any, fn: Tile): TypeofTile = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTile]
  }
  
  extension [Self <: TypeofTile](x: Self) {
    
    inline def setFn(value: Tile): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Any): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
