package typingsJapgolly.pino

import typingsJapgolly.pino.mod.pino.Level
import typingsJapgolly.pino.mod.pino.LevelWithSilent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinoStrings {
  
  @js.native
  sealed trait debug
    extends StObject
       with Level
       with LevelWithSilent
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with Level
       with LevelWithSilent
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal
    extends StObject
       with Level
       with LevelWithSilent
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with Level
       with LevelWithSilent
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `level-change` extends StObject
  inline def `level-change`: `level-change` = "level-change".asInstanceOf[`level-change`]
  
  @js.native
  sealed trait silent
    extends StObject
       with LevelWithSilent
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait trace
    extends StObject
       with Level
       with LevelWithSilent
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn
    extends StObject
       with Level
       with LevelWithSilent
  inline def warn: warn = "warn".asInstanceOf[warn]
}
