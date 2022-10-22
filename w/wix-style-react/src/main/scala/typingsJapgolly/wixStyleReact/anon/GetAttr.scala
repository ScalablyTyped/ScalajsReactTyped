package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAttr extends StObject {
  
  def exists(): Boolean
  
  def getAttr(attrName: Any): Any
  
  def getLabel(): Any
  
  def getNumberOfChildren(): Any
  
  def hasInputs(): Boolean
  
  def hasLabel(): Boolean
}
object GetAttr {
  
  inline def apply(
    exists: CallbackTo[Boolean],
    getAttr: Any => Any,
    getLabel: CallbackTo[Any],
    getNumberOfChildren: CallbackTo[Any],
    hasInputs: CallbackTo[Boolean],
    hasLabel: CallbackTo[Boolean]
  ): GetAttr = {
    val __obj = js.Dynamic.literal(exists = exists.toJsFn, getAttr = js.Any.fromFunction1(getAttr), getLabel = getLabel.toJsFn, getNumberOfChildren = getNumberOfChildren.toJsFn, hasInputs = hasInputs.toJsFn, hasLabel = hasLabel.toJsFn)
    __obj.asInstanceOf[GetAttr]
  }
  
  extension [Self <: GetAttr](x: Self) {
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetAttr(value: Any => Any): Self = StObject.set(x, "getAttr", js.Any.fromFunction1(value))
    
    inline def setGetLabel(value: CallbackTo[Any]): Self = StObject.set(x, "getLabel", value.toJsFn)
    
    inline def setGetNumberOfChildren(value: CallbackTo[Any]): Self = StObject.set(x, "getNumberOfChildren", value.toJsFn)
    
    inline def setHasInputs(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasInputs", value.toJsFn)
    
    inline def setHasLabel(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasLabel", value.toJsFn)
  }
}
