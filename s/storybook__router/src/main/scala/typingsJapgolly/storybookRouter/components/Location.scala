package typingsJapgolly.storybookRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookRouter.routerMod.QueryLocationProps
import typingsJapgolly.storybookRouter.routerMod.RenderData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: RenderData => CallbackTo[Node]
  ): UnmountedSimple[
    QueryLocationProps, 
    MountedWithRawType[QueryLocationProps, js.Object, RawMounted[QueryLocationProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.storybookRouter.routerMod.RenderData) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookRouter.routerMod.QueryLocationProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookRouter.routerMod.QueryLocationProps])
  }
  @JSImport("@storybook/router", "Location")
  @js.native
  object componentImport extends js.Object
  
}

