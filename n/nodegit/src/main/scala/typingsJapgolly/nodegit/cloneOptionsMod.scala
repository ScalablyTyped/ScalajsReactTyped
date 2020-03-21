package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsJapgolly.nodegit.fetchOptionsMod.FetchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/clone-options", JSImport.Namespace)
@js.native
object cloneOptionsMod extends js.Object {
  @js.native
  class CloneOptions () extends js.Object {
    var bare: js.UndefOr[Double] = js.native
    var checkoutBranch: js.UndefOr[String] = js.native
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
    var fetchOpts: js.UndefOr[FetchOptions] = js.native
    var local: js.UndefOr[Double] = js.native
    var remoteCbPayload: js.UndefOr[js.Any] = js.native
    var repositoryCbPayload: js.UndefOr[js.Any] = js.native
    var version: js.UndefOr[Double] = js.native
  }
  
}

