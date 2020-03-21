package typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterMetadata extends js.Object {
  def getEntity(): String
  def getStyle(): DraftInlineStyle
  def hasStyle(style: String): Boolean
}

object CharacterMetadata {
  @scala.inline
  def apply(
    getEntity: CallbackTo[String],
    getStyle: CallbackTo[DraftInlineStyle],
    hasStyle: String => CallbackTo[Boolean]
  ): CharacterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntity")(getEntity.toJsFn)
    __obj.updateDynamic("getStyle")(getStyle.toJsFn)
    __obj.updateDynamic("hasStyle")(js.Any.fromFunction1((t0: java.lang.String) => hasStyle(t0).runNow()))
    __obj.asInstanceOf[CharacterMetadata]
  }
}

