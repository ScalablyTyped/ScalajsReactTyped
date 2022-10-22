package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsStickyStickyDottypesMod.IStickyProps
import typingsJapgolly.officeUiFabricReact.libComponentsStickyStickyDottypesMod.StickyPositionType
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sticky {
  
  @JSImport("office-ui-fabric-react", "Sticky")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.Sticky] {
    
    inline def componentRef(value: IRefObject[IStickyProps]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IStickyProps | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IStickyProps | Null) => value(t0).runNow()))
    
    inline def isScrollSynced(value: Boolean): this.type = set("isScrollSynced", value.asInstanceOf[js.Any])
    
    inline def stickyBackgroundColor(value: String): this.type = set("stickyBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
    
    inline def stickyPosition(value: StickyPositionType): this.type = set("stickyPosition", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Sticky.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IStickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
