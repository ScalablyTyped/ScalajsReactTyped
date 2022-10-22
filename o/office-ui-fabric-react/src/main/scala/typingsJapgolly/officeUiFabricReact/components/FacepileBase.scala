package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.IFacepile
import typingsJapgolly.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.IFacepilePersona
import typingsJapgolly.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.IFacepileProps
import typingsJapgolly.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.IFacepileStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.IFacepileStyles
import typingsJapgolly.officeUiFabricReact.libComponentsFacepileFacepileDottypesMod.OverflowButtonType
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaSharedProps
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.PersonaSize
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FacepileBase {
  
  inline def apply(personas: js.Array[IFacepilePersona]): Builder = {
    val __props = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IFacepileProps]))
  }
  
  @JSImport("office-ui-fabric-react", "FacepileBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.FacepileBase] {
    
    inline def addButtonProps(value: IButtonProps): this.type = set("addButtonProps", value.asInstanceOf[js.Any])
    
    inline def ariaDescription(value: String): this.type = set("ariaDescription", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def chevronButtonProps(value: IButtonProps): this.type = set("chevronButtonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IFacepile]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IFacepile | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IFacepile | Null) => value(t0).runNow()))
    
    inline def getPersonaProps(value: /* persona */ IFacepilePersona => IPersonaSharedProps): this.type = set("getPersonaProps", js.Any.fromFunction1(value))
    
    inline def maxDisplayablePersonas(value: Double): this.type = set("maxDisplayablePersonas", value.asInstanceOf[js.Any])
    
    inline def onRenderPersona(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null
    ): this.type = set("onRenderPersona", js.Any.fromFunction2(value))
    
    inline def onRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => Element | Null
    ): this.type = set("onRenderPersonaCoin", js.Any.fromFunction2(value))
    
    inline def overflowButtonProps(value: IButtonProps): this.type = set("overflowButtonProps", value.asInstanceOf[js.Any])
    
    inline def overflowButtonType(value: OverflowButtonType): this.type = set("overflowButtonType", value.asInstanceOf[js.Any])
    
    inline def overflowPersonas(value: js.Array[IFacepilePersona]): this.type = set("overflowPersonas", value.asInstanceOf[js.Any])
    
    inline def overflowPersonasVarargs(value: IFacepilePersona*): this.type = set("overflowPersonas", js.Array(value*))
    
    inline def personaSize(value: PersonaSize): this.type = set("personaSize", value.asInstanceOf[js.Any])
    
    inline def showAddButton(value: Boolean): this.type = set("showAddButton", value.asInstanceOf[js.Any])
    
    inline def showTooltip(value: Boolean): this.type = set("showTooltip", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IFacepileStyleProps => DeepPartial[IFacepileStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IFacepileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
