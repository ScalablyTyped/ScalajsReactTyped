package typingsJapgolly.phantom

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.phantom.anon.Abort
import typingsJapgolly.phantom.anon.Bottom
import typingsJapgolly.phantom.anon.Contents
import typingsJapgolly.phantom.anon.ErrorCode
import typingsJapgolly.phantom.anon.File
import typingsJapgolly.phantom.anon.Format
import typingsJapgolly.phantom.anon.Height
import typingsJapgolly.phantom.anon.IRequestDataerrorCodenumb
import typingsJapgolly.phantom.anon.Left
import typingsJapgolly.phantom.anon.LogLevel
import typingsJapgolly.phantom.anon.Name
import typingsJapgolly.phantom.anon.PageId
import typingsJapgolly.phantom.anon.Width
import typingsJapgolly.phantom.phantomBooleans.`false`
import typingsJapgolly.phantom.phantomBooleans.`true`
import typingsJapgolly.phantom.phantomStrings.A3
import typingsJapgolly.phantom.phantomStrings.A4
import typingsJapgolly.phantom.phantomStrings.A5
import typingsJapgolly.phantom.phantomStrings.BackOrForward
import typingsJapgolly.phantom.phantomStrings.DELETE
import typingsJapgolly.phantom.phantomStrings.FormResubmitted
import typingsJapgolly.phantom.phantomStrings.FormSubmitted
import typingsJapgolly.phantom.phantomStrings.GET
import typingsJapgolly.phantom.phantomStrings.HEAD
import typingsJapgolly.phantom.phantomStrings.Legal
import typingsJapgolly.phantom.phantomStrings.Letter
import typingsJapgolly.phantom.phantomStrings.LinkClicked
import typingsJapgolly.phantom.phantomStrings.Other
import typingsJapgolly.phantom.phantomStrings.POST
import typingsJapgolly.phantom.phantomStrings.PUT
import typingsJapgolly.phantom.phantomStrings.Reload
import typingsJapgolly.phantom.phantomStrings.Tabloid
import typingsJapgolly.phantom.phantomStrings.Undefined
import typingsJapgolly.phantom.phantomStrings.XSSAuditingEnabled
import typingsJapgolly.phantom.phantomStrings.callback
import typingsJapgolly.phantom.phantomStrings.canGoBack
import typingsJapgolly.phantom.phantomStrings.canGoForward
import typingsJapgolly.phantom.phantomStrings.clipRect
import typingsJapgolly.phantom.phantomStrings.content
import typingsJapgolly.phantom.phantomStrings.cookies
import typingsJapgolly.phantom.phantomStrings.customHeaders
import typingsJapgolly.phantom.phantomStrings.end
import typingsJapgolly.phantom.phantomStrings.fail
import typingsJapgolly.phantom.phantomStrings.focusedFrameName
import typingsJapgolly.phantom.phantomStrings.frameContent
import typingsJapgolly.phantom.phantomStrings.frameName
import typingsJapgolly.phantom.phantomStrings.framePlainText
import typingsJapgolly.phantom.phantomStrings.frameTitle
import typingsJapgolly.phantom.phantomStrings.framesCount
import typingsJapgolly.phantom.phantomStrings.framesName
import typingsJapgolly.phantom.phantomStrings.javascriptEnabled
import typingsJapgolly.phantom.phantomStrings.landscape
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
import typingsJapgolly.phantom.phantomStrings.portrait
import typingsJapgolly.phantom.phantomStrings.resourceTimeout
import typingsJapgolly.phantom.phantomStrings.scrollPosition
import typingsJapgolly.phantom.phantomStrings.start
import typingsJapgolly.phantom.phantomStrings.success
import typingsJapgolly.phantom.phantomStrings.title
import typingsJapgolly.phantom.phantomStrings.url
import typingsJapgolly.phantom.phantomStrings.userAgent
import typingsJapgolly.phantom.phantomStrings.userName
import typingsJapgolly.phantom.phantomStrings.utf8
import typingsJapgolly.phantom.phantomStrings.viewportSize
import typingsJapgolly.phantom.phantomStrings.webSecurityEnabled
import typingsJapgolly.phantom.phantomStrings.windowName
import typingsJapgolly.phantom.phantomStrings.zoomFactor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("phantom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): js.Promise[PhantomJS] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[js.Promise[PhantomJS]]
  inline def create(args: js.Array[String]): js.Promise[PhantomJS] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PhantomJS]]
  inline def create(args: js.Array[String], config: LogLevel): js.Promise[PhantomJS] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhantomJS]]
  inline def create(args: Unit, config: LogLevel): js.Promise[PhantomJS] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhantomJS]]
  
  trait ICookie extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[String] = js.undefined
    
    var httponly: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var path: String
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object ICookie {
    
    inline def apply(name: String, path: String, value: String): ICookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICookie]
    }
    
    extension [Self <: ICookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
      
      inline def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOpenWebPageSettings extends StObject {
    
    var data: js.UndefOr[String] = js.undefined
    
    var encoding: js.UndefOr[utf8 | String] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var operation: js.UndefOr[GET | POST | HEAD | DELETE | PUT | String] = js.undefined
  }
  object IOpenWebPageSettings {
    
    inline def apply(): IOpenWebPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOpenWebPageSettings]
    }
    
    extension [Self <: IOpenWebPageSettings](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEncoding(value: utf8 | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOperation(value: GET | POST | HEAD | DELETE | PUT | String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    }
  }
  
  trait IPaperSizeOptions extends StObject {
    
    var footer: js.UndefOr[Contents] = js.undefined
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
    
    var header: js.UndefOr[Contents] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[String | Bottom] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object IPaperSizeOptions {
    
    inline def apply(): IPaperSizeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPaperSizeOptions]
    }
    
    extension [Self <: IPaperSizeOptions](x: Self) {
      
      inline def setFooter(value: Contents): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeader(value: Contents): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: String | Bottom): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IPhantomCallback extends StObject {
    
    var method: callback
    
    var parent: typingsJapgolly.phantom.phantomStrings.phantom
    
    var target: js.Function
    
    var transform: `true`
  }
  object IPhantomCallback {
    
    inline def apply(target: js.Function): IPhantomCallback = {
      val __obj = js.Dynamic.literal(method = "callback", parent = "phantom", target = target.asInstanceOf[js.Any], transform = true)
      __obj.asInstanceOf[IPhantomCallback]
    }
    
    extension [Self <: IPhantomCallback](x: Self) {
      
      inline def setMethod(value: callback): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParent(value: typingsJapgolly.phantom.phantomStrings.phantom): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: `true`): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRequestData extends StObject {
    
    var headers: js.Array[Name]
    
    var id: Double
    
    var method: String
    
    var time: js.Date
    
    var url: String
  }
  object IRequestData {
    
    inline def apply(headers: js.Array[Name], id: Double, method: String, time: js.Date, url: String): IRequestData = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRequestData]
    }
    
    extension [Self <: IRequestData](x: Self) {
      
      inline def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResponse extends StObject {
    
    var bodySize: Double
    
    var contentType: String
    
    var headers: js.Array[Name]
    
    var id: String
    
    var redirectURL: String
    
    var stage: start | end
    
    var status: Double
    
    var statusText: String
    
    var time: js.Date
    
    var url: String
  }
  object IResponse {
    
    inline def apply(
      bodySize: Double,
      contentType: String,
      headers: js.Array[Name],
      id: String,
      redirectURL: String,
      stage: start | end,
      status: Double,
      statusText: String,
      time: js.Date,
      url: String
    ): IResponse = {
      val __obj = js.Dynamic.literal(bodySize = bodySize.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], redirectURL = redirectURL.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResponse]
    }
    
    extension [Self <: IResponse](x: Self) {
      
      inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Array[Name]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Name*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
      
      inline def setStage(value: start | end): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PhantomJS extends StObject {
    
    def callback(fn: js.Function2[/* pageNum */ Double, /* numPages */ Double, String]): IPhantomCallback = js.native
    
    def createPage(): js.Promise[WebPage] = js.native
    
    def exit(): Unit = js.native
    def exit(returnValue: Double): Unit = js.native
  }
  
  @js.native
  trait WebPage extends StObject {
    
    def addCookie(cookie: ICookie): js.Promise[Boolean] = js.native
    
    def clearCookies(): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def deleteCookie(cookieName: String): js.Promise[Boolean] = js.native
    
    def evaluate[R](callback: js.Function0[R]): js.Promise[R] = js.native
    def evaluate[R](callback: js.Function1[/* repeated */ Any, R], args: Any*): js.Promise[R] = js.native
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
    ): js.Promise[PageId] = js.native
    
    def on(event: onAlert, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    def on(event: onCallback, runOnPhantom: `false`, listener: js.Function1[/* data */ Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onClosing, runOnPhantom: `false`, listener: js.Function1[/* closingPage */ Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onConfirm, runOnPhantom: `false`, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onConsoleMessage,
      runOnPhantom: `false`,
      listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onError,
      runOnPhantom: `false`,
      listener: js.Function2[/* msg */ String, /* trace */ js.Array[File], Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onFilePicker, runOnPhantom: `false`, listener: js.Function1[/* oldFile */ Any, Unit]): js.Promise[PageId] = js.native
    def on(event: onInitialized, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    def on(event: onLoadFinished, listener: js.Function1[/* status */ success | fail, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onLoadFinished,
      runOnPhantom: `false`,
      listener: js.Function1[/* status */ success | fail, Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onLoadStarted, runOnPhantom: `false`, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    def on(
      event: onNavigationRequested,
      listener: js.Function4[
          /* url */ String, 
          /* type */ Undefined | LinkClicked | FormSubmitted | BackOrForward | Reload | FormResubmitted | Other, 
          /* willNavigate */ Boolean, 
          /* main */ Boolean, 
          Unit
        ]
    ): js.Promise[PageId] = js.native
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
    ): js.Promise[PageId] = js.native
    def on(event: onPageCreated, runOnPhantom: `false`, listener: js.Function1[/* newPage */ Any, Unit]): js.Promise[PageId] = js.native
    def on(
      event: onPrompt,
      runOnPhantom: `false`,
      listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceError,
      runOnPhantom: `false`,
      listener: js.Function1[/* resourceError */ ErrorCode, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceReceived,
      runOnPhantom: `false`,
      listener: js.Function1[/* response */ IResponse, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceRequested,
      runOnPhantom: `false`,
      listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ Abort, Unit]
    ): js.Promise[PageId] = js.native
    def on(
      event: onResourceTimeout,
      runOnPhantom: `false`,
      listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]
    ): js.Promise[PageId] = js.native
    def on(event: onUrlChanged, runOnPhantom: `false`, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onAlert(event: onAlert, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onCallback(event: onCallback, listener: js.Function1[/* data */ Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onClosing(event: onClosing, listener: js.Function1[/* closingPage */ Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onConfirm(event: onConfirm, listener: js.Function1[/* msg */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onConsoleMessage(
      event: onConsoleMessage,
      listener: js.Function3[/* msg */ String, /* lineNum */ Double, /* sourceId */ String, Unit]
    ): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onError(event: onError, listener: js.Function2[/* msg */ String, /* trace */ js.Array[File], Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onFilePicker(event: onFilePicker, listener: js.Function1[/* oldFile */ Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onInitialized(event: onInitialized, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onLoadStarted(event: onLoadStarted, listener: js.Function0[Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onPageCreated(event: onPageCreated, listener: js.Function1[/* newPage */ Any, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onPrompt(event: onPrompt, listener: js.Function2[/* msg */ String, /* defaultVal */ String, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceError(event: onResourceError, listener: js.Function1[/* resourceError */ ErrorCode, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceReceived(event: onResourceReceived, listener: js.Function1[/* response */ IResponse, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceRequested(
      event: onResourceRequested,
      listener: js.Function2[/* requestData */ IRequestData, /* networkRequest */ Abort, Unit]
    ): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onResourceTimeout(event: onResourceTimeout, listener: js.Function1[/* request */ IRequestDataerrorCodenumb, Unit]): js.Promise[PageId] = js.native
    @JSName("on")
    def on_onUrlChanged(event: onUrlChanged, listener: js.Function1[/* targetUrl */ String, Unit]): js.Promise[PageId] = js.native
    
    def open(url: String): js.Promise[String] = js.native
    def open(url: String, settings: IOpenWebPageSettings): js.Promise[String] = js.native
    
    def property(
      key: canGoBack | canGoForward | content | focusedFrameName | frameContent | frameName | framePlainText | frameTitle | framesCount | framesName | libraryPath | navigationLocked | offlineStoragePath | offlineStorageQuota | ownsPages | pages | pagesWindowName | plainText | title | url | windowName | zoomFactor
    ): js.Promise[String] = js.native
    def property[T](key: String): js.Promise[T] = js.native
    def property[T](key: String, value: T): js.Promise[Unit] = js.native
    @JSName("property")
    def property_clipRect(key: clipRect): js.Promise[Height] = js.native
    @JSName("property")
    def property_cookies(key: cookies): js.Promise[js.Array[ICookie]] = js.native
    @JSName("property")
    def property_customHeaders(key: customHeaders): js.Promise[StringDictionary[String]] = js.native
    @JSName("property")
    def property_paperSize(key: paperSize): js.Promise[IPaperSizeOptions] = js.native
    @JSName("property")
    def property_scrollPosition(key: scrollPosition): js.Promise[Left] = js.native
    @JSName("property")
    def property_viewportSize(key: viewportSize): js.Promise[Width] = js.native
    
    def render(filename: String): js.Promise[Unit] = js.native
    def render(filename: String, options: Format): js.Promise[Unit] = js.native
    
    def renderBase64(`type`: String): js.Promise[String] = js.native
    
    def sendEvent(keyboardEventType: String, key: String): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit): js.Promise[Unit] = js.native
    def sendEvent(keyboardEventType: String, key: String, null1: Unit, null2: Unit, modifier: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Double, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Double, mouseY: Unit, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Double): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Double, button: String): js.Promise[Unit] = js.native
    def sendEvent(mouseEventType: String, mouseX: Unit, mouseY: Unit, button: String): js.Promise[Unit] = js.native
    
    def setContent(html: String, url: String): js.Promise[String] = js.native
    
    def setting(
      key: XSSAuditingEnabled | javascriptEnabled | loadImages | localToRemoteUrlAccessEnabled | password | userAgent | userName | webSecurityEnabled
    ): js.Promise[Boolean] = js.native
    def setting[T](key: String): js.Promise[T] = js.native
    def setting[T](key: String, value: T): js.Promise[T] = js.native
    @JSName("setting")
    def setting_resourceTimeout(key: resourceTimeout): js.Promise[Double] = js.native
  }
  
  @js.native
  trait winstonLeveledLogMethod extends StObject {
    
    def apply(infoObject: Any): Any = js.native
    def apply(message: String, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    def apply(message: String, meta: Any*): Any = js.native
    def apply(message: String, meta: Any, callback: js.Function1[/* repeated */ Any, Unit]): Any = js.native
  }
}
