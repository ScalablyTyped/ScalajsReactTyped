package typingsJapgolly.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CandidatesParameters extends js.Object {
  /** List of candidates to show in the candidate window */
  var candidates: js.Array[CandidateTemplate]
  /** ID of the context that owns the candidate window. */
  var contextID: Double
}

object CandidatesParameters {
  @scala.inline
  def apply(candidates: js.Array[CandidateTemplate], contextID: Double): CandidatesParameters = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CandidatesParameters]
  }
}

