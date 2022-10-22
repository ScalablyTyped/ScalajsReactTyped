package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.BounceLoaderCls
import typingsJapgolly.halogen.mod.SizeLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BounceLoader {
  
  @JSImport("halogen", "BounceLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BounceLoader.type): SharedBuilder_SizeLoaderProps1802861059[BounceLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[BounceLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[BounceLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[BounceLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
