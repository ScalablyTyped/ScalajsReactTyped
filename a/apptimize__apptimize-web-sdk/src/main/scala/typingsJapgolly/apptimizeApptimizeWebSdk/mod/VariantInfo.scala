package typingsJapgolly.apptimizeApptimizeWebSdk.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantInfo extends js.Object {
  def getAnonymousUserId(): String
  def getCurrentPhase(): Double
  def getCycle(): Double
  def getExperimentId(): Double
  def getExperimentName(): String
  def getExperimentType(): Double
  def getExperimentTypeName(): String
  def getParticipationPhase(): Double
  def getUserHasParticipated(): Boolean
  def getUserId(): String
  def getVariantId(): Double
  def getVariantName(): String
}

object VariantInfo {
  @scala.inline
  def apply(
    getAnonymousUserId: CallbackTo[String],
    getCurrentPhase: CallbackTo[Double],
    getCycle: CallbackTo[Double],
    getExperimentId: CallbackTo[Double],
    getExperimentName: CallbackTo[String],
    getExperimentType: CallbackTo[Double],
    getExperimentTypeName: CallbackTo[String],
    getParticipationPhase: CallbackTo[Double],
    getUserHasParticipated: CallbackTo[Boolean],
    getUserId: CallbackTo[String],
    getVariantId: CallbackTo[Double],
    getVariantName: CallbackTo[String]
  ): VariantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAnonymousUserId")(getAnonymousUserId.toJsFn)
    __obj.updateDynamic("getCurrentPhase")(getCurrentPhase.toJsFn)
    __obj.updateDynamic("getCycle")(getCycle.toJsFn)
    __obj.updateDynamic("getExperimentId")(getExperimentId.toJsFn)
    __obj.updateDynamic("getExperimentName")(getExperimentName.toJsFn)
    __obj.updateDynamic("getExperimentType")(getExperimentType.toJsFn)
    __obj.updateDynamic("getExperimentTypeName")(getExperimentTypeName.toJsFn)
    __obj.updateDynamic("getParticipationPhase")(getParticipationPhase.toJsFn)
    __obj.updateDynamic("getUserHasParticipated")(getUserHasParticipated.toJsFn)
    __obj.updateDynamic("getUserId")(getUserId.toJsFn)
    __obj.updateDynamic("getVariantId")(getVariantId.toJsFn)
    __obj.updateDynamic("getVariantName")(getVariantName.toJsFn)
    __obj.asInstanceOf[VariantInfo]
  }
}

