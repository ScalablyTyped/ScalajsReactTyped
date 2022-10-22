package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.action_required
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.cancelled
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.neutral
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.skipped
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.stale
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.timed_out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detailsurl extends StObject {
  
  /** @description Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. See the [`actions` object](https://docs.github.com/rest/reference/checks#actions-object) description. To learn more about check runs and requested actions, see "[Check runs and requested actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions)." */
  var actions: js.UndefOr[js.Array[DescriptionIdentifier]] = js.undefined
  
  /**
    * Format: date-time
    * @description The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var completed_at: js.UndefOr[String] = js.undefined
  
  /**
    * @description **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.
    * **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a check run conclusion to `stale`, only GitHub can set this.
    * @enum {string}
    */
  var conclusion: js.UndefOr[
    action_required | cancelled | failure | neutral | success | skipped | stale | timed_out
  ] = js.undefined
  
  /** @description The URL of the integrator's site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used. */
  var details_url: js.UndefOr[String] = js.undefined
  
  /** @description A reference for the run on the integrator's system. */
  var external_id: js.UndefOr[String] = js.undefined
  
  /** @description The SHA of the commit. */
  var head_sha: String
  
  /** @description The name of the check. For example, "code-coverage". */
  var name: String
  
  /** @description Check runs can accept a variety of data in the `output` object, including a `title` and `summary` and can optionally provide descriptive details about the run. See the [`output` object](https://docs.github.com/rest/reference/checks#output-object) description. */
  var output: js.UndefOr[Annotations] = js.undefined
  
  /**
    * Format: date-time
    * @description The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var started_at: js.UndefOr[String] = js.undefined
  
  /**
    * @description The current status.
    * @default queued
    * @enum {string}
    */
  var status: js.UndefOr[queued_ | in_progress | completed] = js.undefined
}
object Detailsurl {
  
  inline def apply(head_sha: String, name: String): Detailsurl = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detailsurl]
  }
  
  extension [Self <: Detailsurl](x: Self) {
    
    inline def setActions(value: js.Array[DescriptionIdentifier]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: DescriptionIdentifier*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
    
    inline def setConclusion(value: action_required | cancelled | failure | neutral | success | skipped | stale | timed_out): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionUndefined: Self = StObject.set(x, "conclusion", js.undefined)
    
    inline def setDetails_url(value: String): Self = StObject.set(x, "details_url", value.asInstanceOf[js.Any])
    
    inline def setDetails_urlUndefined: Self = StObject.set(x, "details_url", js.undefined)
    
    inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
    
    inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
    
    inline def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: Annotations): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
