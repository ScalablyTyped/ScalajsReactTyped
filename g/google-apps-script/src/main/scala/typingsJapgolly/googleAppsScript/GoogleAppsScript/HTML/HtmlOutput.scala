package typingsJapgolly.googleAppsScript.GoogleAppsScript.HTML

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An HtmlOutput object that can be served from a script. Due to security considerations,
  * scripts cannot directly return HTML to a browser. Instead, they must sanitize it so that it
  * cannot perform malicious actions. You can return sanitized HTML like this:
  *
  *     function doGet() {
  *       return HtmlService.createHtmlOutput('<b>Hello, world!</b>');
  *     }
  *
  * HtmlOutput
  * iframe
  * sandboxing
  * guide to restrictions in HTML service
  */
trait HtmlOutput extends js.Object {
  def addMetaTag(name: String, content: String): HtmlOutput
  def append(addedContent: String): HtmlOutput
  def appendUntrusted(addedContent: String): HtmlOutput
  def asTemplate(): HtmlTemplate
  def clear(): HtmlOutput
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getContent(): String
  def getFaviconUrl(): String
  def getHeight(): Integer
  def getMetaTags(): js.Array[HtmlOutputMetaTag]
  def getTitle(): String
  def getWidth(): Integer
  def setContent(content: String): HtmlOutput
  def setFaviconUrl(iconUrl: String): HtmlOutput
  def setHeight(height: Integer): HtmlOutput
  def setSandboxMode(mode: SandboxMode): HtmlOutput
  def setTitle(title: String): HtmlOutput
  def setWidth(width: Integer): HtmlOutput
  def setXFrameOptionsMode(mode: XFrameOptionsMode): HtmlOutput
}

object HtmlOutput {
  @scala.inline
  def apply(
    addMetaTag: (String, String) => CallbackTo[HtmlOutput],
    append: String => CallbackTo[HtmlOutput],
    appendUntrusted: String => CallbackTo[HtmlOutput],
    asTemplate: CallbackTo[HtmlTemplate],
    clear: CallbackTo[HtmlOutput],
    getAs: String => CallbackTo[Blob],
    getBlob: CallbackTo[Blob],
    getContent: CallbackTo[String],
    getFaviconUrl: CallbackTo[String],
    getHeight: CallbackTo[Integer],
    getMetaTags: CallbackTo[js.Array[HtmlOutputMetaTag]],
    getTitle: CallbackTo[String],
    getWidth: CallbackTo[Integer],
    setContent: String => CallbackTo[HtmlOutput],
    setFaviconUrl: String => CallbackTo[HtmlOutput],
    setHeight: Integer => CallbackTo[HtmlOutput],
    setSandboxMode: SandboxMode => CallbackTo[HtmlOutput],
    setTitle: String => CallbackTo[HtmlOutput],
    setWidth: Integer => CallbackTo[HtmlOutput],
    setXFrameOptionsMode: XFrameOptionsMode => CallbackTo[HtmlOutput]
  ): HtmlOutput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMetaTag")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addMetaTag(t0, t1).runNow()))
    __obj.updateDynamic("append")(js.Any.fromFunction1((t0: java.lang.String) => append(t0).runNow()))
    __obj.updateDynamic("appendUntrusted")(js.Any.fromFunction1((t0: java.lang.String) => appendUntrusted(t0).runNow()))
    __obj.updateDynamic("asTemplate")(asTemplate.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("getAs")(js.Any.fromFunction1((t0: java.lang.String) => getAs(t0).runNow()))
    __obj.updateDynamic("getBlob")(getBlob.toJsFn)
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getFaviconUrl")(getFaviconUrl.toJsFn)
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getMetaTags")(getMetaTags.toJsFn)
    __obj.updateDynamic("getTitle")(getTitle.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setFaviconUrl")(js.Any.fromFunction1((t0: java.lang.String) => setFaviconUrl(t0).runNow()))
    __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setHeight(t0).runNow()))
    __obj.updateDynamic("setSandboxMode")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.HTML.SandboxMode) => setSandboxMode(t0).runNow()))
    __obj.updateDynamic("setTitle")(js.Any.fromFunction1((t0: java.lang.String) => setTitle(t0).runNow()))
    __obj.updateDynamic("setWidth")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer) => setWidth(t0).runNow()))
    __obj.updateDynamic("setXFrameOptionsMode")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.HTML.XFrameOptionsMode) => setXFrameOptionsMode(t0).runNow()))
    __obj.asInstanceOf[HtmlOutput]
  }
}

