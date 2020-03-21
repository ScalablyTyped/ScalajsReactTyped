package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonHref
import typingsJapgolly.antDesignPro.antDesignProStrings.`403`
import typingsJapgolly.antDesignPro.antDesignProStrings.`404`
import typingsJapgolly.antDesignPro.antDesignProStrings.`500`
import typingsJapgolly.antDesignPro.exceptionMod.ExceptionProps
import typingsJapgolly.antDesignPro.exceptionMod.default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Exception {
  def apply(
    actions: VdomNode = null,
    backText: VdomNode = null,
    className: String = null,
    desc: VdomNode = null,
    img: String = null,
    linkElement: String | ComponentType[AnonHref] = null,
    redirect: String = null,
    style: CSSProperties = null,
    title: VdomNode = null,
    `type`: `403` | `404` | `500` = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ExceptionProps[AnonHref], default, Unit, ExceptionProps[AnonHref]] = {
    val __obj = js.Dynamic.literal()
  
      if (actions != null) __obj.updateDynamic("actions")(actions.rawNode.asInstanceOf[js.Any])
    if (backText != null) __obj.updateDynamic("backText")(backText.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.rawNode.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.asInstanceOf[js.Any])
    if (linkElement != null) __obj.updateDynamic("linkElement")(linkElement.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.exceptionMod.ExceptionProps[typingsJapgolly.antDesignPro.AnonHref], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.exceptionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.exceptionMod.ExceptionProps[typingsJapgolly.antDesignPro.AnonHref]])(children: _*)
  }
  @JSImport("ant-design-pro/lib/Exception", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

