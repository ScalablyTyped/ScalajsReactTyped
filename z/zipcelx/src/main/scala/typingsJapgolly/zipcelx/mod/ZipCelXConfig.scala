package typingsJapgolly.zipcelx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipCelXConfig extends js.Object {
  /**
    * The file name of the exported file
    */
  var filename: String
  /**
    * The sheet to be exported as an .xlsx file
    */
  var sheet: ZipCelXSheet
}

object ZipCelXConfig {
  @scala.inline
  def apply(filename: String, sheet: ZipCelXSheet): ZipCelXConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZipCelXConfig]
  }
}

