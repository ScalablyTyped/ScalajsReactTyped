package typingsJapgolly.themeUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.themeUiComponents.distDeclarationsSrcFieldMod.FieldProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("theme-ui", "Field")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def as(value: ComponentType[InputProps]): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def m(value: Any): this.type = set("m", value.asInstanceOf[js.Any])
    
    inline def mb(value: Any): this.type = set("mb", value.asInstanceOf[js.Any])
    
    inline def ml(value: Any): this.type = set("ml", value.asInstanceOf[js.Any])
    
    inline def mr(value: Any): this.type = set("mr", value.asInstanceOf[js.Any])
    
    inline def mt(value: Any): this.type = set("mt", value.asInstanceOf[js.Any])
    
    inline def mx(value: Any): this.type = set("mx", value.asInstanceOf[js.Any])
    
    inline def my(value: Any): this.type = set("my", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Field.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ FieldProps[ComponentType[InputProps]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
