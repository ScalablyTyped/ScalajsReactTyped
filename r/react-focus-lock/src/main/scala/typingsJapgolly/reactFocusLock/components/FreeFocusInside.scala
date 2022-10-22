package typingsJapgolly.reactFocusLock.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFocusLock.interfacesMod.FreeFocusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FreeFocusInside {
  
  @JSImport("react-focus-lock", "FreeFocusInside")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFocusLock.mod.FreeFocusInside] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FreeFocusInside.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FreeFocusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
