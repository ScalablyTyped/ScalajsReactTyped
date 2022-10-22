package typingsJapgolly.raml1Parser.distParserHighLevelASTMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractWrapperNode extends StObject {
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  def RAMLVersion(): String
  
  /**
    * @return Actual name of instance interface
    **/
  def kind(): String
  
  /**
    * @hidden
    **/
  def wrapperClassName(): String
}
object AbstractWrapperNode {
  
  inline def apply(RAMLVersion: CallbackTo[String], kind: CallbackTo[String], wrapperClassName: CallbackTo[String]): AbstractWrapperNode = {
    val __obj = js.Dynamic.literal(RAMLVersion = RAMLVersion.toJsFn, kind = kind.toJsFn, wrapperClassName = wrapperClassName.toJsFn)
    __obj.asInstanceOf[AbstractWrapperNode]
  }
  
  extension [Self <: AbstractWrapperNode](x: Self) {
    
    inline def setKind(value: CallbackTo[String]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setRAMLVersion(value: CallbackTo[String]): Self = StObject.set(x, "RAMLVersion", value.toJsFn)
    
    inline def setWrapperClassName(value: CallbackTo[String]): Self = StObject.set(x, "wrapperClassName", value.toJsFn)
  }
}
