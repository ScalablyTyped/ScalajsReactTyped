package typingsJapgolly.winrtUwp.Windows.Foundation.Diagnostics

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFolder
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the destination of logged messages from LoggingChannel instances. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingSession")
@js.native
class LoggingSession protected () extends js.Object {
  /**
    * Initializes a new instance of the LoggingSession class.
    * @param name The name of the logging session.
    */
  def this(name: String) = this()
  /** Gets the name of the logging session. */
  var name: String = js.native
  /**
    * Adds a logging channel to the current logging session.
    * @param loggingChannel The logging channel to add.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
  /**
    * Adds a logging channel with the specified logging level to the current logging session.
    * @param loggingChannel The logging channel to add.
    * @param maxLevel The logging level for loggingChannel.
    */
  def addLoggingChannel(loggingChannel: ILoggingChannel, maxLevel: LoggingLevel): Unit = js.native
  /** Ends the current logging session. */
  def close(): Unit = js.native
  /**
    * Removes the specified logging channel from the current logging session.
    * @param loggingChannel The logging channel to remove.
    */
  def removeLoggingChannel(loggingChannel: ILoggingChannel): Unit = js.native
  /**
    * Saves the current logging session to a file.
    * @param folder The folder that contains the log file.
    * @param fileName The name of the log file.
    * @return When this method completes, it returns the new file as a StorageFile .
    */
  def saveToFileAsync(folder: IStorageFolder, fileName: String): IPromiseWithIAsyncOperation[StorageFile] = js.native
}

