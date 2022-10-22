package typingsJapgolly.reactTypeAnimation.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTypeAnimation.mod.TypeAnimationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTypeAnimation {
  
  inline def apply(sequence: js.Array[String | Double]): Builder = {
    val __props = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TypeAnimationProps]))
  }
  
  @JSImport("react-type-animation", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cursor(value: Boolean): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    inline def repeat(value: Double): this.type = set("repeat", value.asInstanceOf[js.Any])
    
    inline def wrapper(value: String): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TypeAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
