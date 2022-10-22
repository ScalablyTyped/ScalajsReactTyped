package typingsJapgolly.hlsJs.mod

import org.scalajs.dom.TextTrack
import typingsJapgolly.std.VTTCue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CuesInterface extends StObject {
  
  def newCue(track: TextTrack, startTime: Double, endTime: Double, captionScreen: CaptionScreen): js.Array[VTTCue] = js.native
  def newCue(track: Null, startTime: Double, endTime: Double, captionScreen: CaptionScreen): js.Array[VTTCue] = js.native
}
