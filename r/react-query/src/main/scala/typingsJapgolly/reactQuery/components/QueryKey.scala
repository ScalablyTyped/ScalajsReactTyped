package typingsJapgolly.reactQuery.components

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QueryKey {
  
  @JSImport("react-query/types/devtools/styledComponents", "QueryKey")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: QueryKey.type): SharedBuilder_HTMLAttributesRefAttributes298282053[HTMLSpanElement] = new SharedBuilder_HTMLAttributesRefAttributes298282053[HTMLSpanElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributes[HTMLSpanElement] & RefAttributes[HTMLSpanElement]): SharedBuilder_HTMLAttributesRefAttributes298282053[HTMLSpanElement] = new SharedBuilder_HTMLAttributesRefAttributes298282053[HTMLSpanElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
