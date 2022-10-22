package typingsJapgolly.sentryBrowser

import typingsJapgolly.sentryBrowser.typesClientMod.BrowserOptions
import typingsJapgolly.sentryBrowser.typesHelpersMod.ReportDialogOptions
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.Breadcrumbs
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.Dedupe
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.GlobalHandlers
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.HttpContext
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.LinkedErrors
import typingsJapgolly.sentryBrowser.typesIntegrationsMod.TryCatch
import typingsJapgolly.sentryCore.mod.Hub
import typingsJapgolly.sentryCore.mod.Integrations.FunctionToString
import typingsJapgolly.sentryCore.mod.Integrations.InboundFilters
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSdkMod {
  
  @JSImport("@sentry/browser/types/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[PromiseLike[Boolean]]
  inline def close(timeout: Double): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(timeout.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[Boolean]]
  
  @JSImport("@sentry/browser/types/sdk", "defaultIntegrations")
  @js.native
  val defaultIntegrations: js.Array[
    GlobalHandlers | TryCatch | Breadcrumbs | LinkedErrors | HttpContext | Dedupe | InboundFilters | FunctionToString
  ] = js.native
  
  inline def flush(): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[PromiseLike[Boolean]]
  inline def flush(timeout: Double): PromiseLike[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")(timeout.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[Boolean]]
  
  inline def forceLoad(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLoad")().asInstanceOf[Unit]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: BrowserOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def lastEventId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lastEventId")().asInstanceOf[js.UndefOr[String]]
  
  inline def onLoad(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoad")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showReportDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")().asInstanceOf[Unit]
  inline def showReportDialog(options: Unit, hub: Hub): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def showReportDialog(options: ReportDialogOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showReportDialog(options: ReportDialogOptions, hub: Hub): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showReportDialog")(options.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def wrap(fn: js.Function1[/* args */ Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
}
