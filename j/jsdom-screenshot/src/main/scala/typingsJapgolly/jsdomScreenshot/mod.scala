package typingsJapgolly.jsdomScreenshot

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import typingsJapgolly.jsdomScreenshot.anon.FnCall
import typingsJapgolly.puppeteer.mod.LaunchOptions
import typingsJapgolly.puppeteer.mod.ScreenshotOptions
import typingsJapgolly.puppeteer.mod.Viewport
import typingsJapgolly.std.ReturnType
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsdom-screenshot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debug(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Unit]
  inline def debug(element: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def debug(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def generateImage(): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateImage")().asInstanceOf[ReturnType[FnCall]]
  inline def generateImage(options: GenerateImageOptions): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateImage")(options.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def restoreDefaultOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreDefaultOptions")().asInstanceOf[Unit]
  
  inline def setDefaultOptions(options: GenerateImageOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait GenerateImageOptions extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var intercept: js.UndefOr[VoidFunction] = js.undefined
    
    var launch: js.UndefOr[LaunchOptions] = js.undefined
    
    var screenshot: js.UndefOr[ScreenshotOptions] = js.undefined
    
    var serve: js.UndefOr[js.Array[String]] = js.undefined
    
    var viewport: js.UndefOr[Viewport] = js.undefined
    
    var waitUntilNetworkIdle: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateImageOptions {
    
    inline def apply(): GenerateImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateImageOptions]
    }
    
    extension [Self <: GenerateImageOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIntercept(value: Callback): Self = StObject.set(x, "intercept", value.toJsFn)
      
      inline def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
      
      inline def setLaunch(value: LaunchOptions): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
      
      inline def setLaunchUndefined: Self = StObject.set(x, "launch", js.undefined)
      
      inline def setScreenshot(value: ScreenshotOptions): Self = StObject.set(x, "screenshot", value.asInstanceOf[js.Any])
      
      inline def setScreenshotUndefined: Self = StObject.set(x, "screenshot", js.undefined)
      
      inline def setServe(value: js.Array[String]): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
      
      inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
      
      inline def setServeVarargs(value: String*): Self = StObject.set(x, "serve", js.Array(value*))
      
      inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      inline def setWaitUntilNetworkIdle(value: Boolean): Self = StObject.set(x, "waitUntilNetworkIdle", value.asInstanceOf[js.Any])
      
      inline def setWaitUntilNetworkIdleUndefined: Self = StObject.set(x, "waitUntilNetworkIdle", js.undefined)
    }
  }
}
