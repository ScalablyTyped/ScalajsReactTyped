package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typingsJapgolly.wixStyleReact.distTypesTrendIndicatorMod.TrendIndicatorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TrendIndicator {
  
  inline def apply(value: Double): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TrendIndicatorProps]))
  }
  
  @JSImport("wix-style-react", "TrendIndicator")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.TrendIndicator] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def locale(value: SupportedWixLocales_): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TrendIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
