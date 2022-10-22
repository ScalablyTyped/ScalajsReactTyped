package typingsJapgolly.weixinApp.anon

import typingsJapgolly.weixinApp.wx.Stat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var stats: Stat
}
object Stats {
  
  inline def apply(stats: Stat): Stats = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setStats(value: Stat): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
