package typingsJapgolly.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.APP_NOT_FOUND
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STAGING
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.UPDATING
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STARTING
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.FAILED_STAGING
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.FAILED
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STARTED
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.MXBUILD_STARTED
  - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STOPPED
*/
trait SuccessAppState extends js.Object

object SuccessAppState {
  @scala.inline
  def APP_NOT_FOUND: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.APP_NOT_FOUND = this.cast("APP_NOT_FOUND")
  @scala.inline
  def FAILED: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def FAILED_STAGING: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.FAILED_STAGING = this.cast("FAILED_STAGING")
  @scala.inline
  def MXBUILD_STARTED: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.MXBUILD_STARTED = this.cast("MXBUILD_STARTED")
  @scala.inline
  def STAGING: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STAGING = this.cast("STAGING")
  @scala.inline
  def STARTED: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STARTED = this.cast("STARTED")
  @scala.inline
  def STARTING: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STARTING = this.cast("STARTING")
  @scala.inline
  def STOPPED: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.STOPPED = this.cast("STOPPED")
  @scala.inline
  def UPDATING: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.UPDATING = this.cast("UPDATING")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

