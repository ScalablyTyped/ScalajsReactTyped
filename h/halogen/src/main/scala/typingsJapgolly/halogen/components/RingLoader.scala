package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.RingLoaderCls
import typingsJapgolly.halogen.mod.SizeLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RingLoader {
  
  @JSImport("halogen", "RingLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RingLoader.type): SharedBuilder_SizeLoaderProps1802861059[RingLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[RingLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[RingLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[RingLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
