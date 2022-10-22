package typingsJapgolly.antDesignIconsReact.components

import typingsJapgolly.antDesignIconsReact.esComponentsIconMod.IconProps
import typingsJapgolly.antDesignIconsReact.esMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Es {
  
  inline def apply(
    `type`: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconDefinition */ Any)
  ): SharedBuilder_IconProps467207268[default] = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_IconProps467207268[default](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("@ant-design/icons-react/es", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps467207268[default] = new SharedBuilder_IconProps467207268[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
