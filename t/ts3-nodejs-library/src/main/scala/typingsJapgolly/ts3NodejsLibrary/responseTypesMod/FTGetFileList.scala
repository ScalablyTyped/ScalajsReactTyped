package typingsJapgolly.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTGetFileList extends js.Object {
  var cid: Double
  var datetime: Double
  var name: String
  var path: String
  var size: Double
  /** 1=file 0=folder */
  var `type`: Double
}

object FTGetFileList {
  @scala.inline
  def apply(cid: Double, datetime: Double, name: String, path: String, size: Double, `type`: Double): FTGetFileList = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FTGetFileList]
  }
}

