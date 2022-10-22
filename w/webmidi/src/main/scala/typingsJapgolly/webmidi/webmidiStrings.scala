package typingsJapgolly.webmidi

import typingsJapgolly.webmidi.WebMidi.MIDIPortConnectionState
import typingsJapgolly.webmidi.WebMidi.MIDIPortDeviceState
import typingsJapgolly.webmidi.WebMidi.MIDIPortType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webmidiStrings {
  
  @js.native
  sealed trait closed
    extends StObject
       with MIDIPortConnectionState
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait connected
    extends StObject
       with MIDIPortDeviceState
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with MIDIPortDeviceState
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait input
    extends StObject
       with MIDIPortType
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait midimessage extends StObject
  inline def midimessage: midimessage = "midimessage".asInstanceOf[midimessage]
  
  @js.native
  sealed trait open
    extends StObject
       with MIDIPortConnectionState
  inline def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait output
    extends StObject
       with MIDIPortType
  inline def output: output = "output".asInstanceOf[output]
  
  @js.native
  sealed trait pending
    extends StObject
       with MIDIPortConnectionState
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait statechange extends StObject
  inline def statechange: statechange = "statechange".asInstanceOf[statechange]
}
