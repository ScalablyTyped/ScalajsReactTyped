package typingsJapgolly.blockingProxy

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtLibWebdriverCommandsMod {
  
  @JSImport("blocking-proxy/built/lib/webdriver_commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CommandName extends StObject
  @JSImport("blocking-proxy/built/lib/webdriver_commands", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CommandName & Double] = js.native
    
    @js.native
    sealed trait AcceptAlert
      extends StObject
         with CommandName
    /* 30 */ val AcceptAlert: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.AcceptAlert & Double = js.native
    
    @js.native
    sealed trait Back
      extends StObject
         with CommandName
    /* 7 */ val Back: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.Back & Double = js.native
    
    @js.native
    sealed trait DeleteSession
      extends StObject
         with CommandName
    /* 1 */ val DeleteSession: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.DeleteSession & Double = js.native
    
    @js.native
    sealed trait DismissAlert
      extends StObject
         with CommandName
    /* 31 */ val DismissAlert: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.DismissAlert & Double = js.native
    
    @js.native
    sealed trait ElementClear
      extends StObject
         with CommandName
    /* 24 */ val ElementClear: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.ElementClear & Double = js.native
    
    @js.native
    sealed trait ElementClick
      extends StObject
         with CommandName
    /* 23 */ val ElementClick: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.ElementClick & Double = js.native
    
    @js.native
    sealed trait ElementSendKeys
      extends StObject
         with CommandName
    /* 25 */ val ElementSendKeys: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.ElementSendKeys & Double = js.native
    
    @js.native
    sealed trait FindElement
      extends StObject
         with CommandName
    /* 11 */ val FindElement: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.FindElement & Double = js.native
    
    @js.native
    sealed trait FindElementFromElement
      extends StObject
         with CommandName
    /* 13 */ val FindElementFromElement: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.FindElementFromElement & Double = js.native
    
    @js.native
    sealed trait FindElements
      extends StObject
         with CommandName
    /* 12 */ val FindElements: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.FindElements & Double = js.native
    
    @js.native
    sealed trait FindElementsFromElement
      extends StObject
         with CommandName
    /* 14 */ val FindElementsFromElement: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.FindElementsFromElement & Double = js.native
    
    @js.native
    sealed trait Forward
      extends StObject
         with CommandName
    /* 8 */ val Forward: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.Forward & Double = js.native
    
    @js.native
    sealed trait GetAlertText
      extends StObject
         with CommandName
    /* 29 */ val GetAlertText: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetAlertText & Double = js.native
    
    @js.native
    sealed trait GetCurrentURL
      extends StObject
         with CommandName
    /* 6 */ val GetCurrentURL: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetCurrentURL & Double = js.native
    
    @js.native
    sealed trait GetElementAttribute
      extends StObject
         with CommandName
    /* 16 */ val GetElementAttribute: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetElementAttribute & Double = js.native
    
    @js.native
    sealed trait GetElementCSSValue
      extends StObject
         with CommandName
    /* 18 */ val GetElementCSSValue: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetElementCSSValue & Double = js.native
    
    @js.native
    sealed trait GetElementProperty
      extends StObject
         with CommandName
    /* 17 */ val GetElementProperty: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetElementProperty & Double = js.native
    
    @js.native
    sealed trait GetElementRect
      extends StObject
         with CommandName
    /* 21 */ val GetElementRect: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetElementRect & Double = js.native
    
    @js.native
    sealed trait GetElementTagName
      extends StObject
         with CommandName
    /* 20 */ val GetElementTagName: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetElementTagName & Double = js.native
    
    @js.native
    sealed trait GetElementText
      extends StObject
         with CommandName
    /* 19 */ val GetElementText: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetElementText & Double = js.native
    
    @js.native
    sealed trait GetTimeouts
      extends StObject
         with CommandName
    /* 3 */ val GetTimeouts: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetTimeouts & Double = js.native
    
    @js.native
    sealed trait GetTitle
      extends StObject
         with CommandName
    /* 10 */ val GetTitle: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.GetTitle & Double = js.native
    
    @js.native
    sealed trait Go
      extends StObject
         with CommandName
    /* 5 */ val Go: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.Go & Double = js.native
    
    @js.native
    sealed trait IsElementEnabled
      extends StObject
         with CommandName
    /* 22 */ val IsElementEnabled: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.IsElementEnabled & Double = js.native
    
    @js.native
    sealed trait IsElementSelected
      extends StObject
         with CommandName
    /* 15 */ val IsElementSelected: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.IsElementSelected & Double = js.native
    
    @js.native
    sealed trait NewSession
      extends StObject
         with CommandName
    /* 0 */ val NewSession: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.NewSession & Double = js.native
    
    @js.native
    sealed trait Refresh
      extends StObject
         with CommandName
    /* 9 */ val Refresh: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.Refresh & Double = js.native
    
    @js.native
    sealed trait SetTimeouts
      extends StObject
         with CommandName
    /* 4 */ val SetTimeouts: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.SetTimeouts & Double = js.native
    
    @js.native
    sealed trait Status
      extends StObject
         with CommandName
    /* 2 */ val Status: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.Status & Double = js.native
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with CommandName
    /* 32 */ val UNKNOWN: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.UNKNOWN & Double = js.native
    
    @js.native
    sealed trait WireButtonDown
      extends StObject
         with CommandName
    /* 27 */ val WireButtonDown: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.WireButtonDown & Double = js.native
    
    @js.native
    sealed trait WireButtonUp
      extends StObject
         with CommandName
    /* 28 */ val WireButtonUp: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.WireButtonUp & Double = js.native
    
    @js.native
    sealed trait WireMoveTo
      extends StObject
         with CommandName
    /* 26 */ val WireMoveTo: typingsJapgolly.blockingProxy.builtLibWebdriverCommandsMod.CommandName.WireMoveTo & Double = js.native
  }
  
  @JSImport("blocking-proxy/built/lib/webdriver_commands", "WebDriverCommand")
  @js.native
  open class WebDriverCommand protected () extends EventEmitter {
    def this(commandName: CommandName, url: String, method: HttpMethod) = this()
    def this(commandName: CommandName, url: String, method: HttpMethod, params: Any) = this()
    
    var commandName: CommandName = js.native
    
    var data: Any = js.native
    
    def getParam(key: paramKey): String = js.native
    
    def handleData(): Unit = js.native
    def handleData(data: Any): Unit = js.native
    
    def handleResponse(statusCode: Double): Unit = js.native
    def handleResponse(statusCode: Double, data: Any): Unit = js.native
    
    val method: HttpMethod = js.native
    
    /* private */ var params: Any = js.native
    
    var responseData: Any = js.native
    
    var responseStatus: Double = js.native
    
    val sessionId: String = js.native
    
    val url: String = js.native
  }
  
  inline def parseWebDriverCommand(url: Any, method: Any): WebDriverCommand = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWebDriverCommand")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[WebDriverCommand]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blockingProxy.blockingProxyStrings.GET
    - typingsJapgolly.blockingProxy.blockingProxyStrings.POST
    - typingsJapgolly.blockingProxy.blockingProxyStrings.DELETE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def DELETE: typingsJapgolly.blockingProxy.blockingProxyStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.DELETE]
    
    inline def GET: typingsJapgolly.blockingProxy.blockingProxyStrings.GET = "GET".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.GET]
    
    inline def POST: typingsJapgolly.blockingProxy.blockingProxyStrings.POST = "POST".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.POST]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.blockingProxy.blockingProxyStrings.sessionId
    - typingsJapgolly.blockingProxy.blockingProxyStrings.elementId
    - typingsJapgolly.blockingProxy.blockingProxyStrings.name
    - typingsJapgolly.blockingProxy.blockingProxyStrings.propertyName
  */
  trait paramKey extends StObject
  object paramKey {
    
    inline def elementId: typingsJapgolly.blockingProxy.blockingProxyStrings.elementId = "elementId".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.elementId]
    
    inline def name: typingsJapgolly.blockingProxy.blockingProxyStrings.name = "name".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.name]
    
    inline def propertyName: typingsJapgolly.blockingProxy.blockingProxyStrings.propertyName = "propertyName".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.propertyName]
    
    inline def sessionId: typingsJapgolly.blockingProxy.blockingProxyStrings.sessionId = "sessionId".asInstanceOf[typingsJapgolly.blockingProxy.blockingProxyStrings.sessionId]
  }
}
