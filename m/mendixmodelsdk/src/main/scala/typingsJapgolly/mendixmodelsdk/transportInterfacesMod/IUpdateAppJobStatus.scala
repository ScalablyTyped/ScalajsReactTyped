package typingsJapgolly.mendixmodelsdk.transportInterfacesMod

import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.failed_
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.started_
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.updating_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.updating_
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.resuming
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.provisioning
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.started_
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.failed_
*/
trait IUpdateAppJobStatus extends js.Object

object IUpdateAppJobStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def consistencyerrors: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.consistencyerrors = this.cast("consistencyerrors")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def provisioning: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.provisioning = this.cast("provisioning")
  @scala.inline
  def resuming: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.resuming = this.cast("resuming")
  @scala.inline
  def started: started_ = this.cast("started")
  @scala.inline
  def updating: updating_ = this.cast("updating")
}

