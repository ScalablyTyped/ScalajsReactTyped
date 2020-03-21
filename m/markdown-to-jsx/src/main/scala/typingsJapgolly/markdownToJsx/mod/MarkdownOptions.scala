package typingsJapgolly.markdownToJsx.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.markdownToJsx.AnonDictkey
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownOptions extends js.Object {
  /** Custom React.createElement behavior. */
  var createElement: js.UndefOr[
    js.Function3[
      /* type */ SFC[js.Object] | ComponentClassP[js.Object] | String, 
      /* props */ js.UndefOr[(Attributes with js.Object) | Null], 
      /* repeated */ Node, 
      Element
    ]
  ] = js.undefined
  /** Force all input strings to use block layout. */
  var forceBlock: js.UndefOr[Boolean] = js.undefined
  /** Force all input strings to use inline layout. */
  var forceInline: js.UndefOr[Boolean] = js.undefined
  /** Override representation of any HTML tag or custom component. */
  var overrides: js.UndefOr[AnonDictkey] = js.undefined
  /** Custom function to generate an HTML id from headings. */
  var slugify: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
}

object MarkdownOptions {
  @scala.inline
  def apply(
    createElement: (/* type */ SFC[js.Object] | ComponentClassP[js.Object] | String, /* props */ js.UndefOr[(Attributes with js.Object) | Null], /* repeated */ Node) => CallbackTo[Element] = null,
    forceBlock: js.UndefOr[Boolean] = js.undefined,
    forceInline: js.UndefOr[Boolean] = js.undefined,
    overrides: AnonDictkey = null,
    slugify: /* text */ String => CallbackTo[String] = null
  ): MarkdownOptions = {
    val __obj = js.Dynamic.literal()
    if (createElement != null) __obj.updateDynamic("createElement")(js.Any.fromFunction3((t0: /* type */ typingsJapgolly.react.mod.SFC[js.Object] | japgolly.scalajs.react.raw.React.ComponentClassP[js.Object] | java.lang.String, t1: /* props */ js.UndefOr[(typingsJapgolly.react.mod.Attributes with js.Object) | scala.Null], t2: /* repeated */ japgolly.scalajs.react.raw.React.Node) => createElement(t0, t1, t2).runNow()))
    if (!js.isUndefined(forceBlock)) __obj.updateDynamic("forceBlock")(forceBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(forceInline)) __obj.updateDynamic("forceInline")(forceInline.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (slugify != null) __obj.updateDynamic("slugify")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => slugify(t0).runNow()))
    __obj.asInstanceOf[MarkdownOptions]
  }
}

