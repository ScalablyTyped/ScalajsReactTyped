package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerScrollPosition extends StObject {
  
  def exists(): Boolean
  
  def getContainerScrollPosition(containerId: String): Any
  
  def getOptionsCount(): Any
  
  def getSelectedOptionsCount(): Double
  
  def optionAt(index: Double): ClassName
  
  def triggerMouseDown(): Any
}
object GetContainerScrollPosition {
  
  inline def apply(
    exists: CallbackTo[Boolean],
    getContainerScrollPosition: String => Any,
    getOptionsCount: CallbackTo[Any],
    getSelectedOptionsCount: CallbackTo[Double],
    optionAt: Double => ClassName,
    triggerMouseDown: CallbackTo[Any]
  ): GetContainerScrollPosition = {
    val __obj = js.Dynamic.literal(exists = exists.toJsFn, getContainerScrollPosition = js.Any.fromFunction1(getContainerScrollPosition), getOptionsCount = getOptionsCount.toJsFn, getSelectedOptionsCount = getSelectedOptionsCount.toJsFn, optionAt = js.Any.fromFunction1(optionAt), triggerMouseDown = triggerMouseDown.toJsFn)
    __obj.asInstanceOf[GetContainerScrollPosition]
  }
  
  extension [Self <: GetContainerScrollPosition](x: Self) {
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetContainerScrollPosition(value: String => Any): Self = StObject.set(x, "getContainerScrollPosition", js.Any.fromFunction1(value))
    
    inline def setGetOptionsCount(value: CallbackTo[Any]): Self = StObject.set(x, "getOptionsCount", value.toJsFn)
    
    inline def setGetSelectedOptionsCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSelectedOptionsCount", value.toJsFn)
    
    inline def setOptionAt(value: Double => ClassName): Self = StObject.set(x, "optionAt", js.Any.fromFunction1(value))
    
    inline def setTriggerMouseDown(value: CallbackTo[Any]): Self = StObject.set(x, "triggerMouseDown", value.toJsFn)
  }
}
