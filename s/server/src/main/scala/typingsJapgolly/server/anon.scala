package typingsJapgolly.server

import japgolly.scalajs.react.Callback
import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.bodyParser.mod.OptionsText
import typingsJapgolly.bodyParser.mod.OptionsUrlencoded
import typingsJapgolly.express.mod.CookieOptions
import typingsJapgolly.server.serverBooleans.`false`
import typingsJapgolly.server.typingsCommonMod.LogFn
import typingsJapgolly.server.typingsCommonMod.LogLevel
import typingsJapgolly.server.typingsOptionsMod.CsurfOptions
import typingsJapgolly.server.typingsOptionsMod.DataParserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.UndefOr[OptionsUrlencoded] = js.undefined
    
    var cookie: js.UndefOr[CookieOptions] = js.undefined
    
    var data: js.UndefOr[DataParserOptions] = js.undefined
    
    var json: js.UndefOr[OptionsJson] = js.undefined
    
    var text: js.UndefOr[OptionsText] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: OptionsUrlencoded): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCookie(value: CookieOptions): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setData(value: DataParserOptions): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setJson(value: OptionsJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setText(value: OptionsText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Csrf extends StObject {
    
    var csrf: js.UndefOr[`false` | CsurfOptions] = js.undefined
  }
  object Csrf {
    
    inline def apply(): Csrf = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Csrf]
    }
    
    extension [Self <: Csrf](x: Self) {
      
      inline def setCsrf(value: `false` | CsurfOptions): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
      
      inline def setCsrfUndefined: Self = StObject.set(x, "csrf", js.undefined)
    }
  }
  
  trait Level extends StObject {
    
    var level: LogLevel
    
    def report(content: String, `type`: LogLevel): Unit
  }
  object Level {
    
    inline def apply(level: LogLevel, report: (String, LogLevel) => Callback): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], report = js.Any.fromFunction2((t0: String, t1: LogLevel) => (report(t0, t1)).runNow()))
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setReport(value: (String, LogLevel) => Callback): Self = StObject.set(x, "report", js.Any.fromFunction2((t0: String, t1: LogLevel) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Inlined {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn} */
  trait keyinLogLevelLogFn extends StObject {
    
    def alert(template: String, tokens: String*): Unit
    @JSName("alert")
    var alert_Original: LogFn
    
    def critical(template: String, tokens: String*): Unit
    @JSName("critical")
    var critical_Original: LogFn
    
    def debug(template: String, tokens: String*): Unit
    @JSName("debug")
    var debug_Original: LogFn
    
    def emergency(template: String, tokens: String*): Unit
    @JSName("emergency")
    var emergency_Original: LogFn
    
    def error(template: String, tokens: String*): Unit
    @JSName("error")
    var error_Original: LogFn
    
    def info(template: String, tokens: String*): Unit
    @JSName("info")
    var info_Original: LogFn
    
    def notice(template: String, tokens: String*): Unit
    @JSName("notice")
    var notice_Original: LogFn
    
    def warning(template: String, tokens: String*): Unit
    @JSName("warning")
    var warning_Original: LogFn
  }
  object keyinLogLevelLogFn {
    
    inline def apply(
      alert: LogFn,
      critical: LogFn,
      debug: LogFn,
      emergency: LogFn,
      error: LogFn,
      info: LogFn,
      notice: LogFn,
      warning: LogFn
    ): keyinLogLevelLogFn = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emergency = emergency.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinLogLevelLogFn]
    }
    
    extension [Self <: keyinLogLevelLogFn](x: Self) {
      
      inline def setAlert(value: LogFn): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setCritical(value: LogFn): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: LogFn): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setEmergency(value: LogFn): Self = StObject.set(x, "emergency", value.asInstanceOf[js.Any])
      
      inline def setError(value: LogFn): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: LogFn): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: LogFn): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: LogFn): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
}
