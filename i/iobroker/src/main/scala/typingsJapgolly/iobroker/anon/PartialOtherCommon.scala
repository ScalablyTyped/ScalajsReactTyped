package typingsJapgolly.iobroker.anon

import typingsJapgolly.iobroker.iobrokerBooleans.`true`
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.OtherCommon> */
trait PartialOtherCommon extends StObject {
  
  var custom: Unit
  
  var dontDelete: js.UndefOr[`true`] = js.undefined
  
  var expert: js.UndefOr[`true`] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[StringOrTranslated] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
}
object PartialOtherCommon {
  
  inline def apply(custom: Unit): PartialOtherCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOtherCommon]
  }
  
  extension [Self <: PartialOtherCommon](x: Self) {
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setDontDelete(value: `true`): Self = StObject.set(x, "dontDelete", value.asInstanceOf[js.Any])
    
    inline def setDontDeleteUndefined: Self = StObject.set(x, "dontDelete", js.undefined)
    
    inline def setExpert(value: `true`): Self = StObject.set(x, "expert", value.asInstanceOf[js.Any])
    
    inline def setExpertUndefined: Self = StObject.set(x, "expert", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: StringOrTranslated): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
