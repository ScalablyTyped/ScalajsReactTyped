package typingsJapgolly.apolloReactHoc.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object GraphQLBase {
  def apply[TProps, TChildProps, TState](
    props: TProps with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TProps with js.Object, 
    typingsJapgolly.apolloReactHoc.hocUtilsMod.GraphQLBase[TProps, TChildProps, TState], 
    Unit, 
    TProps with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  TProps with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.apolloReactHoc.hocUtilsMod.GraphQLBase[TProps, TChildProps, TState]](this.componentImport)
    f(__obj.asInstanceOf[TProps with js.Object])(children: _*)
  }
  @JSImport("@apollo/react-hoc/lib/hoc-utils", "GraphQLBase")
  @js.native
  object componentImport extends js.Object
  
}

