package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import typingsJapgolly.std.Record
import typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Flags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlagsDeclarationOption[T /* <: Record[String, Boolean] */]
  extends StObject
     with DeclarationOptionBase {
  
  /**
    * All of the possible flags, with their default values set.
    */
  var defaults: T
  
  @JSName("type")
  var type_FlagsDeclarationOption: Flags
}
object FlagsDeclarationOption {
  
  inline def apply[T /* <: Record[String, Boolean] */](defaults: T, help: String, name: String, `type`: Flags): FlagsDeclarationOption[T] = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagsDeclarationOption[T]]
  }
  
  extension [Self <: FlagsDeclarationOption[?], T /* <: Record[String, Boolean] */](x: Self & FlagsDeclarationOption[T]) {
    
    inline def setDefaults(value: T): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setType(value: Flags): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
