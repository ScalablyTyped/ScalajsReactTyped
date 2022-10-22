package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.complete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An AudioContext interface representing an audio-processing graph built from linked together AudioNodes. In contrast with a standard AudioContext, an OfflineAudioContext doesn't render the audio to the device hardware; instead, it generates it, as fast as it can, and outputs the result to an AudioBuffer. */
@js.native
trait OfflineAudioContext
  extends StObject
     with BaseAudioContext {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  var oncomplete: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    `type`: complete,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.OfflineAudioCompletionEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /* standard dom */
  def resume(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def startRendering(): js.Promise[org.scalajs.dom.AudioBuffer] = js.native
  
  /* standard dom */
  def suspend(suspendTime: Double): js.Promise[Unit] = js.native
}
