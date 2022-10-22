package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesSelectorMod.SelectorProgressBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectorProgressBar {
  
  inline def apply(progress: Double): Builder = {
    val __props = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProgressBarProps]))
  }
  
  @JSImport("wix-style-react", "SelectorProgressBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.SelectorProgressBar] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectorProgressBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
