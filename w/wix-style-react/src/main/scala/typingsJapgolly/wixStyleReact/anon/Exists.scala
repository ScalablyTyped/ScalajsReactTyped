package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exists extends StObject {
  
  def clickOutside(): js.Promise[Unit]
  
  def exists(): js.Promise[Boolean]
  
  def getWidth(): js.Promise[String]
  
  def open(): ReturnType[js.Function0[js.Promise[Unit]]]
}
object Exists {
  
  inline def apply(
    clickOutside: CallbackTo[js.Promise[Unit]],
    exists: CallbackTo[js.Promise[Boolean]],
    getWidth: CallbackTo[js.Promise[String]],
    open: CallbackTo[ReturnType[js.Function0[js.Promise[Unit]]]]
  ): Exists = {
    val __obj = js.Dynamic.literal(clickOutside = clickOutside.toJsFn, exists = exists.toJsFn, getWidth = getWidth.toJsFn, open = open.toJsFn)
    __obj.asInstanceOf[Exists]
  }
  
  extension [Self <: Exists](x: Self) {
    
    inline def setClickOutside(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickOutside", value.toJsFn)
    
    inline def setExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setOpen(value: CallbackTo[ReturnType[js.Function0[js.Promise[Unit]]]]): Self = StObject.set(x, "open", value.toJsFn)
  }
}
