package typingsJapgolly.baseui.components

import typingsJapgolly.baseui.popoverTypesMod.StatefulPopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StatefulHelper {
  
  @JSImport("baseui/helper/stateful-helper", "StatefulHelper")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: StatefulHelper.type): SharedBuilder_StatefulPopoverProps_2143430071 = new SharedBuilder_StatefulPopoverProps_2143430071(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StatefulPopoverProps): SharedBuilder_StatefulPopoverProps_2143430071 = new SharedBuilder_StatefulPopoverProps_2143430071(js.Array(this.component, p.asInstanceOf[js.Any]))
}
