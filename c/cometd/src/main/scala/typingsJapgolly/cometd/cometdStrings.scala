package typingsJapgolly.cometd

import typingsJapgolly.cometd.mod.ConnectionType
import typingsJapgolly.cometd.mod.ReconnectAdvice
import typingsJapgolly.cometd.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cometdStrings {
  
  @js.native
  sealed trait `callback-polling`
    extends StObject
       with ConnectionType
  inline def `callback-polling`: `callback-polling` = "callback-polling".asInstanceOf[`callback-polling`]
  
  @js.native
  sealed trait connected
    extends StObject
       with Status
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting
    extends StObject
       with Status
  inline def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait debug extends StObject
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with Status
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting
    extends StObject
       with Status
  inline def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait flash
    extends StObject
       with ConnectionType
  inline def flash: flash = "flash".asInstanceOf[flash]
  
  @js.native
  sealed trait handshake
    extends StObject
       with ReconnectAdvice
  inline def handshake: handshake = "handshake".asInstanceOf[handshake]
  
  @js.native
  sealed trait handshaking
    extends StObject
       with Status
  inline def handshaking: handshaking = "handshaking".asInstanceOf[handshaking]
  
  @js.native
  sealed trait iframe
    extends StObject
       with ConnectionType
  inline def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait info extends StObject
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait `long-polling`
    extends StObject
       with ConnectionType
  inline def `long-polling`: `long-polling` = "long-polling".asInstanceOf[`long-polling`]
  
  @js.native
  sealed trait none
    extends StObject
       with ReconnectAdvice
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait retry
    extends StObject
       with ReconnectAdvice
  inline def retry: retry = "retry".asInstanceOf[retry]
  
  @js.native
  sealed trait warn extends StObject
  inline def warn: warn = "warn".asInstanceOf[warn]
}
