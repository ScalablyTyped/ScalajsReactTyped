package typingsJapgolly.dropboxChooser.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit
  - typingsJapgolly.dropboxChooser.dropboxChooserStrings.crop
  - typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow
*/
trait ChooserFileMode extends js.Object

object ChooserFileMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def crop: typingsJapgolly.dropboxChooser.dropboxChooserStrings.crop = this.cast("crop")
  @scala.inline
  def fit: typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit = this.cast("fit")
  @scala.inline
  def fit_one_and_overflow: typingsJapgolly.dropboxChooser.dropboxChooserStrings.fit_one_and_overflow = this.cast("fit_one_and_overflow")
}

