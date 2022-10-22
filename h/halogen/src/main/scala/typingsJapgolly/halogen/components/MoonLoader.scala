package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.MoonLoaderCls
import typingsJapgolly.halogen.mod.SizeLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MoonLoader {
  
  @JSImport("halogen", "MoonLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MoonLoader.type): SharedBuilder_SizeLoaderProps1802861059[MoonLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[MoonLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[MoonLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[MoonLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
