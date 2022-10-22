package typingsJapgolly.jestEnvironmentPuppeteer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.vmMod.Context
import typingsJapgolly.puppeteer.mod.Browser
import typingsJapgolly.puppeteer.mod.BrowserContext
import typingsJapgolly.puppeteer.mod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
  @JSImport("jest-environment-puppeteer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PuppeteerEnvironment {
    
    /* CompleteClass */
    var global: Global_ = js.native
  }
  
  object global {
    
    @JSGlobal("browser")
    @js.native
    val browser: Browser = js.native
    
    @JSGlobal("context")
    @js.native
    val context: BrowserContext = js.native
    
    @JSGlobal("jestPuppeteer")
    @js.native
    val jestPuppeteer: JestPuppeteer = js.native
    
    @JSGlobal("page")
    @js.native
    val page: Page = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeEnvironment * / any['global']
  - Lifted 0 members from Set(std.NonNullable</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeEnvironment * / any['global']>) */ trait Global_ extends StObject {
    
    var browser: Browser
    
    var context: Context
    
    var jestPuppeteer: JestPuppeteer
    
    var page: Page
  }
  object Global_ {
    
    inline def apply(browser: Browser, context: Context, jestPuppeteer: JestPuppeteer, page: Page): Global_ = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], jestPuppeteer = jestPuppeteer.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global_]
    }
    
    extension [Self <: Global_](x: Self) {
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setJestPuppeteer(value: JestPuppeteer): Self = StObject.set(x, "jestPuppeteer", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Page): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    }
  }
  
  trait JestPuppeteer extends StObject {
    
    /**
      * Suspends test execution and gives you opportunity to see what's going on in the browser
      * - Jest is suspended (no timeout)
      * - A debugger instruction to Chromium, if Puppeteer has been launched with { devtools: true } it will stop
      *
      * ```ts
      * it('should put test in debug mode', async () => {
      *   await jestPuppeteer.debug()
      * })
      * ```
      */
    def debug(): js.Promise[Unit]
    
    /**
      * Reset global.browser
      *
      * ```ts
      * beforeEach(async () => {
      *   await jestPuppeteer.resetBrowser()
      * })
      * ```
      */
    def resetBrowser(): js.Promise[Unit]
    
    /**
      * Reset global.page
      *
      * ```ts
      * beforeEach(async () => {
      *   await jestPuppeteer.resetPage()
      * })
      * ```
      */
    def resetPage(): js.Promise[Unit]
  }
  object JestPuppeteer {
    
    inline def apply(
      debug: CallbackTo[js.Promise[Unit]],
      resetBrowser: CallbackTo[js.Promise[Unit]],
      resetPage: CallbackTo[js.Promise[Unit]]
    ): JestPuppeteer = {
      val __obj = js.Dynamic.literal(debug = debug.toJsFn, resetBrowser = resetBrowser.toJsFn, resetPage = resetPage.toJsFn)
      __obj.asInstanceOf[JestPuppeteer]
    }
    
    extension [Self <: JestPuppeteer](x: Self) {
      
      inline def setDebug(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "debug", value.toJsFn)
      
      inline def setResetBrowser(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "resetBrowser", value.toJsFn)
      
      inline def setResetPage(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "resetPage", value.toJsFn)
    }
  }
  
  /** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeEnvironment * / any */ trait PuppeteerEnvironment extends StObject {
    
    var global: Global_
  }
  object PuppeteerEnvironment {
    
    inline def apply(global: Global_): PuppeteerEnvironment = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[PuppeteerEnvironment]
    }
    
    extension [Self <: PuppeteerEnvironment](x: Self) {
      
      inline def setGlobal(value: Global_): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
}
