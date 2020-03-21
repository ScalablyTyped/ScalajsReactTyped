package typingsJapgolly.parentPackageJson.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentPackage extends js.Object {
  var path: String
  def parse(): StringDictionary[js.Any]
  def read(): String
}

object ParentPackage {
  @scala.inline
  def apply(parse: CallbackTo[StringDictionary[js.Any]], path: String, read: CallbackTo[String]): ParentPackage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("parse")(parse.toJsFn)
    __obj.updateDynamic("read")(read.toJsFn)
    __obj.asInstanceOf[ParentPackage]
  }
}

