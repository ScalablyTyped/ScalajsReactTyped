package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.webpack.HotEvent
import typingsJapgolly.webpack.webpackStrings.disposed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleId
  extends StObject
     with HotEvent {
  
  /** The module in question. */
  var moduleId: Double
  
  var `type`: disposed
}
object ModuleId {
  
  inline def apply(moduleId: Double): ModuleId = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("disposed")
    __obj.asInstanceOf[ModuleId]
  }
  
  extension [Self <: ModuleId](x: Self) {
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setType(value: disposed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
