package typingsJapgolly.kbar.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.kbar.libActionActionImplMod.ActionImpl
import typingsJapgolly.kbar.libKbarresultsMod.KBarResultsProps
import typingsJapgolly.kbar.libKbarresultsMod.RenderParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KBarResults {
  
  inline def apply(items: js.Array[Any], onRender: RenderParams[ActionImpl | String] => Element): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onRender = js.Any.fromFunction1(onRender))
    new Builder(js.Array(this.component, __props.asInstanceOf[KBarResultsProps]))
  }
  
  @JSImport("kbar", "KBarResults")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KBarResultsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
