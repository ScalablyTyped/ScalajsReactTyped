package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IArchiveOldVersionsJob
import typingsJapgolly.mfiles.IImpersonation
import typingsJapgolly.mfiles.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ArchiveOldVersionsJob")
@js.native
class ArchiveOldVersionsJob () extends IArchiveOldVersionsJob {
  /* CompleteClass */
  override var AtLeastNDaysOlder: Double = js.native
  /* CompleteClass */
  override var AtLeastNVersionsOlder: Double = js.native
  /* CompleteClass */
  override var CheckedInBefore: ITimestamp = js.native
  /* CompleteClass */
  override var Flags: MFExportContentFlag = js.native
  /* CompleteClass */
  override var Impersonation: IImpersonation = js.native
  /* CompleteClass */
  override var MarkedForArchiving: Boolean = js.native
  /* CompleteClass */
  override var NoVersionTag: Boolean = js.native
  /* CompleteClass */
  override var TargetLocation: String = js.native
  /* CompleteClass */
  override var UseAtLeastNDaysOlder: Boolean = js.native
  /* CompleteClass */
  override var UseAtLeastNVersionsOlder: Boolean = js.native
  /* CompleteClass */
  override var UseCheckedInBefore: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IArchiveOldVersionsJob = js.native
}

@JSGlobal("MFiles.ArchiveOldVersionsJob")
@js.native
object ArchiveOldVersionsJob extends Instantiable0[IArchiveOldVersionsJob]

