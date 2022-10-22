package typingsJapgolly.webpack.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map extends StObject {
  
  var map: js.Object
  
  var source: String | Buffer
}
object Map {
  
  inline def apply(map: js.Object, source: String | Buffer): Map = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  
  extension [Self <: Map](x: Self) {
    
    inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
