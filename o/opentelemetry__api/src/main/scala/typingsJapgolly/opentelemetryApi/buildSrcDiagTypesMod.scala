package typingsJapgolly.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDiagTypesMod {
  
  @js.native
  sealed trait DiagLogLevel extends StObject
  @JSImport("@opentelemetry/api/build/src/diag/types", "DiagLogLevel")
  @js.native
  object DiagLogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DiagLogLevel & Double] = js.native
    
    /** Used to set the logging level to include all logging */
    @js.native
    sealed trait ALL
      extends StObject
         with DiagLogLevel
    /* 9999 */ val ALL: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ALL & Double = js.native
    
    /** General debug log message */
    @js.native
    sealed trait DEBUG
      extends StObject
         with DiagLogLevel
    /* 70 */ val DEBUG: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.DEBUG & Double = js.native
    
    /** Identifies an error scenario */
    @js.native
    sealed trait ERROR
      extends StObject
         with DiagLogLevel
    /* 30 */ val ERROR: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.ERROR & Double = js.native
    
    /** General informational log message */
    @js.native
    sealed trait INFO
      extends StObject
         with DiagLogLevel
    /* 60 */ val INFO: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.INFO & Double = js.native
    
    /** Diagnostic Logging level setting to disable all logging (except and forced logs) */
    @js.native
    sealed trait NONE
      extends StObject
         with DiagLogLevel
    /* 0 */ val NONE: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.NONE & Double = js.native
    
    /**
      * Detailed trace level logging should only be used for development, should only be set
      * in a development environment.
      */
    @js.native
    sealed trait VERBOSE
      extends StObject
         with DiagLogLevel
    /* 80 */ val VERBOSE: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.VERBOSE & Double = js.native
    
    /** Identifies a warning scenario */
    @js.native
    sealed trait WARN
      extends StObject
         with DiagLogLevel
    /* 50 */ val WARN: typingsJapgolly.opentelemetryApi.buildSrcDiagTypesMod.DiagLogLevel.WARN & Double = js.native
  }
  
  trait ComponentLoggerOptions extends StObject {
    
    var namespace: String
  }
  object ComponentLoggerOptions {
    
    inline def apply(namespace: String): ComponentLoggerOptions = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentLoggerOptions]
    }
    
    extension [Self <: ComponentLoggerOptions](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DiagLogFunction extends StObject {
    
    def apply(message: String, args: Any*): Unit = js.native
  }
  
  trait DiagLogger extends StObject {
    
    /**
      * Log a general debug message that can be useful for identifying a failure.
      * Information logged at this level may include diagnostic details that would
      * help identify a failure scenario.
      * For example: Logging the order of execution of async operations.
      */
    def debug(message: String, args: Any*): Unit
    /**
      * Log a general debug message that can be useful for identifying a failure.
      * Information logged at this level may include diagnostic details that would
      * help identify a failure scenario.
      * For example: Logging the order of execution of async operations.
      */
    @JSName("debug")
    var debug_Original: DiagLogFunction
    
    /** Log an error scenario that was not expected and caused the requested operation to fail. */
    def error(message: String, args: Any*): Unit
    /** Log an error scenario that was not expected and caused the requested operation to fail. */
    @JSName("error")
    var error_Original: DiagLogFunction
    
    /**
      * Log a general informational message, this should not affect functionality.
      * This is also the default logging level so this should NOT be used for logging
      * debugging level information.
      */
    def info(message: String, args: Any*): Unit
    /**
      * Log a general informational message, this should not affect functionality.
      * This is also the default logging level so this should NOT be used for logging
      * debugging level information.
      */
    @JSName("info")
    var info_Original: DiagLogFunction
    
    /**
      * Log a detailed (verbose) trace level logging that can be used to identify failures
      * where debug level logging would be insufficient, this level of tracing can include
      * input and output parameters and as such may include PII information passing through
      * the API. As such it is recommended that this level of tracing should not be enabled
      * in a production environment.
      */
    def verbose(message: String, args: Any*): Unit
    /**
      * Log a detailed (verbose) trace level logging that can be used to identify failures
      * where debug level logging would be insufficient, this level of tracing can include
      * input and output parameters and as such may include PII information passing through
      * the API. As such it is recommended that this level of tracing should not be enabled
      * in a production environment.
      */
    @JSName("verbose")
    var verbose_Original: DiagLogFunction
    
    /**
      * Log a warning scenario to inform the developer of an issues that should be investigated.
      * The requested operation may or may not have succeeded or completed.
      */
    def warn(message: String, args: Any*): Unit
    /**
      * Log a warning scenario to inform the developer of an issues that should be investigated.
      * The requested operation may or may not have succeeded or completed.
      */
    @JSName("warn")
    var warn_Original: DiagLogFunction
  }
  object DiagLogger {
    
    inline def apply(
      debug: DiagLogFunction,
      error: DiagLogFunction,
      info: DiagLogFunction,
      verbose: DiagLogFunction,
      warn: DiagLogFunction
    ): DiagLogger = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagLogger]
    }
    
    extension [Self <: DiagLogger](x: Self) {
      
      inline def setDebug(value: DiagLogFunction): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: DiagLogFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: DiagLogFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: DiagLogFunction): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: DiagLogFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
