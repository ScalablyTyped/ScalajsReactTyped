package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Pathspec")
@js.native
class Pathspec ()
  extends typingsJapgolly.nodegit.pathSpecMod.Pathspec

/* static members */
@JSImport("nodegit", "Pathspec")
@js.native
object Pathspec extends js.Object {
  def create(pathspec: String): typingsJapgolly.nodegit.pathSpecMod.Pathspec = js.native
  def create(pathspec: js.Array[String]): typingsJapgolly.nodegit.pathSpecMod.Pathspec = js.native
  def create(pathspec: typingsJapgolly.nodegit.strArrayMod.Strarray): typingsJapgolly.nodegit.pathSpecMod.Pathspec = js.native
  def matchListDiffEntry(m: js.Any, pos: Double): typingsJapgolly.nodegit.diffDeltaMod.DiffDelta = js.native
  def matchListEntry(m: js.Any, pos: Double): String = js.native
  def matchListEntrycount(m: js.Any): Double = js.native
  def matchListFailedEntry(m: js.Any, pos: Double): String = js.native
  def matchListFailedEntrycount(m: js.Any): Double = js.native
}

