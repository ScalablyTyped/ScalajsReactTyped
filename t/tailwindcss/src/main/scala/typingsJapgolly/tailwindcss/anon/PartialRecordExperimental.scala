package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<tailwindcss.tailwindcss/types/config.ExperimentalConfigValues, boolean>> */
trait PartialRecordExperimental extends StObject {
  
  var optimizeUniversalDefaults: js.UndefOr[Boolean] = js.undefined
}
object PartialRecordExperimental {
  
  inline def apply(): PartialRecordExperimental = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordExperimental]
  }
  
  extension [Self <: PartialRecordExperimental](x: Self) {
    
    inline def setOptimizeUniversalDefaults(value: Boolean): Self = StObject.set(x, "optimizeUniversalDefaults", value.asInstanceOf[js.Any])
    
    inline def setOptimizeUniversalDefaultsUndefined: Self = StObject.set(x, "optimizeUniversalDefaults", js.undefined)
  }
}
