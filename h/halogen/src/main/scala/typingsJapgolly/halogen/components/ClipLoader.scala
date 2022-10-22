package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.ClipLoaderCls
import typingsJapgolly.halogen.mod.SizeLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClipLoader {
  
  @JSImport("halogen", "ClipLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ClipLoader.type): SharedBuilder_SizeLoaderProps1802861059[ClipLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[ClipLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[ClipLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[ClipLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
