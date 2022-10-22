package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.compact
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.messages
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.off
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.verbose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TraceValues {
  
  /**
    * Compact message tracing.
    */
  @JSImport("vscode-languageserver-protocol", "TraceValues.Compact")
  @js.native
  val Compact: compact = js.native
  
  /**
    * Trace messages only.
    */
  @JSImport("vscode-languageserver-protocol", "TraceValues.Messages")
  @js.native
  val Messages: messages = js.native
  
  /**
    * Turn tracing off.
    */
  @JSImport("vscode-languageserver-protocol", "TraceValues.Off")
  @js.native
  val Off: off = js.native
  
  /**
    * Verbose message tracing.
    */
  @JSImport("vscode-languageserver-protocol", "TraceValues.Verbose")
  @js.native
  val Verbose: verbose = js.native
}
