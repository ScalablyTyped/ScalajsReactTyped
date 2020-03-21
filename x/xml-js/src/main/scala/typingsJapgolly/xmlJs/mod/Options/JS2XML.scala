package typingsJapgolly.xmlJs.mod.Options

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JS2XML
  extends ChangingKeyNames
     with IgnoreOptions {
  var attributeNameFn: js.UndefOr[
    js.Function4[
      /* attributeName */ String, 
      /* attributeValue */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var attributeValueFn: js.UndefOr[
    js.Function4[
      /* attributeValue */ String, 
      /* attributeName */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var attributesFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var cdataFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var commentFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var doctypeFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var elementNameFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var fullTagEmptyElement: js.UndefOr[Boolean] = js.undefined
  var fullTagEmptyElementFn: js.UndefOr[
    js.Function2[/* currentElementName */ String, /* currentElementObj */ js.Object, Unit]
  ] = js.undefined
  var indentAttributes: js.UndefOr[Boolean] = js.undefined
  var indentCdata: js.UndefOr[Boolean] = js.undefined
  var indentInstruction: js.UndefOr[Boolean] = js.undefined
  var indentText: js.UndefOr[Boolean] = js.undefined
  var instructionFn: js.UndefOr[
    js.Function4[
      /* instructionValue */ String, 
      /* instructionName */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var instructionNameFn: js.UndefOr[
    js.Function4[
      /* instructionName */ String, 
      /* instructionValue */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var noQuotesForNativeAttributes: js.UndefOr[Boolean] = js.undefined
  var spaces: js.UndefOr[Double | String] = js.undefined
  var textFn: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* currentElementName */ String, 
      /* currentElementObj */ js.Object, 
      Unit
    ]
  ] = js.undefined
}

object JS2XML {
  @scala.inline
  def apply(
    attributeNameFn: (/* attributeName */ String, /* attributeValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    attributeValueFn: (/* attributeValue */ String, /* attributeName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    attributesFn: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    attributesKey: String = null,
    cdataFn: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    cdataKey: String = null,
    commentFn: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    commentKey: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    declarationKey: String = null,
    doctypeFn: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    doctypeKey: String = null,
    elementNameFn: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    elementsKey: String = null,
    fullTagEmptyElement: js.UndefOr[Boolean] = js.undefined,
    fullTagEmptyElementFn: (/* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    ignoreAttributes: js.UndefOr[Boolean] = js.undefined,
    ignoreCdata: js.UndefOr[Boolean] = js.undefined,
    ignoreComment: js.UndefOr[Boolean] = js.undefined,
    ignoreDeclaration: js.UndefOr[Boolean] = js.undefined,
    ignoreDoctype: js.UndefOr[Boolean] = js.undefined,
    ignoreInstruction: js.UndefOr[Boolean] = js.undefined,
    ignoreText: js.UndefOr[Boolean] = js.undefined,
    indentAttributes: js.UndefOr[Boolean] = js.undefined,
    indentCdata: js.UndefOr[Boolean] = js.undefined,
    indentInstruction: js.UndefOr[Boolean] = js.undefined,
    indentText: js.UndefOr[Boolean] = js.undefined,
    instructionFn: (/* instructionValue */ String, /* instructionName */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    instructionKey: String = null,
    instructionNameFn: (/* instructionName */ String, /* instructionValue */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    nameKey: String = null,
    noQuotesForNativeAttributes: js.UndefOr[Boolean] = js.undefined,
    parentKey: String = null,
    spaces: Double | String = null,
    textFn: (/* value */ String, /* currentElementName */ String, /* currentElementObj */ js.Object) => Callback = null,
    textKey: String = null,
    typeKey: String = null
  ): JS2XML = {
    val __obj = js.Dynamic.literal()
    if (attributeNameFn != null) __obj.updateDynamic("attributeNameFn")(js.Any.fromFunction4((t0: /* attributeName */ java.lang.String, t1: /* attributeValue */ java.lang.String, t2: /* currentElementName */ java.lang.String, t3: /* currentElementObj */ js.Object) => attributeNameFn(t0, t1, t2, t3).runNow()))
    if (attributeValueFn != null) __obj.updateDynamic("attributeValueFn")(js.Any.fromFunction4((t0: /* attributeValue */ java.lang.String, t1: /* attributeName */ java.lang.String, t2: /* currentElementName */ java.lang.String, t3: /* currentElementObj */ js.Object) => attributeValueFn(t0, t1, t2, t3).runNow()))
    if (attributesFn != null) __obj.updateDynamic("attributesFn")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* currentElementName */ java.lang.String, t2: /* currentElementObj */ js.Object) => attributesFn(t0, t1, t2).runNow()))
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (cdataFn != null) __obj.updateDynamic("cdataFn")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* currentElementName */ java.lang.String, t2: /* currentElementObj */ js.Object) => cdataFn(t0, t1, t2).runNow()))
    if (cdataKey != null) __obj.updateDynamic("cdataKey")(cdataKey.asInstanceOf[js.Any])
    if (commentFn != null) __obj.updateDynamic("commentFn")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* currentElementName */ java.lang.String, t2: /* currentElementObj */ js.Object) => commentFn(t0, t1, t2).runNow()))
    if (commentKey != null) __obj.updateDynamic("commentKey")(commentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (declarationKey != null) __obj.updateDynamic("declarationKey")(declarationKey.asInstanceOf[js.Any])
    if (doctypeFn != null) __obj.updateDynamic("doctypeFn")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* currentElementName */ java.lang.String, t2: /* currentElementObj */ js.Object) => doctypeFn(t0, t1, t2).runNow()))
    if (doctypeKey != null) __obj.updateDynamic("doctypeKey")(doctypeKey.asInstanceOf[js.Any])
    if (elementNameFn != null) __obj.updateDynamic("elementNameFn")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* currentElementName */ java.lang.String, t2: /* currentElementObj */ js.Object) => elementNameFn(t0, t1, t2).runNow()))
    if (elementsKey != null) __obj.updateDynamic("elementsKey")(elementsKey.asInstanceOf[js.Any])
    if (!js.isUndefined(fullTagEmptyElement)) __obj.updateDynamic("fullTagEmptyElement")(fullTagEmptyElement.asInstanceOf[js.Any])
    if (fullTagEmptyElementFn != null) __obj.updateDynamic("fullTagEmptyElementFn")(js.Any.fromFunction2((t0: /* currentElementName */ java.lang.String, t1: /* currentElementObj */ js.Object) => fullTagEmptyElementFn(t0, t1).runNow()))
    if (!js.isUndefined(ignoreAttributes)) __obj.updateDynamic("ignoreAttributes")(ignoreAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCdata)) __obj.updateDynamic("ignoreCdata")(ignoreCdata.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreComment)) __obj.updateDynamic("ignoreComment")(ignoreComment.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDeclaration)) __obj.updateDynamic("ignoreDeclaration")(ignoreDeclaration.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDoctype)) __obj.updateDynamic("ignoreDoctype")(ignoreDoctype.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInstruction)) __obj.updateDynamic("ignoreInstruction")(ignoreInstruction.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreText)) __obj.updateDynamic("ignoreText")(ignoreText.asInstanceOf[js.Any])
    if (!js.isUndefined(indentAttributes)) __obj.updateDynamic("indentAttributes")(indentAttributes.asInstanceOf[js.Any])
    if (!js.isUndefined(indentCdata)) __obj.updateDynamic("indentCdata")(indentCdata.asInstanceOf[js.Any])
    if (!js.isUndefined(indentInstruction)) __obj.updateDynamic("indentInstruction")(indentInstruction.asInstanceOf[js.Any])
    if (!js.isUndefined(indentText)) __obj.updateDynamic("indentText")(indentText.asInstanceOf[js.Any])
    if (instructionFn != null) __obj.updateDynamic("instructionFn")(js.Any.fromFunction4((t0: /* instructionValue */ java.lang.String, t1: /* instructionName */ java.lang.String, t2: /* currentElementName */ java.lang.String, t3: /* currentElementObj */ js.Object) => instructionFn(t0, t1, t2, t3).runNow()))
    if (instructionKey != null) __obj.updateDynamic("instructionKey")(instructionKey.asInstanceOf[js.Any])
    if (instructionNameFn != null) __obj.updateDynamic("instructionNameFn")(js.Any.fromFunction4((t0: /* instructionName */ java.lang.String, t1: /* instructionValue */ java.lang.String, t2: /* currentElementName */ java.lang.String, t3: /* currentElementObj */ js.Object) => instructionNameFn(t0, t1, t2, t3).runNow()))
    if (nameKey != null) __obj.updateDynamic("nameKey")(nameKey.asInstanceOf[js.Any])
    if (!js.isUndefined(noQuotesForNativeAttributes)) __obj.updateDynamic("noQuotesForNativeAttributes")(noQuotesForNativeAttributes.asInstanceOf[js.Any])
    if (parentKey != null) __obj.updateDynamic("parentKey")(parentKey.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    if (textFn != null) __obj.updateDynamic("textFn")(js.Any.fromFunction3((t0: /* value */ java.lang.String, t1: /* currentElementName */ java.lang.String, t2: /* currentElementObj */ js.Object) => textFn(t0, t1, t2).runNow()))
    if (textKey != null) __obj.updateDynamic("textKey")(textKey.asInstanceOf[js.Any])
    if (typeKey != null) __obj.updateDynamic("typeKey")(typeKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[JS2XML]
  }
}

