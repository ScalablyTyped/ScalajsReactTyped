package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialVennOptions
import typingsJapgolly.antvG2plot.libPlotsVennTypesMod.VennOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Venn")
@js.native
open class Venn protected ()
  extends typingsJapgolly.antvG2plot.libPlotsVennMod.Venn {
  def this(container: String, options: VennOptions) = this()
  def this(container: HTMLElement, options: VennOptions) = this()
}
/* static members */
object Venn {
  
  @JSImport("@antv/g2plot", "Venn")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultOptions(): PartialVennOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialVennOptions]
}
