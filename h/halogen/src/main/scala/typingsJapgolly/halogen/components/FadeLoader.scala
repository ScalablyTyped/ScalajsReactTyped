package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.FadeLoaderCls
import typingsJapgolly.halogen.mod.RadiusLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FadeLoader {
  
  @JSImport("halogen", "FadeLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FadeLoader.type): SharedBuilder_RadiusLoaderProps_1673729384[FadeLoaderCls] = new SharedBuilder_RadiusLoaderProps_1673729384[FadeLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadiusLoaderProps): SharedBuilder_RadiusLoaderProps_1673729384[FadeLoaderCls] = new SharedBuilder_RadiusLoaderProps_1673729384[FadeLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
