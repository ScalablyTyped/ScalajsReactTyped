package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameTile
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var tile: org.scalajs.dom.Element
}
object DictpropNameTile {
  
  inline def apply(tile: org.scalajs.dom.Element): DictpropNameTile = {
    val __obj = js.Dynamic.literal(tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameTile]
  }
  
  extension [Self <: DictpropNameTile](x: Self) {
    
    inline def setTile(value: org.scalajs.dom.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
