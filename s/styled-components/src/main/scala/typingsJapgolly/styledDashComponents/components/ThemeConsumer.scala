package typingsJapgolly.styledDashComponents.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.ConsumerProps
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty
import typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeConsumer {
  def apply(
    unstable_observedBits: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
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
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]) => children(t0).runNow()))
    if (unstable_observedBits != null) __obj.updateDynamic("unstable_observedBits")(unstable_observedBits.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.reactMod.ConsumerProps[
    typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]
  ], 
  japgolly.scalajs.react.Children.None, 
  js.Object](typingsJapgolly.styledDashComponents.macroMod.ThemeConsumer)
    f(__obj.asInstanceOf[typingsJapgolly.react.reactMod.ConsumerProps[
  typingsJapgolly.styledDashComponents.styledDashComponentsMod.AnyIfEmpty[typingsJapgolly.styledDashComponents.styledDashComponentsMod.DefaultTheme]]])
  }
}

