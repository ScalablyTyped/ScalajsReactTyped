package typingsJapgolly.firebaseInstallations

import typingsJapgolly.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/testing/compare-headers", JSImport.Namespace)
@js.native
object compareHeadersMod extends js.Object {
  @js.native
  trait HeadersWithEntries extends Headers {
    @JSName("entries")
    var entries_FHeadersWithEntries: js.UndefOr[js.Function0[js.Iterable[js.Tuple2[String, String]]]] = js.native
  }
  
  def compareHeaders(expectedHeaders: HeadersWithEntries, actualHeaders: HeadersWithEntries): Unit = js.native
}

