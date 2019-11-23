package typingsJapgolly.atEmotionCore.atEmotionCoreMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesProps[Theme] extends js.Object {
  def children(content: ClassNamesContent[Theme]): Node
}

object ClassNamesProps {
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => CallbackTo[Node]): ClassNamesProps[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atEmotionCore.atEmotionCoreMod.ClassNamesContent[Theme]) => children(t0).runNow()))
    __obj.asInstanceOf[ClassNamesProps[Theme]]
  }
}

