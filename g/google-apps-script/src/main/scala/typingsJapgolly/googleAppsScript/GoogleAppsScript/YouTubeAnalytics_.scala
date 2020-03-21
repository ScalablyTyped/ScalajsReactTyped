package typingsJapgolly.googleAppsScript.GoogleAppsScript

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupItemsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.GroupsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Collection.ReportsCollection
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.ErrorProto
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Errors
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.Group
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupContentDetails
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItem
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupItemResource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTubeAnalytics.Schema.GroupSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeAnalytics_ extends js.Object {
  var GroupItems: js.UndefOr[GroupItemsCollection] = js.undefined
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  var Reports: js.UndefOr[ReportsCollection] = js.undefined
  // Create a new instance of ErrorProto
  def newErrorProto(): ErrorProto
  // Create a new instance of Errors
  def newErrors(): Errors
  // Create a new instance of Group
  def newGroup(): Group
  // Create a new instance of GroupContentDetails
  def newGroupContentDetails(): GroupContentDetails
  // Create a new instance of GroupItem
  def newGroupItem(): GroupItem
  // Create a new instance of GroupItemResource
  def newGroupItemResource(): GroupItemResource
  // Create a new instance of GroupSnippet
  def newGroupSnippet(): GroupSnippet
}

object YouTubeAnalytics_ {
  @scala.inline
  def apply(
    newErrorProto: CallbackTo[ErrorProto],
    newErrors: CallbackTo[Errors],
    newGroup: CallbackTo[Group],
    newGroupContentDetails: CallbackTo[GroupContentDetails],
    newGroupItem: CallbackTo[GroupItem],
    newGroupItemResource: CallbackTo[GroupItemResource],
    newGroupSnippet: CallbackTo[GroupSnippet],
    GroupItems: GroupItemsCollection = null,
    Groups: GroupsCollection = null,
    Reports: ReportsCollection = null
  ): YouTubeAnalytics_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newErrorProto")(newErrorProto.toJsFn)
    __obj.updateDynamic("newErrors")(newErrors.toJsFn)
    __obj.updateDynamic("newGroup")(newGroup.toJsFn)
    __obj.updateDynamic("newGroupContentDetails")(newGroupContentDetails.toJsFn)
    __obj.updateDynamic("newGroupItem")(newGroupItem.toJsFn)
    __obj.updateDynamic("newGroupItemResource")(newGroupItemResource.toJsFn)
    __obj.updateDynamic("newGroupSnippet")(newGroupSnippet.toJsFn)
    if (GroupItems != null) __obj.updateDynamic("GroupItems")(GroupItems.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Reports != null) __obj.updateDynamic("Reports")(Reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeAnalytics_]
  }
}

