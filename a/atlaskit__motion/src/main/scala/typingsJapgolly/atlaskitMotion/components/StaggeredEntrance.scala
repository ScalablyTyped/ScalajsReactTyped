package typingsJapgolly.atlaskitMotion.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.responsive
import typingsJapgolly.atlaskitMotion.distTypesEnteringStaggeredEntranceMod.StaggeredEntranceProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StaggeredEntrance {
  
  inline def apply(children: Element | js.Array[Element]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StaggeredEntranceProps]))
  }
  
  @JSImport("@atlaskit/motion", "StaggeredEntrance")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def columns(value: Double | responsive): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def delayStep(value: Double): this.type = set("delayStep", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StaggeredEntranceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
