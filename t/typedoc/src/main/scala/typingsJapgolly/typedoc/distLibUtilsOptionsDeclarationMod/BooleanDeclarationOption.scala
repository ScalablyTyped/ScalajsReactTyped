package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanDeclarationOption
  extends StObject
     with DeclarationOptionBase
     with _DeclarationOption {
  
  /**
    * If not specified defaults to false.
    */
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_BooleanDeclarationOption: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean
}
object BooleanDeclarationOption {
  
  inline def apply(
    help: String,
    name: String,
    `type`: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean
  ): BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanDeclarationOption]
  }
  
  extension [Self <: BooleanDeclarationOption](x: Self) {
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
