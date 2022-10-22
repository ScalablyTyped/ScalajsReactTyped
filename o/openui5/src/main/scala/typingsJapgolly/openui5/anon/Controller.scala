package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapUiCoreMvcControllerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Controller extends StObject {
  
  /**
    * Controller instance to be used for this view. The given controller instance overrides the controller
    * defined in the view definition. Sharing a controller instance between multiple views is not supported.
    */
  var controller: js.UndefOr[default] = js.undefined
  
  /**
    * The view definition.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies an ID for the view instance. If no ID is given, an ID will be generated.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the view resource in module name notation (without suffix)
    */
  var viewName: js.UndefOr[String] = js.undefined
}
object Controller {
  
  inline def apply(): Controller = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Controller]
  }
  
  extension [Self <: Controller](x: Self) {
    
    inline def setController(value: default): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setViewName(value: String): Self = StObject.set(x, "viewName", value.asInstanceOf[js.Any])
    
    inline def setViewNameUndefined: Self = StObject.set(x, "viewName", js.undefined)
  }
}
