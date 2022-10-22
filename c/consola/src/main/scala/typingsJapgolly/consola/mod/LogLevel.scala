package typingsJapgolly.consola.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LogLevel extends StObject
@JSImport("consola", "LogLevel")
@js.native
object LogLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
  
  @js.native
  sealed trait Debug
    extends StObject
       with LogLevel
  /* 4 */ val Debug: typingsJapgolly.consola.mod.LogLevel.Debug & Double = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with LogLevel
  /* 0 */ val Error: typingsJapgolly.consola.mod.LogLevel.Error & Double = js.native
  
  @js.native
  sealed trait Fatal
    extends StObject
       with LogLevel
  /* 0 */ val Fatal: typingsJapgolly.consola.mod.LogLevel.Fatal & Double = js.native
  
  @js.native
  sealed trait Info
    extends StObject
       with LogLevel
  /* 3 */ val Info: typingsJapgolly.consola.mod.LogLevel.Info & Double = js.native
  
  @js.native
  sealed trait Log
    extends StObject
       with LogLevel
  /* 2 */ val Log: typingsJapgolly.consola.mod.LogLevel.Log & Double = js.native
  
  @js.native
  sealed trait Silent
    extends StObject
       with LogLevel
  /* -Infinity */ val Silent: typingsJapgolly.consola.mod.LogLevel.Silent & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with LogLevel
  /* 3 */ val Success: typingsJapgolly.consola.mod.LogLevel.Success & Double = js.native
  
  @js.native
  sealed trait Trace
    extends StObject
       with LogLevel
  /* 5 */ val Trace: typingsJapgolly.consola.mod.LogLevel.Trace & Double = js.native
  
  @js.native
  sealed trait Verbose
    extends StObject
       with LogLevel
  /* Infinity */ val Verbose: typingsJapgolly.consola.mod.LogLevel.Verbose & Double = js.native
  
  @js.native
  sealed trait Warn
    extends StObject
       with LogLevel
  /* 1 */ val Warn: typingsJapgolly.consola.mod.LogLevel.Warn & Double = js.native
}
