package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsNestedHeadersNestedHeadersMod {
  
  @JSImport("handsontable/plugins/nestedHeaders/nestedHeaders", "NestedHeaders")
  @js.native
  open class NestedHeaders protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var detectedOverlappedHeaders: Boolean = js.native
    
    def isEnabled(): Boolean = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var colspan: Double
    
    var label: String
  }
  object DetailedSettings {
    
    inline def apply(colspan: Double, label: String): DetailedSettings = {
      val __obj = js.Dynamic.literal(colspan = colspan.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setColspan(value: Double): Self = StObject.set(x, "colspan", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = js.Array[js.Array[String | DetailedSettings]]
}
