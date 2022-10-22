package typingsJapgolly.muiDatatables.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lookup extends StObject {
  
  var data: js.Array[Index]
  
  var lookup: NumberDictionary[Boolean]
}
object Lookup {
  
  inline def apply(data: js.Array[Index], lookup: NumberDictionary[Boolean]): Lookup = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lookup]
  }
  
  extension [Self <: Lookup](x: Self) {
    
    inline def setData(value: js.Array[Index]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Index*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLookup(value: NumberDictionary[Boolean]): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
  }
}
