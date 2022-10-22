package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.libCoreAdaptorMod.Adaptor
import typingsJapgolly.antvG2plot.libCorePlotMod.PickOptions
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "P")
@js.native
open class P[O /* <: PickOptions */] protected ()
  extends typingsJapgolly.antvG2plot.libPluginMod.P[O] {
  /**
    * 相比普通图表增加 adaptor 参数。
    * @param container
    * @param options
    * @param adaptor
    * @param defaultOptions
    */
  def this(container: String, options: O, adaptor: Adaptor[O]) = this()
  def this(container: HTMLElement, options: O, adaptor: Adaptor[O]) = this()
  def this(container: String, options: O, adaptor: Adaptor[O], defaultOptions: Partial[O]) = this()
  def this(container: HTMLElement, options: O, adaptor: Adaptor[O], defaultOptions: Partial[O]) = this()
}
