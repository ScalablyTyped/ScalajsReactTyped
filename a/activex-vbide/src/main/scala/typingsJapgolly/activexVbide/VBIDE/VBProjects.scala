package typingsJapgolly.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VBProjects extends js.Object {
  val Count: Double = js.native
  val Parent: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
  def apply(index: js.Any): VBProject = js.native
  def Add(Type: vbextProjectType): VBProject = js.native
  def Item(index: js.Any): VBProject = js.native
  def Open(bstrPath: String): VBProject = js.native
  def Remove(lpc: VBProject): Unit = js.native
}

