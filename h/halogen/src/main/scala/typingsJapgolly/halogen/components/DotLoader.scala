package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.DotLoaderCls
import typingsJapgolly.halogen.mod.SizeLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotLoader {
  
  @JSImport("halogen", "DotLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DotLoader.type): SharedBuilder_SizeLoaderProps1802861059[DotLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[DotLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[DotLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[DotLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
