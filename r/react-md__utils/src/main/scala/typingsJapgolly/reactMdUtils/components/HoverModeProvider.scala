package typingsJapgolly.reactMdUtils.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdUtils.typesHoverHoverModeProviderMod.HoverModeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HoverModeProvider {
  
  @JSImport("@react-md/utils", "HoverModeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def deactivateTime(value: Double): this.type = set("deactivateTime", value.asInstanceOf[js.Any])
    
    inline def defaultVisibleInTime(value: Double): this.type = set("defaultVisibleInTime", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HoverModeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HoverModeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
