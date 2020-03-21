package typingsJapgolly.exceljs.mod.stream.xlsx

import typingsJapgolly.exceljs.PartialArchiverZipOptions
import typingsJapgolly.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookStreamWriterOptions extends WorkbookWriterOptions {
  /**
    * Specifies whether to add style information to the workbook.
    * Styles can add some performance overhead. Default is false
    */
  var zip: PartialArchiverZipOptions
}

object WorkbookStreamWriterOptions {
  @scala.inline
  def apply(
    filename: String,
    stream: Stream,
    useSharedStrings: Boolean,
    useStyles: Boolean,
    zip: PartialArchiverZipOptions
  ): WorkbookStreamWriterOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], useSharedStrings = useSharedStrings.asInstanceOf[js.Any], useStyles = useStyles.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkbookStreamWriterOptions]
  }
}

