package typingsJapgolly.jestHasteMap.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasteImpl extends js.Object {
  def getHasteName(filePath: Path): js.UndefOr[String]
}

object HasteImpl {
  @scala.inline
  def apply(getHasteName: Path => CallbackTo[js.UndefOr[String]]): HasteImpl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getHasteName")(js.Any.fromFunction1((t0: typingsJapgolly.jestTypes.configMod.Path) => getHasteName(t0).runNow()))
    __obj.asInstanceOf[HasteImpl]
  }
}

