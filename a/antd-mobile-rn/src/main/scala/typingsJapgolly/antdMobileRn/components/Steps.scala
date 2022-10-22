package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.horizontal
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.vertical
import typingsJapgolly.antdMobileRn.libStepsIndexDotnativeMod.StepsNativeProps
import typingsJapgolly.antdMobileRn.libStepsStyleIndexDotnativeMod.IStepsStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  inline def apply(children: js.Array[Element]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StepsNativeProps]))
  }
  
  @JSImport("antd-mobile-rn", "Steps")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Steps] {
    
    inline def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    inline def direction(value: vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def finishIcon(value: String): this.type = set("finishIcon", value.asInstanceOf[js.Any])
    
    inline def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStepsStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
