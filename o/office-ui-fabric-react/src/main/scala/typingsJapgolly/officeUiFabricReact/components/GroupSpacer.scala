package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupSpacerDottypesMod.IGroupSpacerProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupSpacerDottypesMod.IGroupSpacerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsGroupedListGroupSpacerDottypesMod.IGroupSpacerStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupSpacer {
  
  inline def apply(count: Double): Builder = {
    val __props = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IGroupSpacerProps]))
  }
  
  @JSImport("office-ui-fabric-react", "GroupSpacer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def indentWidth(value: Double): this.type = set("indentWidth", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IGroupSpacerStyleProps, IGroupSpacerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IGroupSpacerStyleProps => DeepPartial[IGroupSpacerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IGroupSpacerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
