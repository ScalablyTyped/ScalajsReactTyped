package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var stats: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats
  
  var ts: Double
}
object Stats {
  
  inline def apply(stats: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats, ts: Double): Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setStats(value: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
