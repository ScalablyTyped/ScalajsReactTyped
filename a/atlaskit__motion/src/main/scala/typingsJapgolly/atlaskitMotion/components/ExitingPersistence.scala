package typingsJapgolly.atlaskitMotion.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitMotion.distTypesEnteringExitingPersistenceMod.ExitingPersistenceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExitingPersistence {
  
  @JSImport("@atlaskit/motion", "ExitingPersistence")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    
    inline def exitThenEnter(value: Boolean): this.type = set("exitThenEnter", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ExitingPersistence.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ExitingPersistenceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
