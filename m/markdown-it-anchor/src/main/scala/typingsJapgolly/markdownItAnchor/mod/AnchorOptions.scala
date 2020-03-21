package typingsJapgolly.markdownItAnchor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var callback: js.UndefOr[
    js.Function2[
      /* token */ typingsJapgolly.markdownIt.tokenMod.^, 
      /* anchor_info */ AnchorInfo, 
      Unit
    ]
  ] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var permalink: js.UndefOr[Boolean] = js.undefined
  var permalinkBefore: js.UndefOr[Boolean] = js.undefined
  var permalinkClass: js.UndefOr[String] = js.undefined
  var permalinkHref: js.UndefOr[js.Function1[/* slug */ String, String]] = js.undefined
  var permalinkSymbol: js.UndefOr[String] = js.undefined
  var renderPermalink: js.UndefOr[
    js.Function4[
      /* slug */ String, 
      /* opts */ this.type, 
      /* state */ typingsJapgolly.markdownIt.parserCoreMod.^, 
      /* idx */ Double, 
      Unit
    ]
  ] = js.undefined
  var slugify: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    callback: (/* token */ typingsJapgolly.markdownIt.tokenMod.^, /* anchor_info */ AnchorInfo) => Callback = null,
    level: Int | Double = null,
    permalink: js.UndefOr[Boolean] = js.undefined,
    permalinkBefore: js.UndefOr[Boolean] = js.undefined,
    permalinkClass: String = null,
    permalinkHref: /* slug */ String => CallbackTo[String] = null,
    permalinkSymbol: String = null,
    renderPermalink: (/* slug */ String, AnchorOptions, /* state */ typingsJapgolly.markdownIt.parserCoreMod.^, /* idx */ Double) => Callback = null,
    slugify: /* str */ String => CallbackTo[String] = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* token */ typingsJapgolly.markdownIt.tokenMod.^, t1: /* anchor_info */ typingsJapgolly.markdownItAnchor.mod.AnchorInfo) => callback(t0, t1).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(permalink)) __obj.updateDynamic("permalink")(permalink.asInstanceOf[js.Any])
    if (!js.isUndefined(permalinkBefore)) __obj.updateDynamic("permalinkBefore")(permalinkBefore.asInstanceOf[js.Any])
    if (permalinkClass != null) __obj.updateDynamic("permalinkClass")(permalinkClass.asInstanceOf[js.Any])
    if (permalinkHref != null) __obj.updateDynamic("permalinkHref")(js.Any.fromFunction1((t0: /* slug */ java.lang.String) => permalinkHref(t0).runNow()))
    if (permalinkSymbol != null) __obj.updateDynamic("permalinkSymbol")(permalinkSymbol.asInstanceOf[js.Any])
    if (renderPermalink != null) __obj.updateDynamic("renderPermalink")(js.Any.fromFunction4((t0: /* slug */ java.lang.String, t1: typingsJapgolly.markdownItAnchor.mod.AnchorOptions, t2: /* state */ typingsJapgolly.markdownIt.parserCoreMod.^, t3: /* idx */ scala.Double) => renderPermalink(t0, t1, t2, t3).runNow()))
    if (slugify != null) __obj.updateDynamic("slugify")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => slugify(t0).runNow()))
    __obj.asInstanceOf[AnchorOptions]
  }
}

