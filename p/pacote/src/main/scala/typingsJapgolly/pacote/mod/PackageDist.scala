package typingsJapgolly.pacote.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageDist extends js.Object {
  var fileCount: js.UndefOr[Double] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var shasum: String
  var tarball: String
  var unpackedSize: js.UndefOr[Double] = js.undefined
}

object PackageDist {
  @scala.inline
  def apply(
    shasum: String,
    tarball: String,
    fileCount: Int | Double = null,
    integrity: String = null,
    unpackedSize: Int | Double = null
  ): PackageDist = {
    val __obj = js.Dynamic.literal(shasum = shasum.asInstanceOf[js.Any], tarball = tarball.asInstanceOf[js.Any])
    if (fileCount != null) __obj.updateDynamic("fileCount")(fileCount.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (unpackedSize != null) __obj.updateDynamic("unpackedSize")(unpackedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageDist]
  }
}

