package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonAltFields
import typingsJapgolly.gapiClientCompute.AnonFieldsInstanceTemplate
import typingsJapgolly.gapiClientCompute.AnonInstanceTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceTemplatesResource extends js.Object {
  /**
    * Deletes the specified instance template. If you delete an instance template that is being referenced from another instance group, the instance group
    * will not be able to create or recreate virtual machine instances. Deleting an instance template is permanent and cannot be undone.
    */
  def delete(request: AnonInstanceTemplate): Request_[Operation]
  /** Returns the specified instance template. Get a list of available instance templates by making a list() request. */
  def get(request: AnonFieldsInstanceTemplate): Request_[InstanceTemplate]
  /**
    * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an
    * existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
    */
  def insert(request: AnonAltFields): Request_[Operation]
  /** Retrieves a list of instance templates that are contained within the specified project and zone. */
  def list(request: AnonAlt): Request_[InstanceTemplateList]
}

object InstanceTemplatesResource {
  @scala.inline
  def apply(
    delete: AnonInstanceTemplate => CallbackTo[Request_[Operation]],
    get: AnonFieldsInstanceTemplate => CallbackTo[Request_[InstanceTemplate]],
    insert: AnonAltFields => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[InstanceTemplateList]]
  ): InstanceTemplatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonInstanceTemplate) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsInstanceTemplate) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAltFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[InstanceTemplatesResource]
  }
}

