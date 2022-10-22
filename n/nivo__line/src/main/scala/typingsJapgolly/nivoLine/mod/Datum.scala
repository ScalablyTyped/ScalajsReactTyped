package typingsJapgolly.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datum
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var x: js.UndefOr[DatumValue | Null] = js.undefined
  
  var y: js.UndefOr[DatumValue | Null] = js.undefined
}
object Datum {
  
  inline def apply(): Datum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datum]
  }
  
  extension [Self <: Datum](x: Self) {
    
    inline def setX(value: DatumValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: DatumValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
