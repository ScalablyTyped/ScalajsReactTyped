package typingsJapgolly.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.AnonContent
import typingsJapgolly.awsLambda.AnonContentType
import typingsJapgolly.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionElicitSlot
  extends LexDialogActionBase
     with LexDialogAction {
  var intentName: String
  var slotToElicit: String
  var slots: StringDictionary[String | Null]
  @JSName("type")
  var type_LexDialogActionElicitSlot: ElicitSlot
}

object LexDialogActionElicitSlot {
  @scala.inline
  def apply(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogActionElicitSlot = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionElicitSlot]
  }
}

