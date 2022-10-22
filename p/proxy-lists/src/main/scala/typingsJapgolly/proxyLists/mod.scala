package typingsJapgolly.proxyLists

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import typingsJapgolly.proxyLists.anon.PartialOptions
import typingsJapgolly.proxyLists.proxyListsStrings.data
import typingsJapgolly.proxyLists.proxyListsStrings.end
import typingsJapgolly.proxyLists.proxyListsStrings.error
import typingsJapgolly.proxyLists.proxyListsStrings.loose
import typingsJapgolly.proxyLists.proxyListsStrings.strict
import typingsJapgolly.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("proxy-lists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("proxy-lists", "GetProxiesEventEmitter")
  @js.native
  open class GetProxiesEventEmitter () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* proxies */ js.Array[Proxy], Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* error */ Any, Unit]): this.type = js.native
  }
  
  inline def addSource(name: String, source: AddSource_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSource")(name.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getProxies(): GetProxiesEventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxies")().asInstanceOf[GetProxiesEventEmitter]
  inline def getProxies(options: PartialOptions): GetProxiesEventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxies")(options.asInstanceOf[js.Any]).asInstanceOf[GetProxiesEventEmitter]
  
  inline def getProxiesFromSource(name: String): GetProxiesEventEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("getProxiesFromSource")(name.asInstanceOf[js.Any]).asInstanceOf[GetProxiesEventEmitter]
  inline def getProxiesFromSource(name: String, options: Options): GetProxiesEventEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("getProxiesFromSource")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GetProxiesEventEmitter]
  
  inline def listSources(): js.Array[Source] = ^.asInstanceOf[js.Dynamic].applyDynamic("listSources")().asInstanceOf[js.Array[Source]]
  inline def listSources(options: ListSourcesOptions): js.Array[Source] = ^.asInstanceOf[js.Dynamic].applyDynamic("listSources")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Source]]
  
  trait AddSource_ extends StObject {
    
    def getProxies(options: InternalOptions): GetProxiesEventEmitter
    
    var homeUrl: String
  }
  object AddSource_ {
    
    inline def apply(getProxies: InternalOptions => GetProxiesEventEmitter, homeUrl: String): AddSource_ = {
      val __obj = js.Dynamic.literal(getProxies = js.Any.fromFunction1(getProxies), homeUrl = homeUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddSource_]
    }
    
    extension [Self <: AddSource_](x: Self) {
      
      inline def setGetProxies(value: InternalOptions => GetProxiesEventEmitter): Self = StObject.set(x, "getProxies", js.Any.fromFunction1(value))
      
      inline def setHomeUrl(value: String): Self = StObject.set(x, "homeUrl", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.proxyLists.proxyListsStrings.transparent
    - typingsJapgolly.proxyLists.proxyListsStrings.anonymous
    - typingsJapgolly.proxyLists.proxyListsStrings.elite
  */
  trait AnonymityLevel extends StObject
  object AnonymityLevel {
    
    inline def anonymous: typingsJapgolly.proxyLists.proxyListsStrings.anonymous = "anonymous".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.anonymous]
    
    inline def elite: typingsJapgolly.proxyLists.proxyListsStrings.elite = "elite".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.elite]
    
    inline def transparent: typingsJapgolly.proxyLists.proxyListsStrings.transparent = "transparent".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.transparent]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.proxyLists.proxyListsStrings.ipv4
    - typingsJapgolly.proxyLists.proxyListsStrings.ipv6
  */
  trait IPType extends StObject
  object IPType {
    
    inline def ipv4: typingsJapgolly.proxyLists.proxyListsStrings.ipv4 = "ipv4".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.ipv4]
    
    inline def ipv6: typingsJapgolly.proxyLists.proxyListsStrings.ipv6 = "ipv6".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.ipv6]
  }
  
  trait InternalOptions
    extends StObject
       with Options {
    
    var sample: js.UndefOr[Boolean] = js.undefined
  }
  object InternalOptions {
    
    inline def apply(): InternalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalOptions]
    }
    
    extension [Self <: InternalOptions](x: Self) {
      
      inline def setSample(value: Boolean): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    }
  }
  
  trait ListSourcesOptions extends StObject {
    
    var sourcesBlackList: js.UndefOr[js.Array[String]] = js.undefined
    
    var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ListSourcesOptions {
    
    inline def apply(): ListSourcesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSourcesOptions]
    }
    
    extension [Self <: ListSourcesOptions](x: Self) {
      
      inline def setSourcesBlackList(value: js.Array[String]): Self = StObject.set(x, "sourcesBlackList", value.asInstanceOf[js.Any])
      
      inline def setSourcesBlackListUndefined: Self = StObject.set(x, "sourcesBlackList", js.undefined)
      
      inline def setSourcesBlackListVarargs(value: String*): Self = StObject.set(x, "sourcesBlackList", js.Array(value*))
      
      inline def setSourcesWhiteList(value: js.Array[String]): Self = StObject.set(x, "sourcesWhiteList", value.asInstanceOf[js.Any])
      
      inline def setSourcesWhiteListUndefined: Self = StObject.set(x, "sourcesWhiteList", js.undefined)
      
      inline def setSourcesWhiteListVarargs(value: String*): Self = StObject.set(x, "sourcesWhiteList", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    var anonymityLevels: js.UndefOr[js.Array[AnonymityLevel]] = js.undefined
    
    var countries: js.UndefOr[js.Array[String]] = js.undefined
    
    var countriesBlackList: js.UndefOr[js.Array[String]] = js.undefined
    
    var defaultRequestOptions: js.UndefOr[CoreOptions] = js.undefined
    
    var filterMode: js.UndefOr[strict | loose] = js.undefined
    
    var ipTypes: js.UndefOr[js.Array[IPType]] = js.undefined
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
    
    var series: js.UndefOr[Boolean] = js.undefined
    
    var sourcesBlackList: js.UndefOr[js.Array[String]] = js.undefined
    
    var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnonymityLevels(value: js.Array[AnonymityLevel]): Self = StObject.set(x, "anonymityLevels", value.asInstanceOf[js.Any])
      
      inline def setAnonymityLevelsUndefined: Self = StObject.set(x, "anonymityLevels", js.undefined)
      
      inline def setAnonymityLevelsVarargs(value: AnonymityLevel*): Self = StObject.set(x, "anonymityLevels", js.Array(value*))
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesBlackList(value: js.Array[String]): Self = StObject.set(x, "countriesBlackList", value.asInstanceOf[js.Any])
      
      inline def setCountriesBlackListUndefined: Self = StObject.set(x, "countriesBlackList", js.undefined)
      
      inline def setCountriesBlackListVarargs(value: String*): Self = StObject.set(x, "countriesBlackList", js.Array(value*))
      
      inline def setCountriesUndefined: Self = StObject.set(x, "countries", js.undefined)
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setDefaultRequestOptions(value: CoreOptions): Self = StObject.set(x, "defaultRequestOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultRequestOptionsUndefined: Self = StObject.set(x, "defaultRequestOptions", js.undefined)
      
      inline def setFilterMode(value: strict | loose): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setIpTypes(value: js.Array[IPType]): Self = StObject.set(x, "ipTypes", value.asInstanceOf[js.Any])
      
      inline def setIpTypesUndefined: Self = StObject.set(x, "ipTypes", js.undefined)
      
      inline def setIpTypesVarargs(value: IPType*): Self = StObject.set(x, "ipTypes", js.Array(value*))
      
      inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setSeries(value: Boolean): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setSourcesBlackList(value: js.Array[String]): Self = StObject.set(x, "sourcesBlackList", value.asInstanceOf[js.Any])
      
      inline def setSourcesBlackListUndefined: Self = StObject.set(x, "sourcesBlackList", js.undefined)
      
      inline def setSourcesBlackListVarargs(value: String*): Self = StObject.set(x, "sourcesBlackList", js.Array(value*))
      
      inline def setSourcesWhiteList(value: js.Array[String]): Self = StObject.set(x, "sourcesWhiteList", value.asInstanceOf[js.Any])
      
      inline def setSourcesWhiteListUndefined: Self = StObject.set(x, "sourcesWhiteList", js.undefined)
      
      inline def setSourcesWhiteListVarargs(value: String*): Self = StObject.set(x, "sourcesWhiteList", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.proxyLists.proxyListsStrings.http
    - typingsJapgolly.proxyLists.proxyListsStrings.https
    - typingsJapgolly.proxyLists.proxyListsStrings.socks5
    - typingsJapgolly.proxyLists.proxyListsStrings.socks4
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def http: typingsJapgolly.proxyLists.proxyListsStrings.http = "http".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.http]
    
    inline def https: typingsJapgolly.proxyLists.proxyListsStrings.https = "https".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.https]
    
    inline def socks4: typingsJapgolly.proxyLists.proxyListsStrings.socks4 = "socks4".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.socks4]
    
    inline def socks5: typingsJapgolly.proxyLists.proxyListsStrings.socks5 = "socks5".asInstanceOf[typingsJapgolly.proxyLists.proxyListsStrings.socks5]
  }
  
  trait Proxy extends StObject {
    
    var anonymityLevel: js.UndefOr[AnonymityLevel] = js.undefined
    
    var country: String
    
    var ipAddress: String
    
    var port: Double
    
    var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
    
    var source: String
    
    var tunnel: js.UndefOr[Boolean] = js.undefined
  }
  object Proxy {
    
    inline def apply(country: String, ipAddress: String, port: Double, source: String): Proxy = {
      val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proxy]
    }
    
    extension [Self <: Proxy](x: Self) {
      
      inline def setAnonymityLevel(value: AnonymityLevel): Self = StObject.set(x, "anonymityLevel", value.asInstanceOf[js.Any])
      
      inline def setAnonymityLevelUndefined: Self = StObject.set(x, "anonymityLevel", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
      
      inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    }
  }
  
  trait Source extends StObject {
    
    var homeUrl: String
    
    var name: String
  }
  object Source {
    
    inline def apply(homeUrl: String, name: String): Source = {
      val __obj = js.Dynamic.literal(homeUrl = homeUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setHomeUrl(value: String): Self = StObject.set(x, "homeUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
