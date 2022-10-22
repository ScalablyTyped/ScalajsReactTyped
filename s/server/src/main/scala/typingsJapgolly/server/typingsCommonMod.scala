package typingsJapgolly.server

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.formidable.mod.Files
import typingsJapgolly.server.anon.keyinLogLevelLogFn
import typingsJapgolly.server.replyMod.Reply
import typingsJapgolly.server.typingsOptionsMod.Options
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsCommonMod {
  
  type BasicType = String | js.Array[Any] | js.Object | Double
  
  trait Context extends StObject {
    
    var cookie: StringDictionary[String]
    
    var data: Any
    
    var error: js.Error
    
    var files: Files
    
    var headers: StringDictionary[String]
    
    var ip: String
    
    var ips: js.UndefOr[js.Array[String]] = js.undefined
    
    var log: keyinLogLevelLogFn
    
    var method: String
    
    var options: Options
    
    var params: StringDictionary[String]
    
    var path: String
    
    var query: StringDictionary[String | js.Array[String]]
    
    var req: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    var res: Response_[Any, Record[String, Any]]
    
    var secure: Boolean
    
    var session: js.Object
    
    var url: String
    
    var xhr: Boolean
  }
  object Context {
    
    inline def apply(
      cookie: StringDictionary[String],
      data: Any,
      error: js.Error,
      files: Files,
      headers: StringDictionary[String],
      ip: String,
      log: keyinLogLevelLogFn,
      method: String,
      options: Options,
      params: StringDictionary[String],
      path: String,
      query: StringDictionary[String | js.Array[String]],
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      secure: Boolean,
      session: js.Object,
      url: String,
      xhr: Boolean
    ): Context = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setCookie(value: StringDictionary[String]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      inline def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
      
      inline def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value*))
      
      inline def setLog(value: keyinLogLevelLogFn): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReq(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Response_[Any, Record[String, Any]]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSession(value: js.Object): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LogFn extends StObject {
    
    def apply(template: String, tokens: String*): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.server.serverStrings.emergency
    - typingsJapgolly.server.serverStrings.alert
    - typingsJapgolly.server.serverStrings.critical
    - typingsJapgolly.server.serverStrings.error
    - typingsJapgolly.server.serverStrings.warning
    - typingsJapgolly.server.serverStrings.notice
    - typingsJapgolly.server.serverStrings.info
    - typingsJapgolly.server.serverStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def alert: typingsJapgolly.server.serverStrings.alert = "alert".asInstanceOf[typingsJapgolly.server.serverStrings.alert]
    
    inline def critical: typingsJapgolly.server.serverStrings.critical = "critical".asInstanceOf[typingsJapgolly.server.serverStrings.critical]
    
    inline def debug: typingsJapgolly.server.serverStrings.debug = "debug".asInstanceOf[typingsJapgolly.server.serverStrings.debug]
    
    inline def emergency: typingsJapgolly.server.serverStrings.emergency = "emergency".asInstanceOf[typingsJapgolly.server.serverStrings.emergency]
    
    inline def error: typingsJapgolly.server.serverStrings.error = "error".asInstanceOf[typingsJapgolly.server.serverStrings.error]
    
    inline def info: typingsJapgolly.server.serverStrings.info = "info".asInstanceOf[typingsJapgolly.server.serverStrings.info]
    
    inline def notice: typingsJapgolly.server.serverStrings.notice = "notice".asInstanceOf[typingsJapgolly.server.serverStrings.notice]
    
    inline def warning: typingsJapgolly.server.serverStrings.warning = "warning".asInstanceOf[typingsJapgolly.server.serverStrings.warning]
  }
  
  type Middleware = js.Function1[/* ctx */ Context, Reply | BasicType | Unit]
  
  type Middlewares = js.Array[Middleware | js.Array[Middleware]]
}
