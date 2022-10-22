package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.PlacementContainerOverrid
import typingsJapgolly.baseui.snackbarTypesMod.Duration
import typingsJapgolly.baseui.snackbarTypesMod.Placement
import typingsJapgolly.baseui.snackbarTypesMod.SnackbarProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SnackbarProvider {
  
  @JSImport("baseui/snackbar", "SnackbarProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultDuration(value: Duration): this.type = set("defaultDuration", value.asInstanceOf[js.Any])
    
    inline def overrides(value: PlacementContainerOverrid): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SnackbarProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SnackbarProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
