package typingsJapgolly.storybookAddonActions

import typingsJapgolly.storybookAddonActions.anon.Args
import typingsJapgolly.storybookAddonActions.distTs3Dot9ModelsActionOptionsMod.ActionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModelsActionDisplayMod {
  
  trait ActionDisplay extends StObject {
    
    var count: Double
    
    var data: Args
    
    var id: String
    
    var options: ActionOptions
  }
  object ActionDisplay {
    
    inline def apply(count: Double, data: Args, id: String, options: ActionOptions): ActionDisplay = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionDisplay]
    }
    
    extension [Self <: ActionDisplay](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setData(value: Args): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ActionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
