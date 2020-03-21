package typingsJapgolly.dojo.dijit._editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dijit/_editor/html.html
  *
  * HTML serialization utility functions used by editor
  * 
  */
trait html extends js.Object {
  /**
    * Adds escape sequences for special characters in XML: &<>"'.
    * Optionally skips escapes for single quotes.
    * 
    * @param str             
    * @param noSingleQuotes               Optional            
    */
  def escapeXml(str: String, noSingleQuotes: Boolean): js.Any
  /**
    * Returns the html content of a DomNode's children
    * 
    * @param node             
    */
  def getChildrenHtml(node: HTMLElement): js.Any
  /**
    * Pushes the html content of a DomNode's children into out[]
    * 
    * @param dom             
    * @param output an array of arrays of points             
    */
  def getChildrenHtmlHelper(dom: HTMLElement, output: js.Array[String]): Unit
  /**
    * Return string representing HTML for node and it's children
    * 
    * @param node             
    */
  def getNodeHtml(node: HTMLElement): js.Any
  /**
    * Pushes array of strings into output[] which represent HTML for node and it's children
    * 
    * @param node             
    * @param output             
    */
  def getNodeHtmlHelper(node: HTMLElement, output: js.Array[String]): String
}

object html {
  @scala.inline
  def apply(
    escapeXml: (String, Boolean) => CallbackTo[js.Any],
    getChildrenHtml: HTMLElement => CallbackTo[js.Any],
    getChildrenHtmlHelper: (HTMLElement, js.Array[String]) => Callback,
    getNodeHtml: HTMLElement => CallbackTo[js.Any],
    getNodeHtmlHelper: (HTMLElement, js.Array[String]) => CallbackTo[String]
  ): html = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("escapeXml")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => escapeXml(t0, t1).runNow()))
    __obj.updateDynamic("getChildrenHtml")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getChildrenHtml(t0).runNow()))
    __obj.updateDynamic("getChildrenHtmlHelper")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Array[java.lang.String]) => getChildrenHtmlHelper(t0, t1).runNow()))
    __obj.updateDynamic("getNodeHtml")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getNodeHtml(t0).runNow()))
    __obj.updateDynamic("getNodeHtmlHelper")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.HTMLElement, t1: js.Array[java.lang.String]) => getNodeHtmlHelper(t0, t1).runNow()))
    __obj.asInstanceOf[html]
  }
}

