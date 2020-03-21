package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import typingsJapgolly.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildReference extends js.Object {
  var _links: js.Any
  /**
    * The build number.
    */
  var buildNumber: String
  /**
    * Indicates whether the build has been deleted.
    */
  var deleted: Boolean
  /**
    * The time that the build was completed.
    */
  var finishTime: js.Date
  /**
    * The ID of the build.
    */
  var id: Double
  /**
    * The time that the build was queued.
    */
  var queueTime: js.Date
  /**
    * The identity on whose behalf the build was queued.
    */
  var requestedFor: IdentityRef
  /**
    * The build result.
    */
  var result: BuildResult
  /**
    * The time that the build was started.
    */
  var startTime: js.Date
  /**
    * The build status.
    */
  var status: BuildStatus
}

object BuildReference {
  @scala.inline
  def apply(
    _links: js.Any,
    buildNumber: String,
    deleted: Boolean,
    finishTime: js.Date,
    id: Double,
    queueTime: js.Date,
    requestedFor: IdentityRef,
    result: BuildResult,
    startTime: js.Date,
    status: BuildStatus
  ): BuildReference = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], buildNumber = buildNumber.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedFor = requestedFor.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildReference]
  }
}

