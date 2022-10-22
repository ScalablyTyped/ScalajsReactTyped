package typingsJapgolly.vscodeJsonrpc

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.TraceValues
import typingsJapgolly.vscodeJsonrpc.libCommonMessagesMod.LSPMessageType
import typingsJapgolly.vscodeJsonrpc.libCommonRalMod.MessageBufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vscodeJsonrpcStrings {
  
  @js.native
  sealed trait LinkedMap extends StObject
  inline def LinkedMap: LinkedMap = "LinkedMap".asInstanceOf[LinkedMap]
  
  @js.native
  sealed trait ascii
    extends StObject
       with MessageBufferEncoding
  inline def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait compact
    extends StObject
       with TraceValues
  inline def compact: compact = "compact".asInstanceOf[compact]
  
  @js.native
  sealed trait messages
    extends StObject
       with TraceValues
  inline def messages: messages = "messages".asInstanceOf[messages]
  
  @js.native
  sealed trait off
    extends StObject
       with TraceValues
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait `receive-notification`
    extends StObject
       with LSPMessageType
  inline def `receive-notification`: `receive-notification` = "receive-notification".asInstanceOf[`receive-notification`]
  
  @js.native
  sealed trait `receive-request`
    extends StObject
       with LSPMessageType
  inline def `receive-request`: `receive-request` = "receive-request".asInstanceOf[`receive-request`]
  
  @js.native
  sealed trait `receive-response`
    extends StObject
       with LSPMessageType
  inline def `receive-response`: `receive-response` = "receive-response".asInstanceOf[`receive-response`]
  
  @js.native
  sealed trait `send-notification`
    extends StObject
       with LSPMessageType
  inline def `send-notification`: `send-notification` = "send-notification".asInstanceOf[`send-notification`]
  
  @js.native
  sealed trait `send-request`
    extends StObject
       with LSPMessageType
  inline def `send-request`: `send-request` = "send-request".asInstanceOf[`send-request`]
  
  @js.native
  sealed trait `send-response`
    extends StObject
       with LSPMessageType
  inline def `send-response`: `send-response` = "send-response".asInstanceOf[`send-response`]
  
  @js.native
  sealed trait `utf-8`
    extends StObject
       with MessageBufferEncoding
  inline def `utf-8`: `utf-8` = "utf-8".asInstanceOf[`utf-8`]
  
  @js.native
  sealed trait verbose
    extends StObject
       with TraceValues
  inline def verbose: verbose = "verbose".asInstanceOf[verbose]
}
