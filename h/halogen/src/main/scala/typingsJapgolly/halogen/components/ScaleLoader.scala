package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.RadiusLoaderProps
import typingsJapgolly.halogen.mod.ScaleLoaderCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleLoader {
  
  @JSImport("halogen", "ScaleLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ScaleLoader.type): SharedBuilder_RadiusLoaderProps_1673729384[ScaleLoaderCls] = new SharedBuilder_RadiusLoaderProps_1673729384[ScaleLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadiusLoaderProps): SharedBuilder_RadiusLoaderProps_1673729384[ScaleLoaderCls] = new SharedBuilder_RadiusLoaderProps_1673729384[ScaleLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
