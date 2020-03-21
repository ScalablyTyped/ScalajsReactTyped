package typingsJapgolly.titanium.Titanium.Network

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Cookie object used to manage the system cookie store and HTTP client cookie store.
		 */
trait Cookie extends Proxy {
  /**
  			 * The comment describing the purpose of this cookie
  			 */
  var comment: String
  /**
  			 * The domain attribute of the cookie.
  			 */
  var domain: String
  /**
  			 * The expiration Date of the cookie.
  			 */
  var expiryDate: String
  /**
  			 * The httponly attribute of the cookie.
  			 */
  var httponly: Boolean
  /**
  			 * Sets the Max-Age attribute of a Cookie, in delta-seconds.
  			 */
  var maxAge: Double
  /**
  			 * The name of the cookie.
  			 */
  val name: String
  /**
  			 * The origual url attribute of the cookie.
  			 */
  var originalUrl: String
  /**
  			 * The path attribute of the cookie.
  			 */
  var path: String
  /**
  			 * The secure attribute of the cookie.
  			 */
  var secure: Boolean
  /**
  			 * The value of the cookie.
  			 */
  var value: String
  /**
  			 * The version of the cookie specification to which this cookie conforms.
  			 */
  var version: Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def getComment(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def getDomain(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def getExpiryDate(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def getHttponly(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def getMaxAge(): Double
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.name> property.
  			 */
  def getName(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def getOriginalUrl(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def getPath(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def getSecure(): Boolean
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def getValue(): String
  /**
  			 * Gets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def getVersion(): Double
  /**
  			 * Returns true if the cookie is valid.
  			 */
  def isValid(): Boolean
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.comment> property.
  			 */
  def setComment(comment: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.domain> property.
  			 */
  def setDomain(domain: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.expiryDate> property.
  			 */
  def setExpiryDate(expiryDate: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.httponly> property.
  			 */
  def setHttponly(httponly: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.maxAge> property.
  			 */
  def setMaxAge(maxAge: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.originalUrl> property.
  			 */
  def setOriginalUrl(originalUrl: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.path> property.
  			 */
  def setPath(path: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.secure> property.
  			 */
  def setSecure(secure: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.value> property.
  			 */
  def setValue(value: String): Unit
  /**
  			 * Sets the value of the <Titanium.Network.Cookie.version> property.
  			 */
  def setVersion(version: Double): Unit
}

object Cookie {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    comment: String,
    domain: String,
    expiryDate: String,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getComment: CallbackTo[String],
    getDomain: CallbackTo[String],
    getExpiryDate: CallbackTo[String],
    getHttponly: CallbackTo[Boolean],
    getMaxAge: CallbackTo[Double],
    getName: CallbackTo[String],
    getOriginalUrl: CallbackTo[String],
    getPath: CallbackTo[String],
    getSecure: CallbackTo[Boolean],
    getValue: CallbackTo[String],
    getVersion: CallbackTo[Double],
    httponly: Boolean,
    isValid: CallbackTo[Boolean],
    maxAge: Double,
    name: String,
    originalUrl: String,
    path: String,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    secure: Boolean,
    setBubbleParent: Boolean => Callback,
    setComment: String => Callback,
    setDomain: String => Callback,
    setExpiryDate: String => Callback,
    setHttponly: Boolean => Callback,
    setMaxAge: Double => Callback,
    setOriginalUrl: String => Callback,
    setPath: String => Callback,
    setSecure: Boolean => Callback,
    setValue: String => Callback,
    setVersion: Double => Callback,
    value: String,
    version: Double,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], expiryDate = expiryDate.asInstanceOf[js.Any], httponly = httponly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getComment")(getComment.toJsFn)
    __obj.updateDynamic("getDomain")(getDomain.toJsFn)
    __obj.updateDynamic("getExpiryDate")(getExpiryDate.toJsFn)
    __obj.updateDynamic("getHttponly")(getHttponly.toJsFn)
    __obj.updateDynamic("getMaxAge")(getMaxAge.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getOriginalUrl")(getOriginalUrl.toJsFn)
    __obj.updateDynamic("getPath")(getPath.toJsFn)
    __obj.updateDynamic("getSecure")(getSecure.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("getVersion")(getVersion.toJsFn)
    __obj.updateDynamic("isValid")(isValid.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setComment")(js.Any.fromFunction1((t0: java.lang.String) => setComment(t0).runNow()))
    __obj.updateDynamic("setDomain")(js.Any.fromFunction1((t0: java.lang.String) => setDomain(t0).runNow()))
    __obj.updateDynamic("setExpiryDate")(js.Any.fromFunction1((t0: java.lang.String) => setExpiryDate(t0).runNow()))
    __obj.updateDynamic("setHttponly")(js.Any.fromFunction1((t0: scala.Boolean) => setHttponly(t0).runNow()))
    __obj.updateDynamic("setMaxAge")(js.Any.fromFunction1((t0: scala.Double) => setMaxAge(t0).runNow()))
    __obj.updateDynamic("setOriginalUrl")(js.Any.fromFunction1((t0: java.lang.String) => setOriginalUrl(t0).runNow()))
    __obj.updateDynamic("setPath")(js.Any.fromFunction1((t0: java.lang.String) => setPath(t0).runNow()))
    __obj.updateDynamic("setSecure")(js.Any.fromFunction1((t0: scala.Boolean) => setSecure(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.updateDynamic("setVersion")(js.Any.fromFunction1((t0: scala.Double) => setVersion(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

