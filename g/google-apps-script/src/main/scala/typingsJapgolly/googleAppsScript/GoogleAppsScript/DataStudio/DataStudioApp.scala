package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataStudioApp allows scripts to interact with developer-oriented features for Data Studio.
  */
trait DataStudioApp extends js.Object {
  def createCommunityConnector(): CommunityConnector
}

object DataStudioApp {
  @scala.inline
  def apply(createCommunityConnector: CallbackTo[CommunityConnector]): DataStudioApp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createCommunityConnector")(createCommunityConnector.toJsFn)
    __obj.asInstanceOf[DataStudioApp]
  }
}

