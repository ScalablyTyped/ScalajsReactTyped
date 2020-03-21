package typingsJapgolly.xss.mod._Global_.XSS

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterXSSOptions extends js.Object {
  var allowCommentTag: js.UndefOr[Boolean] = js.undefined
  var css: js.UndefOr[js.Object | Boolean] = js.undefined
  var escapeHtml: js.UndefOr[EscapeHandler] = js.undefined
  var onIgnoreTag: js.UndefOr[OnTagHandler] = js.undefined
  var onIgnoreTagAttr: js.UndefOr[OnTagAttrHandler] = js.undefined
  var onTag: js.UndefOr[OnTagHandler] = js.undefined
  var onTagAttr: js.UndefOr[OnTagAttrHandler] = js.undefined
  var safeAttrValue: js.UndefOr[SafeAttrValueHandler] = js.undefined
  var stripBlankChar: js.UndefOr[Boolean] = js.undefined
  var stripIgnoreTag: js.UndefOr[Boolean] = js.undefined
  var stripIgnoreTagBody: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var whiteList: js.UndefOr[IWhiteList] = js.undefined
}

object IFilterXSSOptions {
  @scala.inline
  def apply(
    allowCommentTag: js.UndefOr[Boolean] = js.undefined,
    css: js.Object | Boolean = null,
    escapeHtml: /* str */ String => CallbackTo[String] = null,
    onIgnoreTag: (/* tag */ String, /* html */ String, /* options */ js.Object) => CallbackTo[String | Unit] = null,
    onIgnoreTagAttr: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => CallbackTo[String | Unit] = null,
    onTag: (/* tag */ String, /* html */ String, /* options */ js.Object) => CallbackTo[String | Unit] = null,
    onTagAttr: (/* tag */ String, /* name */ String, /* value */ String, /* isWhiteAttr */ Boolean) => CallbackTo[String | Unit] = null,
    safeAttrValue: (/* tag */ String, /* name */ String, /* value */ String, /* cssFilter */ ICSSFilter) => CallbackTo[String] = null,
    stripBlankChar: js.UndefOr[Boolean] = js.undefined,
    stripIgnoreTag: js.UndefOr[Boolean] = js.undefined,
    stripIgnoreTagBody: Boolean | js.Array[String] = null,
    whiteList: IWhiteList = null
  ): IFilterXSSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowCommentTag)) __obj.updateDynamic("allowCommentTag")(allowCommentTag.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (escapeHtml != null) __obj.updateDynamic("escapeHtml")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => escapeHtml(t0).runNow()))
    if (onIgnoreTag != null) __obj.updateDynamic("onIgnoreTag")(js.Any.fromFunction3((t0: /* tag */ java.lang.String, t1: /* html */ java.lang.String, t2: /* options */ js.Object) => onIgnoreTag(t0, t1, t2).runNow()))
    if (onIgnoreTagAttr != null) __obj.updateDynamic("onIgnoreTagAttr")(js.Any.fromFunction4((t0: /* tag */ java.lang.String, t1: /* name */ java.lang.String, t2: /* value */ java.lang.String, t3: /* isWhiteAttr */ scala.Boolean) => onIgnoreTagAttr(t0, t1, t2, t3).runNow()))
    if (onTag != null) __obj.updateDynamic("onTag")(js.Any.fromFunction3((t0: /* tag */ java.lang.String, t1: /* html */ java.lang.String, t2: /* options */ js.Object) => onTag(t0, t1, t2).runNow()))
    if (onTagAttr != null) __obj.updateDynamic("onTagAttr")(js.Any.fromFunction4((t0: /* tag */ java.lang.String, t1: /* name */ java.lang.String, t2: /* value */ java.lang.String, t3: /* isWhiteAttr */ scala.Boolean) => onTagAttr(t0, t1, t2, t3).runNow()))
    if (safeAttrValue != null) __obj.updateDynamic("safeAttrValue")(js.Any.fromFunction4((t0: /* tag */ java.lang.String, t1: /* name */ java.lang.String, t2: /* value */ java.lang.String, t3: /* cssFilter */ typingsJapgolly.xss.mod._Global_.XSS.ICSSFilter) => safeAttrValue(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(stripBlankChar)) __obj.updateDynamic("stripBlankChar")(stripBlankChar.asInstanceOf[js.Any])
    if (!js.isUndefined(stripIgnoreTag)) __obj.updateDynamic("stripIgnoreTag")(stripIgnoreTag.asInstanceOf[js.Any])
    if (stripIgnoreTagBody != null) __obj.updateDynamic("stripIgnoreTagBody")(stripIgnoreTagBody.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(whiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterXSSOptions]
  }
}

