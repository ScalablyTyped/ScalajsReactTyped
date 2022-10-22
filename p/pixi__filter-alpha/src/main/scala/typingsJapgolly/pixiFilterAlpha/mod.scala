package typingsJapgolly.pixiFilterAlpha

import typingsJapgolly.pixiCore.mod.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/filter-alpha", "AlphaFilter")
  @js.native
  /**
    * @param alpha - Amount of alpha from 0 to 1, where 0 is transparent
    */
  open class AlphaFilter () extends Filter {
    def this(alpha: Double) = this()
    
    /**
      * Coefficient for alpha multiplication
      * @default 1
      */
    def alpha: Double = js.native
    def alpha_=(value: Double): Unit = js.native
  }
}
