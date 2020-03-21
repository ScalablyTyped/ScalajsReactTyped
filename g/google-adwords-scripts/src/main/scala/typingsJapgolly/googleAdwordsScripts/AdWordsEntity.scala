package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generics
trait AdWordsEntity extends js.Object {
  var getEntityType: js.UndefOr[js.Function0[String]] = js.undefined
}

object AdWordsEntity {
  @scala.inline
  def apply(getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[AdWordsEntity]
  }
}

