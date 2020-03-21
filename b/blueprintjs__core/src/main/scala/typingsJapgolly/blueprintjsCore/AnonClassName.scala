package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassName[H /* <: HTMLAttributes[_] */] extends js.Object {
  var className: String
  var disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any
  var onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any
  var tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  def onKeyDown(e: ReactKeyboardEventFrom[Element]): Unit
  def onKeyUp(e: ReactKeyboardEventFrom[Element]): Unit
  def ref(ref: HTMLElement): Unit
}

object AnonClassName {
  @scala.inline
  def apply[H /* <: HTMLAttributes[_] */](
    className: String,
    disabled: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['loading'] */ js.Any,
    onClick: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['onClick'] */ js.Any,
    onKeyDown: ReactKeyboardEventFrom[Element] => Callback,
    onKeyUp: ReactKeyboardEventFrom[Element] => Callback,
    ref: HTMLElement => Callback,
    tabIndex: /* import warning: importer.ImportType#apply Failed type conversion: @blueprintjs/core.@blueprintjs/core/lib/esm/components/button/abstractButton.IButtonProps & H['tabIndex'] */ js.Any
  ): AnonClassName[H] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyDown(t0).runNow()))
    __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactKeyboardEventFrom[org.scalajs.dom.raw.Element]) => onKeyUp(t0).runNow()))
    __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => ref(t0).runNow()))
    __obj.asInstanceOf[AnonClassName[H]]
  }
}

