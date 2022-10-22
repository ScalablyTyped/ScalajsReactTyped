package typingsJapgolly.reactRouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRouter.distLibComponentsMod.MemoryRouterProps
import typingsJapgolly.remixRunRouter.distHistoryMod.InitialEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MemoryRouter {
  
  @JSImport("react-router", "MemoryRouter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basename(value: String): this.type = set("basename", value.asInstanceOf[js.Any])
    
    inline def initialEntries(value: js.Array[InitialEntry]): this.type = set("initialEntries", value.asInstanceOf[js.Any])
    
    inline def initialEntriesVarargs(value: InitialEntry*): this.type = set("initialEntries", js.Array(value*))
    
    inline def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MemoryRouter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MemoryRouterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
