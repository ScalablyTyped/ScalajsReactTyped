package typingsJapgolly.reactTimeago.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactTimeago.mod.ReactTimeagoProps
import typingsJapgolly.reactTimeago.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ReactTimeago {
  def apply[T /* <: ComponentType[js.Object] */](
    props: ReactTimeagoProps[T] with ComponentProps[T] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReactTimeagoProps[T] with ComponentProps[T] with js.Object, 
    ^[T], 
    Unit, 
    ReactTimeagoProps[T] with ComponentProps[T] with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTimeago.mod.ReactTimeagoProps[T] with typingsJapgolly.react.mod.ComponentProps[T] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTimeago.mod.^[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTimeago.mod.ReactTimeagoProps[T] with typingsJapgolly.react.mod.ComponentProps[T] with js.Object])(children: _*)
  }
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

