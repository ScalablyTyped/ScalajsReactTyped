package typingsJapgolly.iobroker.objectsMod.global.ioBroker

import typingsJapgolly.iobroker.iobrokerStrings.metaDotfolder
import typingsJapgolly.iobroker.iobrokerStrings.metaDotuser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaCommon
  extends StObject
     with ObjectCommon {
  
  // Make it possible to narrow the object type using the custom property
  var custom: Unit
  
  // Meta objects have to additional CommonTypes
  var `type`: CommonType | metaDotuser | metaDotfolder
}
object MetaCommon {
  
  inline def apply(custom: Unit, name: StringOrTranslated, `type`: CommonType | metaDotuser | metaDotfolder): MetaCommon = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaCommon]
  }
  
  extension [Self <: MetaCommon](x: Self) {
    
    inline def setCustom(value: Unit): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setType(value: CommonType | metaDotuser | metaDotfolder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
