package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.convenientHunkMod.ConvenientHunk
import typingsJapgolly.nodegit.diffDeltaMod.DiffDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyOptionsMod {
  
  @JSImport("nodegit/apply-options", "ApplyOptions")
  @js.native
  open class ApplyOptions () extends StObject {
    
    var deltaCb: js.UndefOr[js.Function2[/* delta */ DiffDelta, /* payload */ Any, Double]] = js.native
    
    var hunkCb: js.UndefOr[js.Function2[/* hunk */ ConvenientHunk, /* payload */ Any, Double]] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
