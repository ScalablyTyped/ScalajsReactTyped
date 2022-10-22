package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.checkoutOptionsMod.CheckoutOptions
import typingsJapgolly.nodegit.fetchOptionsMod.FetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneOptionsMod {
  
  @JSImport("nodegit/clone-options", "CloneOptions")
  @js.native
  open class CloneOptions () extends StObject {
    
    var bare: js.UndefOr[Double] = js.native
    
    var checkoutBranch: js.UndefOr[String] = js.native
    
    var checkoutOpts: js.UndefOr[CheckoutOptions] = js.native
    
    var fetchOpts: js.UndefOr[FetchOptions] = js.native
    
    var local: js.UndefOr[Double] = js.native
    
    var remoteCbPayload: js.UndefOr[Any] = js.native
    
    var repositoryCbPayload: js.UndefOr[Any] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
