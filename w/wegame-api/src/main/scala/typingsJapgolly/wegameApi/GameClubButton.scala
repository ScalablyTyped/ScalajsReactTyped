package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wx.types.ButtonStyle
import typingsJapgolly.wegameApi.wx.types.ButtonType
import typingsJapgolly.wegameApi.wx.types.GameClubButtonIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameClubButton
  extends StObject
     with CreatedButton {
  
  var icon: GameClubButtonIcon
}
object GameClubButton {
  
  inline def apply(
    destroy: Callback,
    hide: Callback,
    icon: GameClubButtonIcon,
    image: String,
    offTap: js.Function1[/* res */ js.UndefOr[Any], Unit] => Callback,
    onTap: js.Function1[/* res */ js.UndefOr[Any], Unit] => Callback,
    show: Callback,
    style: ButtonStyle,
    text: String,
    `type`: ButtonType
  ): GameClubButton = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, icon = icon.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => offTap(t0).runNow()), onTap = js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => onTap(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameClubButton]
  }
  
  extension [Self <: GameClubButton](x: Self) {
    
    inline def setIcon(value: GameClubButtonIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
