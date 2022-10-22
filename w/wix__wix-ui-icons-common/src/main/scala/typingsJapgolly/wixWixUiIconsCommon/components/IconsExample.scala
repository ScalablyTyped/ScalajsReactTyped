package typingsJapgolly.wixWixUiIconsCommon.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.std.Record
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesComponentsIconsExampleIconsExampleMod.IconsExampleProps
import typingsJapgolly.wixWixUiIconsCommon.distTypesStoriesTypesMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconsExample {
  
  inline def apply(iconComponents: Record[String, FC[IconProps]]): Builder = {
    val __props = js.Dynamic.literal(iconComponents = iconComponents.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconsExampleProps]))
  }
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/icons-example", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconsExampleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
