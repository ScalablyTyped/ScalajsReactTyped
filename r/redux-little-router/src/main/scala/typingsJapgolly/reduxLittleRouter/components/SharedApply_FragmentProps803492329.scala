package typingsJapgolly.reduxLittleRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxLittleRouter.mod.FragmentProps
import typingsJapgolly.reduxLittleRouter.mod.Location
import typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_FragmentProps803492329[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    forNoMatch: js.UndefOr[Boolean] = js.undefined,
    forRoute: String = null,
    location: Location = null,
    matchRoute: js.Function = null,
    matchWildcardRoute: js.Function = null,
    parentId: String = null,
    parentRoute: String = null,
    style: ObjectLiteral[_] = null,
    withConditions: /* location */ Location => CallbackTo[Boolean] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FragmentProps, ComponentRef, Unit, FragmentProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(forNoMatch)) __obj.updateDynamic("forNoMatch")(forNoMatch.asInstanceOf[js.Any])
    if (forRoute != null) __obj.updateDynamic("forRoute")(forRoute.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (matchRoute != null) __obj.updateDynamic("matchRoute")(matchRoute.asInstanceOf[js.Any])
    if (matchWildcardRoute != null) __obj.updateDynamic("matchWildcardRoute")(matchWildcardRoute.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (parentRoute != null) __obj.updateDynamic("parentRoute")(parentRoute.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (withConditions != null) __obj.updateDynamic("withConditions")(js.Any.fromFunction1((t0: /* location */ typingsJapgolly.reduxLittleRouter.mod.Location) => withConditions(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxLittleRouter.mod.FragmentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.FragmentProps])(children: _*)
  }
}

