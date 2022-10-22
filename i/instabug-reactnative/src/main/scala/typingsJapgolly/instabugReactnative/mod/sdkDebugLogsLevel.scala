package typingsJapgolly.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait sdkDebugLogsLevel extends StObject
@JSImport("instabug-reactnative", "sdkDebugLogsLevel")
@js.native
object sdkDebugLogsLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[sdkDebugLogsLevel & Double] = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelDebug
    extends StObject
       with sdkDebugLogsLevel
  /* 1 */ val sdkDebugLogsLevelDebug: typingsJapgolly.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelDebug & Double = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelError
    extends StObject
       with sdkDebugLogsLevel
  /* 2 */ val sdkDebugLogsLevelError: typingsJapgolly.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelError & Double = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelNone
    extends StObject
       with sdkDebugLogsLevel
  /* 3 */ val sdkDebugLogsLevelNone: typingsJapgolly.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelNone & Double = js.native
  
  @js.native
  sealed trait sdkDebugLogsLevelVerbose
    extends StObject
       with sdkDebugLogsLevel
  /* 0 */ val sdkDebugLogsLevelVerbose: typingsJapgolly.instabugReactnative.mod.sdkDebugLogsLevel.sdkDebugLogsLevelVerbose & Double = js.native
}
