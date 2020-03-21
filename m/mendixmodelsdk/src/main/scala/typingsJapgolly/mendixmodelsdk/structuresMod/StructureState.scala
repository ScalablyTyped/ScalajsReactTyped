package typingsJapgolly.mendixmodelsdk.structuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`new`
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.attached
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.detached
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.deleted
*/
trait StructureState extends js.Object

object StructureState {
  @scala.inline
  def attached: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.attached = this.cast("attached")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.deleted = this.cast("deleted")
  @scala.inline
  def detached: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.detached = this.cast("detached")
  @scala.inline
  def `new`: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.`new` = this.cast("new")
}

