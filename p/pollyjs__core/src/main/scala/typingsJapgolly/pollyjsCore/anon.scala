package typingsJapgolly.pollyjsCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pollyjsAdapter.mod.default
import typingsJapgolly.pollyjsCore.mod.Headers
import typingsJapgolly.pollyjsCore.mod.MatchBy
import typingsJapgolly.pollyjsCore.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiNamespace extends StObject {
    
    var apiNamespace: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
  }
  object ApiNamespace {
    
    inline def apply(): ApiNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiNamespace]
    }
    
    extension [Self <: ApiNamespace](x: Self) {
      
      inline def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      inline def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    }
  }
  
  trait Body extends StObject {
    
    var body: js.UndefOr[Boolean | (MatchBy[Any, Any])] = js.undefined
    
    var headers: js.UndefOr[Boolean | Exclude | (MatchBy[Headers, Headers])] = js.undefined
    
    var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var order: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[Boolean | (MatchBy[String, String]) | Hash] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Boolean | (MatchBy[Any, Any])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyFunction2(value: (Any, /* req */ Request) => Any): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Boolean | Exclude | (MatchBy[Headers, Headers])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction2(value: (Headers, /* req */ Request) => Headers): Self = StObject.set(x, "headers", js.Any.fromFunction2(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setUrl(value: Boolean | (MatchBy[String, String]) | Hash): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var fetch: js.UndefOr[Context] = js.undefined
    
    var puppeteer: js.UndefOr[Page] = js.undefined
    
    var xhr: js.UndefOr[Context] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setFetch(value: Context): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setPuppeteer(value: Page): Self = StObject.set(x, "puppeteer", value.asInstanceOf[js.Any])
      
      inline def setPuppeteerUndefined: Self = StObject.set(x, "puppeteer", js.undefined)
      
      inline def setXhr(value: Context): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait DisableSortingHarEntries
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disableSortingHarEntries: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[RecordingsDir] = js.undefined
    
    var keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
    
    var `local-storage`: js.UndefOr[Key] = js.undefined
    
    var rest: js.UndefOr[ApiNamespace] = js.undefined
  }
  object DisableSortingHarEntries {
    
    inline def apply(): DisableSortingHarEntries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableSortingHarEntries]
    }
    
    extension [Self <: DisableSortingHarEntries](x: Self) {
      
      inline def setDisableSortingHarEntries(value: Boolean): Self = StObject.set(x, "disableSortingHarEntries", value.asInstanceOf[js.Any])
      
      inline def setDisableSortingHarEntriesUndefined: Self = StObject.set(x, "disableSortingHarEntries", js.undefined)
      
      inline def setFs(value: RecordingsDir): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setKeepUnusedRequests(value: Boolean): Self = StObject.set(x, "keepUnusedRequests", value.asInstanceOf[js.Any])
      
      inline def setKeepUnusedRequestsUndefined: Self = StObject.set(x, "keepUnusedRequests", js.undefined)
      
      inline def `setLocal-storage`(value: Key): Self = StObject.set(x, "local-storage", value.asInstanceOf[js.Any])
      
      inline def `setLocal-storageUndefined`: Self = StObject.set(x, "local-storage", js.undefined)
      
      inline def setRest(value: ApiNamespace): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    }
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.Array[String]
  }
  object Exclude {
    
    inline def apply(exclude: js.Array[String]): Exclude = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  trait Hash extends StObject {
    
    var hash: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var hostname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var password: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var pathname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var port: js.UndefOr[Boolean | (MatchBy[Double, Double])] = js.undefined
    
    var protocol: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var query: js.UndefOr[Boolean | (MatchBy[StringDictionary[Any], StringDictionary[Any]])] = js.undefined
    
    var username: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  }
  object Hash {
    
    inline def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setHash(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHostname(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "hostname", js.Any.fromFunction2(value))
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPassword(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "password", js.Any.fromFunction2(value))
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPathname(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "pathname", js.Any.fromFunction2(value))
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: Boolean | (MatchBy[Double, Double])): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortFunction2(value: (Double, /* req */ Request) => Double): Self = StObject.set(x, "port", js.Any.fromFunction2(value))
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "protocol", js.Any.fromFunction2(value))
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: Boolean | (MatchBy[StringDictionary[Any], StringDictionary[Any]])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryFunction2(value: (StringDictionary[Any], /* req */ Request) => StringDictionary[Any]): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setUsername(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "username", js.Any.fromFunction2(value))
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Page extends StObject {
    
    var page: js.UndefOr[Any] = js.undefined
    
    var requestResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Page {
    
    inline def apply(): Page = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setRequestResourceTypes(value: js.Array[String]): Self = StObject.set(x, "requestResourceTypes", value.asInstanceOf[js.Any])
      
      inline def setRequestResourceTypesUndefined: Self = StObject.set(x, "requestResourceTypes", js.undefined)
      
      inline def setRequestResourceTypesVarargs(value: String*): Self = StObject.set(x, "requestResourceTypes", js.Array(value*))
    }
  }
  
  trait RecordingsDir extends StObject {
    
    var recordingsDir: js.UndefOr[String] = js.undefined
  }
  object RecordingsDir {
    
    inline def apply(): RecordingsDir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingsDir]
    }
    
    extension [Self <: RecordingsDir](x: Self) {
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      inline def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
  
  @js.native
  trait TypeofAdapter
    extends StObject
       with Instantiable0[default] {
    
    val id: String = js.native
    
    val `type`: String = js.native
  }
  
  @js.native
  trait TypeofPersister
    extends StObject
       with Instantiable0[typingsJapgolly.pollyjsPersister.mod.default] {
    
    val id: String = js.native
    
    val `type`: String = js.native
  }
}
