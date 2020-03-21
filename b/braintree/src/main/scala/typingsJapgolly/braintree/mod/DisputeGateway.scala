package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.braintree.AnonCategory
import typingsJapgolly.braintree.AnonContent
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisputeGateway extends js.Object {
  def accept(disputeId: String): js.Promise[ValidatedResponse[Dispute]]
  def addFileEvidence(disputeId: String, evidence: AnonCategory): js.Promise[ValidatedResponse[Evidence]]
  def addTextEvidence(disputeId: String, evidence: AnonContent): js.Promise[ValidatedResponse[Evidence]]
  def finalize(disputeId: String): js.Promise[ValidatedResponse[Dispute]]
  def find(disputeId: String): js.Promise[Dispute]
  def removeEvidence(disputeId: String, evidenceId: String): js.Promise[ValidatedResponse[Dispute]]
  def search(searchFn: js.Any): Readable
}

object DisputeGateway {
  @scala.inline
  def apply(
    accept: String => CallbackTo[js.Promise[ValidatedResponse[Dispute]]],
    addFileEvidence: (String, AnonCategory) => CallbackTo[js.Promise[ValidatedResponse[Evidence]]],
    addTextEvidence: (String, AnonContent) => CallbackTo[js.Promise[ValidatedResponse[Evidence]]],
    finalize: String => CallbackTo[js.Promise[ValidatedResponse[Dispute]]],
    find: String => CallbackTo[js.Promise[Dispute]],
    removeEvidence: (String, String) => CallbackTo[js.Promise[ValidatedResponse[Dispute]]],
    search: js.Any => CallbackTo[Readable]
  ): DisputeGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accept")(js.Any.fromFunction1((t0: java.lang.String) => accept(t0).runNow()))
    __obj.updateDynamic("addFileEvidence")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.braintree.AnonCategory) => addFileEvidence(t0, t1).runNow()))
    __obj.updateDynamic("addTextEvidence")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.braintree.AnonContent) => addTextEvidence(t0, t1).runNow()))
    __obj.updateDynamic("finalize")(js.Any.fromFunction1((t0: java.lang.String) => finalize(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: java.lang.String) => find(t0).runNow()))
    __obj.updateDynamic("removeEvidence")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => removeEvidence(t0, t1).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: js.Any) => search(t0).runNow()))
    __obj.asInstanceOf[DisputeGateway]
  }
}

