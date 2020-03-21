package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  def apply(
    className: String = null,
    current: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    href: String = null,
    icon: IconName | MaybeElement = null,
    intent: Intent = null,
    onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback = null,
    target: String = null,
    text: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    IBreadcrumbProps, 
    MountedWithRawType[IBreadcrumbProps, js.Object, RawMounted[IBreadcrumbProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.breadcrumbMod.IBreadcrumbProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Breadcrumb")
  @js.native
  object componentImport extends js.Object
  
}

