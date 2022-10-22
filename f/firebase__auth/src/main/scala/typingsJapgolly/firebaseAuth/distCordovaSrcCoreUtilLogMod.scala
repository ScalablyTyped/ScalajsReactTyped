package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCordovaSrcCoreUtilLogMod {
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth/dist/cordova/src/core/util/log", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val DEBUG: typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel.DEBUG & Double = js.native
    
    /* 4 */ val ERROR: typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel.ERROR & Double = js.native
    
    /* 2 */ val INFO: typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel.INFO & Double = js.native
    
    /* 5 */ val SILENT: typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel.SILENT & Double = js.native
    
    /* 1 */ val VERBOSE: typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel.VERBOSE & Double = js.native
    
    /* 3 */ val WARN: typingsJapgolly.firebaseLogger.distSrcLoggerMod.LogLevel.WARN & Double = js.native
  }
  
  inline def getLogLevel(): LogLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("_getLogLevel")().asInstanceOf[LogLevel]
  
  inline def logDebug(msg: String, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logDebug")(scala.List(msg.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def logError(msg: String, args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_logError")(scala.List(msg.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def setLogLevel(newLevel: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setLogLevel")(newLevel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
