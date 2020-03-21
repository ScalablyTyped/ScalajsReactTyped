package typingsJapgolly.oauthJs.OAuth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oauthJs.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureMethodStatic extends js.Object {
  /** A map from signature method name to constructor. */
  var REGISTERED: StringDictionary[AnonInstantiable]
  /**
    * Generate a signature base string from a Message object.
    * @see {@link https://tools.ietf.org/html/rfc5849#section-3.4.1}
    * @param message Source of the signature base string.
    */
  def getBaseString(message: Message): String
  /**
    * Create a subclass of OAuth.SignatureMethod, with the given getSignature function.
    * @param getSignatureFunction
    */
  def makeSubclass(getSignatureFunction: js.Function1[/* baseString */ String, String]): AnonInstantiable
  /** Instantiate a SignatureMethod for the given method name. */
  def newMethod(name: String, accessor: Accessor): SignatureMethod
  def normalizeParameters(parameters: ParameterListOrMap): String
  def normalizeUrl(url: String): String
  def parseUri(str: String): Uri
  /**
    * Subsequently, the given constructor will be used for the named methods.
    * The constructor will be called with no parameters.
    * The resulting object should usually implement getSignature(baseString).
    * You can easily define such a constructor by calling makeSubclass method.
    */
  def registerMethodClass(names: js.Array[String], classConstructor: AnonInstantiable): Unit
  def sign(message: Message, accessor: Accessor): Unit
}

object SignatureMethodStatic {
  @scala.inline
  def apply(
    REGISTERED: StringDictionary[AnonInstantiable],
    getBaseString: Message => CallbackTo[String],
    makeSubclass: js.Function1[/* baseString */ String, String] => CallbackTo[AnonInstantiable],
    newMethod: (String, Accessor) => CallbackTo[SignatureMethod],
    normalizeParameters: ParameterListOrMap => CallbackTo[String],
    normalizeUrl: String => CallbackTo[String],
    parseUri: String => CallbackTo[Uri],
    registerMethodClass: (js.Array[String], AnonInstantiable) => Callback,
    sign: (Message, Accessor) => Callback
  ): SignatureMethodStatic = {
    val __obj = js.Dynamic.literal(REGISTERED = REGISTERED.asInstanceOf[js.Any])
    __obj.updateDynamic("getBaseString")(js.Any.fromFunction1((t0: typingsJapgolly.oauthJs.OAuth.Message) => getBaseString(t0).runNow()))
    __obj.updateDynamic("makeSubclass")(js.Any.fromFunction1((t0: js.Function1[/* baseString */ java.lang.String, java.lang.String]) => makeSubclass(t0).runNow()))
    __obj.updateDynamic("newMethod")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.oauthJs.OAuth.Accessor) => newMethod(t0, t1).runNow()))
    __obj.updateDynamic("normalizeParameters")(js.Any.fromFunction1((t0: typingsJapgolly.oauthJs.OAuth.ParameterListOrMap) => normalizeParameters(t0).runNow()))
    __obj.updateDynamic("normalizeUrl")(js.Any.fromFunction1((t0: java.lang.String) => normalizeUrl(t0).runNow()))
    __obj.updateDynamic("parseUri")(js.Any.fromFunction1((t0: java.lang.String) => parseUri(t0).runNow()))
    __obj.updateDynamic("registerMethodClass")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: typingsJapgolly.oauthJs.AnonInstantiable) => registerMethodClass(t0, t1).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction2((t0: typingsJapgolly.oauthJs.OAuth.Message, t1: typingsJapgolly.oauthJs.OAuth.Accessor) => sign(t0, t1).runNow()))
    __obj.asInstanceOf[SignatureMethodStatic]
  }
}

