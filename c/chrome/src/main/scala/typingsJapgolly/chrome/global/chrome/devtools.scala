package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.EvalOptions
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.EvaluationExceptionInfo
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ReloadOptions
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.Resource
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ResourceAddedEvent
import typingsJapgolly.chrome.chrome.devtools.inspectedWindow.ResourceContentCommittedEvent
import typingsJapgolly.chrome.chrome.devtools.network.HARLog
import typingsJapgolly.chrome.chrome.devtools.network.NavigatedEvent
import typingsJapgolly.chrome.chrome.devtools.network.RequestFinishedEvent
import typingsJapgolly.chrome.chrome.devtools.panels.ElementsPanel
import typingsJapgolly.chrome.chrome.devtools.panels.ExtensionPanel
import typingsJapgolly.chrome.chrome.devtools.panels.SourcesPanel
import typingsJapgolly.chrome.chromeStrings.dark
import typingsJapgolly.chrome.chromeStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtools {
  
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  object inspectedWindow {
    
    @JSGlobal("chrome.devtools.inspectedWindow")
    @js.native
    val ^ : js.Any = js.native
    
    inline def eval[T](expression: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("eval")(expression.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def eval[T](
      expression: String,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(expression.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eval[T](
      expression: String,
      options: Unit,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eval[T](expression: String, options: EvalOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def eval[T](
      expression: String,
      options: EvalOptions,
      callback: js.Function2[/* result */ T, /* exceptionInfo */ EvaluationExceptionInfo, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eval")(expression.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getResources(callback: js.Function1[/* resources */ js.Array[Resource], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getResources")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("chrome.devtools.inspectedWindow.onResourceAdded")
    @js.native
    def onResourceAdded: ResourceAddedEvent = js.native
    inline def onResourceAdded_=(x: ResourceAddedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResourceAdded")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.inspectedWindow.onResourceContentCommitted")
    @js.native
    def onResourceContentCommitted: ResourceContentCommittedEvent = js.native
    inline def onResourceContentCommitted_=(x: ResourceContentCommittedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onResourceContentCommitted")(x.asInstanceOf[js.Any])
    
    inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
    inline def reload(reloadOptions: ReloadOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(reloadOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("chrome.devtools.inspectedWindow.tabId")
    @js.native
    def tabId: Double = js.native
    inline def tabId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabId")(x.asInstanceOf[js.Any])
  }
  
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  object network {
    
    @JSGlobal("chrome.devtools.network")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getHAR")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("chrome.devtools.network.onNavigated")
    @js.native
    def onNavigated: NavigatedEvent = js.native
    inline def onNavigated_=(x: NavigatedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onNavigated")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.network.onRequestFinished")
    @js.native
    def onRequestFinished: RequestFinishedEvent = js.native
    inline def onRequestFinished_=(x: RequestFinishedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onRequestFinished")(x.asInstanceOf[js.Any])
  }
  
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  object panels {
    
    @JSGlobal("chrome.devtools.panels")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(title: String, iconPath: String, pagePath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], iconPath.asInstanceOf[js.Any], pagePath.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def create(
      title: String,
      iconPath: String,
      pagePath: String,
      callback: js.Function1[/* panel */ ExtensionPanel, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(title.asInstanceOf[js.Any], iconPath.asInstanceOf[js.Any], pagePath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("chrome.devtools.panels.elements")
    @js.native
    def elements: ElementsPanel = js.native
    inline def elements_=(x: ElementsPanel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    inline def openResource(url: String, lineNumber: Double, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openResource")(url.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setOpenResourceHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOpenResourceHandler")().asInstanceOf[Unit]
    inline def setOpenResourceHandler(callback: js.Function1[/* resource */ Resource, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOpenResourceHandler")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("chrome.devtools.panels.sources")
    @js.native
    def sources: SourcesPanel = js.native
    inline def sources_=(x: SourcesPanel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sources")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.devtools.panels.themeName")
    @js.native
    def themeName: default | dark = js.native
    inline def themeName_=(x: default | dark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themeName")(x.asInstanceOf[js.Any])
  }
}
