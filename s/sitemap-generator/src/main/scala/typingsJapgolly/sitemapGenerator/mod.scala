package typingsJapgolly.sitemapGenerator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sitemapGenerator.anon.ChangeFreq
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.0`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.1`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.2`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.3`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.4`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.5`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.6`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.7`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.8`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.9`
import typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`1.0`
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): Methods = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[Methods]
  inline def apply(url: String, options: Options): Methods = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Methods]
  
  @JSImport("sitemap-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ErrorMessage extends StObject {
    
    var code: String
    
    var message: String
    
    var url: String
  }
  object ErrorMessage {
    
    inline def apply(code: String, message: String, url: String): ErrorMessage = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorMessage]
    }
    
    extension [Self <: ErrorMessage](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.add
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.done
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.error
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.ignore
  */
  trait EventTypes extends StObject
  object EventTypes {
    
    inline def add: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.add = "add".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.add]
    
    inline def done: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.done = "done".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.done]
    
    inline def error: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.error = "error".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.error]
    
    inline def ignore: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.ignore = "ignore".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.ignore]
  }
  
  type ExcludeFunctionProps[T] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): void? never : K}[keyof T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.always
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.hourly
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.daily
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.weekly
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.monthly
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.yearly
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.never
  */
  trait FreqValues extends StObject
  object FreqValues {
    
    inline def always: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.always = "always".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.always]
    
    inline def daily: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.daily = "daily".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.daily]
    
    inline def hourly: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.hourly = "hourly".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.hourly]
    
    inline def monthly: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.monthly = "monthly".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.monthly]
    
    inline def never: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.never = "never".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.never]
    
    inline def weekly: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.weekly = "weekly".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.weekly]
    
    inline def yearly: typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.yearly = "yearly".asInstanceOf[typingsJapgolly.sitemapGenerator.sitemapGeneratorStrings.yearly]
  }
  
  trait Methods extends StObject {
    
    def getCrawler(): typingsJapgolly.simplecrawler.mod.^
    
    def getSitemap(): SiteMapRotator
    
    @JSName("on")
    def on_error[T /* <: EventTypes */](
      events: T,
      cb: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any
    ): Unit
    
    def queueURL(url: String): Unit
    
    def start(): Unit
    
    def stop(): Unit
  }
  object Methods {
    
    inline def apply(
      getCrawler: CallbackTo[typingsJapgolly.simplecrawler.mod.^],
      getSitemap: CallbackTo[SiteMapRotator],
      on: (Any, /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any) => Callback,
      queueURL: String => Callback,
      start: Callback,
      stop: Callback
    ): Methods = {
      val __obj = js.Dynamic.literal(getCrawler = getCrawler.toJsFn, getSitemap = getSitemap.toJsFn, on = js.Any.fromFunction2((t0: Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any) => (on(t0, t1)).runNow()), queueURL = js.Any.fromFunction1((t0: String) => queueURL(t0).runNow()), start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setGetCrawler(value: CallbackTo[typingsJapgolly.simplecrawler.mod.^]): Self = StObject.set(x, "getCrawler", value.toJsFn)
      
      inline def setGetSitemap(value: CallbackTo[SiteMapRotator]): Self = StObject.set(x, "getSitemap", value.toJsFn)
      
      inline def setOn(
        value: (Any, /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any) => Callback
      ): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: Any, t1: /* import warning: importer.ImportType#apply Failed type conversion: T extends 'error' ? (error : sitemap-generator.sitemap-generator.ErrorMessage): void : (): void */ js.Any) => (value(t0, t1)).runNow()))
      
      inline def setQueueURL(value: String => Callback): Self = StObject.set(x, "queueURL", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  type Options = Partial[ExcludeFunctionProps[typingsJapgolly.simplecrawler.mod.^]] & ChangeFreq
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.0`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.1`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.2`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.3`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.4`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.5`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.6`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.7`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.8`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`0.9`
    - typingsJapgolly.sitemapGenerator.sitemapGeneratorDoubles.`1.0`
  */
  trait PriorityValues extends StObject
  object PriorityValues {
    
    inline def `0Dot0`: `0.0` = 0.0d.asInstanceOf[`0.0`]
    
    inline def `0Dot1`: `0.1` = 0.1d.asInstanceOf[`0.1`]
    
    inline def `0Dot2`: `0.2` = 0.2d.asInstanceOf[`0.2`]
    
    inline def `0Dot3`: `0.3` = 0.3d.asInstanceOf[`0.3`]
    
    inline def `0Dot4`: `0.4` = 0.4d.asInstanceOf[`0.4`]
    
    inline def `0Dot5`: `0.5` = 0.5d.asInstanceOf[`0.5`]
    
    inline def `0Dot6`: `0.6` = 0.6d.asInstanceOf[`0.6`]
    
    inline def `0Dot7`: `0.7` = 0.7d.asInstanceOf[`0.7`]
    
    inline def `0Dot8`: `0.8` = 0.8d.asInstanceOf[`0.8`]
    
    inline def `0Dot9`: `0.9` = 0.9d.asInstanceOf[`0.9`]
    
    inline def `1Dot0`: `1.0` = 1.0d.asInstanceOf[`1.0`]
  }
  
  @js.native
  trait SiteMapRotator extends StObject {
    
    def addURL(url: String): Unit = js.native
    def addURL(url: String, depth: Double): Unit = js.native
    def addURL(url: String, depth: Double, lastMod: String): Unit = js.native
    def addURL(url: String, depth: Unit, lastMod: String): Unit = js.native
    
    def finish(): Unit = js.native
    
    def getPaths(): js.Array[String] = js.native
  }
}
