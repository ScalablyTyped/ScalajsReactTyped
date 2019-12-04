package typingsJapgolly.enzyme.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object ElementClass {
  def apply(
    props: js.Any with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    js.Any with js.Object, 
    typingsJapgolly.enzyme.enzymeMod.ElementClass, 
    Unit, 
    js.Any with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  js.Any with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.enzyme.enzymeMod.ElementClass](this.componentImport)
    f(__obj.asInstanceOf[js.Any with js.Object])(children: _*)
  }
  @JSImport("enzyme", "ElementClass")
  @js.native
  object componentImport extends js.Object
  
}

