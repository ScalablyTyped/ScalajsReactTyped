package typingsJapgolly.objFileParser.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Class module */
trait ObjFileParser extends js.Object {
  def parse(): ObjFile
}

object ObjFileParser {
  @scala.inline
  def apply(parse: CallbackTo[ObjFile]): ObjFileParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse.toJsFn)
    __obj.asInstanceOf[ObjFileParser]
  }
}

