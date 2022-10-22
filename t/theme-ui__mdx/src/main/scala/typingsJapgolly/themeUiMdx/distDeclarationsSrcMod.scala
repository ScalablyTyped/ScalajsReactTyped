package typingsJapgolly.themeUiMdx

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.themeUiMdx.anon.Css
import typingsJapgolly.themeUiMdx.themeUiMdxStrings.code
import typingsJapgolly.themeUiMdx.themeUiMdxStrings.div
import typingsJapgolly.themeUiMdx.themeUiMdxStrings.hr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcMod {
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", "MDXProvider")
  @js.native
  val MDXProvider: FC[MdxProviderProps] = js.native
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", "Themed")
  @js.native
  val Themed_ : ThemedDiv & ThemedComponentsDict = js.native
  
  @JSImport("@theme-ui/mdx/dist/declarations/src", "components")
  @js.native
  val components: ThemedComponentsDict = js.native
  
  inline def themed(key: String | ThemedComponentName): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("themed")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ /* theme */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSObject */ Any
  ]]
  
  trait Aliases extends StObject {
    
    val inlineCode: code
    
    val root: div
    
    val thematicBreak: hr
  }
  object Aliases {
    
    inline def apply(): Aliases = {
      val __obj = js.Dynamic.literal(inlineCode = "code", root = "div", thematicBreak = "hr")
      __obj.asInstanceOf[Aliases]
    }
    
    extension [Self <: Aliases](x: Self) {
      
      inline def setInlineCode(value: code): Self = StObject.set(x, "inlineCode", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: div): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setThematicBreak(value: hr): Self = StObject.set(x, "thematicBreak", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ key in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntrinsicSxElements * / any ]:? react.react.ComponentType<any> | string} */ trait MDXProviderComponents
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[ComponentType[Any] | String]]
  object MDXProviderComponents {
    
    inline def apply(): MDXProviderComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDXProviderComponents]
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntrinsicSxElements * / any ]:? react.react.ComponentType<any> | string}
    }}}
    */
  @js.native
  trait MDXProviderComponentsKnownKeys extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntrinsicSxElements * / any ]: 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'}
    }}}
    */
  @js.native
  trait MdxAliases extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.themeUiMdx.themeUiMdxStrings.inlineCode
    - typingsJapgolly.themeUiMdx.themeUiMdxStrings.thematicBreak
    - typingsJapgolly.themeUiMdx.themeUiMdxStrings.root
  */
  trait MdxAliasesKeys extends StObject
  object MdxAliasesKeys {
    
    inline def inlineCode: typingsJapgolly.themeUiMdx.themeUiMdxStrings.inlineCode = "inlineCode".asInstanceOf[typingsJapgolly.themeUiMdx.themeUiMdxStrings.inlineCode]
    
    inline def root: typingsJapgolly.themeUiMdx.themeUiMdxStrings.root = "root".asInstanceOf[typingsJapgolly.themeUiMdx.themeUiMdxStrings.root]
    
    inline def thematicBreak: typingsJapgolly.themeUiMdx.themeUiMdxStrings.thematicBreak = "thematicBreak".asInstanceOf[typingsJapgolly.themeUiMdx.themeUiMdxStrings.thematicBreak]
  }
  
  trait MdxProviderProps extends StObject {
    
    var children: Node
    
    var components: js.UndefOr[MDXProviderComponents] = js.undefined
  }
  object MdxProviderProps {
    
    inline def apply(): MdxProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[MdxProviderProps]
    }
    
    extension [Self <: MdxProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setComponents(value: MDXProviderComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  @js.native
  trait ThemedComponent[Name /* <: String */] extends StObject {
    
    def apply(
      props: (/* import warning: importer.ImportType#apply Failed type conversion: Name extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ? react.react.ComponentProps<Name> : {} */ js.Any) & Css
    ): typingsJapgolly.react.mod.global.JSX.Element = js.native
    
    var displayName: String = js.native
  }
  
  type ThemedComponentName = /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntrinsicSxElements * / any */ String
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IntrinsicSxElements * / any ]: K extends keyof @theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.Aliases? @theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.ThemedComponent<@theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.Aliases[K]> : K extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'? @theme-ui/mdx.@theme-ui/mdx/dist/declarations/src.ThemedComponent<K> : never}
    }}}
    */
  @js.native
  trait ThemedComponentsDict extends StObject
  
  type ThemedDiv = js.Function1[/* props */ ThemedDivProps, typingsJapgolly.react.mod.global.JSX.Element]
  
  type ThemedDivProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
  
  trait ThemedProps extends StObject {
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
  }
  object ThemedProps {
    
    inline def apply(
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): ThemedProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemedProps]
    }
    
    extension [Self <: ThemedProps](x: Self) {
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
