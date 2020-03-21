package typingsJapgolly.xmlbuilder.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the functions used for converting values to strings.
  */
trait XMLStringifier extends js.Object {
  /**
    * Escapes special characters in attribute values.
    */
  var attEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.undefined
  /**
    * Converts attribute value to string
    */
  var attValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts the contents of a CDATA node to string
    */
  var cdata: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts the contents of a comment node to string
    */
  var comment: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to an attribute. 
    */
  var convertAttKey: js.UndefOr[String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a CDATA 
    * node. 
    */
  var convertCDataKey: js.UndefOr[String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a 
    * comment node.
    */
  var convertCommentKey: js.UndefOr[String] = js.undefined
  /** 
    * When prepended to a JS object key, converts the key-value pair 
    * to a processing instruction node. 
    */
  var convertPIKey: js.UndefOr[String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a raw 
    * text node. 
    */
  var convertRawKey: js.UndefOr[String] = js.undefined
  /** 
    * When prepended to a JS object key, converts its value to a text node. 
    * 
    * _Note:_ Since JS objects cannot contain duplicate keys, multiple text 
    * nodes can be created by adding some unique text after each object 
    * key. For example: `{ '#text1': 'some text', '#text2': 'more text' };`
    */
  var convertTextKey: js.UndefOr[String] = js.undefined
  /**
    * Converts `!ATTLIST` node default value inside DocType to string
    */
  var dtdAttDefault: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts `!ATTLIST` node type inside DocType to string
    */
  var dtdAttType: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts `!ELEMENT` node content inside Doctype to string
    */
  var dtdElementValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts `!ENTITY` node content inside Doctype to string
    */
  var dtdEntityValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts `!NOTATION` node content inside Doctype to string
    */
  var dtdNData: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts DocType public identifier to string
    */
  var dtdPubID: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts DocType system identifier to string
    */
  var dtdSysID: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts processing instruction target to string
    */
  var insTarget: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts processing instruction value to string
    */
  var insValue: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts an element or attribute name to string
    */
  var name: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts the contents of a raw text node to string
    */
  var raw: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts the contents of a text node to string
    */
  var text: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Escapes special characters in text.
    */
  var textEscape: js.UndefOr[js.Function1[/* v */ String, String]] = js.undefined
  /**
    * Converts XML encoding to string
    */
  var xmlEncoding: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts standalone document declaration to string
    */
  var xmlStandalone: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
  /**
    * Converts XML version to string
    */
  var xmlVersion: js.UndefOr[js.Function1[/* v */ js.Any, String]] = js.undefined
}

object XMLStringifier {
  @scala.inline
  def apply(
    attEscape: /* v */ String => CallbackTo[String] = null,
    attValue: /* v */ js.Any => CallbackTo[String] = null,
    cdata: /* v */ js.Any => CallbackTo[String] = null,
    comment: /* v */ js.Any => CallbackTo[String] = null,
    convertAttKey: String = null,
    convertCDataKey: String = null,
    convertCommentKey: String = null,
    convertPIKey: String = null,
    convertRawKey: String = null,
    convertTextKey: String = null,
    dtdAttDefault: /* v */ js.Any => CallbackTo[String] = null,
    dtdAttType: /* v */ js.Any => CallbackTo[String] = null,
    dtdElementValue: /* v */ js.Any => CallbackTo[String] = null,
    dtdEntityValue: /* v */ js.Any => CallbackTo[String] = null,
    dtdNData: /* v */ js.Any => CallbackTo[String] = null,
    dtdPubID: /* v */ js.Any => CallbackTo[String] = null,
    dtdSysID: /* v */ js.Any => CallbackTo[String] = null,
    insTarget: /* v */ js.Any => CallbackTo[String] = null,
    insValue: /* v */ js.Any => CallbackTo[String] = null,
    name: /* v */ js.Any => CallbackTo[String] = null,
    raw: /* v */ js.Any => CallbackTo[String] = null,
    text: /* v */ js.Any => CallbackTo[String] = null,
    textEscape: /* v */ String => CallbackTo[String] = null,
    xmlEncoding: /* v */ js.Any => CallbackTo[String] = null,
    xmlStandalone: /* v */ js.Any => CallbackTo[String] = null,
    xmlVersion: /* v */ js.Any => CallbackTo[String] = null
  ): XMLStringifier = {
    val __obj = js.Dynamic.literal()
    if (attEscape != null) __obj.updateDynamic("attEscape")(js.Any.fromFunction1((t0: /* v */ java.lang.String) => attEscape(t0).runNow()))
    if (attValue != null) __obj.updateDynamic("attValue")(js.Any.fromFunction1((t0: /* v */ js.Any) => attValue(t0).runNow()))
    if (cdata != null) __obj.updateDynamic("cdata")(js.Any.fromFunction1((t0: /* v */ js.Any) => cdata(t0).runNow()))
    if (comment != null) __obj.updateDynamic("comment")(js.Any.fromFunction1((t0: /* v */ js.Any) => comment(t0).runNow()))
    if (convertAttKey != null) __obj.updateDynamic("convertAttKey")(convertAttKey.asInstanceOf[js.Any])
    if (convertCDataKey != null) __obj.updateDynamic("convertCDataKey")(convertCDataKey.asInstanceOf[js.Any])
    if (convertCommentKey != null) __obj.updateDynamic("convertCommentKey")(convertCommentKey.asInstanceOf[js.Any])
    if (convertPIKey != null) __obj.updateDynamic("convertPIKey")(convertPIKey.asInstanceOf[js.Any])
    if (convertRawKey != null) __obj.updateDynamic("convertRawKey")(convertRawKey.asInstanceOf[js.Any])
    if (convertTextKey != null) __obj.updateDynamic("convertTextKey")(convertTextKey.asInstanceOf[js.Any])
    if (dtdAttDefault != null) __obj.updateDynamic("dtdAttDefault")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdAttDefault(t0).runNow()))
    if (dtdAttType != null) __obj.updateDynamic("dtdAttType")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdAttType(t0).runNow()))
    if (dtdElementValue != null) __obj.updateDynamic("dtdElementValue")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdElementValue(t0).runNow()))
    if (dtdEntityValue != null) __obj.updateDynamic("dtdEntityValue")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdEntityValue(t0).runNow()))
    if (dtdNData != null) __obj.updateDynamic("dtdNData")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdNData(t0).runNow()))
    if (dtdPubID != null) __obj.updateDynamic("dtdPubID")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdPubID(t0).runNow()))
    if (dtdSysID != null) __obj.updateDynamic("dtdSysID")(js.Any.fromFunction1((t0: /* v */ js.Any) => dtdSysID(t0).runNow()))
    if (insTarget != null) __obj.updateDynamic("insTarget")(js.Any.fromFunction1((t0: /* v */ js.Any) => insTarget(t0).runNow()))
    if (insValue != null) __obj.updateDynamic("insValue")(js.Any.fromFunction1((t0: /* v */ js.Any) => insValue(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(js.Any.fromFunction1((t0: /* v */ js.Any) => name(t0).runNow()))
    if (raw != null) __obj.updateDynamic("raw")(js.Any.fromFunction1((t0: /* v */ js.Any) => raw(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction1((t0: /* v */ js.Any) => text(t0).runNow()))
    if (textEscape != null) __obj.updateDynamic("textEscape")(js.Any.fromFunction1((t0: /* v */ java.lang.String) => textEscape(t0).runNow()))
    if (xmlEncoding != null) __obj.updateDynamic("xmlEncoding")(js.Any.fromFunction1((t0: /* v */ js.Any) => xmlEncoding(t0).runNow()))
    if (xmlStandalone != null) __obj.updateDynamic("xmlStandalone")(js.Any.fromFunction1((t0: /* v */ js.Any) => xmlStandalone(t0).runNow()))
    if (xmlVersion != null) __obj.updateDynamic("xmlVersion")(js.Any.fromFunction1((t0: /* v */ js.Any) => xmlVersion(t0).runNow()))
    __obj.asInstanceOf[XMLStringifier]
  }
}

