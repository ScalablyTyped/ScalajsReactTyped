package typingsJapgolly.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtensionComponent extends StObject {
  
  var model: IExtensionModel
}
object IExtensionComponent {
  
  inline def apply(model: IExtensionModel): IExtensionComponent = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionComponent]
  }
  
  extension [Self <: IExtensionComponent](x: Self) {
    
    inline def setModel(value: IExtensionModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
