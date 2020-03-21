package typingsJapgolly.reactVirtualizedSelect.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactVirtualizedSelect.mod.VirtualizedSelectProps
import typingsJapgolly.reactVirtualizedSelect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ReactVirtualizedSelect {
  def apply[TValue](
    props: VirtualizedSelectProps[TValue] with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VirtualizedSelectProps[TValue] with js.Object, 
    default[TValue], 
    Unit, 
    VirtualizedSelectProps[TValue] with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualizedSelect.mod.VirtualizedSelectProps[TValue] with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualizedSelect.mod.default[TValue]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualizedSelect.mod.VirtualizedSelectProps[TValue] with js.Object])(children: _*)
  }
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

