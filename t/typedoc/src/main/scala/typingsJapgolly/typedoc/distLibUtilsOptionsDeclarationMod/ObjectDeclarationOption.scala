package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption {
  
  /**
    * If not specified defaults to undefined.
    */
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  @JSName("type")
  var type_ObjectDeclarationOption: Object
  
  /**
    * An optional validation function that validates a potential value of this option.
    * The function must throw an Error if the validation fails and should do nothing otherwise.
    */
  var validate: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
}
object ObjectDeclarationOption {
  
  inline def apply(help: String, name: String, `type`: Object): ObjectDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDeclarationOption]
  }
  
  extension [Self <: ObjectDeclarationOption](x: Self) {
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: Object): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* value */ Any => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* value */ Any) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
