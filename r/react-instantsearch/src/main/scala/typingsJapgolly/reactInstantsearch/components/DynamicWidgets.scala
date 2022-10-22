package typingsJapgolly.reactInstantsearch.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactChild
import typingsJapgolly.reactInstantsearchCore.anon.Attribute
import typingsJapgolly.reactInstantsearchCore.anon.Results
import typingsJapgolly.reactInstantsearchCore.reactInstantsearchCoreStrings.Asterisk
import typingsJapgolly.reactInstantsearchDom.mod.DynamicWidgetsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DynamicWidgets {
  
  @JSImport("react-instantsearch/dom", "DynamicWidgets")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactInstantsearch.domMod.DynamicWidgets] {
    
    inline def children(value: ReactChild): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def facets(value: js.Array[Asterisk | scala.Nothing]): this.type = set("facets", value.asInstanceOf[js.Any])
    
    inline def facetsVarargs(value: (Asterisk | scala.Nothing)*): this.type = set("facets", js.Array(value*))
    
    inline def fallbackComponent(value: ComponentType[Attribute]): this.type = set("fallbackComponent", value.asInstanceOf[js.Any])
    
    inline def maxValuesPerFacet(value: Double): this.type = set("maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    inline def transformItems(value: (/* items */ js.Array[String], /* meta */ Results) => Any): this.type = set("transformItems", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: DynamicWidgets.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DynamicWidgetsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
