package typingsJapgolly.officeJsPreview.Office

import typingsJapgolly.officeJsPreview.Office.MailboxEnums.AppointmentSensitivityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to get and set the appointment sensitivity of a meeting in an Outlook add-in.
  *
  * @remarks
  * [Api set: Mailbox preview]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  *
  * @beta
  */
@js.native
trait Sensitivity extends StObject {
  
  /**
    * Gets the value of the appointment sensitivity.
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @beta
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[AppointmentSensitivityType], Unit]): Unit = js.native
  /**
    * Gets the value of the appointment sensitivity.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    *
    * @beta
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[AppointmentSensitivityType], Unit]
  ): Unit = js.native
  
  def setAsync(sensitivity: String): Unit = js.native
  def setAsync(sensitivity: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  def setAsync(sensitivity: String, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    sensitivity: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Sets the value of the appointment sensitivity.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param sensitivity - The sensitivity value as enum or string.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def setAsync(sensitivity: AppointmentSensitivityType): Unit = js.native
  def setAsync(
    sensitivity: AppointmentSensitivityType,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
  /**
    * Sets the value of the appointment sensitivity.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param sensitivity - The sensitivity value as enum or string.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def setAsync(sensitivity: AppointmentSensitivityType, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    sensitivity: AppointmentSensitivityType,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
