package typingsJapgolly.fsExtra.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEntry extends StObject {
  
  var path: String
  
  var stats: typingsJapgolly.node.fsMod.Stats
}
object PathEntry {
  
  inline def apply(path: String, stats: typingsJapgolly.node.fsMod.Stats): PathEntry = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEntry]
  }
  
  extension [Self <: PathEntry](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStats(value: typingsJapgolly.node.fsMod.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
