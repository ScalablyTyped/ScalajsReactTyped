package typingsJapgolly.rmcFeedback.components

import typingsJapgolly.rmcFeedback.libPropTypesMod.ITouchProps
import typingsJapgolly.rmcFeedback.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcFeedback {
  
  @JSImport("rmc-feedback", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RmcFeedback.type): SharedBuilder_ITouchProps1883707256[default] = new SharedBuilder_ITouchProps1883707256[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITouchProps): SharedBuilder_ITouchProps1883707256[default] = new SharedBuilder_ITouchProps1883707256[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
