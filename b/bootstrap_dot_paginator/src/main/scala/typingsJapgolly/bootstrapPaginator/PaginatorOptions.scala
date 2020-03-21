package typingsJapgolly.bootstrapPaginator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var bootstrapMajorVersion: js.UndefOr[Double] = js.undefined
  var bootstrapTooltipOptions: js.UndefOr[js.Object] = js.undefined
  var currentPage: js.UndefOr[Double] = js.undefined
  var itemContainerClass: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var itemTexts: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var numberOfPages: js.UndefOr[Double] = js.undefined
  var onPageChanged: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.undefined
  var onPageClicked: js.UndefOr[
    js.Function4[
      /* event */ js.Any, 
      /* originalEvent */ js.Any, 
      /* type */ String, 
      /* page */ Double, 
      Unit
    ]
  ] = js.undefined
  var pageUrl: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var shouldShowPage: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var tooltipTitles: js.UndefOr[js.Function3[/* type */ String, /* page */ Double, /* current */ Double, String]] = js.undefined
  var totalPages: js.UndefOr[Double] = js.undefined
  var useBootstrapTooltip: js.UndefOr[Boolean] = js.undefined
}

object PaginatorOptions {
  @scala.inline
  def apply(
    alignment: String = null,
    bootstrapMajorVersion: Int | Double = null,
    bootstrapTooltipOptions: js.Object = null,
    currentPage: Int | Double = null,
    itemContainerClass: (/* type */ String, /* page */ Double, /* current */ Double) => CallbackTo[String] = null,
    itemTexts: (/* type */ String, /* page */ Double, /* current */ Double) => CallbackTo[String] = null,
    numberOfPages: Int | Double = null,
    onPageChanged: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Callback = null,
    onPageClicked: (/* event */ js.Any, /* originalEvent */ js.Any, /* type */ String, /* page */ Double) => Callback = null,
    pageUrl: (/* type */ String, /* page */ Double, /* current */ Double) => CallbackTo[String] = null,
    shouldShowPage: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    tooltipTitles: (/* type */ String, /* page */ Double, /* current */ Double) => CallbackTo[String] = null,
    totalPages: Int | Double = null,
    useBootstrapTooltip: js.UndefOr[Boolean] = js.undefined
  ): PaginatorOptions = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (bootstrapMajorVersion != null) __obj.updateDynamic("bootstrapMajorVersion")(bootstrapMajorVersion.asInstanceOf[js.Any])
    if (bootstrapTooltipOptions != null) __obj.updateDynamic("bootstrapTooltipOptions")(bootstrapTooltipOptions.asInstanceOf[js.Any])
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (itemContainerClass != null) __obj.updateDynamic("itemContainerClass")(js.Any.fromFunction3((t0: /* type */ java.lang.String, t1: /* page */ scala.Double, t2: /* current */ scala.Double) => itemContainerClass(t0, t1, t2).runNow()))
    if (itemTexts != null) __obj.updateDynamic("itemTexts")(js.Any.fromFunction3((t0: /* type */ java.lang.String, t1: /* page */ scala.Double, t2: /* current */ scala.Double) => itemTexts(t0, t1, t2).runNow()))
    if (numberOfPages != null) __obj.updateDynamic("numberOfPages")(numberOfPages.asInstanceOf[js.Any])
    if (onPageChanged != null) __obj.updateDynamic("onPageChanged")(js.Any.fromFunction4((t0: /* event */ js.Any, t1: /* originalEvent */ js.Any, t2: /* type */ java.lang.String, t3: /* page */ scala.Double) => onPageChanged(t0, t1, t2, t3).runNow()))
    if (onPageClicked != null) __obj.updateDynamic("onPageClicked")(js.Any.fromFunction4((t0: /* event */ js.Any, t1: /* originalEvent */ js.Any, t2: /* type */ java.lang.String, t3: /* page */ scala.Double) => onPageClicked(t0, t1, t2, t3).runNow()))
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(js.Any.fromFunction3((t0: /* type */ java.lang.String, t1: /* page */ scala.Double, t2: /* current */ scala.Double) => pageUrl(t0, t1, t2).runNow()))
    if (!js.isUndefined(shouldShowPage)) __obj.updateDynamic("shouldShowPage")(shouldShowPage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tooltipTitles != null) __obj.updateDynamic("tooltipTitles")(js.Any.fromFunction3((t0: /* type */ java.lang.String, t1: /* page */ scala.Double, t2: /* current */ scala.Double) => tooltipTitles(t0, t1, t2).runNow()))
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (!js.isUndefined(useBootstrapTooltip)) __obj.updateDynamic("useBootstrapTooltip")(useBootstrapTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorOptions]
  }
}

