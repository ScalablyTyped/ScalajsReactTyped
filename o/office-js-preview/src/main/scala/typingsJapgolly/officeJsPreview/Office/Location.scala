package typingsJapgolly.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to get and set the location of a meeting in an Outlook add-in.
  *
  * @remarks
  * [Api set: Mailbox 1.1]
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  *
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Location extends StObject {
  
  /**
    * Gets the location of an appointment.
    *
    * The `getAsync` method starts an asynchronous call to the Exchange server to get the location of an appointment.
    * The location of the appointment is provided as a string in the `asyncResult.value` property.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  /**
    * Gets the location of an appointment.
    *
    * The `getAsync` method starts an asynchronous call to the Exchange server to get the location of an appointment.
    * The location of the appointment is provided as a string in the `asyncResult.value` property.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    */
  def getAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[String], Unit]): Unit = js.native
  
  /**
    * Sets the location of an appointment.
    *
    * The `setAsync` method starts an asynchronous call to the Exchange server to set the location of an appointment.
    * Setting the location of an appointment overwrites the current location.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - DataExceedsMaximumSize: The location parameter is longer than 255 characters.
    *
    * @param location - The location of the appointment. The string is limited to 255 characters.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If setting the location fails, the `asyncResult.error` property will contain an error code.
    */
  def setAsync(location: String): Unit = js.native
  def setAsync(location: String, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Sets the location of an appointment.
    *
    * The `setAsync` method starts an asynchronous call to the Exchange server to set the location of an appointment.
    * Setting the location of an appointment overwrites the current location.
    *
    * @remarks
    * [Api set: Mailbox 1.1]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * **Errors**:
    *
    * - DataExceedsMaximumSize: The location parameter is longer than 255 characters.
    *
    * @param location - The location of the appointment. The string is limited to 255 characters.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`. If setting the location fails, the `asyncResult.error` property will contain an error code.
    */
  def setAsync(location: String, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    location: String,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
