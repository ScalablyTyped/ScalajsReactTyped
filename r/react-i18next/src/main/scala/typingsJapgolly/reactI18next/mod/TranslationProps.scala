package typingsJapgolly.reactI18next.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.i18next.mod.TFunction
import typingsJapgolly.i18next.mod.i18n
import typingsJapgolly.reactI18next.AnonLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslationProps extends js.Object {
  var i18n: js.UndefOr[typingsJapgolly.i18next.mod.i18n] = js.undefined
  var ns: js.UndefOr[Namespace] = js.undefined
  def children(t: TFunction, options: AnonLng): Node
}

object TranslationProps {
  @scala.inline
  def apply(children: (TFunction, AnonLng) => CallbackTo[Node], i18n: i18n = null, ns: Namespace = null): TranslationProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction2((t0: typingsJapgolly.i18next.mod.TFunction, t1: typingsJapgolly.reactI18next.AnonLng) => children(t0, t1).runNow()))
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationProps]
  }
}

