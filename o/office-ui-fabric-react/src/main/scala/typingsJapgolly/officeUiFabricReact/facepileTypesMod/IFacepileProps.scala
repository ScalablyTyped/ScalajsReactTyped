package typingsJapgolly.officeUiFabricReact.facepileTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.facepileBaseMod.FacepileBase
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFacepileProps extends ClassAttributes[FacepileBase] {
  /** Button properties for the add face button */
  var addButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /** ARIA label for persona list */
  var ariaDescription: js.UndefOr[String] = js.undefined
  /**
    * Defines the aria label that the screen readers use when focus goes on a list of personas.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated at v0.70, use `overflowButtonProps` instead.
    * @deprecated Use `overflowButtonProps` instead.
    */
  var chevronButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /**
    * Additional css class to apply to the Facepile
    * @defaultvalue undefined
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IFacepile interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IFacepile]] = js.undefined
  /** Method to access properties on the underlying Persona control */
  var getPersonaProps: js.UndefOr[js.Function1[/* persona */ IFacepilePersona, IPersonaSharedProps]] = js.undefined
  /** Maximum number of personas to show */
  var maxDisplayablePersonas: js.UndefOr[Double] = js.undefined
  /** Optional custom renderer for the persona, gets called when there is one persona in personas array*/
  var onRenderPersona: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.undefined
  /** Optional custom renderer for the persona coins, gets called when there are multiple persona in personas array*/
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.undefined
  /** Properties for the overflow icon */
  var overflowButtonProps: js.UndefOr[IButtonProps] = js.undefined
  /** Type of overflow icon to use */
  var overflowButtonType: js.UndefOr[OverflowButtonType] = js.undefined
  /**
    * Personas to place in the overflow
    */
  var overflowPersonas: js.UndefOr[js.Array[IFacepilePersona]] = js.undefined
  /** Size to display the personas */
  var personaSize: js.UndefOr[PersonaSize] = js.undefined
  /**
    * Array of IPersonaProps that define each Persona.
    */
  var personas: js.Array[IFacepilePersona]
  /** Show add person button */
  var showAddButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IFacepileProps {
  @scala.inline
  def apply(
    personas: js.Array[IFacepilePersona],
    addButtonProps: IButtonProps = null,
    ariaDescription: String = null,
    ariaLabel: String = null,
    chevronButtonProps: IButtonProps = null,
    className: String = null,
    componentRef: IRefObject[IFacepile] = null,
    getPersonaProps: /* persona */ IFacepilePersona => CallbackTo[IPersonaSharedProps] = null,
    key: Key = null,
    maxDisplayablePersonas: Int | Double = null,
    onRenderPersona: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => CallbackTo[Element | Null] = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], Element | Null]]) => CallbackTo[Element | Null] = null,
    overflowButtonProps: IButtonProps = null,
    overflowButtonType: OverflowButtonType = null,
    overflowPersonas: js.Array[IFacepilePersona] = null,
    personaSize: PersonaSize = null,
    ref: LegacyRef[FacepileBase] = null,
    showAddButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles] = null,
    theme: ITheme = null
  ): IFacepileProps = {
    val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    if (addButtonProps != null) __obj.updateDynamic("addButtonProps")(addButtonProps.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (chevronButtonProps != null) __obj.updateDynamic("chevronButtonProps")(chevronButtonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getPersonaProps != null) __obj.updateDynamic("getPersonaProps")(js.Any.fromFunction1((t0: /* persona */ typingsJapgolly.officeUiFabricReact.facepileTypesMod.IFacepilePersona) => getPersonaProps(t0).runNow()))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddButton)) __obj.updateDynamic("showAddButton")(showAddButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileProps]
  }
}

