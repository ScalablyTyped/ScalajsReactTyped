package typingsJapgolly.storybookTheming.mod

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.DomElement
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.ReactSVGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.react.mod.global.JSX.IntrinsicElements
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionCacheNodeModules@emotionUtilsTypesIndexMod`.EmotionCache
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionCacheNodeModules@emotionUtilsTypesIndexMod`.SerializedStyles
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionCacheTypesIndexMod`.Options
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.CSSInterpolation
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactNodeModules@emotionSerializeTypesIndexMod`.Keyframes
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesIndexMod`.ClassNamesProps
import typingsJapgolly.storybookTheming.anon.Color
import typingsJapgolly.storybookTheming.anon.Styles
import typingsJapgolly.storybookTheming.anon.Typography
import typingsJapgolly.storybookTheming.mod.^
import typingsJapgolly.storybookTheming.storybookThemingStrings.input
import typingsJapgolly.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CacheProvider: Provider[EmotionCache] = ^.asInstanceOf[js.Dynamic].selectDynamic("CacheProvider").asInstanceOf[Provider[EmotionCache]]

inline def ClassNames(props: ClassNamesProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClassNames")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Global(props: Styles): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Global")(props.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def ThemeProvider: typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.ThemeProvider = ^.asInstanceOf[js.Dynamic].selectDynamic("ThemeProvider").asInstanceOf[typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesThemingMod`.ThemeProvider]

inline def convert(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")().asInstanceOf[Theme]
inline def convert(inherit: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(inherit.asInstanceOf[js.Any]).asInstanceOf[Theme]

inline def create(): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ThemeVars]
inline def create(vars: Unit, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]
inline def create(vars: ThemeVars): ThemeVars = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any]).asInstanceOf[ThemeVars]
inline def create(vars: ThemeVars, rest: Rest): ThemeVars = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(vars.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[ThemeVars]

inline def createCache(options: Options): EmotionCache = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")(options.asInstanceOf[js.Any]).asInstanceOf[EmotionCache]

inline def createGlobal(hasColorBackgroundTypography: Color): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobal")(hasColorBackgroundTypography.asInstanceOf[js.Any]).asInstanceOf[Return]

inline def createReset(hasTypography: Typography): Return = ^.asInstanceOf[js.Dynamic].applyDynamic("createReset")(hasTypography.asInstanceOf[js.Any]).asInstanceOf[Return]

inline def css(args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SerializedStyles]
inline def css(template: TemplateStringsArray, args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SerializedStyles]

inline def darken(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ensure(input: ThemeVars): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("ensure")(input.asInstanceOf[js.Any]).asInstanceOf[Theme]

inline def ignoreSsrWarning: /* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("ignoreSsrWarning").asInstanceOf[/* "/ * emotion-disable-server-rendering-unsafe-selector-warning-please-do-not-use-this-the-warning-exists-for-a-reason * /" */ String]

inline def isPropValid(string: PropertyKey): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropValid")(string.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def jsx(
  `type`: input,
  props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: Node*
): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def jsx(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def jsx(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def jsx[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: String, props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
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
inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.a_, typingsJapgolly.storybookTheming.storybookThemingStrings.abbr, typingsJapgolly.storybookTheming.storybookThemingStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: Node*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.a_, typingsJapgolly.storybookTheming.storybookThemingStrings.abbr, typingsJapgolly.storybookTheming.storybookThemingStrings.address */ Any,
  props: Null,
  children: Node*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def jsx[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.a_, typingsJapgolly.storybookTheming.storybookThemingStrings.abbr, typingsJapgolly.storybookTheming.storybookThemingStrings.address */ Any,
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
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.animate, typingsJapgolly.storybookTheming.storybookThemingStrings.circle, typingsJapgolly.storybookTheming.storybookThemingStrings.clipPath */ Any,
  props: ClassAttributes[T] & P,
  children: Node*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.animate, typingsJapgolly.storybookTheming.storybookThemingStrings.circle, typingsJapgolly.storybookTheming.storybookThemingStrings.clipPath */ Any,
  props: Null,
  children: Node*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def jsx_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.animate, typingsJapgolly.storybookTheming.storybookThemingStrings.circle, typingsJapgolly.storybookTheming.storybookThemingStrings.clipPath */ Any,
  props: Unit,
  children: Node*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

inline def jsx_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def jsx_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def jsx_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("jsx")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]

inline def keyframes(args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Keyframes]
inline def keyframes(template: TemplateStringsArray, args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Keyframes]

inline def lighten(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any]).asInstanceOf[String]

inline def styled: CreateStyled[Theme] = ^.asInstanceOf[js.Dynamic].selectDynamic("styled").asInstanceOf[CreateStyled[Theme]]

inline def useTheme[TTheme](): TTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[TTheme]

inline def withTheme[C /* <: ComponentType[Any] */](component: C): FC[AddOptionalTo[LibraryManagedAttributes[C, ComponentPropsWithRef[C]], theme]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[FC[AddOptionalTo[LibraryManagedAttributes[C, ComponentPropsWithRef[C]], theme]]]

type AddOptionalTo[T, U] = (DistributiveOmit[T, U]) & (Partial[Pick[T, Extract[/* keyof T */ String, U]]])

type CreateStyledComponentExtrinsic[Tag /* <: ComponentType[Any] */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[PropsOf[Tag], ExtraProps, Theme]

type CreateStyledComponentIntrinsic[Tag /* <: /* keyof @storybook/theming.@storybook/theming.JSXInEl */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.a_, typingsJapgolly.storybookTheming.storybookThemingStrings.abbr, typingsJapgolly.storybookTheming.storybookThemingStrings.address */ Any */, ExtraProps, Theme /* <: js.Object */] = CreateStyledComponentBase[
/* import warning: importer.ImportType#apply Failed type conversion: @storybook/theming.@storybook/theming.JSXInEl[Tag] */ js.Any, 
ExtraProps, 
Theme]

type JSXInEl = IntrinsicElements

type Overwrapped[T, U] = Pick[T, Extract[/* keyof T */ String, /* keyof U */ String]]

type PropsOf[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typingsJapgolly.storybookTheming.storybookThemingStrings.a_, typingsJapgolly.storybookTheming.storybookThemingStrings.abbr, typingsJapgolly.storybookTheming.storybookThemingStrings.address */ Any */] = LibraryManagedAttributes[C, ComponentPropsWithRef[C]]

type Rest = StringDictionary[Any]

type Return = StringDictionary[StringDictionary[Value]]

type TextSize = Double | String

type Value = String | Double
