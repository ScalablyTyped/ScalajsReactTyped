package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INodeValidationPlugin extends StObject {
  
  /**
    * String ID of the plugin
    */
  def id(): String
  
  /**
    * Apply validation to AST node
    * @param node AST node
    * @return array of {ValidationIssue}
    */
  def process(node: IParseResult): js.Array[PluginValidationIssue]
}
object INodeValidationPlugin {
  
  inline def apply(id: CallbackTo[String], process: IParseResult => js.Array[PluginValidationIssue]): INodeValidationPlugin = {
    val __obj = js.Dynamic.literal(id = id.toJsFn, process = js.Any.fromFunction1(process))
    __obj.asInstanceOf[INodeValidationPlugin]
  }
  
  extension [Self <: INodeValidationPlugin](x: Self) {
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setProcess(value: IParseResult => js.Array[PluginValidationIssue]): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
  }
}
