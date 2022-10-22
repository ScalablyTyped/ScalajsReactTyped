package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromIndex
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var fromIndex: Double
  
  var tile: org.scalajs.dom.Element
}
object FromIndex {
  
  inline def apply(fromIndex: Double, tile: org.scalajs.dom.Element): FromIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromIndex]
  }
  
  extension [Self <: FromIndex](x: Self) {
    
    inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setTile(value: org.scalajs.dom.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
