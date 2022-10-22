package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.mapMarkerTypesMod.LocationPuckOverrides
import typingsJapgolly.baseui.mapMarkerTypesMod.LocationPuckProps
import typingsJapgolly.baseui.mapMarkerTypesMod.LocationPuckSize
import typingsJapgolly.baseui.mapMarkerTypesMod.LocationPuckType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocationPuck {
  
  @JSImport("baseui/map-marker", "LocationPuck")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def confidenceRadius(value: Double): this.type = set("confidenceRadius", value.asInstanceOf[js.Any])
    
    inline def heading(value: Double): this.type = set("heading", value.asInstanceOf[js.Any])
    
    inline def overrides(value: LocationPuckOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def showHeading(value: Boolean): this.type = set("showHeading", value.asInstanceOf[js.Any])
    
    inline def size(value: LocationPuckSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def `type`(value: LocationPuckType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LocationPuck.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LocationPuckProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
