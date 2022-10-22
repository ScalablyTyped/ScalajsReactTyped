package typingsJapgolly.themeUiCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLAreaElement
import org.scalajs.dom.HTMLAudioElement
import org.scalajs.dom.HTMLBRElement
import org.scalajs.dom.HTMLBaseElement
import org.scalajs.dom.HTMLBodyElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLDListElement
import org.scalajs.dom.HTMLDataListElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLEmbedElement
import org.scalajs.dom.HTMLFieldSetElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLHRElement
import org.scalajs.dom.HTMLHeadElement
import org.scalajs.dom.HTMLHeadingElement
import org.scalajs.dom.HTMLHtmlElement
import org.scalajs.dom.HTMLIFrameElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLLegendElement
import org.scalajs.dom.HTMLLinkElement
import org.scalajs.dom.HTMLMapElement
import org.scalajs.dom.HTMLMetaElement
import org.scalajs.dom.HTMLModElement
import org.scalajs.dom.HTMLOListElement
import org.scalajs.dom.HTMLObjectElement
import org.scalajs.dom.HTMLOptGroupElement
import org.scalajs.dom.HTMLOptionElement
import org.scalajs.dom.HTMLParagraphElement
import org.scalajs.dom.HTMLParamElement
import org.scalajs.dom.HTMLPreElement
import org.scalajs.dom.HTMLProgressElement
import org.scalajs.dom.HTMLQuoteElement
import org.scalajs.dom.HTMLScriptElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLSourceElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.HTMLStyleElement
import org.scalajs.dom.HTMLTableColElement
import org.scalajs.dom.HTMLTableElement
import org.scalajs.dom.HTMLTableRowElement
import org.scalajs.dom.HTMLTableSectionElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalajs.dom.HTMLTitleElement
import org.scalajs.dom.HTMLTrackElement
import org.scalajs.dom.HTMLUListElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.SVGCircleElement
import org.scalajs.dom.SVGClipPathElement
import org.scalajs.dom.SVGDefsElement
import org.scalajs.dom.SVGDescElement
import org.scalajs.dom.SVGElement
import org.scalajs.dom.SVGEllipseElement
import org.scalajs.dom.SVGFEBlendElement
import org.scalajs.dom.SVGFEColorMatrixElement
import org.scalajs.dom.SVGFEComponentTransferElement
import org.scalajs.dom.SVGFECompositeElement
import org.scalajs.dom.SVGFEConvolveMatrixElement
import org.scalajs.dom.SVGFEDiffuseLightingElement
import org.scalajs.dom.SVGFEDisplacementMapElement
import org.scalajs.dom.SVGFEDistantLightElement
import org.scalajs.dom.SVGFEFloodElement
import org.scalajs.dom.SVGFEFuncAElement
import org.scalajs.dom.SVGFEFuncBElement
import org.scalajs.dom.SVGFEFuncGElement
import org.scalajs.dom.SVGFEFuncRElement
import org.scalajs.dom.SVGFEGaussianBlurElement
import org.scalajs.dom.SVGFEImageElement
import org.scalajs.dom.SVGFEMergeElement
import org.scalajs.dom.SVGFEMergeNodeElement
import org.scalajs.dom.SVGFEMorphologyElement
import org.scalajs.dom.SVGFEOffsetElement
import org.scalajs.dom.SVGFEPointLightElement
import org.scalajs.dom.SVGFESpecularLightingElement
import org.scalajs.dom.SVGFESpotLightElement
import org.scalajs.dom.SVGFETileElement
import org.scalajs.dom.SVGFETurbulenceElement
import org.scalajs.dom.SVGFilterElement
import org.scalajs.dom.SVGGElement
import org.scalajs.dom.SVGImageElement
import org.scalajs.dom.SVGLineElement
import org.scalajs.dom.SVGLinearGradientElement
import org.scalajs.dom.SVGMarkerElement
import org.scalajs.dom.SVGMaskElement
import org.scalajs.dom.SVGMetadataElement
import org.scalajs.dom.SVGPathElement
import org.scalajs.dom.SVGPatternElement
import org.scalajs.dom.SVGPolygonElement
import org.scalajs.dom.SVGPolylineElement
import org.scalajs.dom.SVGRadialGradientElement
import org.scalajs.dom.SVGRectElement
import org.scalajs.dom.SVGSVGElement
import org.scalajs.dom.SVGStopElement
import org.scalajs.dom.SVGSwitchElement
import org.scalajs.dom.SVGSymbolElement
import org.scalajs.dom.SVGTSpanElement
import org.scalajs.dom.SVGTextElement
import org.scalajs.dom.SVGTextPathElement
import org.scalajs.dom.SVGUseElement
import org.scalajs.dom.SVGViewElement
import typingsJapgolly.react.HTMLWebViewElement
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.AreaHTMLAttributes
import typingsJapgolly.react.mod.Attributes
import typingsJapgolly.react.mod.AudioHTMLAttributes
import typingsJapgolly.react.mod.BaseHTMLAttributes
import typingsJapgolly.react.mod.BlockquoteHTMLAttributes
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.CanvasHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ClassType
import typingsJapgolly.react.mod.ClassicComponent
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ColHTMLAttributes
import typingsJapgolly.react.mod.ColgroupHTMLAttributes
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.DataHTMLAttributes
import typingsJapgolly.react.mod.DelHTMLAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.react.mod.DetailsHTMLAttributes
import typingsJapgolly.react.mod.DialogHTMLAttributes
import typingsJapgolly.react.mod.EmbedHTMLAttributes
import typingsJapgolly.react.mod.FieldsetHTMLAttributes
import typingsJapgolly.react.mod.FormHTMLAttributes
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.HtmlHTMLAttributes
import typingsJapgolly.react.mod.IframeHTMLAttributes
import typingsJapgolly.react.mod.ImgHTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.InsHTMLAttributes
import typingsJapgolly.react.mod.KeygenHTMLAttributes
import typingsJapgolly.react.mod.LabelHTMLAttributes
import typingsJapgolly.react.mod.LiHTMLAttributes
import typingsJapgolly.react.mod.LinkHTMLAttributes
import typingsJapgolly.react.mod.MapHTMLAttributes
import typingsJapgolly.react.mod.MenuHTMLAttributes
import typingsJapgolly.react.mod.MetaHTMLAttributes
import typingsJapgolly.react.mod.MeterHTMLAttributes
import typingsJapgolly.react.mod.ObjectHTMLAttributes
import typingsJapgolly.react.mod.OlHTMLAttributes
import typingsJapgolly.react.mod.OptgroupHTMLAttributes
import typingsJapgolly.react.mod.OptionHTMLAttributes
import typingsJapgolly.react.mod.OutputHTMLAttributes
import typingsJapgolly.react.mod.ParamHTMLAttributes
import typingsJapgolly.react.mod.ProgressHTMLAttributes
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.react.mod.QuoteHTMLAttributes
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.react.mod.ScriptHTMLAttributes
import typingsJapgolly.react.mod.SelectHTMLAttributes
import typingsJapgolly.react.mod.SlotHTMLAttributes
import typingsJapgolly.react.mod.SourceHTMLAttributes
import typingsJapgolly.react.mod.StyleHTMLAttributes
import typingsJapgolly.react.mod.TableHTMLAttributes
import typingsJapgolly.react.mod.TdHTMLAttributes
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import typingsJapgolly.react.mod.ThHTMLAttributes
import typingsJapgolly.react.mod.TimeHTMLAttributes
import typingsJapgolly.react.mod.TrackHTMLAttributes
import typingsJapgolly.react.mod.VideoHTMLAttributes
import typingsJapgolly.react.mod.WebViewHTMLAttributes
import typingsJapgolly.std.HTMLDataElement
import typingsJapgolly.std.HTMLDetailsElement
import typingsJapgolly.std.HTMLDialogElement
import typingsJapgolly.std.HTMLMeterElement
import typingsJapgolly.std.HTMLOutputElement
import typingsJapgolly.std.HTMLSlotElement
import typingsJapgolly.std.HTMLTableDataCellElement
import typingsJapgolly.std.HTMLTableHeaderCellElement
import typingsJapgolly.std.HTMLTemplateElement
import typingsJapgolly.std.HTMLTimeElement
import typingsJapgolly.std.SVGFEDropShadowElement
import typingsJapgolly.std.SVGForeignObjectElement
import typingsJapgolly.themeUiCore.anon.FnCall
import typingsJapgolly.themeUiCore.distDeclarationsSrcTypesMod.SxProp
import typingsJapgolly.themeUiCore.themeUiCoreStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@theme-ui/core/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ThemeProvider(hasThemeChildren: ThemeProviderProps): FunctionComponentElement[ThemeUIInternalBaseThemeProviderProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(hasThemeChildren.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[ThemeUIInternalBaseThemeProviderProps]]
  
  @JSImport("@theme-ui/core/dist/declarations/src", "__ThemeUIContext")
  @js.native
  val ThemeUIContext: Context[ThemeUIContextValue] = js.native
  
  inline def ThemeUIInternalBaseThemeProvider(hasContextChildren: ThemeUIInternalBaseThemeProviderProps): FunctionComponentElement[ProviderProps[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("__ThemeUIInternalBaseThemeProvider")(hasContextChildren.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentElement[ProviderProps[js.Object]]]
  
  @JSImport("@theme-ui/core/dist/declarations/src", "createElement")
  @js.native
  val createElement: Any = js.native
  
  object jsx {
    
    inline def apply(
      `type`: input,
      props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
      children: Node*
    ): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    inline def apply(`type`: input, props: Null, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    inline def apply(`type`: input, props: Unit, children: Node*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
    inline def apply[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: ComponentClassP[P & js.Object], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: String, props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: String, props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: String, props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
      props: (ClassAttributes[ClassicComponent[P, js.Object]]) & P,
      children: Node*
    ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
    inline def apply[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
      props: Null,
      children: Node*
    ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
    inline def apply[P /* <: js.Object */](
      `type`: ClassType[P, ClassicComponent[P, js.Object], ClassicComponentClass[P]],
      props: Unit,
      children: Node*
    ): CElement[P, ClassicComponent[P, js.Object]] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, js.Object]]]
    inline def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Element]
    inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.themeUiCore.themeUiCoreStrings.a, typingsJapgolly.themeUiCore.themeUiCoreStrings.abbr, typingsJapgolly.themeUiCore.themeUiCoreStrings.address */ Any,
      props: ClassAttributes[T] & P,
      children: Node*
    ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.themeUiCore.themeUiCoreStrings.a, typingsJapgolly.themeUiCore.themeUiCoreStrings.abbr, typingsJapgolly.themeUiCore.themeUiCoreStrings.address */ Any,
      props: Null,
      children: Node*
    ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
      `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typingsJapgolly.themeUiCore.themeUiCoreStrings.a, typingsJapgolly.themeUiCore.themeUiCoreStrings.abbr, typingsJapgolly.themeUiCore.themeUiCoreStrings.address */ Any,
      props: Unit,
      children: Node*
    ): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
    
    @JSImport("@theme-ui/core/dist/declarations/src", "jsx")
    @js.native
    val ^ : js.Any = js.native
    
    object JSX {
      
      type Element = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.Element
      
      type ElementAttributesProperty = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.ElementAttributesProperty
      
      type ElementChildrenAttribute = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.ElementChildrenAttribute
      
      type ElementClass = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.ElementClass
      
      type IntrinsicAttributes = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.IntrinsicAttributes
      
      type IntrinsicClassAttributes[T] = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.IntrinsicClassAttributes[T]
      
      /* Inlined @theme-ui/core.@theme-ui/core/dist/declarations/src/jsx-namespace.ThemeUIJSX.IntrinsicElements */
      trait IntrinsicElements extends StObject {
        
        var a: (DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]) & SxProp
        
        var abbr: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var address: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var animate: SVGProps[SVGElement] & SxProp
        
        var animateMotion: SVGProps[SVGElement] & SxProp
        
        var animateTransform: SVGProps[SVGElement] & SxProp
        
        var area: (DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]) & SxProp
        
        var article: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var aside: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var audio: (DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]) & SxProp
        
        var b: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var base: (DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]) & SxProp
        
        var bdi: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var bdo: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var big: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var blockquote: (DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]) & SxProp
        
        var body: (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) & SxProp
        
        var br: (DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement]) & SxProp
        
        var button: (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]) & SxProp
        
        var canvas: (DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]) & SxProp
        
        var caption: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var circle: SVGProps[SVGCircleElement] & SxProp
        
        var cite: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var clipPath: SVGProps[SVGClipPathElement] & SxProp
        
        var code: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var col: (DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]) & SxProp
        
        var colgroup: (DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]) & SxProp
        
        var data: (DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement]) & SxProp
        
        var datalist: (DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement]) & SxProp
        
        var dd: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var defs: SVGProps[SVGDefsElement] & SxProp
        
        var del: (DetailedHTMLProps[DelHTMLAttributes[HTMLModElement], HTMLModElement]) & SxProp
        
        var desc: SVGProps[SVGDescElement] & SxProp
        
        var details: (DetailedHTMLProps[DetailsHTMLAttributes[HTMLDetailsElement], HTMLDetailsElement]) & SxProp
        
        var dfn: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var dialog: (DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]) & SxProp
        
        var div: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) & SxProp
        
        var dl: (DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement]) & SxProp
        
        var dt: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var ellipse: SVGProps[SVGEllipseElement] & SxProp
        
        var em: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var embed: (DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]) & SxProp
        
        var feBlend: SVGProps[SVGFEBlendElement] & SxProp
        
        var feColorMatrix: SVGProps[SVGFEColorMatrixElement] & SxProp
        
        var feComponentTransfer: SVGProps[SVGFEComponentTransferElement] & SxProp
        
        var feComposite: SVGProps[SVGFECompositeElement] & SxProp
        
        var feConvolveMatrix: SVGProps[SVGFEConvolveMatrixElement] & SxProp
        
        var feDiffuseLighting: SVGProps[SVGFEDiffuseLightingElement] & SxProp
        
        var feDisplacementMap: SVGProps[SVGFEDisplacementMapElement] & SxProp
        
        var feDistantLight: SVGProps[SVGFEDistantLightElement] & SxProp
        
        var feDropShadow: SVGProps[SVGFEDropShadowElement] & SxProp
        
        var feFlood: SVGProps[SVGFEFloodElement] & SxProp
        
        var feFuncA: SVGProps[SVGFEFuncAElement] & SxProp
        
        var feFuncB: SVGProps[SVGFEFuncBElement] & SxProp
        
        var feFuncG: SVGProps[SVGFEFuncGElement] & SxProp
        
        var feFuncR: SVGProps[SVGFEFuncRElement] & SxProp
        
        var feGaussianBlur: SVGProps[SVGFEGaussianBlurElement] & SxProp
        
        var feImage: SVGProps[SVGFEImageElement] & SxProp
        
        var feMerge: SVGProps[SVGFEMergeElement] & SxProp
        
        var feMergeNode: SVGProps[SVGFEMergeNodeElement] & SxProp
        
        var feMorphology: SVGProps[SVGFEMorphologyElement] & SxProp
        
        var feOffset: SVGProps[SVGFEOffsetElement] & SxProp
        
        var fePointLight: SVGProps[SVGFEPointLightElement] & SxProp
        
        var feSpecularLighting: SVGProps[SVGFESpecularLightingElement] & SxProp
        
        var feSpotLight: SVGProps[SVGFESpotLightElement] & SxProp
        
        var feTile: SVGProps[SVGFETileElement] & SxProp
        
        var feTurbulence: SVGProps[SVGFETurbulenceElement] & SxProp
        
        var fieldset: (DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]) & SxProp
        
        var figcaption: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var figure: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var filter: SVGProps[SVGFilterElement] & SxProp
        
        var footer: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var foreignObject: SVGProps[SVGForeignObjectElement] & SxProp
        
        var form: (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]) & SxProp
        
        var g: SVGProps[SVGGElement] & SxProp
        
        var h1: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp
        
        var h2: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp
        
        var h3: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp
        
        var h4: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp
        
        var h5: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp
        
        var h6: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp
        
        var head: (DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]) & SxProp
        
        var header: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var hgroup: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var hr: (DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]) & SxProp
        
        var html: (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) & SxProp
        
        var i: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var iframe: (DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]) & SxProp
        
        var image: SVGProps[SVGImageElement] & SxProp
        
        var img: (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]) & SxProp
        
        var input: (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]) & SxProp
        
        var ins: (DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement]) & SxProp
        
        var kbd: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var keygen: (DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var label: (DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]) & SxProp
        
        var legend: (DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement]) & SxProp
        
        var li: (DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]) & SxProp
        
        var line: SVGProps[SVGLineElement] & SxProp
        
        var linearGradient: SVGProps[SVGLinearGradientElement] & SxProp
        
        var link: (DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]) & SxProp
        
        var main: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var map: (DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement]) & SxProp
        
        var mark: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var marker: SVGProps[SVGMarkerElement] & SxProp
        
        var mask: SVGProps[SVGMaskElement] & SxProp
        
        var menu: (DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var menuitem: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var meta: (DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]) & SxProp
        
        var metadata: SVGProps[SVGMetadataElement] & SxProp
        
        var meter: (DetailedHTMLProps[MeterHTMLAttributes[HTMLMeterElement], HTMLMeterElement]) & SxProp
        
        var mpath: SVGProps[SVGElement] & SxProp
        
        var nav: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var noindex: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var noscript: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var `object`: (DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]) & SxProp
        
        var ol: (DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]) & SxProp
        
        var optgroup: (DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]) & SxProp
        
        var option: (DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]) & SxProp
        
        var output: (DetailedHTMLProps[OutputHTMLAttributes[HTMLOutputElement], HTMLOutputElement]) & SxProp
        
        var p: (DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]) & SxProp
        
        var param: (DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]) & SxProp
        
        var path: SVGProps[SVGPathElement] & SxProp
        
        var pattern: SVGProps[SVGPatternElement] & SxProp
        
        var picture: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var polygon: SVGProps[SVGPolygonElement] & SxProp
        
        var polyline: SVGProps[SVGPolylineElement] & SxProp
        
        var pre: (DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement]) & SxProp
        
        var progress: (DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]) & SxProp
        
        var q: (DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]) & SxProp
        
        var radialGradient: SVGProps[SVGRadialGradientElement] & SxProp
        
        var rect: SVGProps[SVGRectElement] & SxProp
        
        var rp: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var rt: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var ruby: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var s: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var samp: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var script: (DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]) & SxProp
        
        var section: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var select: (DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]) & SxProp
        
        var slot: (DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement]) & SxProp
        
        var small: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var source: (DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]) & SxProp
        
        var span: (DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]) & SxProp
        
        var stop: SVGProps[SVGStopElement] & SxProp
        
        var strong: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var style: (DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]) & SxProp
        
        var sub: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var summary: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var sup: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var svg: SVGProps[SVGSVGElement] & SxProp
        
        var switch: SVGProps[SVGSwitchElement] & SxProp
        
        var symbol: SVGProps[SVGSymbolElement] & SxProp
        
        var table: (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]) & SxProp
        
        var tbody: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp
        
        var td: (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement]) & SxProp
        
        var template: (DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement]) & SxProp
        
        var text: SVGProps[SVGTextElement] & SxProp
        
        var textPath: SVGProps[SVGTextPathElement] & SxProp
        
        var textarea: (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]) & SxProp
        
        var tfoot: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp
        
        var th: (DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement]) & SxProp
        
        var thead: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp
        
        var time: (DetailedHTMLProps[TimeHTMLAttributes[HTMLTimeElement], HTMLTimeElement]) & SxProp
        
        var title: (DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement]) & SxProp
        
        var tr: (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]) & SxProp
        
        var track: (DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]) & SxProp
        
        var tspan: SVGProps[SVGTSpanElement] & SxProp
        
        var u: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var ul: (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]) & SxProp
        
        var use: SVGProps[SVGUseElement] & SxProp
        
        var `var`: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var video: (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & SxProp
        
        var view: SVGProps[SVGViewElement] & SxProp
        
        var wbr: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp
        
        var webview: (DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]) & SxProp
      }
      object IntrinsicElements {
        
        inline def apply(
          a: (DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]) & SxProp,
          abbr: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          address: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          animate: SVGProps[SVGElement] & SxProp,
          animateMotion: SVGProps[SVGElement] & SxProp,
          animateTransform: SVGProps[SVGElement] & SxProp,
          area: (DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]) & SxProp,
          article: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          aside: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          audio: (DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]) & SxProp,
          b: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          base: (DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]) & SxProp,
          bdi: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          bdo: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          big: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          blockquote: (DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]) & SxProp,
          body: (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) & SxProp,
          br: (DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement]) & SxProp,
          button: (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]) & SxProp,
          canvas: (DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]) & SxProp,
          caption: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          circle: SVGProps[SVGCircleElement] & SxProp,
          cite: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          clipPath: SVGProps[SVGClipPathElement] & SxProp,
          code: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          col: (DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]) & SxProp,
          colgroup: (DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]) & SxProp,
          data: (DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement]) & SxProp,
          datalist: (DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement]) & SxProp,
          dd: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          defs: SVGProps[SVGDefsElement] & SxProp,
          del: (DetailedHTMLProps[DelHTMLAttributes[HTMLModElement], HTMLModElement]) & SxProp,
          desc: SVGProps[SVGDescElement] & SxProp,
          details: (DetailedHTMLProps[DetailsHTMLAttributes[HTMLDetailsElement], HTMLDetailsElement]) & SxProp,
          dfn: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          dialog: (DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]) & SxProp,
          div: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) & SxProp,
          dl: (DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement]) & SxProp,
          dt: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          ellipse: SVGProps[SVGEllipseElement] & SxProp,
          em: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          embed: (DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]) & SxProp,
          feBlend: SVGProps[SVGFEBlendElement] & SxProp,
          feColorMatrix: SVGProps[SVGFEColorMatrixElement] & SxProp,
          feComponentTransfer: SVGProps[SVGFEComponentTransferElement] & SxProp,
          feComposite: SVGProps[SVGFECompositeElement] & SxProp,
          feConvolveMatrix: SVGProps[SVGFEConvolveMatrixElement] & SxProp,
          feDiffuseLighting: SVGProps[SVGFEDiffuseLightingElement] & SxProp,
          feDisplacementMap: SVGProps[SVGFEDisplacementMapElement] & SxProp,
          feDistantLight: SVGProps[SVGFEDistantLightElement] & SxProp,
          feDropShadow: SVGProps[SVGFEDropShadowElement] & SxProp,
          feFlood: SVGProps[SVGFEFloodElement] & SxProp,
          feFuncA: SVGProps[SVGFEFuncAElement] & SxProp,
          feFuncB: SVGProps[SVGFEFuncBElement] & SxProp,
          feFuncG: SVGProps[SVGFEFuncGElement] & SxProp,
          feFuncR: SVGProps[SVGFEFuncRElement] & SxProp,
          feGaussianBlur: SVGProps[SVGFEGaussianBlurElement] & SxProp,
          feImage: SVGProps[SVGFEImageElement] & SxProp,
          feMerge: SVGProps[SVGFEMergeElement] & SxProp,
          feMergeNode: SVGProps[SVGFEMergeNodeElement] & SxProp,
          feMorphology: SVGProps[SVGFEMorphologyElement] & SxProp,
          feOffset: SVGProps[SVGFEOffsetElement] & SxProp,
          fePointLight: SVGProps[SVGFEPointLightElement] & SxProp,
          feSpecularLighting: SVGProps[SVGFESpecularLightingElement] & SxProp,
          feSpotLight: SVGProps[SVGFESpotLightElement] & SxProp,
          feTile: SVGProps[SVGFETileElement] & SxProp,
          feTurbulence: SVGProps[SVGFETurbulenceElement] & SxProp,
          fieldset: (DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]) & SxProp,
          figcaption: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          figure: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          filter: SVGProps[SVGFilterElement] & SxProp,
          footer: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          foreignObject: SVGProps[SVGForeignObjectElement] & SxProp,
          form: (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]) & SxProp,
          g: SVGProps[SVGGElement] & SxProp,
          h1: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp,
          h2: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp,
          h3: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp,
          h4: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp,
          h5: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp,
          h6: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp,
          head: (DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]) & SxProp,
          header: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          hgroup: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          hr: (DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]) & SxProp,
          html: (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) & SxProp,
          i: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          iframe: (DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]) & SxProp,
          image: SVGProps[SVGImageElement] & SxProp,
          img: (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]) & SxProp,
          input: (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]) & SxProp,
          ins: (DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement]) & SxProp,
          kbd: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          keygen: (DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          label: (DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]) & SxProp,
          legend: (DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement]) & SxProp,
          li: (DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]) & SxProp,
          line: SVGProps[SVGLineElement] & SxProp,
          linearGradient: SVGProps[SVGLinearGradientElement] & SxProp,
          link: (DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]) & SxProp,
          main: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          map: (DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement]) & SxProp,
          mark: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          marker: SVGProps[SVGMarkerElement] & SxProp,
          mask: SVGProps[SVGMaskElement] & SxProp,
          menu: (DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          menuitem: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          meta: (DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]) & SxProp,
          metadata: SVGProps[SVGMetadataElement] & SxProp,
          meter: (DetailedHTMLProps[MeterHTMLAttributes[HTMLMeterElement], HTMLMeterElement]) & SxProp,
          mpath: SVGProps[SVGElement] & SxProp,
          nav: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          noindex: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          noscript: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          `object`: (DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]) & SxProp,
          ol: (DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]) & SxProp,
          optgroup: (DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]) & SxProp,
          option: (DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]) & SxProp,
          output: (DetailedHTMLProps[OutputHTMLAttributes[HTMLOutputElement], HTMLOutputElement]) & SxProp,
          p: (DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]) & SxProp,
          param: (DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]) & SxProp,
          path: SVGProps[SVGPathElement] & SxProp,
          pattern: SVGProps[SVGPatternElement] & SxProp,
          picture: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          polygon: SVGProps[SVGPolygonElement] & SxProp,
          polyline: SVGProps[SVGPolylineElement] & SxProp,
          pre: (DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement]) & SxProp,
          progress: (DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]) & SxProp,
          q: (DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]) & SxProp,
          radialGradient: SVGProps[SVGRadialGradientElement] & SxProp,
          rect: SVGProps[SVGRectElement] & SxProp,
          rp: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          rt: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          ruby: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          s: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          samp: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          script: (DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]) & SxProp,
          section: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          select: (DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]) & SxProp,
          slot: (DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement]) & SxProp,
          small: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          source: (DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]) & SxProp,
          span: (DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]) & SxProp,
          stop: SVGProps[SVGStopElement] & SxProp,
          strong: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          style: (DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]) & SxProp,
          sub: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          summary: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          sup: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          svg: SVGProps[SVGSVGElement] & SxProp,
          switch: SVGProps[SVGSwitchElement] & SxProp,
          symbol: SVGProps[SVGSymbolElement] & SxProp,
          table: (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]) & SxProp,
          tbody: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp,
          td: (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement]) & SxProp,
          template: (DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement]) & SxProp,
          text: SVGProps[SVGTextElement] & SxProp,
          textPath: SVGProps[SVGTextPathElement] & SxProp,
          textarea: (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]) & SxProp,
          tfoot: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp,
          th: (DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement]) & SxProp,
          thead: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp,
          time: (DetailedHTMLProps[TimeHTMLAttributes[HTMLTimeElement], HTMLTimeElement]) & SxProp,
          title: (DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement]) & SxProp,
          tr: (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]) & SxProp,
          track: (DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]) & SxProp,
          tspan: SVGProps[SVGTSpanElement] & SxProp,
          u: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          ul: (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]) & SxProp,
          use: SVGProps[SVGUseElement] & SxProp,
          `var`: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          video: (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & SxProp,
          view: SVGProps[SVGViewElement] & SxProp,
          wbr: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp,
          webview: (DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]) & SxProp
        ): IntrinsicElements = {
          val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], animateMotion = animateMotion.asInstanceOf[js.Any], animateTransform = animateTransform.asInstanceOf[js.Any], area = area.asInstanceOf[js.Any], article = article.asInstanceOf[js.Any], aside = aside.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], bdi = bdi.asInstanceOf[js.Any], bdo = bdo.asInstanceOf[js.Any], big = big.asInstanceOf[js.Any], blockquote = blockquote.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], circle = circle.asInstanceOf[js.Any], cite = cite.asInstanceOf[js.Any], clipPath = clipPath.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], colgroup = colgroup.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], datalist = datalist.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], defs = defs.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dfn = dfn.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], dl = dl.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], ellipse = ellipse.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], feBlend = feBlend.asInstanceOf[js.Any], feColorMatrix = feColorMatrix.asInstanceOf[js.Any], feComponentTransfer = feComponentTransfer.asInstanceOf[js.Any], feComposite = feComposite.asInstanceOf[js.Any], feConvolveMatrix = feConvolveMatrix.asInstanceOf[js.Any], feDiffuseLighting = feDiffuseLighting.asInstanceOf[js.Any], feDisplacementMap = feDisplacementMap.asInstanceOf[js.Any], feDistantLight = feDistantLight.asInstanceOf[js.Any], feDropShadow = feDropShadow.asInstanceOf[js.Any], feFlood = feFlood.asInstanceOf[js.Any], feFuncA = feFuncA.asInstanceOf[js.Any], feFuncB = feFuncB.asInstanceOf[js.Any], feFuncG = feFuncG.asInstanceOf[js.Any], feFuncR = feFuncR.asInstanceOf[js.Any], feGaussianBlur = feGaussianBlur.asInstanceOf[js.Any], feImage = feImage.asInstanceOf[js.Any], feMerge = feMerge.asInstanceOf[js.Any], feMergeNode = feMergeNode.asInstanceOf[js.Any], feMorphology = feMorphology.asInstanceOf[js.Any], feOffset = feOffset.asInstanceOf[js.Any], fePointLight = fePointLight.asInstanceOf[js.Any], feSpecularLighting = feSpecularLighting.asInstanceOf[js.Any], feSpotLight = feSpotLight.asInstanceOf[js.Any], feTile = feTile.asInstanceOf[js.Any], feTurbulence = feTurbulence.asInstanceOf[js.Any], fieldset = fieldset.asInstanceOf[js.Any], figcaption = figcaption.asInstanceOf[js.Any], figure = figure.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], foreignObject = foreignObject.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], hgroup = hgroup.asInstanceOf[js.Any], hr = hr.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], kbd = kbd.asInstanceOf[js.Any], keygen = keygen.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], li = li.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linearGradient = linearGradient.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mark = mark.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], meter = meter.asInstanceOf[js.Any], mpath = mpath.asInstanceOf[js.Any], nav = nav.asInstanceOf[js.Any], noindex = noindex.asInstanceOf[js.Any], noscript = noscript.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], optgroup = optgroup.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], radialGradient = radialGradient.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], ruby = ruby.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], samp = samp.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], tbody = tbody.asInstanceOf[js.Any], td = td.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textPath = textPath.asInstanceOf[js.Any], textarea = textarea.asInstanceOf[js.Any], tfoot = tfoot.asInstanceOf[js.Any], th = th.asInstanceOf[js.Any], thead = thead.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], tspan = tspan.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], wbr = wbr.asInstanceOf[js.Any], webview = webview.asInstanceOf[js.Any])
          __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
          __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
          __obj.asInstanceOf[IntrinsicElements]
        }
        
        extension [Self <: IntrinsicElements](x: Self) {
          
          inline def setA(value: (DetailedHTMLProps[AnchorHTMLAttributes[HTMLAnchorElement], HTMLAnchorElement]) & SxProp): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
          
          inline def setAbbr(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
          
          inline def setAddress(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
          
          inline def setAnimate(value: SVGProps[SVGElement] & SxProp): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
          
          inline def setAnimateMotion(value: SVGProps[SVGElement] & SxProp): Self = StObject.set(x, "animateMotion", value.asInstanceOf[js.Any])
          
          inline def setAnimateTransform(value: SVGProps[SVGElement] & SxProp): Self = StObject.set(x, "animateTransform", value.asInstanceOf[js.Any])
          
          inline def setArea(value: (DetailedHTMLProps[AreaHTMLAttributes[HTMLAreaElement], HTMLAreaElement]) & SxProp): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
          
          inline def setArticle(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "article", value.asInstanceOf[js.Any])
          
          inline def setAside(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "aside", value.asInstanceOf[js.Any])
          
          inline def setAudio(value: (DetailedHTMLProps[AudioHTMLAttributes[HTMLAudioElement], HTMLAudioElement]) & SxProp): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
          
          inline def setB(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
          
          inline def setBase(value: (DetailedHTMLProps[BaseHTMLAttributes[HTMLBaseElement], HTMLBaseElement]) & SxProp): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
          
          inline def setBdi(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "bdi", value.asInstanceOf[js.Any])
          
          inline def setBdo(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "bdo", value.asInstanceOf[js.Any])
          
          inline def setBig(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "big", value.asInstanceOf[js.Any])
          
          inline def setBlockquote(value: (DetailedHTMLProps[BlockquoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]) & SxProp): Self = StObject.set(x, "blockquote", value.asInstanceOf[js.Any])
          
          inline def setBody(value: (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) & SxProp): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
          
          inline def setBr(value: (DetailedHTMLProps[HTMLAttributes[HTMLBRElement], HTMLBRElement]) & SxProp): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
          
          inline def setButton(value: (DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]) & SxProp): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
          
          inline def setCanvas(value: (DetailedHTMLProps[CanvasHTMLAttributes[HTMLCanvasElement], HTMLCanvasElement]) & SxProp): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
          
          inline def setCaption(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
          
          inline def setCircle(value: SVGProps[SVGCircleElement] & SxProp): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
          
          inline def setCite(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
          
          inline def setClipPath(value: SVGProps[SVGClipPathElement] & SxProp): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
          
          inline def setCode(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          inline def setCol(value: (DetailedHTMLProps[ColHTMLAttributes[HTMLTableColElement], HTMLTableColElement]) & SxProp): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
          
          inline def setColgroup(
            value: (DetailedHTMLProps[ColgroupHTMLAttributes[HTMLTableColElement], HTMLTableColElement]) & SxProp
          ): Self = StObject.set(x, "colgroup", value.asInstanceOf[js.Any])
          
          inline def setData(value: (DetailedHTMLProps[DataHTMLAttributes[HTMLDataElement], HTMLDataElement]) & SxProp): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setDatalist(value: (DetailedHTMLProps[HTMLAttributes[HTMLDataListElement], HTMLDataListElement]) & SxProp): Self = StObject.set(x, "datalist", value.asInstanceOf[js.Any])
          
          inline def setDd(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
          
          inline def setDefs(value: SVGProps[SVGDefsElement] & SxProp): Self = StObject.set(x, "defs", value.asInstanceOf[js.Any])
          
          inline def setDel(value: (DetailedHTMLProps[DelHTMLAttributes[HTMLModElement], HTMLModElement]) & SxProp): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
          
          inline def setDesc(value: SVGProps[SVGDescElement] & SxProp): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
          
          inline def setDetails(value: (DetailedHTMLProps[DetailsHTMLAttributes[HTMLDetailsElement], HTMLDetailsElement]) & SxProp): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          inline def setDfn(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "dfn", value.asInstanceOf[js.Any])
          
          inline def setDialog(value: (DetailedHTMLProps[DialogHTMLAttributes[HTMLDialogElement], HTMLDialogElement]) & SxProp): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
          
          inline def setDiv(value: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) & SxProp): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
          
          inline def setDl(value: (DetailedHTMLProps[HTMLAttributes[HTMLDListElement], HTMLDListElement]) & SxProp): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
          
          inline def setDt(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
          
          inline def setEllipse(value: SVGProps[SVGEllipseElement] & SxProp): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
          
          inline def setEm(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
          
          inline def setEmbed(value: (DetailedHTMLProps[EmbedHTMLAttributes[HTMLEmbedElement], HTMLEmbedElement]) & SxProp): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
          
          inline def setFeBlend(value: SVGProps[SVGFEBlendElement] & SxProp): Self = StObject.set(x, "feBlend", value.asInstanceOf[js.Any])
          
          inline def setFeColorMatrix(value: SVGProps[SVGFEColorMatrixElement] & SxProp): Self = StObject.set(x, "feColorMatrix", value.asInstanceOf[js.Any])
          
          inline def setFeComponentTransfer(value: SVGProps[SVGFEComponentTransferElement] & SxProp): Self = StObject.set(x, "feComponentTransfer", value.asInstanceOf[js.Any])
          
          inline def setFeComposite(value: SVGProps[SVGFECompositeElement] & SxProp): Self = StObject.set(x, "feComposite", value.asInstanceOf[js.Any])
          
          inline def setFeConvolveMatrix(value: SVGProps[SVGFEConvolveMatrixElement] & SxProp): Self = StObject.set(x, "feConvolveMatrix", value.asInstanceOf[js.Any])
          
          inline def setFeDiffuseLighting(value: SVGProps[SVGFEDiffuseLightingElement] & SxProp): Self = StObject.set(x, "feDiffuseLighting", value.asInstanceOf[js.Any])
          
          inline def setFeDisplacementMap(value: SVGProps[SVGFEDisplacementMapElement] & SxProp): Self = StObject.set(x, "feDisplacementMap", value.asInstanceOf[js.Any])
          
          inline def setFeDistantLight(value: SVGProps[SVGFEDistantLightElement] & SxProp): Self = StObject.set(x, "feDistantLight", value.asInstanceOf[js.Any])
          
          inline def setFeDropShadow(value: SVGProps[SVGFEDropShadowElement] & SxProp): Self = StObject.set(x, "feDropShadow", value.asInstanceOf[js.Any])
          
          inline def setFeFlood(value: SVGProps[SVGFEFloodElement] & SxProp): Self = StObject.set(x, "feFlood", value.asInstanceOf[js.Any])
          
          inline def setFeFuncA(value: SVGProps[SVGFEFuncAElement] & SxProp): Self = StObject.set(x, "feFuncA", value.asInstanceOf[js.Any])
          
          inline def setFeFuncB(value: SVGProps[SVGFEFuncBElement] & SxProp): Self = StObject.set(x, "feFuncB", value.asInstanceOf[js.Any])
          
          inline def setFeFuncG(value: SVGProps[SVGFEFuncGElement] & SxProp): Self = StObject.set(x, "feFuncG", value.asInstanceOf[js.Any])
          
          inline def setFeFuncR(value: SVGProps[SVGFEFuncRElement] & SxProp): Self = StObject.set(x, "feFuncR", value.asInstanceOf[js.Any])
          
          inline def setFeGaussianBlur(value: SVGProps[SVGFEGaussianBlurElement] & SxProp): Self = StObject.set(x, "feGaussianBlur", value.asInstanceOf[js.Any])
          
          inline def setFeImage(value: SVGProps[SVGFEImageElement] & SxProp): Self = StObject.set(x, "feImage", value.asInstanceOf[js.Any])
          
          inline def setFeMerge(value: SVGProps[SVGFEMergeElement] & SxProp): Self = StObject.set(x, "feMerge", value.asInstanceOf[js.Any])
          
          inline def setFeMergeNode(value: SVGProps[SVGFEMergeNodeElement] & SxProp): Self = StObject.set(x, "feMergeNode", value.asInstanceOf[js.Any])
          
          inline def setFeMorphology(value: SVGProps[SVGFEMorphologyElement] & SxProp): Self = StObject.set(x, "feMorphology", value.asInstanceOf[js.Any])
          
          inline def setFeOffset(value: SVGProps[SVGFEOffsetElement] & SxProp): Self = StObject.set(x, "feOffset", value.asInstanceOf[js.Any])
          
          inline def setFePointLight(value: SVGProps[SVGFEPointLightElement] & SxProp): Self = StObject.set(x, "fePointLight", value.asInstanceOf[js.Any])
          
          inline def setFeSpecularLighting(value: SVGProps[SVGFESpecularLightingElement] & SxProp): Self = StObject.set(x, "feSpecularLighting", value.asInstanceOf[js.Any])
          
          inline def setFeSpotLight(value: SVGProps[SVGFESpotLightElement] & SxProp): Self = StObject.set(x, "feSpotLight", value.asInstanceOf[js.Any])
          
          inline def setFeTile(value: SVGProps[SVGFETileElement] & SxProp): Self = StObject.set(x, "feTile", value.asInstanceOf[js.Any])
          
          inline def setFeTurbulence(value: SVGProps[SVGFETurbulenceElement] & SxProp): Self = StObject.set(x, "feTurbulence", value.asInstanceOf[js.Any])
          
          inline def setFieldset(
            value: (DetailedHTMLProps[FieldsetHTMLAttributes[HTMLFieldSetElement], HTMLFieldSetElement]) & SxProp
          ): Self = StObject.set(x, "fieldset", value.asInstanceOf[js.Any])
          
          inline def setFigcaption(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "figcaption", value.asInstanceOf[js.Any])
          
          inline def setFigure(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "figure", value.asInstanceOf[js.Any])
          
          inline def setFilter(value: SVGProps[SVGFilterElement] & SxProp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
          
          inline def setFooter(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
          
          inline def setForeignObject(value: SVGProps[SVGForeignObjectElement] & SxProp): Self = StObject.set(x, "foreignObject", value.asInstanceOf[js.Any])
          
          inline def setForm(value: (DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement]) & SxProp): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
          
          inline def setG(value: SVGProps[SVGGElement] & SxProp): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
          
          inline def setH1(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
          
          inline def setH2(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
          
          inline def setH3(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
          
          inline def setH4(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
          
          inline def setH5(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
          
          inline def setH6(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement]) & SxProp): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
          
          inline def setHead(value: (DetailedHTMLProps[HTMLAttributes[HTMLHeadElement], HTMLHeadElement]) & SxProp): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
          
          inline def setHeader(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
          
          inline def setHgroup(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "hgroup", value.asInstanceOf[js.Any])
          
          inline def setHr(value: (DetailedHTMLProps[HTMLAttributes[HTMLHRElement], HTMLHRElement]) & SxProp): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
          
          inline def setHtml(value: (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) & SxProp): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
          
          inline def setI(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
          
          inline def setIframe(value: (DetailedHTMLProps[IframeHTMLAttributes[HTMLIFrameElement], HTMLIFrameElement]) & SxProp): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
          
          inline def setImage(value: SVGProps[SVGImageElement] & SxProp): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImg(value: (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement]) & SxProp): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
          
          inline def setInput(value: (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]) & SxProp): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
          
          inline def setIns(value: (DetailedHTMLProps[InsHTMLAttributes[HTMLModElement], HTMLModElement]) & SxProp): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
          
          inline def setKbd(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "kbd", value.asInstanceOf[js.Any])
          
          inline def setKeygen(value: (DetailedHTMLProps[KeygenHTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "keygen", value.asInstanceOf[js.Any])
          
          inline def setLabel(value: (DetailedHTMLProps[LabelHTMLAttributes[HTMLLabelElement], HTMLLabelElement]) & SxProp): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          inline def setLegend(value: (DetailedHTMLProps[HTMLAttributes[HTMLLegendElement], HTMLLegendElement]) & SxProp): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
          
          inline def setLi(value: (DetailedHTMLProps[LiHTMLAttributes[HTMLLIElement], HTMLLIElement]) & SxProp): Self = StObject.set(x, "li", value.asInstanceOf[js.Any])
          
          inline def setLine(value: SVGProps[SVGLineElement] & SxProp): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
          
          inline def setLinearGradient(value: SVGProps[SVGLinearGradientElement] & SxProp): Self = StObject.set(x, "linearGradient", value.asInstanceOf[js.Any])
          
          inline def setLink(value: (DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]) & SxProp): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
          
          inline def setMain(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
          
          inline def setMap(value: (DetailedHTMLProps[MapHTMLAttributes[HTMLMapElement], HTMLMapElement]) & SxProp): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
          
          inline def setMark(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
          
          inline def setMarker(value: SVGProps[SVGMarkerElement] & SxProp): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
          
          inline def setMask(value: SVGProps[SVGMaskElement] & SxProp): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
          
          inline def setMenu(value: (DetailedHTMLProps[MenuHTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
          
          inline def setMenuitem(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
          
          inline def setMeta(value: (DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]) & SxProp): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
          
          inline def setMetadata(value: SVGProps[SVGMetadataElement] & SxProp): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
          
          inline def setMeter(value: (DetailedHTMLProps[MeterHTMLAttributes[HTMLMeterElement], HTMLMeterElement]) & SxProp): Self = StObject.set(x, "meter", value.asInstanceOf[js.Any])
          
          inline def setMpath(value: SVGProps[SVGElement] & SxProp): Self = StObject.set(x, "mpath", value.asInstanceOf[js.Any])
          
          inline def setNav(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
          
          inline def setNoindex(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "noindex", value.asInstanceOf[js.Any])
          
          inline def setNoscript(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "noscript", value.asInstanceOf[js.Any])
          
          inline def setObject(value: (DetailedHTMLProps[ObjectHTMLAttributes[HTMLObjectElement], HTMLObjectElement]) & SxProp): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
          
          inline def setOl(value: (DetailedHTMLProps[OlHTMLAttributes[HTMLOListElement], HTMLOListElement]) & SxProp): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
          
          inline def setOptgroup(
            value: (DetailedHTMLProps[OptgroupHTMLAttributes[HTMLOptGroupElement], HTMLOptGroupElement]) & SxProp
          ): Self = StObject.set(x, "optgroup", value.asInstanceOf[js.Any])
          
          inline def setOption(value: (DetailedHTMLProps[OptionHTMLAttributes[HTMLOptionElement], HTMLOptionElement]) & SxProp): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
          
          inline def setOutput(value: (DetailedHTMLProps[OutputHTMLAttributes[HTMLOutputElement], HTMLOutputElement]) & SxProp): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
          
          inline def setP(value: (DetailedHTMLProps[HTMLAttributes[HTMLParagraphElement], HTMLParagraphElement]) & SxProp): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
          
          inline def setParam(value: (DetailedHTMLProps[ParamHTMLAttributes[HTMLParamElement], HTMLParamElement]) & SxProp): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
          
          inline def setPath(value: SVGProps[SVGPathElement] & SxProp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          inline def setPattern(value: SVGProps[SVGPatternElement] & SxProp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          inline def setPicture(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
          
          inline def setPolygon(value: SVGProps[SVGPolygonElement] & SxProp): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
          
          inline def setPolyline(value: SVGProps[SVGPolylineElement] & SxProp): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
          
          inline def setPre(value: (DetailedHTMLProps[HTMLAttributes[HTMLPreElement], HTMLPreElement]) & SxProp): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
          
          inline def setProgress(
            value: (DetailedHTMLProps[ProgressHTMLAttributes[HTMLProgressElement], HTMLProgressElement]) & SxProp
          ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
          
          inline def setQ(value: (DetailedHTMLProps[QuoteHTMLAttributes[HTMLQuoteElement], HTMLQuoteElement]) & SxProp): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
          
          inline def setRadialGradient(value: SVGProps[SVGRadialGradientElement] & SxProp): Self = StObject.set(x, "radialGradient", value.asInstanceOf[js.Any])
          
          inline def setRect(value: SVGProps[SVGRectElement] & SxProp): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
          
          inline def setRp(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
          
          inline def setRt(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
          
          inline def setRuby(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "ruby", value.asInstanceOf[js.Any])
          
          inline def setS(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
          
          inline def setSamp(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "samp", value.asInstanceOf[js.Any])
          
          inline def setScript(value: (DetailedHTMLProps[ScriptHTMLAttributes[HTMLScriptElement], HTMLScriptElement]) & SxProp): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
          
          inline def setSection(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
          
          inline def setSelect(value: (DetailedHTMLProps[SelectHTMLAttributes[HTMLSelectElement], HTMLSelectElement]) & SxProp): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
          
          inline def setSlot(value: (DetailedHTMLProps[SlotHTMLAttributes[HTMLSlotElement], HTMLSlotElement]) & SxProp): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
          
          inline def setSmall(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
          
          inline def setSource(value: (DetailedHTMLProps[SourceHTMLAttributes[HTMLSourceElement], HTMLSourceElement]) & SxProp): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          inline def setSpan(value: (DetailedHTMLProps[HTMLAttributes[HTMLSpanElement], HTMLSpanElement]) & SxProp): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
          
          inline def setStop(value: SVGProps[SVGStopElement] & SxProp): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
          
          inline def setStrong(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
          
          inline def setStyle(value: (DetailedHTMLProps[StyleHTMLAttributes[HTMLStyleElement], HTMLStyleElement]) & SxProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
          
          inline def setSub(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
          
          inline def setSummary(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
          
          inline def setSup(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
          
          inline def setSvg(value: SVGProps[SVGSVGElement] & SxProp): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
          
          inline def setSwitch(value: SVGProps[SVGSwitchElement] & SxProp): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
          
          inline def setSymbol(value: SVGProps[SVGSymbolElement] & SxProp): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
          
          inline def setTable(value: (DetailedHTMLProps[TableHTMLAttributes[HTMLTableElement], HTMLTableElement]) & SxProp): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
          
          inline def setTbody(
            value: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp
          ): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
          
          inline def setTd(
            value: (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement]) & SxProp
          ): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
          
          inline def setTemplate(value: (DetailedHTMLProps[HTMLAttributes[HTMLTemplateElement], HTMLTemplateElement]) & SxProp): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
          
          inline def setText(value: SVGProps[SVGTextElement] & SxProp): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setTextPath(value: SVGProps[SVGTextPathElement] & SxProp): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
          
          inline def setTextarea(
            value: (DetailedHTMLProps[TextareaHTMLAttributes[HTMLTextAreaElement], HTMLTextAreaElement]) & SxProp
          ): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
          
          inline def setTfoot(
            value: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp
          ): Self = StObject.set(x, "tfoot", value.asInstanceOf[js.Any])
          
          inline def setTh(
            value: (DetailedHTMLProps[ThHTMLAttributes[HTMLTableHeaderCellElement], HTMLTableHeaderCellElement]) & SxProp
          ): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
          
          inline def setThead(
            value: (DetailedHTMLProps[HTMLAttributes[HTMLTableSectionElement], HTMLTableSectionElement]) & SxProp
          ): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
          
          inline def setTime(value: (DetailedHTMLProps[TimeHTMLAttributes[HTMLTimeElement], HTMLTimeElement]) & SxProp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
          
          inline def setTitle(value: (DetailedHTMLProps[HTMLAttributes[HTMLTitleElement], HTMLTitleElement]) & SxProp): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTr(value: (DetailedHTMLProps[HTMLAttributes[HTMLTableRowElement], HTMLTableRowElement]) & SxProp): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
          
          inline def setTrack(value: (DetailedHTMLProps[TrackHTMLAttributes[HTMLTrackElement], HTMLTrackElement]) & SxProp): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
          
          inline def setTspan(value: SVGProps[SVGTSpanElement] & SxProp): Self = StObject.set(x, "tspan", value.asInstanceOf[js.Any])
          
          inline def setU(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
          
          inline def setUl(value: (DetailedHTMLProps[HTMLAttributes[HTMLUListElement], HTMLUListElement]) & SxProp): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
          
          inline def setUse(value: SVGProps[SVGUseElement] & SxProp): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
          
          inline def setVar(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
          
          inline def setVideo(value: (DetailedHTMLProps[VideoHTMLAttributes[HTMLVideoElement], HTMLVideoElement]) & SxProp): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
          
          inline def setView(value: SVGProps[SVGViewElement] & SxProp): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
          
          inline def setWbr(value: (DetailedHTMLProps[HTMLAttributes[HTMLElement], HTMLElement]) & SxProp): Self = StObject.set(x, "wbr", value.asInstanceOf[js.Any])
          
          inline def setWebview(value: (DetailedHTMLProps[WebViewHTMLAttributes[HTMLWebViewElement], HTMLWebViewElement]) & SxProp): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
        }
      }
      
      type LibraryManagedAttributes[C, P] = typingsJapgolly.themeUiCore.distDeclarationsSrcJsxNamespaceMod.ThemeUIJSX.LibraryManagedAttributes[C, P]
    }
  }
  
  object merge {
    
    inline def apply(
      a: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any,
      b: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): Any = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("@theme-ui/core/dist/declarations/src", "merge")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@theme-ui/core/dist/declarations/src", "merge.all")
    @js.native
    def all: FnCall = js.native
    inline def all_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@theme-ui/core/dist/declarations/src", "__themeUiDefaultContextValue")
  @js.native
  val themeUiDefaultContextValue: ThemeUIContextValue = js.native
  
  inline def useThemeUI(): ThemeUIContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeUI")().asInstanceOf[ThemeUIContextValue]
  
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ])
  }
  object ThemeProviderProps {
    
    inline def apply(
      theme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
        ])
    ): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    extension [Self <: ThemeProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTheme(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any) | (js.Function1[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
            ])
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeFunction1(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* outerTheme */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", js.Any.fromFunction1(value))
    }
  }
  
  trait ThemeUIContextValue extends StObject {
    
    var __EMOTION_VERSION__ : String
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
  }
  object ThemeUIContextValue {
    
    inline def apply(
      __EMOTION_VERSION__ : String,
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): ThemeUIContextValue = {
      val __obj = js.Dynamic.literal(__EMOTION_VERSION__ = __EMOTION_VERSION__.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeUIContextValue]
    }
    
    extension [Self <: ThemeUIContextValue](x: Self) {
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def set__EMOTION_VERSION__(value: String): Self = StObject.set(x, "__EMOTION_VERSION__", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeUIInternalBaseThemeProviderProps extends StObject {
    
    var children: Node
    
    var context: ThemeUIContextValue
  }
  object ThemeUIInternalBaseThemeProviderProps {
    
    inline def apply(context: ThemeUIContextValue): ThemeUIInternalBaseThemeProviderProps = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ThemeUIInternalBaseThemeProviderProps]
    }
    
    extension [Self <: ThemeUIInternalBaseThemeProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContext(value: ThemeUIContextValue): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
