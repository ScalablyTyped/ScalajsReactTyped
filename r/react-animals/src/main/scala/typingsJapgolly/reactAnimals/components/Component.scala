package typingsJapgolly.reactAnimals.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.csstype.mod.Property.Width
import typingsJapgolly.reactAnimals.anon.PartialAnimalProps
import typingsJapgolly.reactAnimals.reactAnimalsStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Component {
  
  @JSImport("react-animals", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def circle(value: Boolean): this.type = set("circle", value.asInstanceOf[js.Any])
    
    inline def color(value: Color | none): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dance(value: Boolean): this.type = set("dance", value.asInstanceOf[js.Any])
    
    inline def name(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 72, starting with typingsJapgolly.reactAnimals.reactAnimalsStrings.alligator, typingsJapgolly.reactAnimals.reactAnimalsStrings.anteater, typingsJapgolly.reactAnimals.reactAnimalsStrings.armadillo */ Any
    ): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def rounded(value: Boolean): this.type = set("rounded", value.asInstanceOf[js.Any])
    
    inline def size(value: Width[String | Double]): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def square(value: Boolean): this.type = set("square", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Component.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialAnimalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
