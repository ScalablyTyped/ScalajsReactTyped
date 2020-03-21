package typingsJapgolly.extjs.Ext.toolbar

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextItem extends IItem {
  /** [Method] Updates this item s text setting the text to be used as innerHTML
  		* @param text String The text to display (html accepted).
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
}

object ITextItem {
  @scala.inline
  def apply(
    IItem: IItem = null,
    setText: /* text */ js.UndefOr[String] => Callback = null,
    text: String = null
  ): ITextItem = {
    val __obj = js.Dynamic.literal()
    if (IItem != null) js.Dynamic.global.Object.assign(__obj, IItem)
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: /* text */ js.UndefOr[java.lang.String]) => setText(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextItem]
  }
}

