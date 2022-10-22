package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A generic interface for representing an audio processing module. Examples include: */
@js.native
trait AudioNode
  extends StObject
     with EventTarget {
  
  /* standard dom */
  var channelCount: Double = js.native
  
  /* standard dom */
  var channelCountMode: ChannelCountMode = js.native
  
  /* standard dom */
  var channelInterpretation: ChannelInterpretation = js.native
  
  /* standard dom */
  def connect(destinationNode: org.scalajs.dom.AudioNode): org.scalajs.dom.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.AudioNode, output: Double): org.scalajs.dom.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.AudioNode, output: Double, input: Double): org.scalajs.dom.AudioNode = js.native
  def connect(destinationNode: org.scalajs.dom.AudioNode, output: Unit, input: Double): org.scalajs.dom.AudioNode = js.native
  /* standard dom */
  def connect(destinationParam: org.scalajs.dom.AudioParam): Unit = js.native
  def connect(destinationParam: org.scalajs.dom.AudioParam, output: Double): Unit = js.native
  
  /* standard dom */
  val context: BaseAudioContext = js.native
  
  /* standard dom */
  def disconnect(): Unit = js.native
  /* standard dom */
  def disconnect(destinationNode: org.scalajs.dom.AudioNode): Unit = js.native
  /* standard dom */
  def disconnect(destinationNode: org.scalajs.dom.AudioNode, output: Double): Unit = js.native
  /* standard dom */
  def disconnect(destinationNode: org.scalajs.dom.AudioNode, output: Double, input: Double): Unit = js.native
  /* standard dom */
  def disconnect(destinationParam: org.scalajs.dom.AudioParam): Unit = js.native
  /* standard dom */
  def disconnect(destinationParam: org.scalajs.dom.AudioParam, output: Double): Unit = js.native
  /* standard dom */
  def disconnect(output: Double): Unit = js.native
  
  /* standard dom */
  val numberOfInputs: Double = js.native
  
  /* standard dom */
  val numberOfOutputs: Double = js.native
}
