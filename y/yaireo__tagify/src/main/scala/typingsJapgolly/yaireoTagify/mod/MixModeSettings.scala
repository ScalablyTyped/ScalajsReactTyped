package typingsJapgolly.yaireoTagify.mod

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the mix mode feature that can be activated via the `mode`
  * option of the settings that are passed to tagify.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.MixModeRuntimeSettings> */
trait MixModeSettings extends StObject {
  
  var insertAfterTag: js.UndefOr[String | HTMLElement] = js.undefined
}
object MixModeSettings {
  
  inline def apply(): MixModeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MixModeSettings]
  }
  
  extension [Self <: MixModeSettings](x: Self) {
    
    inline def setInsertAfterTag(value: String | HTMLElement): Self = StObject.set(x, "insertAfterTag", value.asInstanceOf[js.Any])
    
    inline def setInsertAfterTagUndefined: Self = StObject.set(x, "insertAfterTag", js.undefined)
  }
}
