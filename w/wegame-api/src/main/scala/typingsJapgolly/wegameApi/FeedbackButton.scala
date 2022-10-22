package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.wx.types.ButtonStyle
import typingsJapgolly.wegameApi.wx.types.ButtonType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeedbackButton
  extends StObject
     with CreatedButton
object FeedbackButton {
  
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
  ): FeedbackButton = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, hide = hide.toJsFn, image = image.asInstanceOf[js.Any], offTap = js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => offTap(t0).runNow()), onTap = js.Any.fromFunction1((t0: js.Function1[/* res */ js.UndefOr[Any], Unit]) => onTap(t0).runNow()), show = show.toJsFn, style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedbackButton]
  }
}
