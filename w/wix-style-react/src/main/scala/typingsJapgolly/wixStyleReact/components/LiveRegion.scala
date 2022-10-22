package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixStyleReact.distTypesLiveRegionLiveRegionDottypesMod.LiveRegionProps
import typingsJapgolly.wixStyleReact.distTypesLiveRegionLiveRegionDottypesMod.LiveRegionRefType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveRegion {
  
  @JSImport("wix-style-react", "LiveRegion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[LiveRegionRefType] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LiveRegion.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LiveRegionProps & RefAttributes[LiveRegionRefType]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
