package typingsJapgolly.electron

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.electron.Electron.FromPartitionOptions
import typingsJapgolly.electron.Electron.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassSession extends Instantiable0[Session] {
  /**
    * A Session object, the default session object of the app.
    */
  var defaultSession: js.UndefOr[Session] = js.native
  // Docs: http://electronjs.org/docs/api/session
  /**
    * If partition starts with persist:, the page will use a persistent session
    * available to all pages in the app with the same partition. if there is no
    * persist: prefix, the page will use an in-memory session. If the partition is
    * empty then default session of the app will be returned. To create a Session with
    * options, you have to ensure the Session with the partition has never been used
    * before. There is no way to change the options of an existing Session object.
    */
  def fromPartition(partition: String): Session = js.native
  def fromPartition(partition: String, options: FromPartitionOptions): Session = js.native
}

