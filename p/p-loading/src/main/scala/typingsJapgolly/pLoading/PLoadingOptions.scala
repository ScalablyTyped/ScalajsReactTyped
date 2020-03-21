package typingsJapgolly.pLoading

import japgolly.scalajs.react.Callback
import typingsJapgolly.pLoading.pLoadingStrings.destroy
import typingsJapgolly.pLoading.pLoadingStrings.hide
import typingsJapgolly.pLoading.pLoadingStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PLoadingOptions extends js.Object {
  var action: js.UndefOr[show | hide | destroy] = js.undefined
  var containerAttrs: js.UndefOr[js.Object] = js.undefined
  var containerClass: js.UndefOr[String] = js.undefined
  var containerHTML: js.UndefOr[String] = js.undefined
  var destroyAfterHide: js.UndefOr[Boolean] = js.undefined
  var hideAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  var idPrefix: js.UndefOr[String] = js.undefined
  var maskColor: js.UndefOr[String] = js.undefined
  /**
    * @deprecated
    */
  var onDestroyContainer: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  /**
    * @deprecated
    */
  var onHideContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.undefined
  /**
    * @deprecated
    */
  var onShowContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.undefined
  var pluginNameSpace: js.UndefOr[String] = js.undefined
  var showAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  var spinnerAttrs: js.UndefOr[js.Object] = js.undefined
  var spinnerClass: js.UndefOr[String] = js.undefined
  var spinnerHTML: js.UndefOr[String] = js.undefined
  var useAddOns: js.UndefOr[js.Array[String]] = js.undefined
}

object PLoadingOptions {
  @scala.inline
  def apply(
    action: show | hide | destroy = null,
    containerAttrs: js.Object = null,
    containerClass: String = null,
    containerHTML: String = null,
    destroyAfterHide: js.UndefOr[Boolean] = js.undefined,
    hideAnimation: /* $container */ JQuery => Callback = null,
    idPrefix: String = null,
    maskColor: String = null,
    onDestroyContainer: /* $container */ JQuery => Callback = null,
    onHideContainer: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Callback = null,
    onShowContainer: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Callback = null,
    pluginNameSpace: String = null,
    showAnimation: /* $container */ JQuery => Callback = null,
    spinnerAttrs: js.Object = null,
    spinnerClass: String = null,
    spinnerHTML: String = null,
    useAddOns: js.Array[String] = null
  ): PLoadingOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (containerAttrs != null) __obj.updateDynamic("containerAttrs")(containerAttrs.asInstanceOf[js.Any])
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (containerHTML != null) __obj.updateDynamic("containerHTML")(containerHTML.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyAfterHide)) __obj.updateDynamic("destroyAfterHide")(destroyAfterHide.asInstanceOf[js.Any])
    if (hideAnimation != null) __obj.updateDynamic("hideAnimation")(js.Any.fromFunction1((t0: /* $container */ typingsJapgolly.pLoading.JQuery) => hideAnimation(t0).runNow()))
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (maskColor != null) __obj.updateDynamic("maskColor")(maskColor.asInstanceOf[js.Any])
    if (onDestroyContainer != null) __obj.updateDynamic("onDestroyContainer")(js.Any.fromFunction1((t0: /* $container */ typingsJapgolly.pLoading.JQuery) => onDestroyContainer(t0).runNow()))
    if (onHideContainer != null) __obj.updateDynamic("onHideContainer")(js.Any.fromFunction2((t0: /* $pluginElement */ typingsJapgolly.pLoading.JQuery, t1: /* $container */ typingsJapgolly.pLoading.JQuery) => onHideContainer(t0, t1).runNow()))
    if (onShowContainer != null) __obj.updateDynamic("onShowContainer")(js.Any.fromFunction2((t0: /* $pluginElement */ typingsJapgolly.pLoading.JQuery, t1: /* $container */ typingsJapgolly.pLoading.JQuery) => onShowContainer(t0, t1).runNow()))
    if (pluginNameSpace != null) __obj.updateDynamic("pluginNameSpace")(pluginNameSpace.asInstanceOf[js.Any])
    if (showAnimation != null) __obj.updateDynamic("showAnimation")(js.Any.fromFunction1((t0: /* $container */ typingsJapgolly.pLoading.JQuery) => showAnimation(t0).runNow()))
    if (spinnerAttrs != null) __obj.updateDynamic("spinnerAttrs")(spinnerAttrs.asInstanceOf[js.Any])
    if (spinnerClass != null) __obj.updateDynamic("spinnerClass")(spinnerClass.asInstanceOf[js.Any])
    if (spinnerHTML != null) __obj.updateDynamic("spinnerHTML")(spinnerHTML.asInstanceOf[js.Any])
    if (useAddOns != null) __obj.updateDynamic("useAddOns")(useAddOns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PLoadingOptions]
  }
}

