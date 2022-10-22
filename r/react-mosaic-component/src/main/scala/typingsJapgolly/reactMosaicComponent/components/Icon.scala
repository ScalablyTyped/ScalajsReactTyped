package typingsJapgolly.reactMosaicComponent.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.large
import typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  inline def apply(
    icon: /* keyof react-mosaic-component.anon.TypeofIconNames */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 1120, starting with typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.FUNCTION, typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.ADD, typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.AIRPLANE */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactMosaicComponent.anon.Icon]))
  }
  
  @JSImport("react-mosaic-component/lib/util/OptionalBlueprint", "OptionalBlueprint.Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def size(value: standard | large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: typingsJapgolly.reactMosaicComponent.anon.Icon): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
