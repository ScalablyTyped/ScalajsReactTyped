package typingsJapgolly.scrivito.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.scrivito.mod.ChildListTagProps
import typingsJapgolly.scrivito.mod.Obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChildListTag {
  
  @JSImport("scrivito", "ChildListTag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.scrivito.mod.ChildListTag] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def parent(value: Obj): this.type = set("parent", value.asInstanceOf[js.Any])
    
    inline def renderChild(value: /* child */ Obj => Element): this.type = set("renderChild", js.Any.fromFunction1(value))
    
    inline def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ChildListTag.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ChildListTagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
