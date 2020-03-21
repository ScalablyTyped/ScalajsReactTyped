package typingsJapgolly.reactMovable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMovable.AnonChildren
import typingsJapgolly.reactMovable.AnonElements
import typingsJapgolly.reactMovable.AnonIndex
import typingsJapgolly.reactMovable.AnonNewIndex
import typingsJapgolly.reactMovable.listMod.default
import typingsJapgolly.reactMovable.typesMod.IProps
import typingsJapgolly.reactMovable.typesMod.IVoiceover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply[Value](
    lockVertically: Boolean,
    removableByMove: Boolean,
    transitionDuration: Double,
    values: js.Array[Value],
    voiceover: IVoiceover,
    onChange: AnonNewIndex => Callback,
    renderItem: AnonIndex[Value] => CallbackTo[Node],
    renderList: AnonChildren => CallbackTo[Node],
    beforeDrag: /* params */ AnonElements => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IProps[Value], default[Value], Unit, IProps[Value]] = {
    val __obj = js.Dynamic.literal(lockVertically = lockVertically.asInstanceOf[js.Any], removableByMove = removableByMove.asInstanceOf[js.Any], transitionDuration = transitionDuration.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], voiceover = voiceover.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.reactMovable.AnonNewIndex) => onChange(t0).runNow()))
    __obj.updateDynamic("renderItem")(js.Any.fromFunction1((t0: typingsJapgolly.reactMovable.AnonIndex[Value]) => renderItem(t0).runNow()))
    __obj.updateDynamic("renderList")(js.Any.fromFunction1((t0: typingsJapgolly.reactMovable.AnonChildren) => renderList(t0).runNow()))
    if (beforeDrag != null) __obj.updateDynamic("beforeDrag")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactMovable.AnonElements) => beforeDrag(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMovable.typesMod.IProps[Value], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMovable.listMod.default[Value]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMovable.typesMod.IProps[Value]])(children: _*)
  }
  @JSImport("react-movable/lib/List", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

