package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.fetchOptionsMod.FetchOptions
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.nodegitInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("nodegit/fetch", "Fetch")
  @js.native
  open class Fetch () extends StObject
  /* static members */
  object Fetch {
    
    @JSImport("nodegit/fetch", "Fetch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def initOptions(opts: FetchOptions, version: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("initOptions")(opts.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
      - typingsJapgolly.nodegit.nodegitInts.`2`
    */
    trait PRUNE extends StObject
    object PRUNE {
      
      inline def GIT_FETCH_NO_PRUNE: `2` = 2.asInstanceOf[`2`]
      
      inline def GIT_FETCH_PRUNE: `1` = 1.asInstanceOf[`1`]
      
      inline def GIT_FETCH_PRUNE_UNSPECIFIED: `0` = 0.asInstanceOf[`0`]
    }
  }
}
