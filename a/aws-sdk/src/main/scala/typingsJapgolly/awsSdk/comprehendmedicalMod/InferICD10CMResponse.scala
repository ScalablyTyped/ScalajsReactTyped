package typingsJapgolly.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InferICD10CMResponse extends js.Object {
  /**
    * The medical conditions detected in the text linked to ICD-10-CM concepts. If the action is successful, the service sends back an HTTP 200 response, as well as the entities detected.
    */
  var Entities: ICD10CMEntityList = js.native
  /**
    * The version of the model used to analyze the documents, in the format n.n.n You can use this information to track the model used for a particular batch of documents.
    */
  var ModelVersion: js.UndefOr[String] = js.native
  /**
    * If the result of the previous request to InferICD10CM was truncated, include the PaginationToken to fetch the next page of medical condition entities. 
    */
  var PaginationToken: js.UndefOr[String] = js.native
}

object InferICD10CMResponse {
  @scala.inline
  def apply(Entities: ICD10CMEntityList, ModelVersion: String = null, PaginationToken: String = null): InferICD10CMResponse = {
    val __obj = js.Dynamic.literal(Entities = Entities.asInstanceOf[js.Any])
    if (ModelVersion != null) __obj.updateDynamic("ModelVersion")(ModelVersion.asInstanceOf[js.Any])
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[InferICD10CMResponse]
  }
}

