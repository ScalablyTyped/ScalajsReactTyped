package typingsJapgolly.gatsby.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gatsby.mod.StaticQueryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticQuery {
  def apply[T](
    query: js.Any,
    render: T => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: T => CallbackTo[Node] = null
  ): UnmountedWithRoot[
    StaticQueryProps[T], 
    typingsJapgolly.gatsby.mod.StaticQuery[T], 
    Unit, 
    StaticQueryProps[T]
  ] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: T) => children(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: T) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gatsby.mod.StaticQueryProps[T], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.gatsby.mod.StaticQuery[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gatsby.mod.StaticQueryProps[T]])
  }
  @JSImport("gatsby", "StaticQuery")
  @js.native
  object componentImport extends js.Object
  
}

