package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Remittance resource
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.fhir.fhir.Resource because Already inherited */ trait ClaimResponse extends DomainResource {
  /**
    * Contains extended information for property 'created'.
    */
  var _created: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'disposition'.
    */
  var _disposition: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Insurer added line items
    */
  var addItem: js.UndefOr[js.Array[ClaimResponseAddItem]] = js.undefined
  /**
    * Request for additional information
    */
  var communicationRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Creation date
    */
  var created: js.UndefOr[dateTime] = js.undefined
  /**
    * Disposition Message
    */
  var disposition: js.UndefOr[String] = js.undefined
  /**
    * Processing errors
    */
  var error: js.UndefOr[js.Array[ClaimResponseError]] = js.undefined
  /**
    * Printed Form Identifier
    */
  var form: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Response  number
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Insurance or medical plan
    */
  var insurance: js.UndefOr[js.Array[ClaimResponseInsurance]] = js.undefined
  /**
    * Insurance issuing organization
    */
  var insurer: js.UndefOr[Reference] = js.undefined
  /**
    * Line items
    */
  var item: js.UndefOr[js.Array[ClaimResponseItem]] = js.undefined
  /**
    * complete | error | partial
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * The subject of the Products and Services
    */
  var patient: js.UndefOr[Reference] = js.undefined
  /**
    * Party to be paid any benefits payable
    */
  var payeeType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Payment details, if paid
    */
  var payment: js.UndefOr[ClaimResponsePayment] = js.undefined
  /**
    * Processing notes
    */
  var processNote: js.UndefOr[js.Array[ClaimResponseProcessNote]] = js.undefined
  /**
    * Id of resource triggering adjudication
    */
  var request: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible organization
    */
  var requestOrganization: js.UndefOr[Reference] = js.undefined
  /**
    * Responsible practitioner
    */
  var requestProvider: js.UndefOr[Reference] = js.undefined
  /**
    * Funds reserved status
    */
  var reserved: js.UndefOr[Coding] = js.undefined
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
  /**
    * Total benefit payable for the Claim
    */
  var totalBenefit: js.UndefOr[Money] = js.undefined
  /**
    * Total Cost of service from the Claim
    */
  var totalCost: js.UndefOr[Money] = js.undefined
  /**
    * Unallocated deductible
    */
  var unallocDeductable: js.UndefOr[Money] = js.undefined
}

object ClaimResponse {
  @scala.inline
  def apply(
    _created: Element = null,
    _disposition: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    addItem: js.Array[ClaimResponseAddItem] = null,
    communicationRequest: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    created: dateTime = null,
    disposition: String = null,
    error: js.Array[ClaimResponseError] = null,
    extension: js.Array[Extension] = null,
    form: CodeableConcept = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    insurance: js.Array[ClaimResponseInsurance] = null,
    insurer: Reference = null,
    item: js.Array[ClaimResponseItem] = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: CodeableConcept = null,
    patient: Reference = null,
    payeeType: CodeableConcept = null,
    payment: ClaimResponsePayment = null,
    processNote: js.Array[ClaimResponseProcessNote] = null,
    request: Reference = null,
    requestOrganization: Reference = null,
    requestProvider: Reference = null,
    reserved: Coding = null,
    resourceType: code = null,
    status: code = null,
    text: Narrative = null,
    totalBenefit: Money = null,
    totalCost: Money = null,
    unallocDeductable: Money = null
  ): ClaimResponse = {
    val __obj = js.Dynamic.literal()
    if (_created != null) __obj.updateDynamic("_created")(_created.asInstanceOf[js.Any])
    if (_disposition != null) __obj.updateDynamic("_disposition")(_disposition.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (addItem != null) __obj.updateDynamic("addItem")(addItem.asInstanceOf[js.Any])
    if (communicationRequest != null) __obj.updateDynamic("communicationRequest")(communicationRequest.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (insurance != null) __obj.updateDynamic("insurance")(insurance.asInstanceOf[js.Any])
    if (insurer != null) __obj.updateDynamic("insurer")(insurer.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (outcome != null) __obj.updateDynamic("outcome")(outcome.asInstanceOf[js.Any])
    if (patient != null) __obj.updateDynamic("patient")(patient.asInstanceOf[js.Any])
    if (payeeType != null) __obj.updateDynamic("payeeType")(payeeType.asInstanceOf[js.Any])
    if (payment != null) __obj.updateDynamic("payment")(payment.asInstanceOf[js.Any])
    if (processNote != null) __obj.updateDynamic("processNote")(processNote.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (requestOrganization != null) __obj.updateDynamic("requestOrganization")(requestOrganization.asInstanceOf[js.Any])
    if (requestProvider != null) __obj.updateDynamic("requestProvider")(requestProvider.asInstanceOf[js.Any])
    if (reserved != null) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (totalBenefit != null) __obj.updateDynamic("totalBenefit")(totalBenefit.asInstanceOf[js.Any])
    if (totalCost != null) __obj.updateDynamic("totalCost")(totalCost.asInstanceOf[js.Any])
    if (unallocDeductable != null) __obj.updateDynamic("unallocDeductable")(unallocDeductable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponse]
  }
}

