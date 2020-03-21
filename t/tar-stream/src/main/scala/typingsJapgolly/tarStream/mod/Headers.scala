package typingsJapgolly.tarStream.mod

import typingsJapgolly.tarStream.tarStreamStrings.`block-device`
import typingsJapgolly.tarStream.tarStreamStrings.`character-device`
import typingsJapgolly.tarStream.tarStreamStrings.`contiguous-file`
import typingsJapgolly.tarStream.tarStreamStrings.`gnu-long-link-path`
import typingsJapgolly.tarStream.tarStreamStrings.`gnu-long-path`
import typingsJapgolly.tarStream.tarStreamStrings.`pax-global-header`
import typingsJapgolly.tarStream.tarStreamStrings.`pax-header`
import typingsJapgolly.tarStream.tarStreamStrings.directory
import typingsJapgolly.tarStream.tarStreamStrings.fifo
import typingsJapgolly.tarStream.tarStreamStrings.file
import typingsJapgolly.tarStream.tarStreamStrings.link
import typingsJapgolly.tarStream.tarStreamStrings.symlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var devmajor: js.UndefOr[Double] = js.undefined
  var devminor: js.UndefOr[Double] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var gname: js.UndefOr[String] = js.undefined
  var linkname: js.UndefOr[String | Null] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[js.Date] = js.undefined
  var name: String
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[
    file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` | Null
  ] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
  var uname: js.UndefOr[String] = js.undefined
}

object Headers {
  @scala.inline
  def apply(
    name: String,
    devmajor: Int | Double = null,
    devminor: Int | Double = null,
    gid: Int | Double = null,
    gname: String = null,
    linkname: String = null,
    mode: Int | Double = null,
    mtime: js.Date = null,
    size: Int | Double = null,
    `type`: file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` = null,
    uid: Int | Double = null,
    uname: String = null
  ): Headers = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (devmajor != null) __obj.updateDynamic("devmajor")(devmajor.asInstanceOf[js.Any])
    if (devminor != null) __obj.updateDynamic("devminor")(devminor.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (gname != null) __obj.updateDynamic("gname")(gname.asInstanceOf[js.Any])
    if (linkname != null) __obj.updateDynamic("linkname")(linkname.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (uname != null) __obj.updateDynamic("uname")(uname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

