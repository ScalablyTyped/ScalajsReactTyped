package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonFamily
import typingsJapgolly.gapiClientCompute.AnonFieldsImage
import typingsJapgolly.gapiClientCompute.AnonForceCreate
import typingsJapgolly.gapiClientCompute.AnonImage
import typingsJapgolly.gapiClientCompute.AnonKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the specified image. */
  def delete(request: AnonImage): Request_[Operation]
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: AnonImage): Request_[Operation]
  /** Returns the specified image. Get a list of available images by making a list() request. */
  def get(request: AnonFieldsImage): Request_[Image]
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(request: AnonFamily): Request_[Image]
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: AnonForceCreate): Request_[Operation]
  /**
    * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method
    * does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of
    * publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
    */
  def list(request: AnonAlt): Request_[ImageList]
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonKeyOauthtoken): Request_[Operation]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonImage => CallbackTo[Request_[Operation]],
    deprecate: AnonImage => CallbackTo[Request_[Operation]],
    get: AnonFieldsImage => CallbackTo[Request_[Image]],
    getFromFamily: AnonFamily => CallbackTo[Request_[Image]],
    insert: AnonForceCreate => CallbackTo[Request_[Operation]],
    list: AnonAlt => CallbackTo[Request_[ImageList]],
    setLabels: AnonKeyOauthtoken => CallbackTo[Request_[Operation]]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonImage) => delete(t0).runNow()))
    __obj.updateDynamic("deprecate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonImage) => deprecate(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFieldsImage) => get(t0).runNow()))
    __obj.updateDynamic("getFromFamily")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonFamily) => getFromFamily(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonForceCreate) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setLabels")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonKeyOauthtoken) => setLabels(t0).runNow()))
    __obj.asInstanceOf[ImagesResource]
  }
}

