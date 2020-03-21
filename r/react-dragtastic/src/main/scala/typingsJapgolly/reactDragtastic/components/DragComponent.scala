package typingsJapgolly.reactDragtastic.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDragtastic.StateisOverAcceptedboolea
import typingsJapgolly.reactDragtastic.mod.DragComponentProps
import typingsJapgolly.reactDragtastic.mod.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragComponent {
  def apply(
    alwaysRender: js.UndefOr[Boolean] = js.undefined,
    `for`: Id = null,
    onDrag: js.UndefOr[Callback] = js.undefined,
    subscribeTo: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: StateisOverAcceptedboolea => CallbackTo[Node]
  ): UnmountedWithRoot[
    DragComponentProps, 
    typingsJapgolly.reactDragtastic.mod.DragComponent, 
    Unit, 
    DragComponentProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactDragtastic.StateisOverAcceptedboolea) => children(t0).runNow()))
    if (!js.isUndefined(alwaysRender)) __obj.updateDynamic("alwaysRender")(alwaysRender.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    onDrag.foreach(p => __obj.updateDynamic("onDrag")(p.toJsFn))
    if (subscribeTo != null) __obj.updateDynamic("subscribeTo")(subscribeTo.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDragtastic.mod.DragComponentProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactDragtastic.mod.DragComponent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDragtastic.mod.DragComponentProps])
  }
  @JSImport("react-dragtastic", "DragComponent")
  @js.native
  object componentImport extends js.Object
  
}

