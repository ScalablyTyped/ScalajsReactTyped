package typingsJapgolly.reactBulmaComponents.components

import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("react-bulma-components", "Box")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Box.type): SharedBuilder_ObjectElementProps1309836731 = new SharedBuilder_ObjectElementProps1309836731(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ js.Object & (ElementProps[js.Object, div])): SharedBuilder_ObjectElementProps1309836731 = new SharedBuilder_ObjectElementProps1309836731(js.Array(this.component, p.asInstanceOf[js.Any]))
}
