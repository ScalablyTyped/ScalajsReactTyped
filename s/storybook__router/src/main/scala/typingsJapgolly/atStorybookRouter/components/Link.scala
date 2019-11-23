package typingsJapgolly.atStorybookRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookRouter.distRouterMod.QueryLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  def apply(
    to: String,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    QueryLinkProps, 
    MountedWithRawType[QueryLinkProps, js.Object, RawMounted[QueryLinkProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atStorybookRouter.distRouterMod.QueryLinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](typingsJapgolly.atStorybookRouter.distRouterMod.Link)
    f(__obj.asInstanceOf[typingsJapgolly.atStorybookRouter.distRouterMod.QueryLinkProps])(children: _*)
  }
}

