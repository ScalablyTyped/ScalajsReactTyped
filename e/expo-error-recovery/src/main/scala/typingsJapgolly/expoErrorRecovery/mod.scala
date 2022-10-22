package typingsJapgolly.expoErrorRecovery

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-error-recovery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("expo-error-recovery", "recoveredProps")
  @js.native
  val recoveredProps: ErrorRecoveryProps | Null = js.native
  
  inline def setRecoveryProps(props: ErrorRecoveryProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRecoveryProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ErrorRecoveryProps = Record[String, Any]
}
