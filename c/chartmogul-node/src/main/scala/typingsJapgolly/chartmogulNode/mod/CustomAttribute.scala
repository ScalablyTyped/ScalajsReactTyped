package typingsJapgolly.chartmogulNode.mod

import typingsJapgolly.chartmogulNode.anon.Custom
import typingsJapgolly.chartmogulNode.anon.CustomArray
import typingsJapgolly.chartmogulNode.anon.CustomStrings
import typingsJapgolly.chartmogulNode.commonMod.Entries
import typingsJapgolly.chartmogulNode.commonMod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomAttribute {
  
  @JSImport("chartmogul-node", "CustomAttribute")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(config: Config, uuid: String, data: Custom): js.Promise[Entries[typingsJapgolly.chartmogulNode.mod.Customer.Customer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Entries[typingsJapgolly.chartmogulNode.mod.Customer.Customer]]]
  inline def add(config: Config, uuid: String, data: CustomArray): js.Promise[CustomAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CustomAttributes]]
  
  inline def remove(config: Config, uuid: String, data: CustomStrings): js.Promise[CustomAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CustomAttributes]]
  
  inline def update(config: Config, uuid: String, data: CustomAttributes): js.Promise[CustomAttributes] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CustomAttributes]]
  
  trait CustomAttributes extends StObject {
    
    var custom: Map
  }
  object CustomAttributes {
    
    inline def apply(custom: Map): CustomAttributes = {
      val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomAttributes]
    }
    
    extension [Self <: CustomAttributes](x: Self) {
      
      inline def setCustom(value: Map): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    }
  }
}
