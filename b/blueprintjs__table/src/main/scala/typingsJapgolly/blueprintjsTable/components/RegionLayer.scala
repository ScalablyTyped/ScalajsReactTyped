package typingsJapgolly.blueprintjsTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmLayersRegionsMod.RegionLayerProps
import typingsJapgolly.blueprintjsTable.libEsmRegionsMod.Region
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegionLayer {
  
  @JSImport("@blueprintjs/table/lib/esm/layers/regions", "RegionLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.libEsmLayersRegionsMod.RegionLayer] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def regionStyles(value: js.Array[CSSProperties]): this.type = set("regionStyles", value.asInstanceOf[js.Any])
    
    inline def regionStylesVarargs(value: CSSProperties*): this.type = set("regionStyles", js.Array(value*))
    
    inline def regions(value: js.Array[Region]): this.type = set("regions", value.asInstanceOf[js.Any])
    
    inline def regionsVarargs(value: Region*): this.type = set("regions", js.Array(value*))
  }
  
  implicit def make(companion: RegionLayer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RegionLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
