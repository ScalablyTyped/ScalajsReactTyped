package typingsJapgolly.react.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.SuspenseProps
import typingsJapgolly.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Suspense {
  def apply(
    fallback: NonNullable[Node] = null,
    unstable_avoidThisFallback: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SuspenseProps, 
    MountedWithRawType[SuspenseProps, js.Object, RawMounted[SuspenseProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (!js.isUndefined(unstable_avoidThisFallback)) __obj.updateDynamic("unstable_avoidThisFallback")(unstable_avoidThisFallback.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.SuspenseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.SuspenseProps])(children: _*)
  }
  @JSImport("react", "Suspense")
  @js.native
  object componentImport extends js.Object
  
}

