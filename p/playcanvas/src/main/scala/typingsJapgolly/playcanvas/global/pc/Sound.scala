package typingsJapgolly.playcanvas.global.pc

import org.scalajs.dom.AudioBuffer
import org.scalajs.dom.HTMLAudioElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of an audio asset.
  */
@JSGlobal("pc.Sound")
@js.native
open class Sound protected ()
  extends typingsJapgolly.playcanvas.mod.Sound {
  def this(resource: AudioBuffer) = this()
  /**
    * Create a new Sound instance.
    *
    * @param {HTMLAudioElement|AudioBuffer} resource - If the Web Audio API is supported, pass an
    * AudioBuffer object, otherwise an Audio object.
    */
  def this(resource: HTMLAudioElement) = this()
}
