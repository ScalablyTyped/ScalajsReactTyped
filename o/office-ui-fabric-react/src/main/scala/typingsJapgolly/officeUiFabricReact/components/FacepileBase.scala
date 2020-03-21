package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepile
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepileStyleProps
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepileStyles
import typingsJapgolly.officeUiFabricReact.facepileTypesMod.OverflowButtonType
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FacepileBase {
  def apply(
    personas: js.Array[IFacepilePersona],
    addButtonProps: IButtonProps = null,
    ariaDescription: String = null,
    ariaLabel: String = null,
    chevronButtonProps: IButtonProps = null,
    className: String = null,
    componentRef: IRefObject[IFacepile] = null,
    getPersonaProps: /* persona */ IFacepilePersona => CallbackTo[IPersonaSharedProps] = null,
    maxDisplayablePersonas: Int | Double = null,
    onRenderPersona: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => CallbackTo[Element | Null] = null,
    overflowButtonProps: IButtonProps = null,
    overflowButtonType: OverflowButtonType = null,
    overflowPersonas: js.Array[IFacepilePersona] = null,
    personaSize: PersonaSize = null,
    showAddButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IFacepileProps, 
    typingsJapgolly.officeUiFabricReact.mod.FacepileBase, 
    Unit, 
    IFacepileProps
  ] = {
    val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
  
      if (addButtonProps != null) __obj.updateDynamic("addButtonProps")(addButtonProps.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (chevronButtonProps != null) __obj.updateDynamic("chevronButtonProps")(chevronButtonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getPersonaProps != null) __obj.updateDynamic("getPersonaProps")(js.Any.fromFunction1((t0: /* persona */ typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona) => getPersonaProps(t0).runNow()))
    if (maxDisplayablePersonas != null) __obj.updateDynamic("maxDisplayablePersonas")(maxDisplayablePersonas.asInstanceOf[js.Any])
    if (onRenderPersona != null) __obj.updateDynamic("onRenderPersona")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderPersona(t0, t1).runNow()))
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2((t0: /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona], t1: /* defaultRender */ js.UndefOr[
  js.Function1[
    /* props */ js.UndefOr[typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]]) => onRenderPersonaCoin(t0, t1).runNow()))
    if (overflowButtonProps != null) __obj.updateDynamic("overflowButtonProps")(overflowButtonProps.asInstanceOf[js.Any])
    if (overflowButtonType != null) __obj.updateDynamic("overflowButtonType")(overflowButtonType.asInstanceOf[js.Any])
    if (overflowPersonas != null) __obj.updateDynamic("overflowPersonas")(overflowPersonas.asInstanceOf[js.Any])
    if (personaSize != null) __obj.updateDynamic("personaSize")(personaSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddButton)) __obj.updateDynamic("showAddButton")(showAddButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepileProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.FacepileBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepileProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "FacepileBase")
  @js.native
  object componentImport extends js.Object
  
}

