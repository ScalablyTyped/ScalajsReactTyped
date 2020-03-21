package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactMapGl.mod.BaseControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object BaseControl {
  def apply[T /* <: BaseControlProps */, S /* <: Element */](
    props: T with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    T with js.Object, 
    typingsJapgolly.reactMapGl.mod.BaseControl[T, S], 
    Unit, 
    T with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  T with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.BaseControl[T, S]](this.componentImport)
    f(__obj.asInstanceOf[T with js.Object])(children: _*)
  }
  @JSImport("react-map-gl", "BaseControl")
  @js.native
  object componentImport extends js.Object
  
}

