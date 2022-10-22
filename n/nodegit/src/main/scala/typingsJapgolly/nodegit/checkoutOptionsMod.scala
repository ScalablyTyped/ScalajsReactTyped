package typingsJapgolly.nodegit

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodegit.mod.Index
import typingsJapgolly.nodegit.strArrayMod.Strarray
import typingsJapgolly.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkoutOptionsMod {
  
  @JSImport("nodegit/checkout-options", "CheckoutOptions")
  @js.native
  open class CheckoutOptions ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var ancestorLabel: js.UndefOr[String] = js.native
    
    var baseline: js.UndefOr[Tree] = js.native
    
    var baselineIndex: js.UndefOr[Index] = js.native
    
    var checkoutStrategy: js.UndefOr[Double] = js.native
    
    var dirMode: js.UndefOr[Double] = js.native
    
    var disableFilters: js.UndefOr[Double] = js.native
    
    var fileMode: js.UndefOr[Double] = js.native
    
    var fileOpenFlags: js.UndefOr[Double] = js.native
    
    var notifyCb: js.UndefOr[Any] = js.native
    
    var notifyFlags: js.UndefOr[Double] = js.native
    
    var notifyPayload: Unit = js.native
    
    var ourLabel: js.UndefOr[String] = js.native
    
    var paths: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var perfdataCb: js.UndefOr[Any] = js.native
    
    var perfdataPayload: Unit = js.native
    
    var progressCb: js.UndefOr[Any] = js.native
    
    var progressPayload: Unit = js.native
    
    var targetDirectory: js.UndefOr[String] = js.native
    
    var theirLabel: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
