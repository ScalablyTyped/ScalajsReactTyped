package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An audio-processing graph built from audio modules linked together, each represented by an AudioNode. */
@js.native
trait AudioContext
  extends StObject
     with BaseAudioContext {
  
  /* standard dom */
  val baseLatency: Double = js.native
  
  /* standard dom */
  def close(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def createMediaElementSource(mediaElement: org.scalajs.dom.HTMLMediaElement): org.scalajs.dom.MediaElementAudioSourceNode = js.native
  
  /* standard dom */
  def createMediaStreamDestination(): org.scalajs.dom.MediaStreamAudioDestinationNode = js.native
  
  /* standard dom */
  def createMediaStreamSource(mediaStream: org.scalajs.dom.MediaStream): org.scalajs.dom.MediaStreamAudioSourceNode = js.native
  
  /* standard dom */
  def getOutputTimestamp(): AudioTimestamp = js.native
  
  /* standard dom */
  val outputLatency: Double = js.native
  
  /* standard dom */
  def resume(): js.Promise[Unit] = js.native
  
  /* standard dom */
  def suspend(): js.Promise[Unit] = js.native
}
