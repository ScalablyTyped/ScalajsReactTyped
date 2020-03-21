package typingsJapgolly.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fsExtra.fsExtraStrings.dir
  - typingsJapgolly.fsExtra.fsExtraStrings.file
  - typingsJapgolly.fsExtra.fsExtraStrings.junction
*/
trait FsSymlinkType extends js.Object

object FsSymlinkType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dir: typingsJapgolly.fsExtra.fsExtraStrings.dir = this.cast("dir")
  @scala.inline
  def file: typingsJapgolly.fsExtra.fsExtraStrings.file = this.cast("file")
  @scala.inline
  def junction: typingsJapgolly.fsExtra.fsExtraStrings.junction = this.cast("junction")
}

