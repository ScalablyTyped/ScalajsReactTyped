package typingsJapgolly.dojo.dojo.io

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/io/iframe.html
  *
  * Deprecated, use dojo/request/iframe instead.
  * Sends an Ajax I/O call using and Iframe (for instance, to upload files)
  *
  */
trait iframe extends js.Object {
  /**
    * Creates a hidden iframe in the page. Used mostly for IO
    * transports.  You do not need to call this to start a
    * dojo/io/iframe request. Just call send().
    *
    * @param fname The name of the iframe. Used for the name attribute on theiframe.
    * @param onloadstr A string of JavaScript that will be executed when the contentin the iframe loads.
    * @param uri The value of the src attribute on the iframe element. If avalue is not given, then dojo/resources/blank.html will beused.
    */
  def create(fname: String, onloadstr: String, uri: String): Unit
  /**
    * Returns the document object associated with the iframe DOM Node argument.
    *
    * @param iframeNode
    */
  def doc(iframeNode: js.Any): Unit
  /**
    * Sets the URL that is loaded in an IFrame. The replace parameter
    * indicates whether location.replace() should be used when
    * changing the location of the iframe.
    *
    * @param iframe
    * @param src
    * @param replace
    */
  def setSrc(iframe: js.Any, src: js.Any, replace: js.Any): Unit
}

object iframe {
  @scala.inline
  def apply(
    create: (String, String, String) => Callback,
    doc: js.Any => Callback,
    setSrc: (js.Any, js.Any, js.Any) => Callback
  ): iframe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => create(t0, t1, t2).runNow()))
    __obj.updateDynamic("doc")(js.Any.fromFunction1((t0: js.Any) => doc(t0).runNow()))
    __obj.updateDynamic("setSrc")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => setSrc(t0, t1, t2).runNow()))
    __obj.asInstanceOf[iframe]
  }
}

