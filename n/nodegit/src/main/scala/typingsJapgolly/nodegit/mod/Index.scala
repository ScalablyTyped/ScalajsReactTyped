package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Index")
@js.native
class Index ()
  extends typingsJapgolly.nodegit.indexMod.Index

/* static members */
@JSImport("nodegit", "Index")
@js.native
object Index extends js.Object {
  def entryIsConflict(entry: typingsJapgolly.nodegit.indexEntryMod.IndexEntry): Boolean = js.native
  def entryStage(entry: typingsJapgolly.nodegit.indexEntryMod.IndexEntry): Double = js.native
  def open(indexPath: String): js.Promise[typingsJapgolly.nodegit.indexMod.Index] = js.native
}

