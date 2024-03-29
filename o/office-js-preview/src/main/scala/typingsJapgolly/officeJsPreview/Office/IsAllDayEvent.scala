package typingsJapgolly.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods to get and set the all-day event status of a meeting in an Outlook add-in.
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
trait IsAllDayEvent extends StObject {
  
  /**
    * Gets the boolean value indicating whether the event is all day or not.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - When the method completes, the function passed in the `callback` parameter is called with a single parameter of
    *                 type `Office.AsyncResult`.
    *
    * @beta
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
  /**
    * Gets the boolean value indicating whether the event is all day or not.
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
  def getAsync(options: AsyncContextOptions, callback: js.Function1[/* asyncResult */ AsyncResult[Boolean], Unit]): Unit = js.native
  
  /**
    * Sets the all-day event status of an appointment.
    *
    * @remarks
    * [Api set: Mailbox preview]
    *
    * If an appointment is marked as an all-day event:
    * - Start and end time will be marked as 12:00 AM (just like in the Outlook UI). Start time will return 12:00 AM and end time will be 12:00 AM the next day.
    *
    * **{@link  https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param isAllDayEvent - boolean value to set the all day event status.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def setAsync(isAllDayEvent: Boolean): Unit = js.native
  def setAsync(isAllDayEvent: Boolean, callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]): Unit = js.native
  /**
    * Sets the all-day event status of an appointment.
    *
    * @remarks
    * [Api set: Mailbox preview]
    * 
    * If an appointment is marked as an all-day event:
    * - Start and end time will be marked as 12:00 AM (just like in the Outlook UI). Start time will return 12:00 AM and end time will be 12:00 AM the next day.
    *
    * **{@link  https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadWriteItem`
    *
    * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param isAllDayEvent - boolean value to set the all day event status.
    * @param options - An object literal that contains one or more of the following properties:-
    *        `asyncContext`: Developers can provide any object they wish to access in the callback function.
    * @param callback - Optional. When the method completes, the function passed in the `callback` parameter is called with a single parameter,
    *                `asyncResult`, which is an `Office.AsyncResult` object.
    *
    * @beta
    */
  def setAsync(isAllDayEvent: Boolean, options: AsyncContextOptions): Unit = js.native
  def setAsync(
    isAllDayEvent: Boolean,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[Unit], Unit]
  ): Unit = js.native
}
