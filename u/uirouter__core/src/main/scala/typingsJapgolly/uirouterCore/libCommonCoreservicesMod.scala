package typingsJapgolly.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uirouterCore.libCommonCommonMod.IInjectable
import typingsJapgolly.uirouterCore.libCommonCommonMod.Obj
import typingsJapgolly.uirouterCore.libInterfaceMod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCoreservicesMod {
  
  @JSImport("@uirouter/core/lib/common/coreservices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeStub[T](service: String, methods: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStub")(service.asInstanceOf[js.Any], methods.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("@uirouter/core/lib/common/coreservices", "services")
  @js.native
  val services: CoreServices = js.native
  
  trait CoreServices extends StObject {
    
    @JSName("$injector")
    var $injector: InjectorLike
    
    @JSName("$q")
    var $q: QLike
  }
  object CoreServices {
    
    inline def apply($injector: InjectorLike, $q: QLike): CoreServices = {
      val __obj = js.Dynamic.literal($injector = $injector.asInstanceOf[js.Any], $q = $q.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoreServices]
    }
    
    extension [Self <: CoreServices](x: Self) {
      
      inline def set$injector(value: InjectorLike): Self = StObject.set(x, "$injector", value.asInstanceOf[js.Any])
      
      inline def set$q(value: QLike): Self = StObject.set(x, "$q", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InjectorLike extends StObject {
    
    def annotate(fn: IInjectable): js.Array[Any] = js.native
    def annotate(fn: IInjectable, strictDi: Boolean): js.Array[Any] = js.native
    
    def get(token: Any): Any = js.native
    @JSName("get")
    def get_T_T[T](token: Any): T = js.native
    
    def has(token: Any): Boolean = js.native
    
    def invoke(fn: IInjectable): Any = js.native
    def invoke(fn: IInjectable, context: Any): Any = js.native
    def invoke(fn: IInjectable, context: Any, locals: Obj): Any = js.native
    def invoke(fn: IInjectable, context: Unit, locals: Obj): Any = js.native
    
    var strictDi: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait LocationConfig
    extends StObject
       with Disposable {
    
    /** See: [[UrlConfig.baseHref]] */ def baseHref(): String = js.native
    /** See: [[UrlConfig.baseHref]] */ @JSName("baseHref")
    var baseHref_Original: js.Function0[String] = js.native
    
    /** See: [[UrlConfig.hashPrefix]] */ def hashPrefix(): String = js.native
    def hashPrefix(newprefix: String): String = js.native
    /** See: [[UrlConfig.hashPrefix]] */ @JSName("hashPrefix")
    var hashPrefix_Original: js.Function1[/* newprefix */ js.UndefOr[String], String] = js.native
    
    /** See: [[UrlConfig.host]] */ def host(): String = js.native
    /** See: [[UrlConfig.host]] */ @JSName("host")
    var host_Original: js.Function0[String] = js.native
    
    /** See: [[UrlConfig.html5Mode]] */ def html5Mode(): Boolean = js.native
    /** See: [[UrlConfig.html5Mode]] */ @JSName("html5Mode")
    var html5Mode_Original: js.Function0[Boolean] = js.native
    
    /** See: [[UrlConfig.port]] */ def port(): Double = js.native
    /** See: [[UrlConfig.port]] */ @JSName("port")
    var port_Original: js.Function0[Double] = js.native
    
    /** See: [[UrlConfig.protocol]] */ def protocol(): String = js.native
    /** See: [[UrlConfig.protocol]] */ @JSName("protocol")
    var protocol_Original: js.Function0[String] = js.native
  }
  
  @js.native
  trait LocationServices
    extends StObject
       with Disposable {
    
    /** See: [[UrlService.hash]] */ def hash(): String = js.native
    /** See: [[UrlService.hash]] */ @JSName("hash")
    var hash_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['hash'] */ js.Any) & js.Function0[String] = js.native
    
    /** See: [[UrlService.onChange]] */ def onChange(callback: EventListener): js.Function = js.native
    /** See: [[UrlService.onChange]] */ @JSName("onChange")
    var onChange_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['onChange'] */ js.Any) & (js.Function1[/* callback */ EventListener, js.Function]) = js.native
    
    /** See: [[UrlService.path]] */ def path(): String = js.native
    /** See: [[UrlService.path]] */ @JSName("path")
    var path_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['path'] */ js.Any) & js.Function0[String] = js.native
    
    /** See: [[UrlService.search]] */ def search(): StringDictionary[Any] = js.native
    /** See: [[UrlService.search]] */ @JSName("search")
    var search_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['search'] */ js.Any) & js.Function0[StringDictionary[Any]] = js.native
    
    /** See: [[UrlService.url]] */ def url(): String = js.native
    def url(newurl: String): String = js.native
    def url(newurl: String, replace: Boolean): String = js.native
    def url(newurl: String, replace: Boolean, state: Any): String = js.native
    def url(newurl: String, replace: Unit, state: Any): String = js.native
    def url(newurl: Unit, replace: Boolean): String = js.native
    def url(newurl: Unit, replace: Boolean, state: Any): String = js.native
    def url(newurl: Unit, replace: Unit, state: Any): String = js.native
    /** See: [[UrlService.url]] */ @JSName("url")
    var url_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url.UrlService['url'] */ js.Any) & (js.Function3[
        /* newurl */ js.UndefOr[String], 
        /* replace */ js.UndefOr[Boolean], 
        /* state */ js.UndefOr[Any], 
        String
      ]) = js.native
  }
  
  @js.native
  trait QLike extends StObject {
    
    def all(promises: js.Array[js.Promise[Any]]): js.Promise[js.Array[Any]] = js.native
    def all(promises: StringDictionary[js.Promise[Any]]): js.Promise[Any] = js.native
    
    def defer(): QLikeDeferred = js.native
    
    def reject[T](reason: Any): js.Promise[T] = js.native
    
    def when[T](): js.Promise[T] = js.native
    def when[T](value: T): js.Promise[T] = js.native
    def when[T](value: PromiseLike[T]): js.Promise[T] = js.native
  }
  
  @js.native
  trait QLikeDeferred extends StObject {
    
    var promise: js.Promise[Any] = js.native
    
    def reject(): Unit = js.native
    def reject(reason: Any): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve(`val`: Any): Unit = js.native
  }
}
