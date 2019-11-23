package typingsJapgolly.react.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps
import typingsJapgolly.react.experimentalMod.reactMod.SuspenseListRevealOrder
import typingsJapgolly.react.experimentalMod.reactMod.SuspenseListTailMode
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuspenseList {
  def DirectionalSuspenseListProps(
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Iterable[Element]
  ): UnmountedSimple[
    SuspenseListProps, 
    MountedWithRawType[SuspenseListProps, js.Object, RawMounted[SuspenseListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
  
      if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](typingsJapgolly.react.reactMod.SuspenseList)
    f(__obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps])
  }
  def NonDirectionalSuspenseListProps(
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Iterable[Element]
  ): UnmountedSimple[
    SuspenseListProps, 
    MountedWithRawType[SuspenseListProps, js.Object, RawMounted[SuspenseListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](typingsJapgolly.react.reactMod.SuspenseList)
    f(__obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps])
  }
}

