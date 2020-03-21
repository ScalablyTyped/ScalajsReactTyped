package typingsJapgolly.appBuilderLib.appFileCopierMod

import typingsJapgolly.fsExtra.mod.Stats
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedFileSet extends js.Object {
  var destination: String
  var files: js.Array[String]
  var metadata: Map[String, Stats]
  var src: String
  var transformedFiles: js.UndefOr[(Map[Double, String | Buffer]) | Null] = js.undefined
}

object ResolvedFileSet {
  @scala.inline
  def apply(
    destination: String,
    files: js.Array[String],
    metadata: Map[String, Stats],
    src: String,
    transformedFiles: Map[Double, String | Buffer] = null
  ): ResolvedFileSet = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (transformedFiles != null) __obj.updateDynamic("transformedFiles")(transformedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedFileSet]
  }
}

