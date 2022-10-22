package typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod

import typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.compact
import typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.messages
import typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.off
import typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.off
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.messages
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.compact
  - typingsJapgolly.vscodeJsonrpc.vscodeJsonrpcStrings.verbose
*/
trait TraceValues extends StObject
object TraceValues {
  
  /**
    * Compact message tracing.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Compact")
  @js.native
  val Compact: compact = js.native
  
  /**
    * Trace messages only.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Messages")
  @js.native
  val Messages: messages = js.native
  
  /**
    * Turn tracing off.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Off")
  @js.native
  val Off: off = js.native
  
  /**
    * Verbose message tracing.
    */
  @JSImport("vscode-jsonrpc/lib/common/connection", "TraceValues.Verbose")
  @js.native
  val Verbose: verbose = js.native
}
