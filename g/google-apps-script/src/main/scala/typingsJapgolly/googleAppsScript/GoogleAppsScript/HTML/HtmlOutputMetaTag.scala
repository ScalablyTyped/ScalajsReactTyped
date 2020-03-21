package typingsJapgolly.googleAppsScript.GoogleAppsScript.HTML

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that represents a meta tag added to the page by calling HtmlOutput.addMetaTag(name, content).
  *
  *     var output = HtmlService.createHtmlOutput('<b>Hello, world!</b>');
  *     output.addMetaTag('viewport', 'width=device-width, initial-scale=1');
  *
  *     var tags = output.getMetaTags();
  *     Logger.log('<meta name="%s" content="%s"/>', tags[0].getName(), tags[0].getContent());
  */
trait HtmlOutputMetaTag extends js.Object {
  def getContent(): String
  def getName(): String
}

object HtmlOutputMetaTag {
  @scala.inline
  def apply(getContent: CallbackTo[String], getName: CallbackTo[String]): HtmlOutputMetaTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.asInstanceOf[HtmlOutputMetaTag]
  }
}

