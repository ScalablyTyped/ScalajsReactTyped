package typingsJapgolly.azureSb.gcmserviceMod

import typingsJapgolly.azureSb.AnonHeaders
import typingsJapgolly.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import typingsJapgolly.azureSb.mod.Azure.ServiceBus.ResponseCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GcmService extends js.Object {
  var notificationHubService: typingsJapgolly.azureSb.notificationhubserviceMod.^ = js.native
  def createNativeRegistration(gcmRegistrationId: String, tags: String, callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(gcmRegistrationId: String, tags: js.Array[String], callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(token: String, tags: String, options: js.Object, callback: ResponseCallback): Unit = js.native
  def createNativeRegistration(token: String, tags: js.Array[String], options: js.Object, callback: ResponseCallback): Unit = js.native
  def createOrUpdateNativeRegistration(registrationId: String, gcmRegistrationId: String, tags: String, callback: ResponseCallback): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: js.Array[String],
    callback: ResponseCallback
  ): Unit = js.native
  def createOrUpdateNativeRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: js.Array[String],
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createTemplateRegistration(gcmRegistrationId: String, tags: String, template: String, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: String,
    tags: String,
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createTemplateRegistration(gcmRegistrationId: String, tags: String, template: Template, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: String,
    tags: String,
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createTemplateRegistration(gcmRegistrationId: String, tags: js.Array[String], template: String, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: String,
    tags: js.Array[String],
    template: String,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def createTemplateRegistration(gcmRegistrationId: String, tags: js.Array[String], template: Template, callback: ResponseCallback): Unit = js.native
  def createTemplateRegistration(
    gcmRegistrationId: String,
    tags: js.Array[String],
    template: Template,
    options: js.Object,
    callback: ResponseCallback
  ): Unit = js.native
  def listRegistrationsByGcmRegistrationId(gcmRegistrationId: String, callback: ResponseCallback): Unit = js.native
  def listRegistrationsByGcmRegistrationId(gcmRegistrationId: String, options: ListNotificationHubsOptions, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: String, payload: js.Object, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: String, callback: ResponseCallback): Unit = js.native
  def send(tags: js.Array[String], payload: js.Object, callback: ResponseCallback): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: String,
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: String,
    template: String,
    options: AnonHeaders,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: String,
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: String,
    template: Template,
    options: AnonHeaders,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: js.Array[String],
    template: String,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: js.Array[String],
    template: String,
    options: AnonHeaders,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: js.Array[String],
    template: Template,
    callback: ResponseCallback
  ): Unit = js.native
  def updateTemplateRegistration(
    registrationId: String,
    gcmRegistrationId: String,
    tags: js.Array[String],
    template: Template,
    options: AnonHeaders,
    callback: ResponseCallback
  ): Unit = js.native
}

