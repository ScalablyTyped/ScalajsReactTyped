package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.BeatLoaderCls
import typingsJapgolly.halogen.mod.MarginLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BeatLoader {
  
  @JSImport("halogen", "BeatLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BeatLoader.type): SharedBuilder_MarginLoaderProps134229891[BeatLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[BeatLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps134229891[BeatLoaderCls] = new SharedBuilder_MarginLoaderProps134229891[BeatLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
