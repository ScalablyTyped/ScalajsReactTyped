package typingsJapgolly.rnFetchBlob.mod

import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.directory
import typingsJapgolly.rnFetchBlob.rnFetchBlobStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rn-fetch-blob", "RNFetchBlobStat")
@js.native
class RNFetchBlobStat () extends js.Object {
  var filename: String = js.native
  var lastModified: String = js.native
  var path: String = js.native
  var size: String = js.native
  var `type`: directory | file = js.native
}

