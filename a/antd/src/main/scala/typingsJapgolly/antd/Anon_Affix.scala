package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affix extends js.Object {
  var affix: Boolean
  var getContainer: js.Function0[
    Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)
  ]
  var showInkInFixed: Boolean
}

object Anon_Affix {
  @scala.inline
  def apply(
    affix: Boolean,
    getContainer: CallbackTo[
      Window with (/* import warning: importer.ImportType#apply Failed type conversion: typeof globalThis */ js.Any)
    ],
    showInkInFixed: Boolean
  ): Anon_Affix = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.asInstanceOf[Anon_Affix]
  }
}

