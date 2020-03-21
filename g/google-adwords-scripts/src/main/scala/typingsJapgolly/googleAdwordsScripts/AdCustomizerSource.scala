package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdCustomizerSource extends AdWordsEntity {
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem]
  def getAttributes(): js.Object
  def getName(): String
  def items(): AdWordsSelector[AdCustomizerItem]
}

object AdCustomizerSource {
  @scala.inline
  def apply(
    adCustomizerItemBuilder: CallbackTo[AdCustomizerItemBuilder[AdCustomizerItem]],
    getAttributes: CallbackTo[js.Object],
    getName: CallbackTo[String],
    items: CallbackTo[AdWordsSelector[AdCustomizerItem]],
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adCustomizerItemBuilder")(adCustomizerItemBuilder.toJsFn)
    __obj.updateDynamic("getAttributes")(getAttributes.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("items")(items.toJsFn)
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[AdCustomizerSource]
  }
}

