package typingsJapgolly.bandagedbdBdapi.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListRevealOrder
import typingsJapgolly.react.experimentalMod.reactAugmentingMod.SuspenseListTailMode
import typingsJapgolly.react.reactStrings.backwards
import typingsJapgolly.react.reactStrings.forwards
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BdApiModuleReactSuspenseList {
  def DirectionalSuspenseListProps(
    revealOrder: forwards | backwards,
    tail: SuspenseListTailMode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Iterable[Element]
  ): UnmountedSimple[
    typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps, 
    MountedWithRawType[
      typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps, 
      js.Object, 
      RawMounted[
        typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps, 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], revealOrder = revealOrder.asInstanceOf[js.Any])
  
      if (tail != null) __obj.updateDynamic("tail")(tail.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.DirectionalSuspenseListProps])
  }
  def NonDirectionalSuspenseListProps(
    revealOrder: Exclude[SuspenseListRevealOrder, forwards | backwards] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Iterable[Element]
  ): UnmountedSimple[
    typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps, 
    MountedWithRawType[
      typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps, 
      js.Object, 
      RawMounted[
        typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps, 
        js.Object
      ]
    ]
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (revealOrder != null) __obj.updateDynamic("revealOrder")(revealOrder.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactAugmentingMod.NonDirectionalSuspenseListProps])
  }
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.SuspenseList")
  @js.native
  object componentImport extends js.Object
  
}

