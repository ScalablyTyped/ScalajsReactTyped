package typingsJapgolly.sharepoint.SP.WorkflowServices

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of WorkflowDefinition objects */
@js.native
trait WorkflowDefinitionCollection extends ClientObjectCollection[WorkflowDefinition] {
  /** returns SP.WorkflowDefinition class */
  def get_childItemType(): js.Any = js.native
  def get_item(index: Double): WorkflowDefinition = js.native
  def itemAt(index: Double): WorkflowDefinition = js.native
}

