package typingsJapgolly.reactHelmet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactHelmet.mod.BodyProps
import typingsJapgolly.reactHelmet.mod.HelmetProps
import typingsJapgolly.reactHelmet.mod.HelmetTags
import typingsJapgolly.reactHelmet.mod.HtmlProps
import typingsJapgolly.reactHelmet.mod.LinkProps
import typingsJapgolly.reactHelmet.mod.MetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_HelmetProps2060883372[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    base: js.Any = null,
    bodyAttributes: BodyProps = null,
    defaultTitle: String = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    encodeSpecialCharacters: js.UndefOr[Boolean] = js.undefined,
    htmlAttributes: HtmlProps = null,
    link: js.Array[LinkProps] = null,
    meta: js.Array[MetaProps] = null,
    noscript: js.Array[_] = null,
    onChangeClientState: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Callback = null,
    script: js.Array[_] = null,
    style: js.Array[_] = null,
    title: String = null,
    titleAttributes: js.Object = null,
    titleTemplate: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HelmetProps, ComponentRef, Unit, HelmetProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bodyAttributes != null) __obj.updateDynamic("bodyAttributes")(bodyAttributes.asInstanceOf[js.Any])
    if (defaultTitle != null) __obj.updateDynamic("defaultTitle")(defaultTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeSpecialCharacters)) __obj.updateDynamic("encodeSpecialCharacters")(encodeSpecialCharacters.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (noscript != null) __obj.updateDynamic("noscript")(noscript.asInstanceOf[js.Any])
    if (onChangeClientState != null) __obj.updateDynamic("onChangeClientState")(js.Any.fromFunction3((t0: /* newState */ js.Any, t1: /* addedTags */ typingsJapgolly.reactHelmet.mod.HelmetTags, t2: /* removedTags */ typingsJapgolly.reactHelmet.mod.HelmetTags) => onChangeClientState(t0, t1, t2).runNow()))
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleAttributes != null) __obj.updateDynamic("titleAttributes")(titleAttributes.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactHelmet.mod.HelmetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactHelmet.mod.HelmetProps])(children: _*)
  }
}

