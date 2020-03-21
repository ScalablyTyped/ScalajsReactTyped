package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter
import typingsJapgolly.reactNativeTabView.typesMod.Listener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-tab-view.react-native-tab-view/lib/typescript/src/types.EventEmitterProps & {  position  :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> * / any, render (children : react.react.ReactNode): react.react.ReactNode, jumpTo (key : string): void} */
trait EventEmitterPropsposition extends js.Object {
  var position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any
  @JSName("addListener")
  def addListener_enter(`type`: enter, listener: Listener): Unit
  def jumpTo(key: String): Unit
  @JSName("removeListener")
  def removeListener_enter(`type`: enter, listener: Listener): Unit
  def render(children: Node): Node
}

object EventEmitterPropsposition {
  @scala.inline
  def apply(
    addListener: (enter, Listener) => Callback,
    jumpTo: String => Callback,
    position: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Animated.Node<number> */ js.Any,
    removeListener: (enter, Listener) => Callback,
    render: Node => CallbackTo[Node]
  ): EventEmitterPropsposition = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("jumpTo")(js.Any.fromFunction1((t0: java.lang.String) => jumpTo(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2((t0: typingsJapgolly.reactNativeTabView.reactNativeTabViewStrings.enter, t1: typingsJapgolly.reactNativeTabView.typesMod.Listener) => removeListener(t0, t1).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Node) => render(t0).runNow()))
    __obj.asInstanceOf[EventEmitterPropsposition]
  }
}

