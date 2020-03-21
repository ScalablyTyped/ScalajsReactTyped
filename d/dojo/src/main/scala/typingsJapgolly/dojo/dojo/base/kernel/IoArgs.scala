package typingsJapgolly.dojo.dojo.base.kernel

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.__IoArgs.html
  *
  *
  */
@JSGlobal("dojo._base.kernel.__IoArgs")
@js.native
class IoArgs () extends js.Object {
  /**
    * Contains properties with string values. These
    * properties will be serialized as name1=value2 and
    * passed in the request.
    *
    */
  var content: js.Object = js.native
  /**
    * DOM node for a form. Used to extract the form values
    * and send to the server.
    *
    */
  var form: HTMLElement = js.native
  /**
    * Acceptable values depend on the type of IO
    * transport (see specific IO calls for more information).
    *
    */
  var handleAs: String = js.native
  /**
    * Set this explicitly to false to prevent publishing of topics related to
    * IO operations. Otherwise, if djConfig.ioPublish is set to true, topics
    * will be published via dojo/topic.publish() for different phases of an IO operation.
    * See dojo/main.__IoPublish for a list of topics that are published.
    *
    */
  var ioPublish: Boolean = js.native
  /**
    * Default is false. If true, then a
    * "dojo.preventCache" parameter is sent in the request
    * with a value that changes with each request
    * (timestamp). Useful only with GET-type requests.
    *
    */
  var preventCache: Boolean = js.native
  /**
    * Sets the raw body for an HTTP request. If this is used, then the content
    * property is ignored. This is mostly useful for HTTP methods that have
    * a body to their requests, like PUT or POST. This property can be used instead
    * of postData and putData for dojo/_base/xhr.rawXhrPost and dojo/_base/xhr.rawXhrPut respectively.
    *
    */
  var rawBody: String = js.native
  /**
    * Milliseconds to wait for the response. If this time
    * passes, the then error callbacks are called.
    *
    */
  var timeout: Double = js.native
  /**
    * URL to server endpoint.
    *
    */
  var url: String = js.native
  /**
    * This function will
    * be called when the request fails due to a network or server error, the url
    * is invalid, etc. It will also be called if the load or handle callback throws an
    * exception, unless djConfig.debugAtAllCosts is true.  This allows deployed applications
    * to continue to run even when a logic error happens in the callback, while making
    * it easier to troubleshoot while in debug mode.
    *
    * @param response The response in the format as defined with handleAs.
    * @param ioArgs Provides additional information about the request.
    */
  def error(response: js.Object, ioArgs: typingsJapgolly.dojo.dojo.main.IoCallbackArgs): Unit = js.native
  /**
    * This function will
    * be called at the end of every request, whether or not an error occurs.
    *
    * @param loadOrError Provides a string that tells you whether this functionwas called because of success (load) or failure (error).
    * @param response The response in the format as defined with handleAs.
    * @param ioArgs Provides additional information about the request.
    */
  def handle(loadOrError: String, response: js.Object, ioArgs: typingsJapgolly.dojo.dojo.main.IoCallbackArgs): Unit = js.native
  /**
    * This function will be
    * called on a successful HTTP response code.
    *
    * @param response The response in the format as defined with handleAs.
    * @param ioArgs Provides additional information about the request.
    */
  def load(response: js.Object, ioArgs: typingsJapgolly.dojo.dojo.main.IoCallbackArgs): Unit = js.native
}

