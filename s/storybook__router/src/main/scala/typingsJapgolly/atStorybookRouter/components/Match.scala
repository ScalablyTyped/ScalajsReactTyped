package typingsJapgolly.atStorybookRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookRouter.distRouterMod.MatchingData
import typingsJapgolly.atStorybookRouter.distRouterMod.QueryMatchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Match {
  def apply(
    path: String,
    startsWith: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: MatchingData => CallbackTo[Node]
  ): UnmountedSimple[
    QueryMatchProps, 
    MountedWithRawType[QueryMatchProps, js.Object, RawMounted[QueryMatchProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookRouter.distRouterMod.MatchingData) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atStorybookRouter.distRouterMod.QueryMatchProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](typingsJapgolly.atStorybookRouter.distRouterMod.Match)
    f(__obj.asInstanceOf[typingsJapgolly.atStorybookRouter.distRouterMod.QueryMatchProps])
  }
}

