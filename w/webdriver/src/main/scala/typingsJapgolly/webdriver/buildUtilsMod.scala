package typingsJapgolly.webdriver

import typingsJapgolly.std.Error
import typingsJapgolly.std.Record
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
import typingsJapgolly.wdioTypes.buildOptionsMod.WebDriver
import typingsJapgolly.webdriver.anon.Capabilities
import typingsJapgolly.webdriver.anon.IsAndroid
import typingsJapgolly.webdriver.anon.PartialSessionFlags
import typingsJapgolly.webdriver.anon.PartialWebDriver
import typingsJapgolly.webdriver.buildRequestMod.WebDriverResponse
import typingsJapgolly.webdriver.buildTypesMod.Client
import typingsJapgolly.webdriver.buildTypesMod.JSONWPCommandError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMod {
  
  @JSImport("webdriver/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver/build/utils", "CustomRequestError")
  @js.native
  open class CustomRequestError protected ()
    extends StObject
       with Error {
    def this(body: WebDriverResponse, requestOptions: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def getEnvironmentVars(hasIsW3CIsMobileIsIOSIsAndroidIsChromeIsFirefoxIsSauceIsSeleniumStandalone: PartialSessionFlags): IsAndroid = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnvironmentVars")(hasIsW3CIsMobileIsIOSIsAndroidIsChromeIsFirefoxIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[IsAndroid]
  
  inline def getErrorFromResponseBody(body: Any, requestOptions: Any): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getErrorFromResponseBody")(body.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def getPrototype(hasIsW3CIsChromeIsFirefoxIsMobileIsSauceIsSeleniumStandalone: PartialSessionFlags): Record[String, js.PropertyDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototype")(hasIsW3CIsChromeIsFirefoxIsMobileIsSauceIsSeleniumStandalone.asInstanceOf[js.Any]).asInstanceOf[Record[String, js.PropertyDescriptor]]
  
  inline def getSessionError(err: JSONWPCommandError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")(err.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSessionError(err: JSONWPCommandError, params: PartialWebDriver): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSessionError")(err.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTimeoutError(error: js.Error, requestOptions: RequestLibOptions): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeoutError")(error.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
  inline def isSuccessfulResponse(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")().asInstanceOf[Boolean]
  inline def isSuccessfulResponse(statusCode: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSuccessfulResponse(statusCode: Double, body: WebDriverResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isSuccessfulResponse(statusCode: Unit, body: WebDriverResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuccessfulResponse")(statusCode.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setupDirectConnect(client: Client): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupDirectConnect")(client.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startWebDriverSession(params: WebDriver): js.Promise[Capabilities] = ^.asInstanceOf[js.Dynamic].applyDynamic("startWebDriverSession")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Capabilities]]
}
