package typingsJapgolly.atStorybookRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookRouter.distRouterMod.QueryLocationProps
import typingsJapgolly.atStorybookRouter.distRouterMod.RenderData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: RenderData => CallbackTo[Node]
  ): UnmountedSimple[
    QueryLocationProps, 
    MountedWithRawType[QueryLocationProps, js.Object, RawMounted[QueryLocationProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookRouter.distRouterMod.RenderData) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atStorybookRouter.distRouterMod.QueryLocationProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](typingsJapgolly.atStorybookRouter.distRouterMod.Location)
    f(__obj.asInstanceOf[typingsJapgolly.atStorybookRouter.distRouterMod.QueryLocationProps])
  }
}

