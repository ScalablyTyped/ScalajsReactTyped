package typingsJapgolly.carlo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.carlo.anon.Body
import typingsJapgolly.carlo.anon.Height
import typingsJapgolly.carlo.anon.Path
import typingsJapgolly.carlo.carloStrings.close
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.puppeteerCore.mod.Browser
import typingsJapgolly.puppeteerCore.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("carlo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enterTestMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enterTestMode")().asInstanceOf[Unit]
  
  inline def fileInfo(file: Any): js.Promise[Path] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileInfo")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Path]]
  
  inline def launch(): js.Promise[App] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")().asInstanceOf[js.Promise[App]]
  inline def launch(options: LaunchOptions): js.Promise[App] = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[App]]
  
  inline def loadParams(): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadParams")().asInstanceOf[js.Promise[js.Array[Any]]]
  
  @js.native
  trait App extends StObject {
    
    /**
      * Puppeteer browser object for testing.
      */
    def browserForTest(): Browser = js.native
    
    def createWindow(): js.Promise[Window] = js.native
    def createWindow(options: WindowOptions): js.Promise[Window] = js.native
    
    def evaluate(
      pageFunction: String,
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any
      ] = js.native
    def evaluate(
      pageFunction: js.Function1[/* repeated */ Any, Any],
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any
      ] = js.native
    @JSName("evaluate")
    var evaluate_Original: EvaluateFunction = js.native
    
    /**
      * Closes the browser window
      */
    def exit(): js.Promise[Unit] = js.native
    
    /**
      * The method adds a function called name on the pages' window object.
      * When called, the function executes carloFunction in Node.js and returns a Promise which resolves to the return value of carloFunction.
      * @param name
      * @param carloFunction
      */
    def exposeFunction(name: String, carloFunction: js.Function1[/* repeated */ Any, Any]): js.Promise[Unit] = js.native
    
    /**
      * Shortcut to the main window's Window.load
      * @param uri
      * @param params
      */
    def load(uri: String, params: Any*): js.Promise[Unit] = js.native
    
    /**
      * Running app guarantees to have main window.
      * If current main window closes, a next open window becomes the main one.
      */
    def mainWindow(): Window = js.native
    
    /**
      * 'exit' - Emitted when the last window closes.
      * 'window' - Emitted when the new window opens.
      * @param name 'exit' or 'window'
      * @param callback
      */
    def on(name: AppEvent, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    /**
      * Makes the content of the given folder available to the Chrome web app
      * @param folder Folder with web content to make available to Chrome
      * @param prefix Prefix of the URL path to serve from the given folder
      */
    def serveFolder(folder: String): Unit = js.native
    def serveFolder(folder: String, prefix: String): Unit = js.native
    
    /**
      * Handler function is called with every network request in this app.
      * It can abort, continue or fulfill each request.
      * Only single app-wide handler can be registered.
      * @param handler Network handler callback accepting the HttpRequest parameter.
      */
    def serveHandler(handler: js.Function1[/* request */ HttpRequest, Unit]): Unit = js.native
    
    /**
      * Fetches Carlo content from the specified origin instead of reading it from the file system, eg http://localhost:8080.
      * This mode can be used for the fast development mode available in web frameworks.
      * @param base Base to serve web content from.
      * @param prefix Prefix of the URL path to serve from the given folder.
      */
    def serveOrigin(base: String): Unit = js.native
    def serveOrigin(base: String, prefix: String): Unit = js.native
    
    def setIcon(image: String): Unit = js.native
    /**
      * Specifies image to be used as an app icon in the system dock.
      * This feature is only available in Chrome M72+. One can use 'canary' channel to see it in action before M72 hits stable.
      * @param image Either buffer containing PNG or a path to the PNG file on the file system.
      */
    def setIcon(image: Buffer): Unit = js.native
    
    /**
      * Returns all currently opened windows.
      * Running app guarantees to have at least one open window.
      */
    def windows(): js.Array[Window] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.carlo.carloStrings.exit
    - typingsJapgolly.carlo.carloStrings.window
  */
  trait AppEvent extends StObject
  object AppEvent {
    
    inline def exit: typingsJapgolly.carlo.carloStrings.exit = "exit".asInstanceOf[typingsJapgolly.carlo.carloStrings.exit]
    
    inline def window: typingsJapgolly.carlo.carloStrings.window = "window".asInstanceOf[typingsJapgolly.carlo.carloStrings.window]
  }
  
  trait Bounds extends StObject {
    
    /**
      * Height in pixels.
      */
    var height: Double
    
    /**
      * Left offset in pixels.
      */
    var left: Double
    
    /**
      * Top offset in pixels.
      */
    var top: Double
    
    /**
      * Width in pixels.
      */
    var width: Double
  }
  object Bounds {
    
    inline def apply(height: Double, left: Double, top: Double, width: Double): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type Channel = String
  
  @js.native
  trait EvaluateFunction extends StObject {
    
    def apply(
      pageFunction: String,
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any
      ] = js.native
    def apply(
      pageFunction: js.Function1[/* repeated */ Any, Any],
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any
      ] = js.native
  }
  
  trait HttpRequest extends StObject {
    
    /**
      * Aborts request.
      * If request is a navigation request, navigation is aborted as well.
      */
    def abort(): js.Promise[Unit]
    
    /**
      * Proceeds with the default behavior for this request.
      * Either serves it from the filesystem or defers to the browser.
      */
    def continue(): js.Promise[Unit]
    
    /**
      * Marks the request as failed.
      * If request is a navigation request, navigation is still committed, but to a location that fails to be fetched.
      */
    def fail(): js.Promise[Unit]
    
    /**
      * Fulfills the network request with the given data. 'Content-Length' header is generated in case it is not listed in the headers.
      */
    def fulfill(options: Body): js.Promise[Unit]
    
    /**
      * Network request headers
      */
    def headers(): js.Object
    
    /**
      * HTTP method of this network request (GET, POST, etc.)
      */
    def method(): String
    
    /**
      * Network request URL
      */
    def url(): String
  }
  object HttpRequest {
    
    inline def apply(
      abort: CallbackTo[js.Promise[Unit]],
      continue: CallbackTo[js.Promise[Unit]],
      fail: CallbackTo[js.Promise[Unit]],
      fulfill: Body => js.Promise[Unit],
      headers: CallbackTo[js.Object],
      method: CallbackTo[String],
      url: CallbackTo[String]
    ): HttpRequest = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, continue = continue.toJsFn, fail = fail.toJsFn, fulfill = js.Any.fromFunction1(fulfill), headers = headers.toJsFn, method = method.toJsFn, url = url.toJsFn)
      __obj.asInstanceOf[HttpRequest]
    }
    
    extension [Self <: HttpRequest](x: Self) {
      
      inline def setAbort(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setContinue(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "continue", value.toJsFn)
      
      inline def setFail(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "fail", value.toJsFn)
      
      inline def setFulfill(value: Body => js.Promise[Unit]): Self = StObject.set(x, "fulfill", js.Any.fromFunction1(value))
      
      inline def setHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "headers", value.toJsFn)
      
      inline def setMethod(value: CallbackTo[String]): Self = StObject.set(x, "method", value.toJsFn)
      
      inline def setUrl(value: CallbackTo[String]): Self = StObject.set(x, "url", value.toJsFn)
    }
  }
  
  trait LaunchOptions
    extends StObject
       with WindowOptions {
    
    /**
      * Additional arguments to pass to the browser instance.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Browser to be used, defaults to ['stable']
      */
    var channel: js.UndefOr[js.Array[Channel]] = js.undefined
    
    /**
      * Path to a Chromium or Chrome executable to run instead of the automatically located Chrome.
      * If executablePath is a relative path, then it is resolved relative to current working directory.
      * Carlo is only guaranteed to work with the latest Chrome stable version.
      */
    var executablePath: js.UndefOr[String] = js.undefined
    
    /**
      * Application icon to be used in the system dock.
      * Either buffer containing PNG or a path to the PNG file on the file system.
      * This feature is only available in Chrome M72+.
      * One can use 'canary' channel to see it in action before M72 hits stable.
      */
    var icon: js.UndefOr[Buffer | String] = js.undefined
    
    /**
      * Optional parameters to share between Carlo instances.
      */
    var paramsForReuse: js.UndefOr[Any] = js.undefined
    
    /**
      * Application title
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      *  Path to a User Data Directory. This folder is created upon the first app launch and contains user settings and Web storage data. Defaults to '.profile'.
      */
    var userDataDir: js.UndefOr[String] = js.undefined
  }
  object LaunchOptions {
    
    inline def apply(): LaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchOptions]
    }
    
    extension [Self <: LaunchOptions](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setChannel(value: js.Array[Channel]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setChannelVarargs(value: Channel*): Self = StObject.set(x, "channel", js.Array(value*))
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      inline def setIcon(value: Buffer | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setParamsForReuse(value: Any): Self = StObject.set(x, "paramsForReuse", value.asInstanceOf[js.Any])
      
      inline def setParamsForReuseUndefined: Self = StObject.set(x, "paramsForReuse", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
  
  @js.native
  trait Window extends StObject {
    
    /**
      * Returns window bounds
      */
    def bounds(): js.Promise[Bounds] = js.native
    
    /**
      * Brings this window to front.
      */
    def bringToFront(): js.Promise[Unit] = js.native
    
    /**
      * Closes this window.
      */
    def close(): js.Promise[Unit] = js.native
    
    def evaluate(
      pageFunction: String,
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any
      ] = js.native
    def evaluate(
      pageFunction: js.Function1[/* repeated */ Any, Any],
      args: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any)*
    ): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Serializable */ Any
      ] = js.native
    @JSName("evaluate")
    var evaluate_Original: EvaluateFunction = js.native
    
    /**
      * @param name Name of the function on the window object.
      * @param carloFunction Callback function which will be called in Carlo's context.
      */
    def exposeFunction(name: String, carloFunction: js.Function1[/* repeated */ Any, Any]): js.Promise[Unit] = js.native
    
    /**
      * Turns the window into the full screen mode. Behavior is platform specific.
      */
    def fullscreen(): js.Promise[Unit] = js.native
    
    /**
      * Navigates the corresponding web page to the given uri,
      * makes given params available in web page via carlo.loadParams()
      * Resolves upon DOMContentLoaded event in the web page.
      * @param uri Path to the resource relative to the folder passed into serveFolder()
      * @param params Optional parameters to pass to the web application.
      */
    def load(uri: String): js.Promise[Unit] = js.native
    def load(uri: String, params: Any): js.Promise[Unit] = js.native
    
    /**
      * Maximizes the window. Behavior is platform-specific.
      */
    def maximize(): js.Promise[Unit] = js.native
    
    /**
      * Minimizes the window. Behavior is platform-specific.
      */
    def minimize(): js.Promise[Unit] = js.native
    
    /**
      * 'close' - Emitted when the window closes.
      * @param name 'close'
      */
    def on(name: AppEvent, callback: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    /**
      * Returns Puppeteer page object for testing.
      */
    def pageForTest(): Page = js.native
    
    /**
      * Returns the options.paramsForReuse value passed into the carlo.launch.
      */
    def paramsForReuse(): Any = js.native
    
    /**
      * Same as App.serveFolder(folder[, prefix]), but only applies to current window.
      * @param folder Folder with web content to make available to Chrome.
      * @param prefix Prefix of the URL path to serve from the given folder.
      */
    def serveFolder(folder: String): Unit = js.native
    def serveFolder(folder: String, prefix: String): Unit = js.native
    
    /**
      * Same as App.serveHandler(handler), but only applies to the current window requests.
      * Only single window-level handler can be installed in window.
      * @param handle Network handler callback accepting the HttpRequest parameter.
      */
    def serveHandler(handle: js.Function1[/* request */ HttpRequest, Unit]): Unit = js.native
    
    /**
      * Same as App.serveOrigin(base[, prefix]), but only applies to current window.
      * @param base Base to serve web content from.
      * @param prefix Prefix of the URL path to serve from the given folder.
      */
    def serveOrigin(base: String): js.Promise[Unit] = js.native
    def serveOrigin(base: String, prefix: String): js.Promise[Unit] = js.native
    
    /**
      * Sets window bounds. Parameters top, left, width and height are all optional.
      * Dimension or the offset is only applied when specified.
      * @param bounds Window bounds
      */
    def setBounds(bounds: Height): js.Promise[Unit] = js.native
  }
  
  type WindowEvent = close
  
  trait WindowOptions extends StObject {
    
    /**
      * Background color using hex notation, defaults to '#ffffff'.
      */
    var bgcolor: js.UndefOr[String] = js.undefined
    
    /**
      * App window height in pixels.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * App window left offset in pixels.
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /**
      * App window top offset in pixels.
      */
    var top: js.UndefOr[Double] = js.undefined
    
    /**
      * App window width in pixels.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object WindowOptions {
    
    inline def apply(): WindowOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WindowOptions]
    }
    
    extension [Self <: WindowOptions](x: Self) {
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
