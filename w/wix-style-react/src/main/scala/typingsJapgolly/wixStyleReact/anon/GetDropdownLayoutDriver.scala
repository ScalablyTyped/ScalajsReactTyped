package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDropdownLayoutDriver extends StObject {
  
  def element(): Any
  
  def exists(): Boolean
  
  def getDropdownLayoutDriver(): Any
}
object GetDropdownLayoutDriver {
  
  inline def apply(element: CallbackTo[Any], exists: CallbackTo[Boolean], getDropdownLayoutDriver: CallbackTo[Any]): GetDropdownLayoutDriver = {
    val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getDropdownLayoutDriver = getDropdownLayoutDriver.toJsFn)
    __obj.asInstanceOf[GetDropdownLayoutDriver]
  }
  
  extension [Self <: GetDropdownLayoutDriver](x: Self) {
    
    inline def setElement(value: CallbackTo[Any]): Self = StObject.set(x, "element", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetDropdownLayoutDriver(value: CallbackTo[Any]): Self = StObject.set(x, "getDropdownLayoutDriver", value.toJsFn)
  }
}
