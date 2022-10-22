package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.GridLoaderCls
import typingsJapgolly.halogen.mod.MarginLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridLoader {
  
  @JSImport("halogen", "GridLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GridLoader.type): SharedBuilder_MarginLoaderProps134229891[GridLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[GridLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps134229891[GridLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[GridLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
