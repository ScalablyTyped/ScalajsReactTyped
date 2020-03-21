package typingsJapgolly.styledComponents.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty
import typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeConsumer {
  def apply(
    unstable_observedBits: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: AnyIfEmpty[DefaultTheme] => CallbackTo[Node]
  ): UnmountedSimple[
    ConsumerProps[AnyIfEmpty[DefaultTheme]], 
    MountedWithRawType[
      ConsumerProps[AnyIfEmpty[DefaultTheme]], 
      js.Object, 
      RawMounted[ConsumerProps[AnyIfEmpty[DefaultTheme]], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]) => children(t0).runNow()))
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.mod.ConsumerProps[
    typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]
  ], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.mod.ConsumerProps[
  typingsJapgolly.styledComponents.styledComponentsMod.AnyIfEmpty[typingsJapgolly.styledComponents.styledComponentsMod.DefaultTheme]]])
  }
  @JSImport("styled-components", "ThemeConsumer")
  @js.native
  object componentImport extends js.Object
  
}

