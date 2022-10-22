package typingsJapgolly.winrtUwp.Windows.Foundation.Diagnostics

import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.logfilegenerated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the destination of logged messages from LoggingChannel instances. */
@js.native
trait FileLoggingSession extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_logfilegenerated(
    `type`: logfilegenerated,
    listener: TypedEventHandler[IFileLoggingSession, LogFileGeneratedEventArgs]
  ): Unit = js.native
  
  /**
    * Adds a logging channel to the current logging session.
    * @param loggingChannel The logging channel to add.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
  /**
    * Adds a logging channel to the current logging session. The logging channel only accepts events that have a logging level at or above the specified logging level.
    * @param loggingChannel The logging channel to add.
    * @param maxLevel The minimum logging level that an event must have to be accepted by the session.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel, maxLevel: LoggingLevel): Unit = js.native
  
  /** Ends the current logging session. */
  def close(): Unit = js.native
  
  /**
    * Ends the current logging session and saves it to a file.
    * @return When this method completes, it returns the new file as a StorageFile . Returns NULL if there are no events in the session or if logging has just rolled over into a new file that doesn't contain events yet.
    */
  def closeAndSaveToFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Gets the name of the logging session. */
  var name: String = js.native
  
  /** Raised when a log file is saved. */
  def onlogfilegenerated(ev: LogFileGeneratedEventArgs & WinRTEvent[IFileLoggingSession]): Unit = js.native
  /** Raised when a log file is saved. */
  @JSName("onlogfilegenerated")
  var onlogfilegenerated_Original: TypedEventHandler[IFileLoggingSession, LogFileGeneratedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_logfilegenerated(
    `type`: logfilegenerated,
    listener: TypedEventHandler[IFileLoggingSession, LogFileGeneratedEventArgs]
  ): Unit = js.native
  
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
}
