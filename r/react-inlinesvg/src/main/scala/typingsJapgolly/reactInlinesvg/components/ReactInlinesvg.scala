package typingsJapgolly.reactInlinesvg.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInlinesvg.helpersMod.InlineSVGError
import typingsJapgolly.reactInlinesvg.mod.IFetchError
import typingsJapgolly.reactInlinesvg.mod.IProps
import typingsJapgolly.reactInlinesvg.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInlinesvg {
  def apply(
    src: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    baseURL: String = null,
    cacheRequests: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    innerRef: Ref = null,
    loader: VdomNode = null,
    onError: /* error */ InlineSVGError | IFetchError => Callback = null,
    onLoad: (/* src */ String, /* isCached */ Boolean) => Callback = null,
    preProcessor: /* code */ String => CallbackTo[String] = null,
    title: String = null,
    uniqueHash: String = null,
    uniquifyIDs: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IProps, default, Unit, IProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheRequests)) __obj.updateDynamic("cacheRequests")(cacheRequests.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.rawNode.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.reactInlinesvg.helpersMod.InlineSVGError | typingsJapgolly.reactInlinesvg.mod.IFetchError) => onError(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2((t0: /* src */ java.lang.String, t1: /* isCached */ scala.Boolean) => onLoad(t0, t1).runNow()))
    if (preProcessor != null) __obj.updateDynamic("preProcessor")(js.Any.fromFunction1((t0: /* code */ java.lang.String) => preProcessor(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uniqueHash != null) __obj.updateDynamic("uniqueHash")(uniqueHash.asInstanceOf[js.Any])
    if (!js.isUndefined(uniquifyIDs)) __obj.updateDynamic("uniquifyIDs")(uniquifyIDs.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactInlinesvg.mod.IProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactInlinesvg.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactInlinesvg.mod.IProps])(children: _*)
  }
  @JSImport("react-inlinesvg", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

