package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enumerates PlayReady secure stop service requests. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadySecureStopIterable")
@js.native
class PlayReadySecureStopIterable protected () extends js.Object {
  /**
    * Initializes a new instance of the PlayReadySecureStopIterable class.
    * @param publisherCertBytes The raw binary body of the publisher certificate.
    */
  def this(publisherCertBytes: js.Array[Double]) = this()
  /**
    * Returns an iterator that iterates over the items in the PlayReady secure stop collection.
    * @return The PlayReady secure stop iterator.
    */
  def first(): IIterator[IPlayReadySecureStopServiceRequest] = js.native
}

