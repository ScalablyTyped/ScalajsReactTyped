package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardValue extends js.Object {
  val HasIcon: Boolean
  val ID: String
  val IconURL: String
  val IsMultiValue: Boolean
  val Item: Double
  val Name: String
  val State: js.Any
  val Version: Double
  def IsDeleted(): Boolean
  def IsHidden(): Boolean
}

object IMetadataCardValue {
  @scala.inline
  def apply(
    HasIcon: Boolean,
    ID: String,
    IconURL: String,
    IsDeleted: CallbackTo[Boolean],
    IsHidden: CallbackTo[Boolean],
    IsMultiValue: Boolean,
    Item: Double,
    Name: String,
    State: js.Any,
    Version: Double
  ): IMetadataCardValue = {
    val __obj = js.Dynamic.literal(HasIcon = HasIcon.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IconURL = IconURL.asInstanceOf[js.Any], IsMultiValue = IsMultiValue.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.updateDynamic("IsDeleted")(IsDeleted.toJsFn)
    __obj.updateDynamic("IsHidden")(IsHidden.toJsFn)
    __obj.asInstanceOf[IMetadataCardValue]
  }
}

