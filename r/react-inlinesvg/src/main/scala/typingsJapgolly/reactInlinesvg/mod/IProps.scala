package typingsJapgolly.reactInlinesvg.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactInlinesvg.helpersMod.InlineSVGError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProps
  extends /* key */ StringDictionary[js.Any] {
  var baseURL: js.UndefOr[String] = js.undefined
  var cacheRequests: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var innerRef: js.UndefOr[Ref] = js.undefined
  var loader: js.UndefOr[Node] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ InlineSVGError | IFetchError, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function2[/* src */ String, /* isCached */ Boolean, Unit]] = js.undefined
  var preProcessor: js.UndefOr[js.Function1[/* code */ String, String]] = js.undefined
  var src: String
  var title: js.UndefOr[String] = js.undefined
  var uniqueHash: js.UndefOr[String] = js.undefined
  var uniquifyIDs: js.UndefOr[Boolean] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    src: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    baseURL: String = null,
    cacheRequests: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    description: String = null,
    innerRef: Ref = null,
    loader: VdomNode = null,
    onError: /* error */ InlineSVGError | IFetchError => Callback = null,
    onLoad: (/* src */ String, /* isCached */ Boolean) => Callback = null,
    preProcessor: /* code */ String => CallbackTo[String] = null,
    title: String = null,
    uniqueHash: String = null,
    uniquifyIDs: js.UndefOr[Boolean] = js.undefined
  ): IProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheRequests)) __obj.updateDynamic("cacheRequests")(cacheRequests.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (loader != null) __obj.updateDynamic("loader")(loader.rawNode.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.reactInlinesvg.helpersMod.InlineSVGError | typingsJapgolly.reactInlinesvg.mod.IFetchError) => onError(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2((t0: /* src */ java.lang.String, t1: /* isCached */ scala.Boolean) => onLoad(t0, t1).runNow()))
    if (preProcessor != null) __obj.updateDynamic("preProcessor")(js.Any.fromFunction1((t0: /* code */ java.lang.String) => preProcessor(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uniqueHash != null) __obj.updateDynamic("uniqueHash")(uniqueHash.asInstanceOf[js.Any])
    if (!js.isUndefined(uniquifyIDs)) __obj.updateDynamic("uniquifyIDs")(uniquifyIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

