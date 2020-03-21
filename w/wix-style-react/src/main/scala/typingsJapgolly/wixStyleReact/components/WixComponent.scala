package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wixStyleReact.baseComponentsMod.WixComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object WixComponent {
  def apply[T /* <: WixComponentProps */](
    props: T with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    T with js.Object, 
    typingsJapgolly.wixStyleReact.mod.WixComponent[T], 
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
  typingsJapgolly.wixStyleReact.mod.WixComponent[T]](this.componentImport)
    f(__obj.asInstanceOf[T with js.Object])(children: _*)
  }
  @JSImport("wix-style-react", "WixComponent")
  @js.native
  object componentImport extends js.Object
  
}

