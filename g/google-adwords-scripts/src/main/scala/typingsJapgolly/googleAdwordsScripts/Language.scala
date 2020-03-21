package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language
  extends AdWordsEntity
     with isCampaignChild {
  def getCampaignType(): CampaignType
  def getId(): Double
  def getName(): String
  def getVideoCampaign(): Campaign
   // TODO: VideoCampaign
  def remove(): Unit
}

object Language {
  @scala.inline
  def apply(
    getCampaign: CallbackTo[Campaign],
    getCampaignType: CallbackTo[CampaignType],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getVideoCampaign: CallbackTo[Campaign],
    remove: Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): Language = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getCampaignType")(getCampaignType.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getVideoCampaign")(getVideoCampaign.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[Language]
  }
}

