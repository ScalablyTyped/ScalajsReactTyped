package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonEvent
import typingsJapgolly.gestalt.gestaltStrings.`null`
import typingsJapgolly.gestalt.gestaltStrings.blank
import typingsJapgolly.gestalt.gestaltStrings.self
import typingsJapgolly.gestalt.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link {
  def apply(
    href: String = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onClick: /* args */ AnonEvent => Callback = null,
    target: `null` | self | blank = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LinkProps, typingsJapgolly.gestalt.mod.Link, Unit, LinkProps] = {
    val __obj = js.Dynamic.literal()
  
      if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEvent) => onClick(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.LinkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Link](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.LinkProps])(children: _*)
  }
  @JSImport("gestalt", "Link")
  @js.native
  object componentImport extends js.Object
  
}

