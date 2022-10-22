package typingsJapgolly.sequelize.anon

import typingsJapgolly.sequelize.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  var as: js.UndefOr[String] = js.undefined
  
  var model: Model[Any, Any, Any]
}
object As {
  
  inline def apply(model: Model[Any, Any, Any]): As = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setModel(value: Model[Any, Any, Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
