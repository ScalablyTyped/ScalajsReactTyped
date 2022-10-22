package typingsJapgolly.seleniumWebdriver.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.seleniumWebdriver.anon.Message
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object error {
  
  @JSImport("selenium-webdriver", "error")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  @JSImport("selenium-webdriver", "error.ElementClickInterceptedError")
  @js.native
  open class ElementClickInterceptedError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  @JSImport("selenium-webdriver", "error.ElementNotInteractableError")
  @js.native
  open class ElementNotInteractableError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  @JSImport("selenium-webdriver", "error.ElementNotSelectableError")
  @js.native
  open class ElementNotSelectableError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  @JSImport("selenium-webdriver", "error.ErrorCode")
  @js.native
  val ErrorCode: ErrorCodeType = js.native
  
  @JSImport("selenium-webdriver", "error.IError")
  @js.native
  open class IError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  @JSImport("selenium-webdriver", "error.InsecureCertificateError")
  @js.native
  open class InsecureCertificateError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  @JSImport("selenium-webdriver", "error.InvalidArgumentError")
  @js.native
  open class InvalidArgumentError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  @JSImport("selenium-webdriver", "error.InvalidCookieDomainError")
  @js.native
  open class InvalidCookieDomainError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  @JSImport("selenium-webdriver", "error.InvalidCoordinatesError")
  @js.native
  open class InvalidCoordinatesError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  @JSImport("selenium-webdriver", "error.InvalidElementStateError")
  @js.native
  open class InvalidElementStateError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * Argument was an invalid selector.
    */
  @JSImport("selenium-webdriver", "error.InvalidSelectorError")
  @js.native
  open class InvalidSelectorError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  @JSImport("selenium-webdriver", "error.JavascriptError")
  @js.native
  open class JavascriptError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  @JSImport("selenium-webdriver", "error.MoveTargetOutOfBoundsError")
  @js.native
  open class MoveTargetOutOfBoundsError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  @JSImport("selenium-webdriver", "error.NoSuchAlertError")
  @js.native
  open class NoSuchAlertError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  @JSImport("selenium-webdriver", "error.NoSuchCookieError")
  @js.native
  open class NoSuchCookieError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  @JSImport("selenium-webdriver", "error.NoSuchElementError")
  @js.native
  open class NoSuchElementError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  @JSImport("selenium-webdriver", "error.NoSuchFrameError")
  @js.native
  open class NoSuchFrameError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  @JSImport("selenium-webdriver", "error.NoSuchSessionError")
  @js.native
  open class NoSuchSessionError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  @JSImport("selenium-webdriver", "error.NoSuchWindowError")
  @js.native
  open class NoSuchWindowError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A script did not complete before its timeout expired.
    */
  @JSImport("selenium-webdriver", "error.ScriptTimeoutError")
  @js.native
  open class ScriptTimeoutError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A new session could not be created.
    */
  @JSImport("selenium-webdriver", "error.SessionNotCreatedError")
  @js.native
  open class SessionNotCreatedError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  @JSImport("selenium-webdriver", "error.StaleElementReferenceError")
  @js.native
  open class StaleElementReferenceError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  @JSImport("selenium-webdriver", "error.TimeoutError")
  @js.native
  open class TimeoutError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A screen capture operation was not possible.
    */
  @JSImport("selenium-webdriver", "error.UnableToCaptureScreenError")
  @js.native
  open class UnableToCaptureScreenError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  @JSImport("selenium-webdriver", "error.UnableToSetCookieError")
  @js.native
  open class UnableToSetCookieError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  @JSImport("selenium-webdriver", "error.UnexpectedAlertOpenError")
  @js.native
  open class UnexpectedAlertOpenError () extends WebDriverError {
    def this(message: String) = this()
    def this(message: String, openAlertText: String) = this()
    def this(message: Unit, openAlertText: String) = this()
    
    /**
      * @return {(string|undefined)} The text displayed with the unhandled alert,
      *     if available.
      */
    def getAlertText(): String = js.native
  }
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  @JSImport("selenium-webdriver", "error.UnknownCommandError")
  @js.native
  open class UnknownCommandError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  @JSImport("selenium-webdriver", "error.UnknownMethodError")
  @js.native
  open class UnknownMethodError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * Reports an unsupport operation.
    */
  @JSImport("selenium-webdriver", "error.UnsupportedOperationError")
  @js.native
  open class UnsupportedOperationError () extends WebDriverError {
    def this(message: String) = this()
  }
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  @JSImport("selenium-webdriver", "error.WebDriverError")
  @js.native
  open class WebDriverError () extends IError {
    def this(message: String) = this()
    
    var remoteStacktrace: js.UndefOr[String] = js.native
  }
  
  /**
    * Checks a legacy response from the Selenium 2.0 wire protocol for an error.
    */
  inline def checkLegacyResponse(response: MaybeLegacyResponse): MaybeLegacyResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLegacyResponse")(response.asInstanceOf[js.Any]).asInstanceOf[MaybeLegacyResponse]
  
  /**
    * Checks a response object from a server that adheres to the W3C WebDriver
    * protocol.
    */
  inline def checkResponse(data: Response): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResponse")(data.asInstanceOf[js.Any]).asInstanceOf[Response]
  
  /**
    * Lookup the err in table of errors.
    */
  inline def encodeError(err: Any): typingsJapgolly.seleniumWebdriver.anon.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeError")(err.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.seleniumWebdriver.anon.Error]
  
  inline def throwDecodedError(data: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDecodedError")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  inline def throwDecodedError(data: ErrorData): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDecodedError")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  type ErrorCodeType = StringDictionary[Double]
  
  trait ErrorData
    extends StObject
       with /* key */ StringDictionary[String | Double] {
    
    var error: String | Double
    
    var message: String
  }
  object ErrorData {
    
    inline def apply(error: String | Double, message: String): ErrorData = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorData]
    }
    
    extension [Self <: ErrorData](x: Self) {
      
      inline def setError(value: String | Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaybeLegacyResponse extends StObject {
    
    var getAlertText: js.UndefOr[js.Function0[String]] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Message] = js.undefined
  }
  object MaybeLegacyResponse {
    
    inline def apply(): MaybeLegacyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaybeLegacyResponse]
    }
    
    extension [Self <: MaybeLegacyResponse](x: Self) {
      
      inline def setGetAlertText(value: CallbackTo[String]): Self = StObject.set(x, "getAlertText", value.toJsFn)
      
      inline def setGetAlertTextUndefined: Self = StObject.set(x, "getAlertText", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setValue(value: Message): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var error: String | Double
    
    var message: String
  }
  object Response {
    
    inline def apply(error: String | Double, message: String): Response = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setError(value: String | Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
