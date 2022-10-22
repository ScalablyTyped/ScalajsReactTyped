package typingsJapgolly.halogen.components

import typingsJapgolly.halogen.mod.SizeLoaderProps
import typingsJapgolly.halogen.mod.SquareLoaderCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SquareLoader {
  
  @JSImport("halogen", "SquareLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SquareLoader.type): SharedBuilder_SizeLoaderProps1802861059[SquareLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[SquareLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1802861059[SquareLoaderCls] = new SharedBuilder_SizeLoaderProps1802861059[SquareLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
