package typingsJapgolly.jupyterlabTooltip

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typingsJapgolly.phosphorCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/tooltip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Tooltip protected ()
    extends typingsJapgolly.jupyterlabTooltip.widgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object ITooltipManager
    extends TopLevel[Token[typingsJapgolly.jupyterlabTooltip.tokensMod.ITooltipManager]]
  
}

