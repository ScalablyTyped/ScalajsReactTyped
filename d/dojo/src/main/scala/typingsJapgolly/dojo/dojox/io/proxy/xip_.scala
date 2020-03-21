package typingsJapgolly.dojo.dojox.io.proxy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/io/proxy/xip.html
  *
  * Object that implements the iframe handling for XMLHttpRequest
  * IFrame Proxying.
  *
  * Do not use this object directly. See the Dojo Book page
  * on XMLHttpRequest IFrame Proxying:
  * http://dojotoolkit.org/book/dojo-book-0-4/part-5-connecting-pieces/i-o/cross-domain-xmlhttprequest-using-iframe-proxy
  * Usage of XHR IFrame Proxying does not work from local disk in Safari.
  *
  */
trait xip_ extends js.Object {
  /**
    *
    */
  var urlLimit: Double
  /**
    *
    */
  var xipClientUrl: js.Object
  /**
    * XMLHttpRequest facade object used by dojox.io.proxy.xip.
    *
    * Do not use this object directly. See the Dojo Book page
    * on XMLHttpRequest IFrame Proxying:
    * http://dojotoolkit.org/book/dojo-book-0-4/part-5-connecting-pieces/i-o/cross-domain-xmlhttprequest-using-iframe-proxy
    *
    * @param ifpServerUrl
    */
  def XhrIframeFacade(ifpServerUrl: js.Any): Unit
  /**
    *
    */
  def createFacade(): js.Any
  /**
    *
    * @param stateId
    */
  def destroyState(stateId: String): Unit
  /**
    *
    * @param frag
    */
  def fragmentReceived(frag: js.Any): Unit
  /**
    * HTML5 document messaging endpoint. Unpack the event to see if we want to use it.
    *
    * @param evt
    */
  def fragmentReceivedEvent(evt: js.Any): Unit
  /**
    *
    * @param stateId
    */
  def frameLoaded(stateId: String): Unit
  /**
    *
    * @param stateId
    * @param cmd
    * @param message
    */
  def makeServerUrl(stateId: js.Any, cmd: js.Any, message: js.Any): String
  /**
    *
    * @param stateId
    * @param urlEncodedData
    */
  def receive(stateId: String, urlEncodedData: String): Unit
  /**
    * starts the xdomain request using the provided facade.
    * This method first does some init work, then delegates to _realSend.
    *
    * @param facade
    */
  def send(facade: js.Object): js.Any
  /**
    *
    * @param stateId
    * @param encodedData
    */
  def sendRequest(stateId: js.Any, encodedData: js.Any): Unit
  /**
    *
    * @param stateId
    */
  def sendRequestPart(stateId: js.Any): Unit
  /**
    *
    * @param stateId
    */
  def sendRequestStart(stateId: js.Any): Unit
  /**
    *
    * @param stateId
    * @param cmd
    * @param message
    */
  def setServerUrl(stateId: js.Any, cmd: js.Any, message: js.Any): Unit
  /**
    *
    * @param encodedMessage
    */
  def unpackMessage(encodedMessage: js.Any): js.Object
}

object xip_ {
  @scala.inline
  def apply(
    XhrIframeFacade: js.Any => Callback,
    createFacade: CallbackTo[js.Any],
    destroyState: String => Callback,
    fragmentReceived: js.Any => Callback,
    fragmentReceivedEvent: js.Any => Callback,
    frameLoaded: String => Callback,
    makeServerUrl: (js.Any, js.Any, js.Any) => CallbackTo[String],
    receive: (String, String) => Callback,
    send: js.Object => CallbackTo[js.Any],
    sendRequest: (js.Any, js.Any) => Callback,
    sendRequestPart: js.Any => Callback,
    sendRequestStart: js.Any => Callback,
    setServerUrl: (js.Any, js.Any, js.Any) => Callback,
    unpackMessage: js.Any => CallbackTo[js.Object],
    urlLimit: Double,
    xipClientUrl: js.Object
  ): xip_ = {
    val __obj = js.Dynamic.literal(urlLimit = urlLimit.asInstanceOf[js.Any], xipClientUrl = xipClientUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("XhrIframeFacade")(js.Any.fromFunction1((t0: js.Any) => XhrIframeFacade(t0).runNow()))
    __obj.updateDynamic("createFacade")(createFacade.toJsFn)
    __obj.updateDynamic("destroyState")(js.Any.fromFunction1((t0: java.lang.String) => destroyState(t0).runNow()))
    __obj.updateDynamic("fragmentReceived")(js.Any.fromFunction1((t0: js.Any) => fragmentReceived(t0).runNow()))
    __obj.updateDynamic("fragmentReceivedEvent")(js.Any.fromFunction1((t0: js.Any) => fragmentReceivedEvent(t0).runNow()))
    __obj.updateDynamic("frameLoaded")(js.Any.fromFunction1((t0: java.lang.String) => frameLoaded(t0).runNow()))
    __obj.updateDynamic("makeServerUrl")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => makeServerUrl(t0, t1, t2).runNow()))
    __obj.updateDynamic("receive")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => receive(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Object) => send(t0).runNow()))
    __obj.updateDynamic("sendRequest")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => sendRequest(t0, t1).runNow()))
    __obj.updateDynamic("sendRequestPart")(js.Any.fromFunction1((t0: js.Any) => sendRequestPart(t0).runNow()))
    __obj.updateDynamic("sendRequestStart")(js.Any.fromFunction1((t0: js.Any) => sendRequestStart(t0).runNow()))
    __obj.updateDynamic("setServerUrl")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => setServerUrl(t0, t1, t2).runNow()))
    __obj.updateDynamic("unpackMessage")(js.Any.fromFunction1((t0: js.Any) => unpackMessage(t0).runNow()))
    __obj.asInstanceOf[xip_]
  }
}

