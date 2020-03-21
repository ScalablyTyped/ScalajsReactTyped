package typingsJapgolly.vsoNodeApi.testInterfacesMod

import typingsJapgolly.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSession extends js.Object {
  /**
    * Area path of the test session
    */
  var area: ShallowReference
  /**
    * Comments in the test session
    */
  var comment: String
  /**
    * Duration of the session
    */
  var endDate: js.Date
  /**
    * Id of the test session
    */
  var id: Double
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: IdentityRef
  /**
    * Last updated date
    */
  var lastUpdatedDate: js.Date
  /**
    * Owner of the test session
    */
  var owner: IdentityRef
  /**
    * Project to which the test session belongs
    */
  var project: ShallowReference
  /**
    * Generic store for test session data
    */
  var propertyBag: PropertyBag
  /**
    * Revision of the test session
    */
  var revision: Double
  /**
    * Source of the test session
    */
  var source: TestSessionSource
  /**
    * Start date
    */
  var startDate: js.Date
  /**
    * State of the test session
    */
  var state: TestSessionState
  /**
    * Title of the test session
    */
  var title: String
  /**
    * Url of Test Session Resource
    */
  var url: String
}

object TestSession {
  @scala.inline
  def apply(
    area: ShallowReference,
    comment: String,
    endDate: js.Date,
    id: Double,
    lastUpdatedBy: IdentityRef,
    lastUpdatedDate: js.Date,
    owner: IdentityRef,
    project: ShallowReference,
    propertyBag: PropertyBag,
    revision: Double,
    source: TestSessionSource,
    startDate: js.Date,
    state: TestSessionState,
    title: String,
    url: String
  ): TestSession = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedBy = lastUpdatedBy.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], propertyBag = propertyBag.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestSession]
  }
}

