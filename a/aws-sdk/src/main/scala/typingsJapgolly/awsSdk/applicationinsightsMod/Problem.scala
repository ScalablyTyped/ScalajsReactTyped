package typingsJapgolly.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Problem extends js.Object {
  /**
    * The resource affected by the problem.
    */
  var AffectedResource: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.AffectedResource] = js.native
  /**
    * The time when the problem ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[js.Date] = js.native
  /**
    * Feedback provided by the user about the problem.
    */
  var Feedback: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.Feedback] = js.native
  /**
    * The ID of the problem.
    */
  var Id: js.UndefOr[ProblemId] = js.native
  /**
    * A detailed analysis of the problem using machine learning.
    */
  var Insights: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.Insights] = js.native
  /**
    * The name of the resource group affected by the problem.
    */
  var ResourceGroupName: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.ResourceGroupName] = js.native
  /**
    * A measure of the level of impact of the problem.
    */
  var SeverityLevel: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.SeverityLevel] = js.native
  /**
    * The time when the problem started, in epoch seconds.
    */
  var StartTime: js.UndefOr[js.Date] = js.native
  /**
    * The status of the problem.
    */
  var Status: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.Status] = js.native
  /**
    * The name of the problem.
    */
  var Title: js.UndefOr[typingsJapgolly.awsSdk.applicationinsightsMod.Title] = js.native
}

object Problem {
  @scala.inline
  def apply(
    AffectedResource: AffectedResource = null,
    EndTime: js.Date = null,
    Feedback: Feedback = null,
    Id: ProblemId = null,
    Insights: Insights = null,
    ResourceGroupName: ResourceGroupName = null,
    SeverityLevel: SeverityLevel = null,
    StartTime: js.Date = null,
    Status: Status = null,
    Title: Title = null
  ): Problem = {
    val __obj = js.Dynamic.literal()
    if (AffectedResource != null) __obj.updateDynamic("AffectedResource")(AffectedResource.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Feedback != null) __obj.updateDynamic("Feedback")(Feedback.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Insights != null) __obj.updateDynamic("Insights")(Insights.asInstanceOf[js.Any])
    if (ResourceGroupName != null) __obj.updateDynamic("ResourceGroupName")(ResourceGroupName.asInstanceOf[js.Any])
    if (SeverityLevel != null) __obj.updateDynamic("SeverityLevel")(SeverityLevel.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Problem]
  }
}

