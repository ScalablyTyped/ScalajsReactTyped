package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  type UITest = XUITest
  
  trait XUIObject extends StObject {
    
    val Children: SafeArray[String]
    
    val State: PropertyValues
    
    val Type: String
    
    def executeAction(action: String, propValues: PropertyValues): Unit
    
    def getChild(id: String): XUIObject
    
    def getChildren(): SafeArray[String]
    
    def getState(): PropertyValues
    
    def getType(): String
  }
  object XUIObject {
    
    inline def apply(
      Children: SafeArray[String],
      State: PropertyValues,
      Type: String,
      executeAction: (String, PropertyValues) => Callback,
      getChild: String => XUIObject,
      getChildren: CallbackTo[SafeArray[String]],
      getState: CallbackTo[PropertyValues],
      getType: CallbackTo[String]
    ): XUIObject = {
      val __obj = js.Dynamic.literal(Children = Children.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], executeAction = js.Any.fromFunction2((t0: String, t1: PropertyValues) => (executeAction(t0, t1)).runNow()), getChild = js.Any.fromFunction1(getChild), getChildren = getChildren.toJsFn, getState = getState.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[XUIObject]
    }
    
    extension [Self <: XUIObject](x: Self) {
      
      inline def setChildren(value: SafeArray[String]): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
      
      inline def setExecuteAction(value: (String, PropertyValues) => Callback): Self = StObject.set(x, "executeAction", js.Any.fromFunction2((t0: String, t1: PropertyValues) => (value(t0, t1)).runNow()))
      
      inline def setGetChild(value: String => XUIObject): Self = StObject.set(x, "getChild", js.Any.fromFunction1(value))
      
      inline def setGetChildren(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetState(value: CallbackTo[PropertyValues]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setState(value: PropertyValues): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStateVarargs(value: PropertyValue*): Self = StObject.set(x, "State", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  trait XUITest extends StObject {
    
    val TopFocusWindow: XUIObject
    
    def executeCommand(command: String): Unit
    
    def getTopFocusWindow(): XUIObject
  }
  object XUITest {
    
    inline def apply(
      TopFocusWindow: XUIObject,
      executeCommand: String => Callback,
      getTopFocusWindow: CallbackTo[XUIObject]
    ): XUITest = {
      val __obj = js.Dynamic.literal(TopFocusWindow = TopFocusWindow.asInstanceOf[js.Any], executeCommand = js.Any.fromFunction1((t0: String) => executeCommand(t0).runNow()), getTopFocusWindow = getTopFocusWindow.toJsFn)
      __obj.asInstanceOf[XUITest]
    }
    
    extension [Self <: XUITest](x: Self) {
      
      inline def setExecuteCommand(value: String => Callback): Self = StObject.set(x, "executeCommand", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetTopFocusWindow(value: CallbackTo[XUIObject]): Self = StObject.set(x, "getTopFocusWindow", value.toJsFn)
      
      inline def setTopFocusWindow(value: XUIObject): Self = StObject.set(x, "TopFocusWindow", value.asInstanceOf[js.Any])
    }
  }
}
