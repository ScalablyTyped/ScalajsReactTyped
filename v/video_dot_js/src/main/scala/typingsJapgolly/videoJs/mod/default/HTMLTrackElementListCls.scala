package typingsJapgolly.videoJs.mod.default

import org.scalajs.dom.raw.HTMLTrackElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "HTMLTrackElementList")
@js.native
/**
  * Create an instance of this class.
  *
  * @param [tracks=[]]
  *        A list of `HtmlTrackElement` to instantiate the list with.
  */
class HTMLTrackElementListCls ()
  extends typingsJapgolly.videoJs.mod.videojs.HTMLTrackElementList {
  def this(tracks: js.Array[HTMLTrackElement]) = this()
  /**
    * The current number of `Track`s in the this Trackist.
    */
  /* CompleteClass */
  override var length: Double = js.native
}

