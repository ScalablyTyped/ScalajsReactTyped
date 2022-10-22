package typingsJapgolly.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTimelineEntries extends StObject {
  
  /**
    * Default is 50.
    */
  var maxTimelineEntries: js.UndefOr[Double] = js.undefined
}
object MaxTimelineEntries {
  
  inline def apply(): MaxTimelineEntries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimelineEntries]
  }
  
  extension [Self <: MaxTimelineEntries](x: Self) {
    
    inline def setMaxTimelineEntries(value: Double): Self = StObject.set(x, "maxTimelineEntries", value.asInstanceOf[js.Any])
    
    inline def setMaxTimelineEntriesUndefined: Self = StObject.set(x, "maxTimelineEntries", js.undefined)
  }
}
