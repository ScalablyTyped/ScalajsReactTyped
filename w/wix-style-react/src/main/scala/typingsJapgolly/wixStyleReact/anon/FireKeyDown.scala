package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FireKeyDown extends StObject {
  
  def blur(): Any
  
  def click(): Unit
  
  def exists(): Boolean
  
  def fireKeyDown(): Boolean
  
  def fireKeyUp(): Boolean
  
  def fireMouseDown(): Boolean
  
  def focus(): Any
  
  def hasFocusState(): Boolean
  
  def hasFocusVisibleState(): Boolean
  
  def tabIn(): Unit
  
  def tabOut(): Unit
}
object FireKeyDown {
  
  inline def apply(
    blur: CallbackTo[Any],
    click: Callback,
    exists: CallbackTo[Boolean],
    fireKeyDown: CallbackTo[Boolean],
    fireKeyUp: CallbackTo[Boolean],
    fireMouseDown: CallbackTo[Boolean],
    focus: CallbackTo[Any],
    hasFocusState: CallbackTo[Boolean],
    hasFocusVisibleState: CallbackTo[Boolean],
    tabIn: Callback,
    tabOut: Callback
  ): FireKeyDown = {
    val __obj = js.Dynamic.literal(blur = blur.toJsFn, click = click.toJsFn, exists = exists.toJsFn, fireKeyDown = fireKeyDown.toJsFn, fireKeyUp = fireKeyUp.toJsFn, fireMouseDown = fireMouseDown.toJsFn, focus = focus.toJsFn, hasFocusState = hasFocusState.toJsFn, hasFocusVisibleState = hasFocusVisibleState.toJsFn, tabIn = tabIn.toJsFn, tabOut = tabOut.toJsFn)
    __obj.asInstanceOf[FireKeyDown]
  }
  
  extension [Self <: FireKeyDown](x: Self) {
    
    inline def setBlur(value: CallbackTo[Any]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
    
    inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setFireKeyDown(value: CallbackTo[Boolean]): Self = StObject.set(x, "fireKeyDown", value.toJsFn)
    
    inline def setFireKeyUp(value: CallbackTo[Boolean]): Self = StObject.set(x, "fireKeyUp", value.toJsFn)
    
    inline def setFireMouseDown(value: CallbackTo[Boolean]): Self = StObject.set(x, "fireMouseDown", value.toJsFn)
    
    inline def setFocus(value: CallbackTo[Any]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setHasFocusState(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFocusState", value.toJsFn)
    
    inline def setHasFocusVisibleState(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFocusVisibleState", value.toJsFn)
    
    inline def setTabIn(value: Callback): Self = StObject.set(x, "tabIn", value.toJsFn)
    
    inline def setTabOut(value: Callback): Self = StObject.set(x, "tabOut", value.toJsFn)
  }
}
