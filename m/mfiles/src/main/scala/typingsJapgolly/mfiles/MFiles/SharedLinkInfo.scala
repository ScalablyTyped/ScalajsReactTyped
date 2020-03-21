package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IFileVer
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.ISharedLinkInfo
import typingsJapgolly.mfiles.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SharedLinkInfo")
@js.native
class SharedLinkInfo () extends ISharedLinkInfo {
  /* CompleteClass */
  override val AccessKey: String = js.native
  /* CompleteClass */
  override val CreatedByUser: Double = js.native
  /* CompleteClass */
  override val CreationTime: ITimestamp = js.native
  /* CompleteClass */
  override var Description: String = js.native
  /* CompleteClass */
  override var ExpirationTime: ITimestamp = js.native
  /* CompleteClass */
  override var FileVer: IFileVer = js.native
  /* CompleteClass */
  override var ObjVer: IObjVer = js.native
  /* CompleteClass */
  override def Clone(): ISharedLinkInfo = js.native
  /* CompleteClass */
  override def Set(ObjVer: IObjVer, FileVer: IFileVer): Unit = js.native
}

@JSGlobal("MFiles.SharedLinkInfo")
@js.native
object SharedLinkInfo extends Instantiable0[ISharedLinkInfo]

