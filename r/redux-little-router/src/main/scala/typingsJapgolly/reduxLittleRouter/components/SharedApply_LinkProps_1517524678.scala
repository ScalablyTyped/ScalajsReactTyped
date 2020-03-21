package typingsJapgolly.reduxLittleRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reduxLittleRouter.AnonPayload
import typingsJapgolly.reduxLittleRouter.mod.Href
import typingsJapgolly.reduxLittleRouter.mod.LinkProps
import typingsJapgolly.reduxLittleRouter.mod.Location
import typingsJapgolly.reduxLittleRouter.mod.LocationOptions
import typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_LinkProps_1517524678[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    href: Href,
    activeProps: ObjectLiteral[_] = null,
    className: String = null,
    location: Location = null,
    onClick: /* event */ Event_ => CallbackTo[js.Any] = null,
    persistQuery: js.UndefOr[Boolean] = js.undefined,
    push: (/* href */ Href, /* options */ LocationOptions) => CallbackTo[AnonPayload] = null,
    replace: (/* href */ Href, /* options */ LocationOptions) => CallbackTo[AnonPayload] = null,
    replaceState: js.UndefOr[Boolean] = js.undefined,
    style: ObjectLiteral[_] = null,
    target: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LinkProps, ComponentRef, Unit, LinkProps] = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
  
      if (activeProps != null) __obj.updateDynamic("activeProps")(activeProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (!js.isUndefined(persistQuery)) __obj.updateDynamic("persistQuery")(persistQuery.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction2((t0: /* href */ typingsJapgolly.reduxLittleRouter.mod.Href, t1: /* options */ typingsJapgolly.reduxLittleRouter.mod.LocationOptions) => push(t0, t1).runNow()))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: /* href */ typingsJapgolly.reduxLittleRouter.mod.Href, t1: /* options */ typingsJapgolly.reduxLittleRouter.mod.LocationOptions) => replace(t0, t1).runNow()))
    if (!js.isUndefined(replaceState)) __obj.updateDynamic("replaceState")(replaceState.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reduxLittleRouter.mod.LinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reduxLittleRouter.mod.LinkProps])(children: _*)
  }
}

