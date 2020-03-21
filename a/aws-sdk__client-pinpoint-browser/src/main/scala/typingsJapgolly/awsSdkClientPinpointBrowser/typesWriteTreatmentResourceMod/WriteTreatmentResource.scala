package typingsJapgolly.awsSdkClientPinpointBrowser.typesWriteTreatmentResourceMod

import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTreatmentResource extends js.Object {
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[
    typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageConfigurationMod.MessageConfiguration
  ] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesScheduleMod.Schedule] = js.undefined
  /**
    * The allocated percentage of users for this treatment.
    */
  var SizePercent: js.UndefOr[Double] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[String] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[String] = js.undefined
}

object WriteTreatmentResource {
  @scala.inline
  def apply(
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    SizePercent: Int | Double = null,
    TreatmentDescription: String = null,
    TreatmentName: String = null
  ): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SizePercent != null) __obj.updateDynamic("SizePercent")(SizePercent.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteTreatmentResource]
  }
}

