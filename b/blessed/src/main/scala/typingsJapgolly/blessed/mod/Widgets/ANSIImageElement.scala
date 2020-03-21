package typingsJapgolly.blessed.mod.Widgets

import typingsJapgolly.blessed.mod.Widgets.Types.TImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Convert any .png file (or .gif, see below) to an ANSI image and display it as an element.
  */
@JSImport("blessed", "Widgets.ANSIImageElement")
@js.native
class ANSIImageElement () extends BoxElement {
  def this(options: ANSIImageOptions) = this()
  /**
    * Image object from the png reader.
    */
  var img: TImage = js.native
  @JSName("options")
  var options_ANSIImageElement: ANSIImageOptions = js.native
  /**
    * clear the current image.
    */
  def clearImage(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Pause animation.
    */
  def pause(): Unit = js.native
  /**
    * Play animation if it has been paused or stopped.
    */
  def play(): Unit = js.native
  /**
    * set the image in the box to a new path.
    */
  def setImage(img: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Stop animation.
    */
  def stop(): Unit = js.native
}

