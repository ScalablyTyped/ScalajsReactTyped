package typingsJapgolly.rcRate.components

import typingsJapgolly.rcRate.esRateMod.RateProps
import typingsJapgolly.rcRate.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcRate {
  
  @JSImport("rc-rate", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcRate.type): SharedBuilder_RateProps2046853644[default] = new SharedBuilder_RateProps2046853644[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RateProps): SharedBuilder_RateProps2046853644[default] = new SharedBuilder_RateProps2046853644[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
