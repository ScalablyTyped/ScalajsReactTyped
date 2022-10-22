package typingsJapgolly.wixUiCore.distEsSrcProtractorMod

import typingsJapgolly.seleniumWebdriver.anon.Error
import typingsJapgolly.seleniumWebdriver.mod.error.ErrorCodeType
import typingsJapgolly.seleniumWebdriver.mod.error.ErrorData
import typingsJapgolly.seleniumWebdriver.mod.error.MaybeLegacyResponse
import typingsJapgolly.seleniumWebdriver.mod.error.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object error {
  
  @JSImport("wix-ui-core/dist/es/src/protractor", "error")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates a {@linkplain ./webdriver.WebElement#click click command} could
    * not completed because the click target is obscured by other elements on the
    * page.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.ElementClickInterceptedError")
  @js.native
  open class ElementClickInterceptedError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.ElementClickInterceptedError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a command could not be completed because the target element is
    * not pointer or keyboard interactable. This will often occur if an element
    * is present in the DOM, but not rendered (i.e. its CSS style has
    * "display: none").
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.ElementNotInteractableError")
  @js.native
  open class ElementNotInteractableError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.ElementNotInteractableError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to select an element that cannot be selected.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.ElementNotSelectableError")
  @js.native
  open class ElementNotSelectableError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.ElementNotSelectableError {
    def this(message: String) = this()
  }
  
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.ErrorCode")
  @js.native
  val ErrorCode: ErrorCodeType = js.native
  
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.IError")
  @js.native
  open class IError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.IError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a navigation event caused the browser to generate a certificate
    * warning. This is usually caused by an expired or invalid TLS certificate.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.InsecureCertificateError")
  @js.native
  open class InsecureCertificateError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.InsecureCertificateError {
    def this(message: String) = this()
  }
  
  /**
    * The arguments passed to a command are either invalid or malformed.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.InvalidArgumentError")
  @js.native
  open class InvalidArgumentError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.InvalidArgumentError {
    def this(message: String) = this()
  }
  
  /**
    * An illegal attempt was made to set a cookie under a different domain than
    * the current page.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.InvalidCookieDomainError")
  @js.native
  open class InvalidCookieDomainError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.InvalidCookieDomainError {
    def this(message: String) = this()
  }
  
  /**
    * The coordinates provided to an interactions operation are invalid.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.InvalidCoordinatesError")
  @js.native
  open class InvalidCoordinatesError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.InvalidCoordinatesError {
    def this(message: String) = this()
  }
  
  /**
    * An element command could not be completed because the element is in an
    * invalid state, e.g. attempting to click an element that is no longer
    * attached to the document.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.InvalidElementStateError")
  @js.native
  open class InvalidElementStateError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.InvalidElementStateError {
    def this(message: String) = this()
  }
  
  /**
    * Argument was an invalid selector.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.InvalidSelectorError")
  @js.native
  open class InvalidSelectorError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.InvalidSelectorError {
    def this(message: String) = this()
  }
  
  /**
    * An error occurred while executing JavaScript supplied by the user.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.JavascriptError")
  @js.native
  open class JavascriptError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.JavascriptError {
    def this(message: String) = this()
  }
  
  /**
    * The target for mouse interaction is not in the browser’s viewport and
    * cannot be brought into that viewport.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.MoveTargetOutOfBoundsError")
  @js.native
  open class MoveTargetOutOfBoundsError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.MoveTargetOutOfBoundsError {
    def this(message: String) = this()
  }
  
  /**
    * An attempt was made to operate on a modal dialog when one was not open.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.NoSuchAlertError")
  @js.native
  open class NoSuchAlertError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.NoSuchAlertError {
    def this(message: String) = this()
  }
  
  /**
    * Indicates a named cookie could not be found in the cookie jar for the
    * currently selected document.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.NoSuchCookieError")
  @js.native
  open class NoSuchCookieError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.NoSuchCookieError {
    def this(message: String) = this()
  }
  
  /**
    * An element could not be located on the page using the given search
    * parameters.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.NoSuchElementError")
  @js.native
  open class NoSuchElementError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.NoSuchElementError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a frame could not be satisfied because the frame
    * could not be found.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.NoSuchFrameError")
  @js.native
  open class NoSuchFrameError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.NoSuchFrameError {
    def this(message: String) = this()
  }
  
  /**
    * Occurs when a command is directed to a session that does not exist.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.NoSuchSessionError")
  @js.native
  open class NoSuchSessionError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.NoSuchSessionError {
    def this(message: String) = this()
  }
  
  /**
    * A request to switch to a window could not be satisfied because the window
    * could not be found.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.NoSuchWindowError")
  @js.native
  open class NoSuchWindowError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.NoSuchWindowError {
    def this(message: String) = this()
  }
  
  /**
    * A script did not complete before its timeout expired.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.ScriptTimeoutError")
  @js.native
  open class ScriptTimeoutError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.ScriptTimeoutError {
    def this(message: String) = this()
  }
  
  /**
    * A new session could not be created.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.SessionNotCreatedError")
  @js.native
  open class SessionNotCreatedError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.SessionNotCreatedError {
    def this(message: String) = this()
  }
  
  /**
    * An element command failed because the referenced element is no longer
    * attached to the DOM.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.StaleElementReferenceError")
  @js.native
  open class StaleElementReferenceError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.StaleElementReferenceError {
    def this(message: String) = this()
  }
  
  /**
    * An operation did not completErrorCodee before its timeout expired.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.TimeoutError")
  @js.native
  open class TimeoutError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.TimeoutError {
    def this(message: String) = this()
  }
  
  /**
    * A screen capture operation was not possible.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.UnableToCaptureScreenError")
  @js.native
  open class UnableToCaptureScreenError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.UnableToCaptureScreenError {
    def this(message: String) = this()
  }
  
  /**
    * A request to set a cookie’s value could not be satisfied.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.UnableToSetCookieError")
  @js.native
  open class UnableToSetCookieError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.UnableToSetCookieError {
    def this(message: String) = this()
  }
  
  /**
    * A modal dialog was open, blocking this operation.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.UnexpectedAlertOpenError")
  @js.native
  open class UnexpectedAlertOpenError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.UnexpectedAlertOpenError {
    def this(message: String) = this()
    def this(message: String, openAlertText: String) = this()
    def this(message: Unit, openAlertText: String) = this()
  }
  
  /**
    * A command could not be executed because the remote end is not aware of it.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.UnknownCommandError")
  @js.native
  open class UnknownCommandError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.UnknownCommandError {
    def this(message: String) = this()
  }
  
  /**
    * The requested command matched a known URL but did not match an method for
    * that URL.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.UnknownMethodError")
  @js.native
  open class UnknownMethodError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.UnknownMethodError {
    def this(message: String) = this()
  }
  
  /**
    * Reports an unsupport operation.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.UnsupportedOperationError")
  @js.native
  open class UnsupportedOperationError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.UnsupportedOperationError {
    def this(message: String) = this()
  }
  
  /**
    * The base WebDriver error type. This error type is only used directly when a
    * more appropriate category is not defined for the offending error.
    */
  @JSImport("wix-ui-core/dist/es/src/protractor", "error.WebDriverError")
  @js.native
  open class WebDriverError ()
    extends typingsJapgolly.seleniumWebdriver.mod.error.WebDriverError {
    def this(message: String) = this()
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
  inline def encodeError(err: Any): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeError")(err.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def throwDecodedError(data: String): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDecodedError")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  /**
    * Throws an error coded from the W3C protocol. A generic error will be thrown
    * if the provided `data` is not a valid encoded error.
    */
  inline def throwDecodedError(data: ErrorData): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("throwDecodedError")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
}
