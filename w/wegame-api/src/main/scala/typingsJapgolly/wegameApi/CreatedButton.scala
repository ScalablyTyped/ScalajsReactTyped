package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wx.types.ButtonStyle
import typingsJapgolly.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedButton extends StObject {
  
  def destroy(): Unit
  
  def hide(): Unit
  
  var image: String
  
  // res参数会被具体按钮的API定义覆盖为具体信息
  def offTap(callback: js.Function1[/* res */ js.UndefOr[Any], Unit]): Unit
  
  def onTap(callback: js.Function1[/* res */ js.UndefOr[Any], Unit]): Unit
  
  def show(): Unit
  
  var style: ButtonStyle
  
  var text: String
  
  var `type`: ButtonType
}
object CreatedButton {
  
  inline def apply(
    destroy: Callback,
    hide: Callback,
    image: String,
    offTap: js.Function1[/* res */ js.UndefOr[Any], Unit] => Callback,
    onTap: js.Function1[/* res */ js.UndefOr[Any], Unit] => Callback,
    show: Callback,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): CreatedButton = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => offTap(t0).runNow()), onTap = js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => onTap(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedButton]
  }
  
  extension [Self <: CreatedButton](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setOffTap(value: js.Function1[/* res */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "offTap", js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setOnTap(value: js.Function1[/* res */ js.UndefOr[Any], Unit] => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => value(t0).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    
    inline def setStyle(value: ButtonStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: ButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
