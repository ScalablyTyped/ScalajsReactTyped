package typingsJapgolly.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Static xRM object.
  */
trait XrmStatic extends StObject {
  
  /**
    * Provides app-related methods.
    * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/xrm-app External Link: Xrm.App (Client API reference)}
    */
  var App: typingsJapgolly.xrm.Xrm.App
  
  /**
    * Provides methods to use native device capabilities of mobile devices.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
    */
  var Device: typingsJapgolly.xrm.Xrm.Device
  
  /**
    * Provides methods to encode strings.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-encoding External Link: Xrm.Encoding (Client API reference)}
    */
  var Encoding: typingsJapgolly.xrm.Xrm.Encoding
  
  /**
    * Provides methods to create and manage records in the mobile clients (for phones tablets).
    * @deprecated Use {@link Xrm.WebApi} instead.
    */
  var Mobile: typingsJapgolly.xrm.Xrm.Mobile
  
  /** Provides navigation-related methods.
    */
  var Navigation: typingsJapgolly.xrm.Xrm.Navigation
  
  /**
    * Provides a namespace container for the context, data and ui objects.
    * @deprecated Deprecated in v9.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var Page: typingsJapgolly.xrm.Xrm.Page
  
  /**
    * Provides a method to display a web page in the side pane of the Customer Engagement form.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
    */
  var Panel: typingsJapgolly.xrm.Xrm.Panel
  
  /**
    * Provides a container for useful functions not directly related to the current page.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-utility External Link: Xrm.Utility (Client API reference)}
    */
  var Utility: typingsJapgolly.xrm.Xrm.Utility
  
  /**
    * Provides properties and methods to use Web API to create and manage records and execute Web API actions and functions in Customer Engagement.
    *
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-webapi External Link: Xrm.WebApi (Client API reference)}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/use-microsoft-dynamics-365-web-api External Link: Use the Customer Engagement Web API}
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/webapi/get-started-web-api-client-side-javascript External Link: Get started with the Customer Engagement Web API (client-side JavaScript)}
    */
  var WebApi: typingsJapgolly.xrm.Xrm.WebApi
}
object XrmStatic {
  
  inline def apply(
    App: App,
    Device: Device,
    Encoding: Encoding,
    Mobile: Mobile,
    Navigation: Navigation,
    Page: Page,
    Panel: Panel,
    Utility: Utility,
    WebApi: WebApi
  ): XrmStatic = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Device = Device.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Mobile = Mobile.asInstanceOf[js.Any], Navigation = Navigation.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any], Panel = Panel.asInstanceOf[js.Any], Utility = Utility.asInstanceOf[js.Any], WebApi = WebApi.asInstanceOf[js.Any])
    __obj.asInstanceOf[XrmStatic]
  }
  
  extension [Self <: XrmStatic](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: Encoding): Self = StObject.set(x, "Encoding", value.asInstanceOf[js.Any])
    
    inline def setMobile(value: Mobile): Self = StObject.set(x, "Mobile", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: Navigation): Self = StObject.set(x, "Navigation", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Page): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPanel(value: Panel): Self = StObject.set(x, "Panel", value.asInstanceOf[js.Any])
    
    inline def setUtility(value: Utility): Self = StObject.set(x, "Utility", value.asInstanceOf[js.Any])
    
    inline def setWebApi(value: WebApi): Self = StObject.set(x, "WebApi", value.asInstanceOf[js.Any])
  }
}
