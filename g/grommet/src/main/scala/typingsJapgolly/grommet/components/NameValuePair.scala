package typingsJapgolly.grommet.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsNameValuePairMod.NameValuePairProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NameValuePair {
  
  @JSImport("grommet/es6", "NameValuePair")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: String | Double | Element): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def name(value: String | Element): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nameVdomElement(value: VdomElement): this.type = set("name", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NameValuePair.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NameValuePairProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
