package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkBeakBeakDottypesMod.IBeak
import typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkBeakBeakDottypesMod.IBeakProps
import typingsJapgolly.officeUiFabricReact.libUtilitiesPositioningPositioningDottypesMod.RectangleEdge
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Beak {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Beak/Beak", "Beak")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.libComponentsCoachmarkBeakBeakMod.Beak] {
    
    inline def bottom(value: String): this.type = set("bottom", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IBeak]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IBeak | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IBeak | Null) => value(t0).runNow()))
    
    inline def direction(value: RectangleEdge): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def left(value: String): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def right(value: String): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def top(value: String): this.type = set("top", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Beak.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IBeakProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
