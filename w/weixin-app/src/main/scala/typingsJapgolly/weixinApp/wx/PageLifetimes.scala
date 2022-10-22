package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
  */
trait PageLifetimes extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object PageLifetimes {
  
  inline def apply(hide: Callback, show: Callback): PageLifetimes = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = show.toJsFn)
    __obj.asInstanceOf[PageLifetimes]
  }
  
  extension [Self <: PageLifetimes](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
