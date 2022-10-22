package typingsJapgolly.styledReactModal.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.styledReactModal.mod.ModalProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ModalProvider {
  
  @JSImport("styled-react-modal", "ModalProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.styledReactModal.mod.ModalProvider] {
    
    inline def backgroundComponent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyStyledComponent */ Any
    ): this.type = set("backgroundComponent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ModalProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
