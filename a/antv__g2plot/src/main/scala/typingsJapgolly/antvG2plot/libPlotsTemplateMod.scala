package typingsJapgolly.antvG2plot

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.libCorePlotMod.Plot
import typingsJapgolly.antvG2plot.libPlotsTemplateTypesMod.TemplateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTemplateMod {
  
  @JSImport("@antv/g2plot/lib/plots/_template", "Template")
  @js.native
  open class Template protected () extends Plot[TemplateOptions] {
    def this(container: String, options: TemplateOptions) = this()
    def this(container: HTMLElement, options: TemplateOptions) = this()
  }
}
