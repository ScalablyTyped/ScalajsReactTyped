package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.GlobArray
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.ModuleArray
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption {
  
  /**
    * If not specified defaults to an empty array.
    */
  var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("type")
  var type_ArrayDeclarationOption: Array | PathArray | ModuleArray | GlobArray
  
  /**
    * An optional validation function that validates a potential value of this option.
    * The function must throw an Error if the validation fails and should do nothing otherwise.
    */
  var validate: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.undefined
}
object ArrayDeclarationOption {
  
  inline def apply(help: String, name: String, `type`: Array | PathArray | ModuleArray | GlobArray): ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayDeclarationOption]
  }
  
  extension [Self <: ArrayDeclarationOption](x: Self) {
    
    inline def setDefaultValue(value: js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    
    inline def setType(value: Array | PathArray | ModuleArray | GlobArray): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: /* value */ js.Array[String] => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: /* value */ js.Array[String]) => value(t0).runNow()))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
