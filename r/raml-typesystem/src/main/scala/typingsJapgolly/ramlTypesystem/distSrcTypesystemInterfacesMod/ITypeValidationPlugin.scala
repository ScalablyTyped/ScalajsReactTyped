package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypeValidationPlugin extends StObject {
  
  /**
    * String ID of the plugin
    */
  def id(): String
  
  /**
    * @param t the type to be validated
    * @param reg context type registry
    */
  def process(t: IParsedType, reg: ITypeRegistry): js.Array[PluginValidationIssue]
}
object ITypeValidationPlugin {
  
  inline def apply(id: CallbackTo[String], process: (IParsedType, ITypeRegistry) => js.Array[PluginValidationIssue]): ITypeValidationPlugin = {
    val __obj = js.Dynamic.literal(id = id.toJsFn, process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[ITypeValidationPlugin]
  }
  
  extension [Self <: ITypeValidationPlugin](x: Self) {
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setProcess(value: (IParsedType, ITypeRegistry) => js.Array[PluginValidationIssue]): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
  }
}
