package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tile
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var index: Double
  
  var tile: org.scalajs.dom.Element
}
object Tile {
  
  inline def apply(index: Double, tile: org.scalajs.dom.Element): Tile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
  
  extension [Self <: Tile](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setTile(value: org.scalajs.dom.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
