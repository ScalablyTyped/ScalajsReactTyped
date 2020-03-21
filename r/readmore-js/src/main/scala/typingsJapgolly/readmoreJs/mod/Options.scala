package typingsJapgolly.readmoreJs.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.readmoreJs.readmoreJsStrings.after
import typingsJapgolly.readmoreJs.readmoreJsStrings.before
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
   // called once per block during initilization after Readmore.js has processed the block
  var afterToggle: js.UndefOr[
    js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
  ] = js.undefined
  var beforeToggle: js.UndefOr[
    js.Function3[/* trigger */ Element, /* element */ Element, /* expanded */ Boolean, Unit]
  ] = js.undefined
   // insert required CSS dynamically, set this to false if you include the necessary CSS in a stylesheet
  var blockCSS: js.UndefOr[String] = js.undefined
   // called after a more or less link is clicked, but before the block is collapsed or expanded
  var blockProcessed: js.UndefOr[js.Function2[/* element */ Element, /* collapsable */ Boolean, Unit]] = js.undefined
   // 100 in milliseconds
  var collapsedHeight: js.UndefOr[Double] = js.undefined
   // HTML string for the "less" toggle link; also accepts a callback function that returns an HTML string
  var embedCSS: js.UndefOr[Boolean] = js.undefined
   // 200 in pixels
  var heightMargin: js.UndefOr[Double] = js.undefined
   // HTML string for the "more" toggle link; also accepts a callback function that returns an HTML string
  var lessLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.undefined
   // 16 in pixels, avoids collapsing blocks that are only slightly larger than collapsedHeight
  var moreLink: js.UndefOr[(js.Function1[/* element */ Element, String]) | String] = js.undefined
  var sourceOrder: js.UndefOr[after | before] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
   // sets the styling of the blocks, ignored if embedCSS is false
  var startOpen: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    afterToggle: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Callback = null,
    beforeToggle: (/* trigger */ Element, /* element */ Element, /* expanded */ Boolean) => Callback = null,
    blockCSS: String = null,
    blockProcessed: (/* element */ Element, /* collapsable */ Boolean) => Callback = null,
    collapsedHeight: Int | Double = null,
    embedCSS: js.UndefOr[Boolean] = js.undefined,
    heightMargin: Int | Double = null,
    lessLink: (js.Function1[/* element */ Element, String]) | String = null,
    moreLink: (js.Function1[/* element */ Element, String]) | String = null,
    sourceOrder: after | before = null,
    speed: Int | Double = null,
    startOpen: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (afterToggle != null) __obj.updateDynamic("afterToggle")(js.Any.fromFunction3((t0: /* trigger */ org.scalajs.dom.raw.Element, t1: /* element */ org.scalajs.dom.raw.Element, t2: /* expanded */ scala.Boolean) => afterToggle(t0, t1, t2).runNow()))
    if (beforeToggle != null) __obj.updateDynamic("beforeToggle")(js.Any.fromFunction3((t0: /* trigger */ org.scalajs.dom.raw.Element, t1: /* element */ org.scalajs.dom.raw.Element, t2: /* expanded */ scala.Boolean) => beforeToggle(t0, t1, t2).runNow()))
    if (blockCSS != null) __obj.updateDynamic("blockCSS")(blockCSS.asInstanceOf[js.Any])
    if (blockProcessed != null) __obj.updateDynamic("blockProcessed")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.Element, t1: /* collapsable */ scala.Boolean) => blockProcessed(t0, t1).runNow()))
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(embedCSS)) __obj.updateDynamic("embedCSS")(embedCSS.asInstanceOf[js.Any])
    if (heightMargin != null) __obj.updateDynamic("heightMargin")(heightMargin.asInstanceOf[js.Any])
    if (lessLink != null) __obj.updateDynamic("lessLink")(lessLink.asInstanceOf[js.Any])
    if (moreLink != null) __obj.updateDynamic("moreLink")(moreLink.asInstanceOf[js.Any])
    if (sourceOrder != null) __obj.updateDynamic("sourceOrder")(sourceOrder.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(startOpen)) __obj.updateDynamic("startOpen")(startOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

