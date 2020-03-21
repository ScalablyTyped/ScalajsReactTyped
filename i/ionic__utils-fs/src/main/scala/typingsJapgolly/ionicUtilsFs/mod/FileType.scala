package typingsJapgolly.ionicUtilsFs.mod

import typingsJapgolly.ionicUtilsFs.ionicUtilsFsStrings.directory
import typingsJapgolly.ionicUtilsFs.ionicUtilsFsStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionicUtilsFs.ionicUtilsFsStrings.file
  - typingsJapgolly.ionicUtilsFs.ionicUtilsFsStrings.directory
*/
trait FileType extends js.Object

object FileType {
  @scala.inline
  def DIRECTORY: directory = this.cast("directory")
  @scala.inline
  def FILE: file = this.cast("file")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

