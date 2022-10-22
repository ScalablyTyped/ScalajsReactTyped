package typingsJapgolly.themeUi

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.HTMLProgressElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Record
import typingsJapgolly.themeUi.anon.CloseProps
import typingsJapgolly.themeUi.anon.Sx
import typingsJapgolly.themeUi.themeUiStrings.input
import typingsJapgolly.themeUiColorModes.anon.DangerouslySetInnerHTML
import typingsJapgolly.themeUiComponents.anon.Size
import typingsJapgolly.themeUiComponents.distDeclarationsSrcAlertMod.AlertProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcAspectImageMod.AspectImageProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcAspectRatioMod.AspectRatioProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcAvatarMod.AvatarProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcBadgeMod.BadgeProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcBoxMod.BoxProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcButtonMod.ButtonProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcCardMod.CardProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcCheckboxMod.CheckboxProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcContainerMod.ContainerProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcDividerMod.DividerProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcDonutMod.DonutProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcEmbedMod.EmbedProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcFlexMod.FlexProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcGridMod.GridProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcHeadingMod.HeadingProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcIconButtonMod.IconButtonProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcImageMod.ImageProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcInputMod.InputProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcLabelMod.LabelProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcLinkMod.LinkProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcMenuButtonMod.MenuButtonProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcMessageMod.MessageProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcNavLinkMod.NavLinkProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcParagraphMod.ParagraphProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcProgressMod.ProgressProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcRadioMod.RadioProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSelectMod.SelectProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSliderMod.SliderProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSpinnerMod.SpinnerProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcSwitchMod.SwitchProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcTextMod.TextProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcTextareaMod.TextareaProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import typingsJapgolly.themeUiCore.anon.FnCall
import typingsJapgolly.themeUiCore.distDeclarationsSrcMod.ThemeUIContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("theme-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("theme-ui", "Alert")
  @js.native
  val Alert: ForwardRef[HTMLDivElement, AlertProps] = js.native
  
  @JSImport("theme-ui", "AspectImage")
  @js.native
  val AspectImage: ForwardRef[HTMLImageElement, AspectImageProps] = js.native
  
  @JSImport("theme-ui", "AspectRatio")
  @js.native
  val AspectRatio: ForwardRef[HTMLDivElement, AspectRatioProps] = js.native
  
  @JSImport("theme-ui", "Avatar")
  @js.native
  val Avatar: ForwardRef[HTMLImageElement, AvatarProps] = js.native
  
  @JSImport("theme-ui", "Badge")
  @js.native
  val Badge: ForwardRef[HTMLDivElement, BadgeProps] = js.native
  
  inline def BaseStyles(props: (Record[String, Any]) & Sx): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BaseStyles")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("theme-ui", "Box")
  @js.native
  val Box: ForwardRefExoticComponent[BoxProps & RefAttributes[Any]] = js.native
  
  @JSImport("theme-ui", "Button")
  @js.native
  val Button: ForwardRef[HTMLButtonElement, ButtonProps] = js.native
  
  @JSImport("theme-ui", "Card")
  @js.native
  val Card: ForwardRef[HTMLDivElement, CardProps] = js.native
  
  @JSImport("theme-ui", "Checkbox")
  @js.native
  val Checkbox: ForwardRef[HTMLInputElement, CheckboxProps] = js.native
  
  @JSImport("theme-ui", "Close")
  @js.native
  val Close: ForwardRef[HTMLButtonElement, CloseProps] = js.native
  
  @JSImport("theme-ui", "CloseIcon")
  @js.native
  val CloseIcon: Element = js.native
  
  @JSImport("theme-ui", "Container")
  @js.native
  val Container: ForwardRef[HTMLDivElement, ContainerProps] = js.native
  
  @JSImport("theme-ui", "Divider")
  @js.native
  val Divider: ForwardRef[HTMLDivElement, DividerProps] = js.native
  
  @JSImport("theme-ui", "Donut")
  @js.native
  val Donut: ForwardRef[SVGSVGElement, DonutProps] = js.native
  
  @JSImport("theme-ui", "Embed")
  @js.native
  val Embed: ForwardRef[HTMLIFrameElement, EmbedProps] = js.native
  
  @JSImport("theme-ui", "Field")
  @js.native
  val Field: typingsJapgolly.themeUiComponents.distDeclarationsSrcFieldMod.Field = js.native
  
  @JSImport("theme-ui", "Flex")
  @js.native
  val Flex: ForwardRef[HTMLElement, FlexProps] = js.native
  
  @JSImport("theme-ui", "Grid")
  @js.native
  val Grid: ForwardRef[HTMLDivElement, GridProps] = js.native
  
  @JSImport("theme-ui", "Heading")
  @js.native
  val Heading: ForwardRef[HTMLHeadingElement, HeadingProps] = js.native
  
  @JSImport("theme-ui", "IconButton")
  @js.native
  val IconButton: ForwardRef[HTMLButtonElement, IconButtonProps] = js.native
  
  @JSImport("theme-ui", "Image")
  @js.native
  val Image: ForwardRef[HTMLImageElement, ImageProps] = js.native
  
  inline def InitializeColorMode(): DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("InitializeColorMode")().asInstanceOf[DetailedReactHTMLElement[DangerouslySetInnerHTML, HTMLElement]]
  
  @JSImport("theme-ui", "Input")
  @js.native
  val Input: ForwardRef[HTMLInputElement, InputProps] = js.native
  
  @JSImport("theme-ui", "Label")
  @js.native
  val Label: ForwardRef[HTMLLabelElement, LabelProps] = js.native
  
  @JSImport("theme-ui", "Link")
  @js.native
  val Link: ForwardRef[HTMLAnchorElement, LinkProps] = js.native
  
  @JSImport("theme-ui", "MenuButton")
  @js.native
  val MenuButton: ForwardRef[HTMLButtonElement, MenuButtonProps] = js.native
  
  inline def MenuIcon(hasSize: Size): typingsJapgolly.emotionReact.mod.jsx.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuIcon")(hasSize.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.emotionReact.mod.jsx.JSX.Element]
  
  @JSImport("theme-ui", "Message")
  @js.native
  val Message: ForwardRef[HTMLDivElement, MessageProps] = js.native
  
  @JSImport("theme-ui", "NavLink")
  @js.native
  val NavLink: ForwardRef[HTMLAnchorElement, NavLinkProps] = js.native
  
  @JSImport("theme-ui", "Paragraph")
  @js.native
  val Paragraph: ForwardRef[HTMLParagraphElement, ParagraphProps] = js.native
  
  @JSImport("theme-ui", "Progress")
  @js.native
  val Progress: ForwardRef[HTMLProgressElement, ProgressProps] = js.native
  
  @JSImport("theme-ui", "Radio")
  @js.native
  val Radio: ForwardRef[HTMLInputElement, RadioProps] = js.native
  
  @JSImport("theme-ui", "Select")
  @js.native
  val Select: ForwardRef[HTMLSelectElement, SelectProps] = js.native
  
  @JSImport("theme-ui", "Slider")
  @js.native
  val Slider: ForwardRef[HTMLInputElement, SliderProps] = js.native
  
  @JSImport("theme-ui", "Spinner")
  @js.native
  val Spinner: ForwardRef[SVGSVGElement, SpinnerProps] = js.native
  
  @JSImport("theme-ui", "Switch")
  @js.native
  val Switch: ForwardRef[HTMLInputElement, SwitchProps] = js.native
  
  @JSImport("theme-ui", "Text")
  @js.native
  val Text: ForwardRef[HTMLDivElement, TextProps] = js.native
  
  @JSImport("theme-ui", "Textarea")
  @js.native
  val Textarea: ForwardRef[HTMLTextAreaElement, TextareaProps] = js.native
  
  @JSImport("theme-ui", "__ThemeUIContext")
  @js.native
  val ThemeUIContext: Context[ThemeUIContextValue] = js.native
  
  @JSImport("theme-ui", "createElement")
  @js.native
  val createElement: Any = js.native
  
  inline def isBoxStyledSystemProp(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("__isBoxStyledSystemProp")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jsx(
    `type`: input,
    props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
    children: Node*
  ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Null, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: (ClassAttributes[ClassicComponent[P, js.Object]]) & P,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: Null,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
  inline def jsx[P /* <: js.Object */](
    `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
    props: Unit,
    children: Node*
  ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): japgolly.scalajs.react.facade.React.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[japgolly.scalajs.react.facade.React.Element]
  inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.themeUi.themeUiStrings.a, typingsJapgolly.themeUi.themeUiStrings.abbr, typingsJapgolly.themeUi.themeUiStrings.address */ Any,
    props: ClassAttributes[T] & P,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.themeUi.themeUiStrings.a, typingsJapgolly.themeUi.themeUiStrings.abbr, typingsJapgolly.themeUi.themeUiStrings.address */ Any,
    props: Null,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.themeUi.themeUiStrings.a, typingsJapgolly.themeUi.themeUiStrings.abbr, typingsJapgolly.themeUi.themeUiStrings.address */ Any,
    props: Unit,
    children: Node*
  ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
  
  inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Null, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  inline def jsx_PTC_CElement[P /* <: js.Object */, T /* <: Component[P & js.Object, js.Object] */, C /* <: ComponentClassP[P & js.Object] */](`type`: ClassType[P, T, C], props: Unit, children: Node*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
  
  inline def jsx_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: ClassAttributes[T] & P, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  inline def jsx_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Null, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  inline def jsx_PT_DomElement[P /* <: DOMAttributes[T] */, T /* <: org.scalajs.dom.Element */](`type`: String, props: Unit, children: Node*): DomElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DomElement]
  
  inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.themeUi.themeUiStrings.animate, typingsJapgolly.themeUi.themeUiStrings.circle, typingsJapgolly.themeUi.themeUiStrings.clipPath */ Any,
    props: ClassAttributes[T] & P,
    children: Node*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.themeUi.themeUiStrings.animate, typingsJapgolly.themeUi.themeUiStrings.circle, typingsJapgolly.themeUi.themeUiStrings.clipPath */ Any,
    props: Null,
    children: Node*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.themeUi.themeUiStrings.animate, typingsJapgolly.themeUi.themeUiStrings.circle, typingsJapgolly.themeUi.themeUiStrings.clipPath */ Any,
    props: Unit,
    children: Node*
  ): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
  
  inline def jsx_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  inline def jsx_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
  
  object merge {
    
    inline def apply(
      a: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any,
      b: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("theme-ui", "merge")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("theme-ui", "merge.all")
    @js.native
    def all: FnCall = js.native
    inline def all_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  }
  
  inline def useColorMode[T /* <: String */](): js.Tuple2[T, Dispatch[SetStateAction[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useColorMode")().asInstanceOf[js.Tuple2[T, Dispatch[SetStateAction[T]]]]
  
  inline def useThemeUI(): ThemeUIContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeUI")().asInstanceOf[ThemeUIContextValue]
}
