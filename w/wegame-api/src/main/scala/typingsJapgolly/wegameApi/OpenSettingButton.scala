package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wx.types.ButtonStyle
import typingsJapgolly.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenSettingButton
  extends StObject
     with CreatedButton {
  
  def offTap(callback: js.Function0[Unit]): Unit
  
  def onTap(callback: js.Function0[Unit]): Unit
}
object OpenSettingButton {
  
  inline def apply(
    destroy: Callback,
    hide: Callback,
    image: String,
    offTap: js.Function0[Unit] => Callback,
    onTap: js.Function0[Unit] => Callback,
    show: Callback,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): OpenSettingButton = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1((t0: js.Function0[Unit]) => offTap(t0).runNow()), onTap = js.Any.fromFunction1((t0: js.Function0[Unit]) => onTap(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSettingButton]
  }
  
  extension [Self <: OpenSettingButton](x: Self) {
    
    inline def setOffTap(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offTap", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnTap(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onTap", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
