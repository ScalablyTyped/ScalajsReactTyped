package typingsJapgolly.babylonjs.mod

import org.scalajs.dom.AudioContext
import org.scalajs.dom.AudioDestinationNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MediaStreamAudioDestinationNode
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "AudioEngine")
@js.native
/**
  * Instantiates a new audio engine.
  *
  * There should be only one per page as some browsers restrict the number
  * of audio contexts you can create.
  * @param hostElement defines the host element where to display the mute icon if necessary
  * @param audioContext defines the audio context to be used by the audio engine
  * @param audioDestination defines the audio destination node to be used by audio engine
  */
open class AudioEngine ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.AudioEngine {
  def this(hostElement: Nullable[HTMLElement]) = this()
  def this(hostElement: Unit, audioContext: Nullable[AudioContext]) = this()
  def this(hostElement: Nullable[HTMLElement], audioContext: Nullable[AudioContext]) = this()
  def this(
    hostElement: Unit,
    audioContext: Unit,
    audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
  ) = this()
  def this(
    hostElement: Unit,
    audioContext: Nullable[AudioContext],
    audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
  ) = this()
  def this(
    hostElement: Nullable[HTMLElement],
    audioContext: Unit,
    audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
  ) = this()
  def this(
    hostElement: Nullable[HTMLElement],
    audioContext: Nullable[AudioContext],
    audioDestination: Nullable[AudioDestinationNode | MediaStreamAudioDestinationNode]
  ) = this()
}
