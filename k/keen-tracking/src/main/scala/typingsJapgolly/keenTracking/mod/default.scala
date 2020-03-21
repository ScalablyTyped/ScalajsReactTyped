package typingsJapgolly.keenTracking.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.keenTracking.AnonCreated
import typingsJapgolly.keenTracking.AnonProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keen-tracking", JSImport.Default)
@js.native
class default protected () extends KeenTracking {
  def this(options: AnonProjectId) = this()
  /* CompleteClass */
  override def recordEvent(collectionName: String, event: js.Object): js.Promise[AnonCreated] = js.native
  /* CompleteClass */
  override def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
}

