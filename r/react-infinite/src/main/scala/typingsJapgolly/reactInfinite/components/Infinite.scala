package typingsJapgolly.reactInfinite.components

import typingsJapgolly.reactInfinite.global.Infinite.^
import typingsJapgolly.reactInfinite.mod.InfiniteProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Infinite {
  
  inline def apply(elementHeight: Double | js.Array[Double]): SharedBuilder_InfiniteProps863782198[^] = {
    val __props = js.Dynamic.literal(elementHeight = elementHeight.asInstanceOf[js.Any])
    new SharedBuilder_InfiniteProps863782198[^](js.Array(this.component, __props.asInstanceOf[InfiniteProps]))
  }
  
  @JSGlobal("Infinite")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: InfiniteProps): SharedBuilder_InfiniteProps863782198[^] = new SharedBuilder_InfiniteProps863782198[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
