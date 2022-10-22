package typingsJapgolly.primereact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.styleclassStyleclassMod.StyleClassProps
import typingsJapgolly.primereact.styleclassStyleclassMod.StyleClassSelectorType
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleClass {
  
  inline def apply(nodeRef: MutableRefObject[Node]): Builder = {
    val __props = js.Dynamic.literal(nodeRef = nodeRef.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StyleClassProps]))
  }
  
  @JSImport("primereact", "StyleClass")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.StyleClass] {
    
    inline def enterActiveClassName(value: String): this.type = set("enterActiveClassName", value.asInstanceOf[js.Any])
    
    inline def enterClassName(value: String): this.type = set("enterClassName", value.asInstanceOf[js.Any])
    
    inline def enterToClassName(value: String): this.type = set("enterToClassName", value.asInstanceOf[js.Any])
    
    inline def hideOnOutsideClick(value: Boolean): this.type = set("hideOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def leaveActiveClassName(value: String): this.type = set("leaveActiveClassName", value.asInstanceOf[js.Any])
    
    inline def leaveClassName(value: String): this.type = set("leaveClassName", value.asInstanceOf[js.Any])
    
    inline def leaveToClassName(value: String): this.type = set("leaveToClassName", value.asInstanceOf[js.Any])
    
    inline def selector(value: StyleClassSelectorType): this.type = set("selector", value.asInstanceOf[js.Any])
    
    inline def toggleClassName(value: String): this.type = set("toggleClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StyleClassProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
