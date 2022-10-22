package typingsJapgolly.sentryTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSeverityMod {
  
  @js.native
  sealed trait Severity extends StObject
  @JSImport("@sentry/types/types/severity", "Severity")
  @js.native
  object Severity extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Severity & String] = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Debug
      extends StObject
         with Severity
    /* "debug" */ val Debug: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Debug & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Error
      extends StObject
         with Severity
    /* "error" */ val Error: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Error & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Fatal
      extends StObject
         with Severity
    /* "fatal" */ val Fatal: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Fatal & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Info
      extends StObject
         with Severity
    /* "info" */ val Info: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Info & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Log
      extends StObject
         with Severity
    /* "log" */ val Log: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Log & String = js.native
    
    /** JSDoc */
    @js.native
    sealed trait Warning
      extends StObject
         with Severity
    /* "warning" */ val Warning: typingsJapgolly.sentryTypes.typesSeverityMod.Severity.Warning & String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings.fatal
    - typingsJapgolly.sentryTypes.sentryTypesStrings.error
    - typingsJapgolly.sentryTypes.sentryTypesStrings.warning
    - typingsJapgolly.sentryTypes.sentryTypesStrings.log
    - typingsJapgolly.sentryTypes.sentryTypesStrings.info
    - typingsJapgolly.sentryTypes.sentryTypesStrings.debug
  */
  trait SeverityLevel extends StObject
  object SeverityLevel {
    
    inline def debug: typingsJapgolly.sentryTypes.sentryTypesStrings.debug = "debug".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.debug]
    
    inline def error: typingsJapgolly.sentryTypes.sentryTypesStrings.error = "error".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.error]
    
    inline def fatal: typingsJapgolly.sentryTypes.sentryTypesStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.fatal]
    
    inline def info: typingsJapgolly.sentryTypes.sentryTypesStrings.info = "info".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.info]
    
    inline def log: typingsJapgolly.sentryTypes.sentryTypesStrings.log = "log".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.log]
    
    inline def warning: typingsJapgolly.sentryTypes.sentryTypesStrings.warning = "warning".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.warning]
  }
}
