package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathAnalysisidOwnerQueryConfirmdelete extends StObject {
  
  /**
    * Deletes a specified code scanning analysis from a repository. For
    * private repositories, you must use an access token with the `repo` scope. For public repositories,
    * you must use an access token with `public_repo` scope.
    * GitHub Apps must have the `security_events` write permission to use this endpoint.
    *
    * You can delete one analysis at a time.
    * To delete a series of analyses, start with the most recent analysis and work backwards.
    * Conceptually, the process is similar to the undo function in a text editor.
    *
    * When you list the analyses for a repository,
    * one or more will be identified as deletable in the response:
    *
    * ```
    * "deletable": true
    * ```
    *
    * An analysis is deletable when it's the most recent in a set of analyses.
    * Typically, a repository will have multiple sets of analyses
    * for each enabled code scanning tool,
    * where a set is determined by a unique combination of analysis values:
    *
    * * `ref`
    * * `tool`
    * * `category`
    *
    * If you attempt to delete an analysis that is not the most recent in a set,
    * you'll get a 400 response with the message:
    *
    * ```
    * Analysis specified is not deletable.
    * ```
    *
    * The response from a successful `DELETE` operation provides you with
    * two alternative URLs for deleting the next analysis in the set:
    * `next_analysis_url` and `confirm_delete_url`.
    * Use the `next_analysis_url` URL if you want to avoid accidentally deleting the final analysis
    * in a set. This is a useful option if you want to preserve at least one analysis
    * for the specified tool in your repository.
    * Use the `confirm_delete_url` URL if you are content to remove all analyses for a tool.
    * When you delete the last analysis in a set, the value of `next_analysis_url` and `confirm_delete_url`
    * in the 200 response is `null`.
    *
    * As an example of the deletion process,
    * let's imagine that you added a workflow that configured a particular code scanning tool
    * to analyze the code in a repository. This tool has added 15 analyses:
    * 10 on the default branch, and another 5 on a topic branch.
    * You therefore have two separate sets of analyses for this tool.
    * You've now decided that you want to remove all of the analyses for the tool.
    * To do this you must make 15 separate deletion requests.
    * To start, you must find an analysis that's identified as deletable.
    * Each set of analyses always has one that's identified as deletable.
    * Having found the deletable analysis for one of the two sets,
    * delete this analysis and then continue deleting the next analysis in the set until they're all deleted.
    * Then repeat the process for the second set.
    * The procedure therefore consists of a nested loop:
    *
    * **Outer loop**:
    * * List the analyses for the repository, filtered by tool.
    * * Parse this list to find a deletable analysis. If found:
    *
    *   **Inner loop**:
    *   * Delete the identified analysis.
    *   * Parse the response for the value of `confirm_delete_url` and, if found, use this in the next iteration.
    *
    * The above process assumes that you want to remove all trace of the tool's analyses from the GitHub user interface, for the specified repository, and it therefore uses the `confirm_delete_url` value. Alternatively, you could use the `next_analysis_url` value, which would leave the last analysis in each set undeleted to avoid removing a tool's analysis entirely.
    */
  var delete: ParametersPathAnalysisidOwnerQueryConfirmdelete
  
  /**
    * Gets a specified code scanning analysis for a repository.
    * You must use an access token with the `security_events` scope to use this endpoint with private repos,
    * the `public_repo` scope also grants permission to read security events on public repos only.
    * GitHub Apps must have the `security_events` read permission to use this endpoint.
    *
    * The default JSON response contains fields that describe the analysis.
    * This includes the Git reference and commit SHA to which the analysis relates,
    * the datetime of the analysis, the name of the code scanning tool,
    * and the number of alerts.
    *
    * The `rules_count` field in the default response give the number of rules
    * that were run in the analysis.
    * For very old analyses this data is not available,
    * and `0` is returned in this field.
    *
    * If you use the Accept header `application/sarif+json`,
    * the response contains the analysis data that was uploaded.
    * This is formatted as
    * [SARIF version 2.1.0](https://docs.oasis-open.org/sarif/sarif/v2.1.0/cs01/sarif-v2.1.0-cs01.html).
    */
  var get: ParametersPathAnalysisidOwner
}
object DeleteParametersPathAnalysisidOwnerQueryConfirmdelete {
  
  inline def apply(delete: ParametersPathAnalysisidOwnerQueryConfirmdelete, get: ParametersPathAnalysisidOwner): DeleteParametersPathAnalysisidOwnerQueryConfirmdelete = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathAnalysisidOwnerQueryConfirmdelete]
  }
  
  extension [Self <: DeleteParametersPathAnalysisidOwnerQueryConfirmdelete](x: Self) {
    
    inline def setDelete(value: ParametersPathAnalysisidOwnerQueryConfirmdelete): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathAnalysisidOwner): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
