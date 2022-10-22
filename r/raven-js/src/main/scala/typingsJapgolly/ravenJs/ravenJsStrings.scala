package typingsJapgolly.ravenJs

import typingsJapgolly.ravenJs.mod.BreadcrumbType
import typingsJapgolly.ravenJs.mod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ravenJsStrings {
  
  @js.native
  sealed trait critical
    extends StObject
       with LogLevel
  inline def critical: critical = "critical".asInstanceOf[critical]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevel
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait http
    extends StObject
       with BreadcrumbType
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait log
    extends StObject
       with LogLevel
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait navigation
    extends StObject
       with BreadcrumbType
  inline def navigation: navigation = "navigation".asInstanceOf[navigation]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait warning
    extends StObject
       with LogLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
}
