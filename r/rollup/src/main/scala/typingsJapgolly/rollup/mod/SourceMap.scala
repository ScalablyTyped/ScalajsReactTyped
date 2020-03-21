package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMap extends js.Object {
  var file: String
  var mappings: String
  var names: js.Array[String]
  var sources: js.Array[String]
  var sourcesContent: js.Array[String]
  var version: Double
  def toUrl(): String
}

object SourceMap {
  @scala.inline
  def apply(
    file: String,
    mappings: String,
    names: js.Array[String],
    sources: js.Array[String],
    sourcesContent: js.Array[String],
    toUrl: CallbackTo[String],
    version: Double
  ): SourceMap = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], sourcesContent = sourcesContent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("toUrl")(toUrl.toJsFn)
    __obj.asInstanceOf[SourceMap]
  }
}

