package typingsJapgolly.wxServerSdk.mod

import typingsJapgolly.wxServerSdk.anon.Total
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountCollectionResult extends StObject {
  
  var stats: Total
}
object CountCollectionResult {
  
  inline def apply(stats: Total): CountCollectionResult = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountCollectionResult]
  }
  
  extension [Self <: CountCollectionResult](x: Self) {
    
    inline def setStats(value: Total): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
