package typingsJapgolly.storybookRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookRouter.routerMod.MatchingData
import typingsJapgolly.storybookRouter.routerMod.QueryMatchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match {
  def apply(
    path: String,
    startsWith: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: MatchingData => CallbackTo[Node]
  ): UnmountedSimple[
    QueryMatchProps, 
    MountedWithRawType[QueryMatchProps, js.Object, RawMounted[QueryMatchProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.storybookRouter.routerMod.MatchingData) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookRouter.routerMod.QueryMatchProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookRouter.routerMod.QueryMatchProps])
  }
  @JSImport("@storybook/router", "Match")
  @js.native
  object componentImport extends js.Object
  
}

