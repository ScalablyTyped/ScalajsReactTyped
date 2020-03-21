package typingsJapgolly.phantom.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phantom.AnonAbort
import typingsJapgolly.phantom.AnonErrorCode
import typingsJapgolly.phantom.AnonFile
import typingsJapgolly.phantom.AnonFormat
import typingsJapgolly.phantom.AnonHeight
import typingsJapgolly.phantom.AnonLeft
import typingsJapgolly.phantom.AnonPageId
import typingsJapgolly.phantom.AnonWidth
import typingsJapgolly.phantom.IRequestDataerrorCodenumb
import typingsJapgolly.phantom.phantomBooleans.`false`
import typingsJapgolly.phantom.phantomStrings.BackOrForward
import typingsJapgolly.phantom.phantomStrings.FormResubmitted
import typingsJapgolly.phantom.phantomStrings.FormSubmitted
import typingsJapgolly.phantom.phantomStrings.LinkClicked
import typingsJapgolly.phantom.phantomStrings.Other
import typingsJapgolly.phantom.phantomStrings.Reload
import typingsJapgolly.phantom.phantomStrings.Undefined
import typingsJapgolly.phantom.phantomStrings.XSSAuditingEnabled
import typingsJapgolly.phantom.phantomStrings.canGoBack
import typingsJapgolly.phantom.phantomStrings.canGoForward
import typingsJapgolly.phantom.phantomStrings.clipRect
import typingsJapgolly.phantom.phantomStrings.content
import typingsJapgolly.phantom.phantomStrings.cookies
import typingsJapgolly.phantom.phantomStrings.customHeaders
import typingsJapgolly.phantom.phantomStrings.fail
import typingsJapgolly.phantom.phantomStrings.focusedFrameName
import typingsJapgolly.phantom.phantomStrings.frameContent
import typingsJapgolly.phantom.phantomStrings.frameName
import typingsJapgolly.phantom.phantomStrings.framePlainText
import typingsJapgolly.phantom.phantomStrings.frameTitle
import typingsJapgolly.phantom.phantomStrings.framesCount
import typingsJapgolly.phantom.phantomStrings.framesName
import typingsJapgolly.phantom.phantomStrings.javascriptEnabled
import typingsJapgolly.phantom.phantomStrings.libraryPath
import typingsJapgolly.phantom.phantomStrings.loadImages
import typingsJapgolly.phantom.phantomStrings.localToRemoteUrlAccessEnabled
import typingsJapgolly.phantom.phantomStrings.navigationLocked
import typingsJapgolly.phantom.phantomStrings.offlineStoragePath
import typingsJapgolly.phantom.phantomStrings.offlineStorageQuota
import typingsJapgolly.phantom.phantomStrings.onAlert
import typingsJapgolly.phantom.phantomStrings.onCallback
import typingsJapgolly.phantom.phantomStrings.onClosing
import typingsJapgolly.phantom.phantomStrings.onConfirm
import typingsJapgolly.phantom.phantomStrings.onConsoleMessage
import typingsJapgolly.phantom.phantomStrings.onError
import typingsJapgolly.phantom.phantomStrings.onFilePicker
import typingsJapgolly.phantom.phantomStrings.onInitialized
import typingsJapgolly.phantom.phantomStrings.onLoadFinished
import typingsJapgolly.phantom.phantomStrings.onLoadStarted
import typingsJapgolly.phantom.phantomStrings.onNavigationRequested
import typingsJapgolly.phantom.phantomStrings.onPageCreated
import typingsJapgolly.phantom.phantomStrings.onPrompt
import typingsJapgolly.phantom.phantomStrings.onResourceError
import typingsJapgolly.phantom.phantomStrings.onResourceReceived
import typingsJapgolly.phantom.phantomStrings.onResourceRequested
import typingsJapgolly.phantom.phantomStrings.onResourceTimeout
import typingsJapgolly.phantom.phantomStrings.onUrlChanged
import typingsJapgolly.phantom.phantomStrings.ownsPages
import typingsJapgolly.phantom.phantomStrings.pages
import typingsJapgolly.phantom.phantomStrings.pagesWindowName
import typingsJapgolly.phantom.phantomStrings.paperSize
import typingsJapgolly.phantom.phantomStrings.password
import typingsJapgolly.phantom.phantomStrings.plainText
import typingsJapgolly.phantom.phantomStrings.resourceTimeout
import typingsJapgolly.phantom.phantomStrings.scrollPosition
import typingsJapgolly.phantom.phantomStrings.success
import typingsJapgolly.phantom.phantomStrings.title
import typingsJapgolly.phantom.phantomStrings.url
import typingsJapgolly.phantom.phantomStrings.userAgent
import typingsJapgolly.phantom.phantomStrings.userName
import typingsJapgolly.phantom.phantomStrings.viewportSize
import typingsJapgolly.phantom.phantomStrings.webSecurityEnabled
import typingsJapgolly.phantom.phantomStrings.windowName
import typingsJapgolly.phantom.phantomStrings.zoomFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPage extends js.Object {
  def addCookie(cookie: ICookie): js.Promise[Boolean] = js.native
  def clearCookies(): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def deleteCookie(cookieName: String): js.Promise[Boolean] = js.native
  def evaluate[R](callback: js.Function0[R]): js.Promise[R] = js.native
  def evaluate[R](callback: js.Function1[/* repeated */ js.Any, R], args: js.Any*): js.Promise[R] = js.native
  def evaluate[T, R](callback: js.Function1[/* arg */ T, R], arg: T): js.Promise[R] = js.native
  def evaluate[T1, T2, R](callback: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R], arg1: T1, arg2: T2): js.Promise[R] = js.native
  def evaluate[T1, T2, T3, R](
    callback: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): js.Promise[R] = js.native
  def includeJs(url: String): js.Promise[Unit] = js.native
  def injectJs(filename: String): js.Promise[Boolean] = js.native
  def off(
    event: onResourceRequested | onLoadFinished | onAlert | onCallback | onClosing | onConfirm | onConsoleMessage | onError | onFilePicker | onInitialized | onLoadStarted | onNavigationRequested | onPageCreated | onPrompt | onResourceError | onResourceReceived | onResourceTimeout | onUrlChanged
  ): js.Promise[AnonPageId] = js.native
  def on(event: onAlert, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onCallback, runOnPhantom: `false`, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onClosing, runOnPhantom: `false`, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onConfirm, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onConsoleMessage,
    runOnPhantom: `false`,
    listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onError,
    runOnPhantom: `false`,
    listener: js.Function2[/* msg */ String, /* trace */ js.Array[AnonFile], Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onFilePicker, runOnPhantom: `false`, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onInitialized, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  def on(event: onLoadFinished, listener: js.Function1[/* status */ success | fail, Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onLoadFinished,
    runOnPhantom: `false`,
    listener: js.Function1[/* status */ success | fail, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onLoadStarted, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onNavigationRequested,
    listener: js.Function4[
      /* url */ String, 
      /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onNavigationRequested,
    runOnPhantom: `false`,
    listener: js.Function4[
      /* url */ String, 
      /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onPageCreated, runOnPhantom: `false`, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  def on(
    event: onPrompt,
    runOnPhantom: `false`,
    listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceError,
    runOnPhantom: `false`,
    listener: js.Function1[/* resourceError */ AnonErrorCode, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceReceived,
    runOnPhantom: `false`,
    listener: js.Function1[/* response */ IResponse, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceRequested,
    runOnPhantom: `false`,
    listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ AnonAbort, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(
    event: onResourceTimeout,
    runOnPhantom: `false`,
    listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]
  ): js.Promise[AnonPageId] = js.native
  def on(event: onUrlChanged, runOnPhantom: `false`, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onAlert(event: onAlert, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onCallback(event: onCallback, listener: js.Function1[/* data */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onClosing(event: onClosing, listener: js.Function1[/* closingPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onConfirm(event: onConfirm, listener: js.Function1[/* msg */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onConsoleMessage(
    event: onConsoleMessage,
    listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
  ): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onError(event: onError, listener: js.Function2[/* msg */ String, /* trace */ js.Array[AnonFile], Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onFilePicker(event: onFilePicker, listener: js.Function1[/* oldFile */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onInitialized(event: onInitialized, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onLoadStarted(event: onLoadStarted, listener: js.Function0[Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onPageCreated(event: onPageCreated, listener: js.Function1[/* newPage */ js.Any, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onPrompt(event: onPrompt, listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceError(event: onResourceError, listener: js.Function1[/* resourceError */ AnonErrorCode, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceReceived(event: onResourceReceived, listener: js.Function1[/* response */ IResponse, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceRequested(
    event: onResourceRequested,
    listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ AnonAbort, Unit]
  ): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onResourceTimeout(event: onResourceTimeout, listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]): js.Promise[AnonPageId] = js.native
  @JSName("on")
  def on_onUrlChanged(event: onUrlChanged, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[AnonPageId] = js.native
  def open(url: String): js.Promise[String] = js.native
  def open(url: String, settings: IOpenWebPageSettings): js.Promise[String] = js.native
  def property(
    key: content | plainText | focusedFrameName | frameContent | frameName | framePlainText | frameTitle | libraryPath | offlineStoragePath | title | url | windowName
  ): js.Promise[String] = js.native
  def property[T](key: String): js.Promise[T] = js.native
  def property[T](key: String, value: T): js.Promise[Unit] = js.native
  @JSName("property")
  def property_canGoBack(key: canGoBack): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_canGoForward(key: canGoForward): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_clipRect(key: clipRect): js.Promise[AnonHeight] = js.native
  @JSName("property")
  def property_cookies(key: cookies): js.Promise[js.Array[ICookie]] = js.native
  @JSName("property")
  def property_customHeaders(key: customHeaders): js.Promise[StringDictionary[String]] = js.native
  @JSName("property")
  def property_framesCount(key: framesCount): js.Promise[Double] = js.native
  @JSName("property")
  def property_framesName(key: framesName): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_navigationLocked(key: navigationLocked): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_offlineStorageQuota(key: offlineStorageQuota): js.Promise[Double] = js.native
  @JSName("property")
  def property_ownsPages(key: ownsPages): js.Promise[Boolean] = js.native
  @JSName("property")
  def property_pages(key: pages): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_pagesWindowName(key: pagesWindowName): js.Promise[js.Array[String]] = js.native
  @JSName("property")
  def property_paperSize(key: paperSize): js.Promise[IPaperSizeOptions] = js.native
  @JSName("property")
  def property_scrollPosition(key: scrollPosition): js.Promise[AnonLeft] = js.native
  @JSName("property")
  def property_viewportSize(key: viewportSize): js.Promise[AnonWidth] = js.native
  @JSName("property")
  def property_zoomFactor(key: zoomFactor): js.Promise[Double] = js.native
  def render(filename: String): js.Promise[Unit] = js.native
  def render(filename: String, options: AnonFormat): js.Promise[Unit] = js.native
  def renderBase64(`type`: String): js.Promise[String] = js.native
  def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit): js.Promise[Unit] = js.native
  def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit, modifier: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): js.Promise[Unit] = js.native
  def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): js.Promise[Unit] = js.native
  def setContent(html: String, url: String): js.Promise[String] = js.native
  def setting[T](key: String): js.Promise[T] = js.native
  def setting[T](key: String, value: T): js.Promise[T] = js.native
  @JSName("setting")
  def setting_XSSAuditingEnabled(key: XSSAuditingEnabled): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_javascriptEnabled(key: javascriptEnabled): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_loadImages(key: loadImages): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_localToRemoteUrlAccessEnabled(key: localToRemoteUrlAccessEnabled): js.Promise[Boolean] = js.native
  @JSName("setting")
  def setting_password(key: password): js.Promise[String] = js.native
  @JSName("setting")
  def setting_resourceTimeout(key: resourceTimeout): js.Promise[Double] = js.native
  @JSName("setting")
  def setting_userAgent(key: userAgent): js.Promise[String] = js.native
  @JSName("setting")
  def setting_userName(key: userName): js.Promise[String] = js.native
  @JSName("setting")
  def setting_webSecurityEnabled(key: webSecurityEnabled): js.Promise[Boolean] = js.native
}

