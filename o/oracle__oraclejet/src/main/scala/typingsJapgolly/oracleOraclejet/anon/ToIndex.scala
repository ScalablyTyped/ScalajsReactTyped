package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToIndex
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var fromIndex: Double
  
  var tile: org.scalajs.dom.Element
  
  var toIndex: Double
}
object ToIndex {
  
  inline def apply(fromIndex: Double, tile: org.scalajs.dom.Element, toIndex: Double): ToIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToIndex]
  }
  
  extension [Self <: ToIndex](x: Self) {
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setTile(value: org.scalajs.dom.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
