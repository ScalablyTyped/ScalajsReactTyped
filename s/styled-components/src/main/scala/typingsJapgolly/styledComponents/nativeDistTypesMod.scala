package typingsJapgolly.styledComponents

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ExoticComponent
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Array
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.AsAs
import typingsJapgolly.styledComponents.anon.`176`
import typingsJapgolly.styledComponents.nativeDistModelsThemeProviderMod.DefaultTheme
import typingsJapgolly.styledComponents.styledComponentsStrings.$as
import typingsJapgolly.styledComponents.styledComponentsStrings.as
import typingsJapgolly.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistTypesMod {
  
  type AnyComponent[P] = ExoticComponentWithDisplayName[P] | ComponentType[P]
  
  type Attrs[Props] = (ExtensibleObject & Props) | (js.Function1[/* props */ ExecutionContext & Props, Partial[Props]])
  
  type BaseExtensibleObject = StringDictionary[Any]
  
  type CSSProp = String | StyledObject[ExecutionContext] | StyleFunction[BaseExtensibleObject]
  
  trait CommonStatics[R /* <: Runtime */, Props] extends StObject {
    
    var attrs: js.Array[Attrs[Props]]
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp[R]] = js.undefined
    
    var target: StyledTarget[R]
    
    var withComponent: Any
  }
  object CommonStatics {
    
    inline def apply[R /* <: Runtime */, Props](attrs: js.Array[Attrs[Props]], target: StyledTarget[R], withComponent: Any): CommonStatics[R, Props] = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = withComponent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonStatics[R, Props]]
    }
    
    extension [Self <: CommonStatics[?, ?], R /* <: Runtime */, Props](x: Self & (CommonStatics[R, Props])) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setShouldForwardProp(value: (/* prop */ String, /* elementToBeCreated */ js.UndefOr[StyledTarget[R]]) => Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction2(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
      
      inline def setTarget(value: StyledTarget[R]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWithComponent(value: Any): Self = StObject.set(x, "withComponent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionContext
    extends StObject
       with ExtensibleObject {
    
    @JSName("theme")
    var theme_ExecutionContext: DefaultTheme
  }
  object ExecutionContext {
    
    inline def apply(theme: DefaultTheme): ExecutionContext = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionContext]
    }
    
    extension [Self <: ExecutionContext](x: Self) {
      
      inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExoticComponentWithDisplayName[P]
    extends StObject
       with ExoticComponent[P] {
    
    var defaultProps: js.UndefOr[Partial[P]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
  }
  
  trait ExtensibleObject
    extends StObject
       with BaseExtensibleObject {
    
    @JSName("$as")
    var $as: js.UndefOr[KnownTarget] = js.undefined
    
    @JSName("$forwardedAs")
    var $forwardedAs: js.UndefOr[KnownTarget] = js.undefined
    
    var as: js.UndefOr[KnownTarget] = js.undefined
    
    var forwardedAs: js.UndefOr[KnownTarget] = js.undefined
    
    var theme: js.UndefOr[DefaultTheme] = js.undefined
  }
  object ExtensibleObject {
    
    inline def apply(): ExtensibleObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtensibleObject]
    }
    
    extension [Self <: ExtensibleObject](x: Self) {
      
      inline def set$as(value: KnownTarget): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
      
      inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
      
      inline def set$forwardedAs(value: KnownTarget): Self = StObject.set(x, "$forwardedAs", value.asInstanceOf[js.Any])
      
      inline def set$forwardedAsUndefined: Self = StObject.set(x, "$forwardedAs", js.undefined)
      
      inline def setAs(value: KnownTarget): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setForwardedAs(value: KnownTarget): Self = StObject.set(x, "forwardedAs", value.asInstanceOf[js.Any])
      
      inline def setForwardedAsUndefined: Self = StObject.set(x, "forwardedAs", js.undefined)
      
      inline def setTheme(value: DefaultTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait Flattener[Props] extends StObject {
    
    def apply(chunks: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: js.Object, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Null, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
    def apply(chunks: js.Array[Interpolation[Props]], executionContext: Unit, styleSheet: js.Object): js.Array[Interpolation[Props]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledComponents.nativeDistTypesMod.RuleSet[Props]
    - scala.Double
    - java.lang.String
    - js.Array[java.lang.String]
    - typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent[scala.Any, scala.Any, scala.Any]
    - typingsJapgolly.styledComponents.nativeDistTypesMod.Keyframes
  */
  type FlattenerResult[Props] = _FlattenerResult[Props] | js.Array[String] | (IStyledComponent[Any, Any, Any]) | Double | String
  
  trait IInlineStyle[Props] extends StObject {
    
    def generateStyleObject(executionContext: js.Object): js.Object
    
    var rules: RuleSet[Props]
  }
  object IInlineStyle {
    
    inline def apply[Props](generateStyleObject: js.Object => js.Object, rules: RuleSet[Props]): IInlineStyle[Props] = {
      val __obj = js.Dynamic.literal(generateStyleObject = js.Any.fromFunction1(generateStyleObject), rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInlineStyle[Props]]
    }
    
    extension [Self <: IInlineStyle[?], Props](x: Self & IInlineStyle[Props]) {
      
      inline def setGenerateStyleObject(value: js.Object => js.Object): Self = StObject.set(x, "generateStyleObject", js.Any.fromFunction1(value))
      
      inline def setRules(value: RuleSet[Props]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IInlineStyleConstructor[Props]
    extends StObject
       with Instantiable1[/* rules */ RuleSet[Props], IInlineStyle[Props]]
  
  @js.native
  trait IStyledComponent[R /* <: Runtime */, Target /* <: StyledTarget[R] */, Props /* <: js.Object */]
    extends StObject
       with PolymorphicComponent[R, Target, Props, ExecutionContext]
       with IStyledStatics[R, Props] {
    
    @JSName("defaultProps")
    var defaultProps_IStyledComponent: js.UndefOr[
        Partial[
          ExtensibleObject & (/* import warning: importer.ImportType#apply Failed type conversion: Target extends styled-components.styled-components/native/dist/types.KnownTarget ? react.react.ComponentProps<Target> : {} */ js.Any) & Props
        ]
      ] = js.native
  }
  
  @js.native
  trait IStyledComponentFactory[R /* <: Runtime */, Target /* <: StyledTarget[R] */, Props /* <: js.Object */, Statics] extends StObject {
    
    def apply(target: Target, options: StyledOptions[R, Props], rules: RuleSet[Props]): (IStyledComponent[R, Target, Props]) & Statics = js.native
  }
  
  trait IStyledStatics[R /* <: Runtime */, OuterProps /* <: js.Object */]
    extends StObject
       with CommonStatics[R, OuterProps] {
    
    var componentStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? styled-components.styled-components/native/dist/models/ComponentStyle.default : never */ js.Any
    
    var foldedComponentIds: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.Array<string> : never */ js.Any
    
    var inlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'native' ? std.InstanceType<styled-components.styled-components/native/dist/types.IInlineStyleConstructor<OuterProps>> : never */ js.Any
    
    var styledComponentId: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
    
    var warnTooManyClasses: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.ReturnType<(displayName : string, componentId : string): (className : string): void> : never */ js.Any
      ] = js.undefined
    
    @JSName("withComponent")
    def withComponent_MIStyledStatics[Target /* <: StyledTarget[R] */, Props](tag: Target): IStyledComponent[R, Target, OuterProps & Props]
  }
  object IStyledStatics {
    
    inline def apply[R /* <: Runtime */, OuterProps /* <: js.Object */](
      attrs: js.Array[Attrs[OuterProps]],
      componentStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? styled-components.styled-components/native/dist/models/ComponentStyle.default : never */ js.Any,
      foldedComponentIds: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.Array<string> : never */ js.Any,
      inlineStyle: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'native' ? std.InstanceType<styled-components.styled-components/native/dist/types.IInlineStyleConstructor<OuterProps>> : never */ js.Any,
      styledComponentId: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any,
      target: StyledTarget[R],
      withComponent: Any => IStyledComponent[R, Any, OuterProps & Any]
    ): IStyledStatics[R, OuterProps] = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], componentStyle = componentStyle.asInstanceOf[js.Any], foldedComponentIds = foldedComponentIds.asInstanceOf[js.Any], inlineStyle = inlineStyle.asInstanceOf[js.Any], styledComponentId = styledComponentId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = js.Any.fromFunction1(withComponent))
      __obj.asInstanceOf[IStyledStatics[R, OuterProps]]
    }
    
    extension [Self <: IStyledStatics[?, ?], R /* <: Runtime */, OuterProps /* <: js.Object */](x: Self & (IStyledStatics[R, OuterProps])) {
      
      inline def setComponentStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? styled-components.styled-components/native/dist/models/ComponentStyle.default : never */ js.Any
      ): Self = StObject.set(x, "componentStyle", value.asInstanceOf[js.Any])
      
      inline def setFoldedComponentIds(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.Array<string> : never */ js.Any
      ): Self = StObject.set(x, "foldedComponentIds", value.asInstanceOf[js.Any])
      
      inline def setInlineStyle(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'native' ? std.InstanceType<styled-components.styled-components/native/dist/types.IInlineStyleConstructor<OuterProps>> : never */ js.Any
      ): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
      
      inline def setStyledComponentId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ): Self = StObject.set(x, "styledComponentId", value.asInstanceOf[js.Any])
      
      inline def setWarnTooManyClasses(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? std.ReturnType<(displayName : string, componentId : string): (className : string): void> : never */ js.Any
      ): Self = StObject.set(x, "warnTooManyClasses", value.asInstanceOf[js.Any])
      
      inline def setWarnTooManyClassesUndefined: Self = StObject.set(x, "warnTooManyClasses", js.undefined)
      
      inline def setWithComponent(value: Any => IStyledComponent[R, Any, OuterProps & Any]): Self = StObject.set(x, "withComponent", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledComponents.nativeDistTypesMod.StyleFunction[Props]
    - typingsJapgolly.styledComponents.nativeDistTypesMod.StyledObject[Props]
    - typingsJapgolly.std.TemplateStringsArray
    - java.lang.String
    - scala.Double
    - typingsJapgolly.styledComponents.styledComponentsBooleans.`false`
    - scala.Unit
    - scala.Null
    - typingsJapgolly.styledComponents.nativeDistTypesMod.Keyframes
    - typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent[typingsJapgolly.styledComponents.styledComponentsStrings.web, scala.Any, scala.Any]
    - js.Array[scala.Any]
  */
  type Interpolation[Props] = js.UndefOr[
    _Interpolation[Props] | (IStyledComponent[web, Any, Any]) | js.Array[Any] | StyledObject[Props] | TemplateStringsArray | String | Double | Null
  ]
  
  trait Keyframes
    extends StObject
       with _FlattenerResult[Any]
       with _Interpolation[Any] {
    
    var id: String
    
    var name: String
    
    var rules: String
  }
  object Keyframes {
    
    inline def apply(id: String, name: String, rules: String): Keyframes = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keyframes]
    }
    
    extension [Self <: Keyframes](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRules(value: String): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledComponents.styledComponentsStrings.a
    - typingsJapgolly.styledComponents.styledComponentsStrings.abbr
    - typingsJapgolly.styledComponents.styledComponentsStrings.address
    - typingsJapgolly.styledComponents.styledComponentsStrings.area
    - typingsJapgolly.styledComponents.styledComponentsStrings.article
    - typingsJapgolly.styledComponents.styledComponentsStrings.aside
    - typingsJapgolly.styledComponents.styledComponentsStrings.audio
    - typingsJapgolly.styledComponents.styledComponentsStrings.b
    - typingsJapgolly.styledComponents.styledComponentsStrings.base
    - typingsJapgolly.styledComponents.styledComponentsStrings.bdi
    - typingsJapgolly.styledComponents.styledComponentsStrings.bdo
    - typingsJapgolly.styledComponents.styledComponentsStrings.big
    - typingsJapgolly.styledComponents.styledComponentsStrings.blockquote
    - typingsJapgolly.styledComponents.styledComponentsStrings.body
    - typingsJapgolly.styledComponents.styledComponentsStrings.br
    - typingsJapgolly.styledComponents.styledComponentsStrings.button
    - typingsJapgolly.styledComponents.styledComponentsStrings.canvas
    - typingsJapgolly.styledComponents.styledComponentsStrings.caption
    - typingsJapgolly.styledComponents.styledComponentsStrings.cite
    - typingsJapgolly.styledComponents.styledComponentsStrings.code
    - typingsJapgolly.styledComponents.styledComponentsStrings.col
    - typingsJapgolly.styledComponents.styledComponentsStrings.colgroup
    - typingsJapgolly.styledComponents.styledComponentsStrings.data
    - typingsJapgolly.styledComponents.styledComponentsStrings.datalist
    - typingsJapgolly.styledComponents.styledComponentsStrings.dd
    - typingsJapgolly.styledComponents.styledComponentsStrings.del
    - typingsJapgolly.styledComponents.styledComponentsStrings.details
    - typingsJapgolly.styledComponents.styledComponentsStrings.dfn
    - typingsJapgolly.styledComponents.styledComponentsStrings.dialog
    - typingsJapgolly.styledComponents.styledComponentsStrings.div
    - typingsJapgolly.styledComponents.styledComponentsStrings.dl
    - typingsJapgolly.styledComponents.styledComponentsStrings.dt
    - typingsJapgolly.styledComponents.styledComponentsStrings.em
    - typingsJapgolly.styledComponents.styledComponentsStrings.embed
    - typingsJapgolly.styledComponents.styledComponentsStrings.fieldset
    - typingsJapgolly.styledComponents.styledComponentsStrings.figcaption
    - typingsJapgolly.styledComponents.styledComponentsStrings.figure
    - typingsJapgolly.styledComponents.styledComponentsStrings.footer
    - typingsJapgolly.styledComponents.styledComponentsStrings.form
    - typingsJapgolly.styledComponents.styledComponentsStrings.h1
    - typingsJapgolly.styledComponents.styledComponentsStrings.h2
    - typingsJapgolly.styledComponents.styledComponentsStrings.h3
    - typingsJapgolly.styledComponents.styledComponentsStrings.h4
    - typingsJapgolly.styledComponents.styledComponentsStrings.h5
    - typingsJapgolly.styledComponents.styledComponentsStrings.h6
    - typingsJapgolly.styledComponents.styledComponentsStrings.head
    - typingsJapgolly.styledComponents.styledComponentsStrings.header
    - typingsJapgolly.styledComponents.styledComponentsStrings.hgroup
    - typingsJapgolly.styledComponents.styledComponentsStrings.hr
    - typingsJapgolly.styledComponents.styledComponentsStrings.html
    - typingsJapgolly.styledComponents.styledComponentsStrings.i
    - typingsJapgolly.styledComponents.styledComponentsStrings.iframe
    - typingsJapgolly.styledComponents.styledComponentsStrings.img
    - typingsJapgolly.styledComponents.styledComponentsStrings.input
    - typingsJapgolly.styledComponents.styledComponentsStrings.ins
    - typingsJapgolly.styledComponents.styledComponentsStrings.kbd
    - typingsJapgolly.styledComponents.styledComponentsStrings.keygen
    - typingsJapgolly.styledComponents.styledComponentsStrings.label
    - typingsJapgolly.styledComponents.styledComponentsStrings.legend
    - typingsJapgolly.styledComponents.styledComponentsStrings.li
    - typingsJapgolly.styledComponents.styledComponentsStrings.link
    - typingsJapgolly.styledComponents.styledComponentsStrings.main
    - typingsJapgolly.styledComponents.styledComponentsStrings.map
    - typingsJapgolly.styledComponents.styledComponentsStrings.mark
    - typingsJapgolly.styledComponents.styledComponentsStrings.menu
    - typingsJapgolly.styledComponents.styledComponentsStrings.menuitem
    - typingsJapgolly.styledComponents.styledComponentsStrings.meta
    - typingsJapgolly.styledComponents.styledComponentsStrings.meter
    - typingsJapgolly.styledComponents.styledComponentsStrings.nav
    - typingsJapgolly.styledComponents.styledComponentsStrings.noindex
    - typingsJapgolly.styledComponents.styledComponentsStrings.noscript
    - typingsJapgolly.styledComponents.styledComponentsStrings.`object`
    - typingsJapgolly.styledComponents.styledComponentsStrings.ol
    - typingsJapgolly.styledComponents.styledComponentsStrings.optgroup
    - typingsJapgolly.styledComponents.styledComponentsStrings.option
    - typingsJapgolly.styledComponents.styledComponentsStrings.output
    - typingsJapgolly.styledComponents.styledComponentsStrings.p
    - typingsJapgolly.styledComponents.styledComponentsStrings.param
    - typingsJapgolly.styledComponents.styledComponentsStrings.picture
    - typingsJapgolly.styledComponents.styledComponentsStrings.pre
    - typingsJapgolly.styledComponents.styledComponentsStrings.progress
    - typingsJapgolly.styledComponents.styledComponentsStrings.q
    - typingsJapgolly.styledComponents.styledComponentsStrings.rp
    - typingsJapgolly.styledComponents.styledComponentsStrings.rt
    - typingsJapgolly.styledComponents.styledComponentsStrings.ruby
    - typingsJapgolly.styledComponents.styledComponentsStrings.s
    - typingsJapgolly.styledComponents.styledComponentsStrings.samp
    - typingsJapgolly.styledComponents.styledComponentsStrings.slot
    - typingsJapgolly.styledComponents.styledComponentsStrings.script
    - typingsJapgolly.styledComponents.styledComponentsStrings.section
    - typingsJapgolly.styledComponents.styledComponentsStrings.select
    - typingsJapgolly.styledComponents.styledComponentsStrings.small
    - typingsJapgolly.styledComponents.styledComponentsStrings.source
    - typingsJapgolly.styledComponents.styledComponentsStrings.span
    - typingsJapgolly.styledComponents.styledComponentsStrings.strong
    - typingsJapgolly.styledComponents.styledComponentsStrings.style
    - typingsJapgolly.styledComponents.styledComponentsStrings.sub
    - typingsJapgolly.styledComponents.styledComponentsStrings.summary
    - typingsJapgolly.styledComponents.styledComponentsStrings.sup
    - typingsJapgolly.styledComponents.styledComponentsStrings.table
    - typingsJapgolly.styledComponents.styledComponentsStrings.template
    - typingsJapgolly.styledComponents.styledComponentsStrings.tbody
    - typingsJapgolly.styledComponents.styledComponentsStrings.td
    - typingsJapgolly.styledComponents.styledComponentsStrings.textarea
    - typingsJapgolly.styledComponents.styledComponentsStrings.tfoot
    - typingsJapgolly.styledComponents.styledComponentsStrings.th
    - typingsJapgolly.styledComponents.styledComponentsStrings.thead
    - typingsJapgolly.styledComponents.styledComponentsStrings.time
    - typingsJapgolly.styledComponents.styledComponentsStrings.title
    - typingsJapgolly.styledComponents.styledComponentsStrings.tr
    - typingsJapgolly.styledComponents.styledComponentsStrings.track
    - typingsJapgolly.styledComponents.styledComponentsStrings.u
    - typingsJapgolly.styledComponents.styledComponentsStrings.ul
    - typingsJapgolly.styledComponents.styledComponentsStrings.`var`
    - typingsJapgolly.styledComponents.styledComponentsStrings.video
    - typingsJapgolly.styledComponents.styledComponentsStrings.wbr
    - typingsJapgolly.styledComponents.styledComponentsStrings.webview
    - typingsJapgolly.styledComponents.styledComponentsStrings.svg
    - typingsJapgolly.styledComponents.styledComponentsStrings.animate
    - typingsJapgolly.styledComponents.styledComponentsStrings.animateMotion
    - typingsJapgolly.styledComponents.styledComponentsStrings.animateTransform
    - typingsJapgolly.styledComponents.styledComponentsStrings.circle
    - typingsJapgolly.styledComponents.styledComponentsStrings.clipPath
    - typingsJapgolly.styledComponents.styledComponentsStrings.defs
    - typingsJapgolly.styledComponents.styledComponentsStrings.desc
    - typingsJapgolly.styledComponents.styledComponentsStrings.ellipse
    - typingsJapgolly.styledComponents.styledComponentsStrings.feBlend
    - typingsJapgolly.styledComponents.styledComponentsStrings.feColorMatrix
    - typingsJapgolly.styledComponents.styledComponentsStrings.feComponentTransfer
    - typingsJapgolly.styledComponents.styledComponentsStrings.feComposite
    - typingsJapgolly.styledComponents.styledComponentsStrings.feConvolveMatrix
    - typingsJapgolly.styledComponents.styledComponentsStrings.feDiffuseLighting
    - typingsJapgolly.styledComponents.styledComponentsStrings.feDisplacementMap
    - typingsJapgolly.styledComponents.styledComponentsStrings.feDistantLight
    - typingsJapgolly.styledComponents.styledComponentsStrings.feDropShadow
    - typingsJapgolly.styledComponents.styledComponentsStrings.feFlood
    - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncA
    - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncB
    - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncG
    - typingsJapgolly.styledComponents.styledComponentsStrings.feFuncR
    - typingsJapgolly.styledComponents.styledComponentsStrings.feGaussianBlur
    - typingsJapgolly.styledComponents.styledComponentsStrings.feImage
    - typingsJapgolly.styledComponents.styledComponentsStrings.feMerge
    - typingsJapgolly.styledComponents.styledComponentsStrings.feMergeNode
    - typingsJapgolly.styledComponents.styledComponentsStrings.feMorphology
    - typingsJapgolly.styledComponents.styledComponentsStrings.feOffset
    - typingsJapgolly.styledComponents.styledComponentsStrings.fePointLight
    - typingsJapgolly.styledComponents.styledComponentsStrings.feSpecularLighting
    - typingsJapgolly.styledComponents.styledComponentsStrings.feSpotLight
    - typingsJapgolly.styledComponents.styledComponentsStrings.feTile
    - typingsJapgolly.styledComponents.styledComponentsStrings.feTurbulence
    - typingsJapgolly.styledComponents.styledComponentsStrings.filter
    - typingsJapgolly.styledComponents.styledComponentsStrings.foreignObject
    - typingsJapgolly.styledComponents.styledComponentsStrings.g
    - typingsJapgolly.styledComponents.styledComponentsStrings.image
    - typingsJapgolly.styledComponents.styledComponentsStrings.line
    - typingsJapgolly.styledComponents.styledComponentsStrings.linearGradient
    - typingsJapgolly.styledComponents.styledComponentsStrings.marker
    - typingsJapgolly.styledComponents.styledComponentsStrings.mask
    - typingsJapgolly.styledComponents.styledComponentsStrings.metadata
    - typingsJapgolly.styledComponents.styledComponentsStrings.mpath
    - typingsJapgolly.styledComponents.styledComponentsStrings.path
    - typingsJapgolly.styledComponents.styledComponentsStrings.pattern
    - typingsJapgolly.styledComponents.styledComponentsStrings.polygon
    - typingsJapgolly.styledComponents.styledComponentsStrings.polyline
    - typingsJapgolly.styledComponents.styledComponentsStrings.radialGradient
    - typingsJapgolly.styledComponents.styledComponentsStrings.rect
    - typingsJapgolly.styledComponents.styledComponentsStrings.stop
    - typingsJapgolly.styledComponents.styledComponentsStrings.switch
    - typingsJapgolly.styledComponents.styledComponentsStrings.symbol
    - typingsJapgolly.styledComponents.styledComponentsStrings.text
    - typingsJapgolly.styledComponents.styledComponentsStrings.textPath
    - typingsJapgolly.styledComponents.styledComponentsStrings.tspan
    - typingsJapgolly.styledComponents.styledComponentsStrings.use
    - typingsJapgolly.styledComponents.styledComponentsStrings.view
    - typingsJapgolly.styledComponents.nativeDistTypesMod.AnyComponent[scala.Any]
  */
  type KnownTarget = _KnownTarget | AnyComponent[Any]
  
  type NameGenerator = js.Function1[/* hash */ Double, String]
  
  type NativeTarget = AnyComponent[Any]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T as T[K] extends never? never : K ]: T[K]}
    }}}
    */
  @js.native
  trait OmitNever[T] extends StObject
  
  @js.native
  trait PolymorphicComponent[R /* <: Runtime */, FallbackComponent /* <: StyledTarget[R] */, ExpectedProps /* <: js.Object */, PropsToBeInjectedIntoActualComponent /* <: js.Object */]
    extends StObject
       with ForwardRefExoticComponent[ExpectedProps]
  
  type PolymorphicComponentProps[R /* <: Runtime */, ActualComponent /* <: StyledTarget[R] */, PropsToBeInjectedIntoActualComponent /* <: js.Object */, ActualComponentProps] = ((AsAs[ActualComponent, R]) & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | as | $as
  ]) & ActualComponentProps) | ((`176`[ActualComponent, R]) & HTMLAttributes[ActualComponent] & (Omit[
    PropsToBeInjectedIntoActualComponent, 
    (/* keyof ActualComponentProps */ String) | as | $as
  ]) & ActualComponentProps)
  
  @js.native
  trait RuleSet[Props]
    extends StObject
       with Array[Interpolation[Props]]
       with _FlattenerResult[Props]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.styledComponents.styledComponentsStrings.web
    - typingsJapgolly.styledComponents.styledComponentsStrings.native
  */
  trait Runtime extends StObject
  object Runtime {
    
    inline def native: typingsJapgolly.styledComponents.styledComponentsStrings.native = "native".asInstanceOf[typingsJapgolly.styledComponents.styledComponentsStrings.native]
    
    inline def web: typingsJapgolly.styledComponents.styledComponentsStrings.web = "web".asInstanceOf[typingsJapgolly.styledComponents.styledComponentsStrings.web]
  }
  
  type ShouldForwardProp[R /* <: Runtime */] = js.Function2[/* prop */ String, /* elementToBeCreated */ js.UndefOr[StyledTarget[R]], Boolean]
  
  @js.native
  trait Stringifier extends StObject {
    
    def apply(css: String): js.Array[String] = js.native
    def apply(css: String, selector: String): js.Array[String] = js.native
    def apply(css: String, selector: String, prefix: String): js.Array[String] = js.native
    def apply(css: String, selector: String, prefix: String, componentId: String): js.Array[String] = js.native
    def apply(css: String, selector: String, prefix: Unit, componentId: String): js.Array[String] = js.native
    def apply(css: String, selector: Unit, prefix: String): js.Array[String] = js.native
    def apply(css: String, selector: Unit, prefix: String, componentId: String): js.Array[String] = js.native
    def apply(css: String, selector: Unit, prefix: Unit, componentId: String): js.Array[String] = js.native
    
    var hash: String = js.native
  }
  
  @js.native
  trait StyleFunction[Props]
    extends StObject
       with _Interpolation[Props] {
    
    def apply(executionContext: ExecutionContext & Props): Interpolation[Props] = js.native
  }
  
  trait StyleSheet extends StObject {
    
    var create: js.Function
  }
  object StyleSheet {
    
    inline def apply(create: js.Function): StyleSheet = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheet]
    }
    
    extension [Self <: StyleSheet](x: Self) {
      
      inline def setCreate(value: js.Function): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    }
  }
  
  type StyledObject[Props] = StringDictionary[BaseExtensibleObject | String | Double | StyleFunction[Props]]
  
  trait StyledOptions[R /* <: Runtime */, Props] extends StObject {
    
    var attrs: js.UndefOr[js.Array[Attrs[Props]]] = js.undefined
    
    var componentId: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var parentComponentId: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ] = js.undefined
    
    var shouldForwardProp: js.UndefOr[ShouldForwardProp[R]] = js.undefined
  }
  object StyledOptions {
    
    inline def apply[R /* <: Runtime */, Props](): StyledOptions[R, Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledOptions[R, Props]]
    }
    
    extension [Self <: StyledOptions[?, ?], R /* <: Runtime */, Props](x: Self & (StyledOptions[R, Props])) {
      
      inline def setAttrs(value: js.Array[Attrs[Props]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      inline def setAttrsVarargs(value: Attrs[Props]*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setComponentId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setParentComponentId(
        value: /* import warning: importer.ImportType#apply Failed type conversion: R extends 'web' ? string : never */ js.Any
      ): Self = StObject.set(x, "parentComponentId", value.asInstanceOf[js.Any])
      
      inline def setParentComponentIdUndefined: Self = StObject.set(x, "parentComponentId", js.undefined)
      
      inline def setShouldForwardProp(value: (/* prop */ String, /* elementToBeCreated */ js.UndefOr[StyledTarget[R]]) => Boolean): Self = StObject.set(x, "shouldForwardProp", js.Any.fromFunction2(value))
      
      inline def setShouldForwardPropUndefined: Self = StObject.set(x, "shouldForwardProp", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    R extends 'web' ? styled-components.styled-components/native/dist/types.WebTarget : styled-components.styled-components/native/dist/types.NativeTarget
    }}}
    */
  @js.native
  trait StyledTarget[R /* <: Runtime */] extends StObject
  
  type Styles[Props] = TemplateStringsArray | StyledObject[Props] | StyleFunction[Props]
  
  type WebTarget = String | KnownTarget
  
  trait _FlattenerResult[Props] extends StObject
  
  trait _Interpolation[Props] extends StObject
  
  trait _KnownTarget extends StObject
}
