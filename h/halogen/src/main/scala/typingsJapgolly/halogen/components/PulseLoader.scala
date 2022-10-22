package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.MarginLoaderProps
import typingsJapgolly.halogen.mod.PulseLoaderCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PulseLoader {
  
  @JSImport("halogen", "PulseLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PulseLoader.type): SharedBuilder_MarginLoaderProps134229891[PulseLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[PulseLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps134229891[PulseLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[PulseLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
