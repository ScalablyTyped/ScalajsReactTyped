package typingsJapgolly.gulpTslint.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TslintFile extends js.Object {
  var contents: Buffer | js.Any
  var path: String
  var relative: String
  var tslint: js.Any
  def isNull(): Boolean
  def isStream(): Boolean
}

object TslintFile {
  @scala.inline
  def apply(
    contents: Buffer | js.Any,
    isNull: CallbackTo[Boolean],
    isStream: CallbackTo[Boolean],
    path: String,
    relative: String,
    tslint: js.Any
  ): TslintFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any])
    __obj.updateDynamic("isNull")(isNull.toJsFn)
    __obj.updateDynamic("isStream")(isStream.toJsFn)
    __obj.asInstanceOf[TslintFile]
  }
}

