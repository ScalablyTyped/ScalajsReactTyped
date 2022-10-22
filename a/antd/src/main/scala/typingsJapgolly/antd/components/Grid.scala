package typingsJapgolly.antd.components

import typingsJapgolly.antd.libCardGridMod.CardGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grid {
  
  @JSImport("antd/lib/card/Grid", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Grid.type): SharedBuilder_CardGridProps_2097606516 = new SharedBuilder_CardGridProps_2097606516(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardGridProps): SharedBuilder_CardGridProps_2097606516 = new SharedBuilder_CardGridProps_2097606516(js.Array(this.component, p.asInstanceOf[js.Any]))
}
