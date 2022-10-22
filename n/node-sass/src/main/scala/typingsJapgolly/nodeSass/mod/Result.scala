package typingsJapgolly.nodeSass.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodeSass.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var css: Buffer
  
  var map: Buffer
  
  var stats: Duration
}
object Result {
  
  inline def apply(css: Buffer, map: Buffer, stats: Duration): Result = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setCss(value: Buffer): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Buffer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
