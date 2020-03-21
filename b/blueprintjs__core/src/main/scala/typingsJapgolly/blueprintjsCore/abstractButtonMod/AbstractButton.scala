package typingsJapgolly.blueprintjsCore.abstractButtonMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.AnonButton
import typingsJapgolly.blueprintjsCore.AnonClassName
import typingsJapgolly.blueprintjsCore.AnonIsActive
import typingsJapgolly.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
@js.native
abstract class AbstractButton[H /* <: HTMLAttributes[_] */] ()
  extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
  var buttonRef: HTMLElement = js.native
  var currentKeyDown: js.Any = js.native
  var refHandlers: AnonButton = js.native
  @JSName("state")
  var state_AbstractButton: AnonIsActive = js.native
  /* protected */ def getCommonButtonProps(): AnonClassName[H] = js.native
  /* protected */ def handleKeyDown(e: ReactKeyboardEventFrom[Element]): Unit = js.native
  /* protected */ def handleKeyUp(e: ReactKeyboardEventFrom[Element]): Unit = js.native
  /* protected */ def renderChildren(): Node = js.native
}

