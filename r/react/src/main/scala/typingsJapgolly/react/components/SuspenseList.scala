package typingsJapgolly.react.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuspenseList {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SuspenseListProps, 
    MountedWithRawType[SuspenseListProps, js.Object, RawMounted[SuspenseListProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.react.reactMod.SuspenseList)
    f(__obj.asInstanceOf[typingsJapgolly.react.experimentalMod.reactMod.SuspenseListProps])(children: _*)
  }
}

