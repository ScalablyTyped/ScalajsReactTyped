package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.backForwardCacheNotUsed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.compilationCacheProduced
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.documentOpened
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.domContentEventFired
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.downloadProgress
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.downloadWillBegin
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.fileChooserOpened
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameAttached
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameClearedScheduledNavigation
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameDetached
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameNavigated
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameRequestedNavigation
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameResized
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameScheduledNavigation
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameStartedLoading
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frameStoppedLoading
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.interstitialHidden
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.interstitialShown
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.javascriptDialogClosed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.javascriptDialogOpening
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.lifecycleEvent
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.loadEventFired
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.navigatedWithinDocument
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.prerenderAttemptCompleted
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.screencastFrame
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.screencastVisibilityChanged
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.windowOpen
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddCompilationCacheRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.BackForwardCacheNotUsedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CaptureScreenshotResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CaptureSnapshotRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CaptureSnapshotResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CompilationCacheProducedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.DeleteCookieRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.DocumentOpenedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.DomContentEventFiredEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.DownloadProgressEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.DownloadWillBeginEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameAttachedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameClearedScheduledNavigationEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameDetachedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameNavigatedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameRequestedNavigationEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameScheduledNavigationEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameStartedLoadingEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameStoppedLoadingEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GenerateTestReportRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetAdScriptIdRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetAdScriptIdResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetAppIdResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetAppManifestResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetCookiesResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetFrameTreeResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetInstallabilityErrorsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetLayoutMetricsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetManifestIconsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetNavigationHistoryResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetOriginTrialsRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetOriginTrialsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetPermissionsPolicyStateRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetPermissionsPolicyStateResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetResourceContentRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetResourceContentResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.GetResourceTreeResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.HandleJavaScriptDialogRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogClosedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.JavascriptDialogOpeningEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.LifecycleEventEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.LoadEventFiredEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.NavigateRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.NavigateResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.NavigateToHistoryEntryRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.NavigatedWithinDocumentEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.PrerenderAttemptCompletedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.PrintToPDFRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.PrintToPDFResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.ProduceCompilationCacheRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.ReloadRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnLoadRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.RemoveScriptToEvaluateOnNewDocumentRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameAckRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.ScreencastFrameEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.ScreencastVisibilityChangedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SearchInResourceRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SearchInResourceResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetAdBlockingEnabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetBypassCSPRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetDeviceMetricsOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetDeviceOrientationOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetDocumentContentRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetDownloadBehaviorRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetFontFamiliesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetFontSizesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetGeolocationOverrideRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetInterceptFileChooserDialogRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetLifecycleEventsEnabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetSPCTransactionModeRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetTouchEmulationEnabledRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.SetWebLifecycleStateRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.StartScreencastRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.WindowOpenEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageApi extends StObject {
  
  /**
    * Seeds compilation cache for given url. Compilation cache does not survive
    * cross-process navigation.
    */
  def addCompilationCache(params: AddCompilationCacheRequest): js.Promise[Unit] = js.native
  
  /**
    * Deprecated, please use addScriptToEvaluateOnNewDocument instead.
    */
  def addScriptToEvaluateOnLoad(params: AddScriptToEvaluateOnLoadRequest): js.Promise[AddScriptToEvaluateOnLoadResponse] = js.native
  
  /**
    * Evaluates given script in every frame upon creation (before loading frame's scripts).
    */
  def addScriptToEvaluateOnNewDocument(params: AddScriptToEvaluateOnNewDocumentRequest): js.Promise[AddScriptToEvaluateOnNewDocumentResponse] = js.native
  
  /**
    * Brings page to front (activates tab).
    */
  def bringToFront(): js.Promise[Unit] = js.native
  
  /**
    * Capture page screenshot.
    */
  def captureScreenshot(params: CaptureScreenshotRequest): js.Promise[CaptureScreenshotResponse] = js.native
  
  /**
    * Returns a snapshot of the page as a string. For MHTML format, the serialization includes
    * iframes, shadow DOM, external resources, and element-inline styles.
    */
  def captureSnapshot(params: CaptureSnapshotRequest): js.Promise[CaptureSnapshotResponse] = js.native
  
  /**
    * Clears seeded compilation cache.
    */
  def clearCompilationCache(): js.Promise[Unit] = js.native
  
  /**
    * Clears the overridden device metrics.
    */
  def clearDeviceMetricsOverride(): js.Promise[Unit] = js.native
  
  /**
    * Clears the overridden Device Orientation.
    */
  def clearDeviceOrientationOverride(): js.Promise[Unit] = js.native
  
  /**
    * Clears the overridden Geolocation Position and Error.
    */
  def clearGeolocationOverride(): js.Promise[Unit] = js.native
  
  /**
    * Tries to close page, running its beforeunload hooks, if any.
    */
  def close(): js.Promise[Unit] = js.native
  
  /**
    * Crashes renderer on the IO thread, generates minidumps.
    */
  def crash(): js.Promise[Unit] = js.native
  
  /**
    * Creates an isolated world for the given frame.
    */
  def createIsolatedWorld(params: CreateIsolatedWorldRequest): js.Promise[CreateIsolatedWorldResponse] = js.native
  
  /**
    * Deletes browser cookie with given name, domain and path.
    */
  def deleteCookie(params: DeleteCookieRequest): js.Promise[Unit] = js.native
  
  /**
    * Disables page domain notifications.
    */
  def disable(): js.Promise[Unit] = js.native
  
  /**
    * Enables page domain notifications.
    */
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Generates a report for testing.
    */
  def generateTestReport(params: GenerateTestReportRequest): js.Promise[Unit] = js.native
  
  def getAdScriptId(params: GetAdScriptIdRequest): js.Promise[GetAdScriptIdResponse] = js.native
  
  /**
    * Returns the unique (PWA) app id.
    * Only returns values if the feature flag 'WebAppEnableManifestId' is enabled
    */
  def getAppId(): js.Promise[GetAppIdResponse] = js.native
  
  def getAppManifest(): js.Promise[GetAppManifestResponse] = js.native
  
  /**
    * Returns all browser cookies for the page and all of its subframes. Depending
    * on the backend support, will return detailed cookie information in the
    * `cookies` field.
    */
  def getCookies(): js.Promise[GetCookiesResponse] = js.native
  
  /**
    * Returns present frame tree structure.
    */
  def getFrameTree(): js.Promise[GetFrameTreeResponse] = js.native
  
  def getInstallabilityErrors(): js.Promise[GetInstallabilityErrorsResponse] = js.native
  
  /**
    * Returns metrics relating to the layouting of the page, such as viewport bounds/scale.
    */
  def getLayoutMetrics(): js.Promise[GetLayoutMetricsResponse] = js.native
  
  def getManifestIcons(): js.Promise[GetManifestIconsResponse] = js.native
  
  /**
    * Returns navigation history for the current page.
    */
  def getNavigationHistory(): js.Promise[GetNavigationHistoryResponse] = js.native
  
  /**
    * Get Origin Trials on given frame.
    */
  def getOriginTrials(params: GetOriginTrialsRequest): js.Promise[GetOriginTrialsResponse] = js.native
  
  /**
    * Get Permissions Policy state on given frame.
    */
  def getPermissionsPolicyState(params: GetPermissionsPolicyStateRequest): js.Promise[GetPermissionsPolicyStateResponse] = js.native
  
  /**
    * Returns content of the given resource.
    */
  def getResourceContent(params: GetResourceContentRequest): js.Promise[GetResourceContentResponse] = js.native
  
  /**
    * Returns present frame / resource tree structure.
    */
  def getResourceTree(): js.Promise[GetResourceTreeResponse] = js.native
  
  /**
    * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
    */
  def handleJavaScriptDialog(params: HandleJavaScriptDialogRequest): js.Promise[Unit] = js.native
  
  /**
    * Navigates current page to the given URL.
    */
  def navigate(params: NavigateRequest): js.Promise[NavigateResponse] = js.native
  
  /**
    * Navigates current page to the given history entry.
    */
  def navigateToHistoryEntry(params: NavigateToHistoryEntryRequest): js.Promise[Unit] = js.native
  
  /**
    * Fired for failed bfcache history navigations if BackForwardCache feature is enabled. Do
    * not assume any ordering with the Page.frameNavigated event. This event is fired only for
    * main-frame history navigation where the document changes (non-same-document navigations),
    * when bfcache navigation fails.
    */
  @JSName("on")
  def on_backForwardCacheNotUsed(
    event: backForwardCacheNotUsed,
    listener: js.Function1[/* params */ BackForwardCacheNotUsedEvent, Unit]
  ): Unit = js.native
  /**
    * Issued for every compilation cache generated. Is only available
    * if Page.setGenerateCompilationCache is enabled.
    */
  @JSName("on")
  def on_compilationCacheProduced(
    event: compilationCacheProduced,
    listener: js.Function1[/* params */ CompilationCacheProducedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when opening document to write to.
    */
  @JSName("on")
  def on_documentOpened(event: documentOpened, listener: js.Function1[/* params */ DocumentOpenedEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_domContentEventFired(event: domContentEventFired, listener: js.Function1[/* params */ DomContentEventFiredEvent, Unit]): Unit = js.native
  /**
    * Fired when download makes progress. Last call has |done| == true.
    * Deprecated. Use Browser.downloadProgress instead.
    */
  @JSName("on")
  def on_downloadProgress(event: downloadProgress, listener: js.Function1[/* params */ DownloadProgressEvent, Unit]): Unit = js.native
  /**
    * Fired when page is about to start a download.
    * Deprecated. Use Browser.downloadWillBegin instead.
    */
  @JSName("on")
  def on_downloadWillBegin(event: downloadWillBegin, listener: js.Function1[/* params */ DownloadWillBeginEvent, Unit]): Unit = js.native
  /**
    * Emitted only when `page.interceptFileChooser` is enabled.
    */
  @JSName("on")
  def on_fileChooserOpened(event: fileChooserOpened, listener: js.Function1[/* params */ FileChooserOpenedEvent, Unit]): Unit = js.native
  /**
    * Fired when frame has been attached to its parent.
    */
  @JSName("on")
  def on_frameAttached(event: frameAttached, listener: js.Function1[/* params */ FrameAttachedEvent, Unit]): Unit = js.native
  /**
    * Fired when frame no longer has a scheduled navigation.
    */
  @JSName("on")
  def on_frameClearedScheduledNavigation(
    event: frameClearedScheduledNavigation,
    listener: js.Function1[/* params */ FrameClearedScheduledNavigationEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when frame has been detached from its parent.
    */
  @JSName("on")
  def on_frameDetached(event: frameDetached, listener: js.Function1[/* params */ FrameDetachedEvent, Unit]): Unit = js.native
  /**
    * Fired once navigation of the frame has completed. Frame is now associated with the new loader.
    */
  @JSName("on")
  def on_frameNavigated(event: frameNavigated, listener: js.Function1[/* params */ FrameNavigatedEvent, Unit]): Unit = js.native
  /**
    * Fired when a renderer-initiated navigation is requested.
    * Navigation may still be cancelled after the event is issued.
    */
  @JSName("on")
  def on_frameRequestedNavigation(
    event: frameRequestedNavigation,
    listener: js.Function1[/* params */ FrameRequestedNavigationEvent, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_frameResized(event: frameResized, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when frame schedules a potential navigation.
    */
  @JSName("on")
  def on_frameScheduledNavigation(
    event: frameScheduledNavigation,
    listener: js.Function1[/* params */ FrameScheduledNavigationEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when frame has started loading.
    */
  @JSName("on")
  def on_frameStartedLoading(event: frameStartedLoading, listener: js.Function1[/* params */ FrameStartedLoadingEvent, Unit]): Unit = js.native
  /**
    * Fired when frame has stopped loading.
    */
  @JSName("on")
  def on_frameStoppedLoading(event: frameStoppedLoading, listener: js.Function1[/* params */ FrameStoppedLoadingEvent, Unit]): Unit = js.native
  /**
    * Fired when interstitial page was hidden
    */
  @JSName("on")
  def on_interstitialHidden(event: interstitialHidden, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when interstitial page was shown
    */
  @JSName("on")
  def on_interstitialShown(event: interstitialShown, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
    * closed.
    */
  @JSName("on")
  def on_javascriptDialogClosed(
    event: javascriptDialogClosed,
    listener: js.Function1[/* params */ JavascriptDialogClosedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
    * open.
    */
  @JSName("on")
  def on_javascriptDialogOpening(
    event: javascriptDialogOpening,
    listener: js.Function1[/* params */ JavascriptDialogOpeningEvent, Unit]
  ): Unit = js.native
  /**
    * Fired for top level page lifecycle events such as navigation, load, paint, etc.
    */
  @JSName("on")
  def on_lifecycleEvent(event: lifecycleEvent, listener: js.Function1[/* params */ LifecycleEventEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_loadEventFired(event: loadEventFired, listener: js.Function1[/* params */ LoadEventFiredEvent, Unit]): Unit = js.native
  /**
    * Fired when same-document navigation happens, e.g. due to history API usage or anchor navigation.
    */
  @JSName("on")
  def on_navigatedWithinDocument(
    event: navigatedWithinDocument,
    listener: js.Function1[/* params */ NavigatedWithinDocumentEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a prerender attempt is completed.
    */
  @JSName("on")
  def on_prerenderAttemptCompleted(
    event: prerenderAttemptCompleted,
    listener: js.Function1[/* params */ PrerenderAttemptCompletedEvent, Unit]
  ): Unit = js.native
  /**
    * Compressed image data requested by the `startScreencast`.
    */
  @JSName("on")
  def on_screencastFrame(event: screencastFrame, listener: js.Function1[/* params */ ScreencastFrameEvent, Unit]): Unit = js.native
  /**
    * Fired when the page with currently enabled screencast was shown or hidden `.
    */
  @JSName("on")
  def on_screencastVisibilityChanged(
    event: screencastVisibilityChanged,
    listener: js.Function1[/* params */ ScreencastVisibilityChangedEvent, Unit]
  ): Unit = js.native
  /**
    * Fired when a new window is going to be opened, via window.open(), link click, form submission,
    * etc.
    */
  @JSName("on")
  def on_windowOpen(event: windowOpen, listener: js.Function1[/* params */ WindowOpenEvent, Unit]): Unit = js.native
  
  /**
    * Print page as PDF.
    */
  def printToPDF(params: PrintToPDFRequest): js.Promise[PrintToPDFResponse] = js.native
  
  /**
    * Requests backend to produce compilation cache for the specified scripts.
    * `scripts` are appeneded to the list of scripts for which the cache
    * would be produced. The list may be reset during page navigation.
    * When script with a matching URL is encountered, the cache is optionally
    * produced upon backend discretion, based on internal heuristics.
    * See also: `Page.compilationCacheProduced`.
    */
  def produceCompilationCache(params: ProduceCompilationCacheRequest): js.Promise[Unit] = js.native
  
  /**
    * Reloads given page optionally ignoring the cache.
    */
  def reload(params: ReloadRequest): js.Promise[Unit] = js.native
  
  /**
    * Deprecated, please use removeScriptToEvaluateOnNewDocument instead.
    */
  def removeScriptToEvaluateOnLoad(params: RemoveScriptToEvaluateOnLoadRequest): js.Promise[Unit] = js.native
  
  /**
    * Removes given script from the list.
    */
  def removeScriptToEvaluateOnNewDocument(params: RemoveScriptToEvaluateOnNewDocumentRequest): js.Promise[Unit] = js.native
  
  /**
    * Resets navigation history for the current page.
    */
  def resetNavigationHistory(): js.Promise[Unit] = js.native
  
  /**
    * Acknowledges that a screencast frame has been received by the frontend.
    */
  def screencastFrameAck(params: ScreencastFrameAckRequest): js.Promise[Unit] = js.native
  
  /**
    * Searches for given string in resource content.
    */
  def searchInResource(params: SearchInResourceRequest): js.Promise[SearchInResourceResponse] = js.native
  
  /**
    * Enable Chrome's experimental ad filter on all sites.
    */
  def setAdBlockingEnabled(params: SetAdBlockingEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Enable page Content Security Policy by-passing.
    */
  def setBypassCSP(params: SetBypassCSPRequest): js.Promise[Unit] = js.native
  
  /**
    * Overrides the values of device screen dimensions (window.screen.width, window.screen.height,
    * window.innerWidth, window.innerHeight, and "device-width"/"device-height"-related CSS media
    * query results).
    */
  def setDeviceMetricsOverride(params: SetDeviceMetricsOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Overrides the Device Orientation.
    */
  def setDeviceOrientationOverride(params: SetDeviceOrientationOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets given markup as the document's HTML.
    */
  def setDocumentContent(params: SetDocumentContentRequest): js.Promise[Unit] = js.native
  
  /**
    * Set the behavior when downloading a file.
    */
  def setDownloadBehavior(params: SetDownloadBehaviorRequest): js.Promise[Unit] = js.native
  
  /**
    * Set generic font families.
    */
  def setFontFamilies(params: SetFontFamiliesRequest): js.Promise[Unit] = js.native
  
  /**
    * Set default font sizes.
    */
  def setFontSizes(params: SetFontSizesRequest): js.Promise[Unit] = js.native
  
  /**
    * Overrides the Geolocation Position or Error. Omitting any of the parameters emulates position
    * unavailable.
    */
  def setGeolocationOverride(params: SetGeolocationOverrideRequest): js.Promise[Unit] = js.native
  
  /**
    * Intercept file chooser requests and transfer control to protocol clients.
    * When file chooser interception is enabled, native file chooser dialog is not shown.
    * Instead, a protocol event `Page.fileChooserOpened` is emitted.
    */
  def setInterceptFileChooserDialog(params: SetInterceptFileChooserDialogRequest): js.Promise[Unit] = js.native
  
  /**
    * Controls whether page will emit lifecycle events.
    */
  def setLifecycleEventsEnabled(params: SetLifecycleEventsEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Sets the Secure Payment Confirmation transaction mode.
    * https://w3c.github.io/secure-payment-confirmation/#sctn-automation-set-spc-transaction-mode
    */
  def setSPCTransactionMode(params: SetSPCTransactionModeRequest): js.Promise[Unit] = js.native
  
  /**
    * Toggles mouse event-based touch event emulation.
    */
  def setTouchEmulationEnabled(params: SetTouchEmulationEnabledRequest): js.Promise[Unit] = js.native
  
  /**
    * Tries to update the web lifecycle state of the page.
    * It will transition the page to the given state according to:
    * https://github.com/WICG/web-lifecycle/
    */
  def setWebLifecycleState(params: SetWebLifecycleStateRequest): js.Promise[Unit] = js.native
  
  /**
    * Starts sending each frame using the `screencastFrame` event.
    */
  def startScreencast(params: StartScreencastRequest): js.Promise[Unit] = js.native
  
  /**
    * Force the page stop all navigations and pending resource fetches.
    */
  def stopLoading(): js.Promise[Unit] = js.native
  
  /**
    * Stops sending each frame in the `screencastFrame`.
    */
  def stopScreencast(): js.Promise[Unit] = js.native
  
  /**
    * Pauses page execution. Can be resumed using generic Runtime.runIfWaitingForDebugger.
    */
  def waitForDebugger(): js.Promise[Unit] = js.native
}
