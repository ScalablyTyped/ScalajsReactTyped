package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IEmailMessageInformation
import typingsJapgolly.mfiles.IFileInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FileInformation")
@js.native
class FileInformation () extends IFileInformation {
  /* CompleteClass */
  override var EmailMessage: IEmailMessageInformation = js.native
  /* CompleteClass */
  override var FileType: MFFileInformationType = js.native
  /* CompleteClass */
  override def Clear(): Unit = js.native
  /* CompleteClass */
  override def ExtractFromFile(PathToFile: String): Unit = js.native
}

@JSGlobal("MFiles.FileInformation")
@js.native
object FileInformation extends Instantiable0[IFileInformation]

