package typingsJapgolly.typedoc

import typingsJapgolly.std.Record
import typingsJapgolly.typedoc.anon.ArrowStyle
import typingsJapgolly.typedoc.anon.HideSources
import typingsJapgolly.typedoc.distLibModelsCommentsCommentMod.CommentDisplayPart
import typingsJapgolly.typedoc.distLibModelsMod.ContainerReflection
import typingsJapgolly.typedoc.distLibModelsMod.DeclarationReflection
import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import typingsJapgolly.typedoc.distLibModelsMod.ReferenceReflection
import typingsJapgolly.typedoc.distLibModelsMod.ReferenceType
import typingsJapgolly.typedoc.distLibModelsMod.Reflection
import typingsJapgolly.typedoc.distLibModelsMod.ReflectionGroup
import typingsJapgolly.typedoc.distLibModelsMod.SignatureReflection
import typingsJapgolly.typedoc.distLibModelsMod.Type
import typingsJapgolly.typedoc.distLibModelsMod.TypeParameterReflection
import typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationHierarchy
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typingsJapgolly.typedoc.distLibOutputMod.PageEvent
import typingsJapgolly.typedoc.distLibOutputThemesDefaultDefaultThemeMod.DefaultTheme
import typingsJapgolly.typedoc.distLibUtilsGeneralMod.NeverIfInternal
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import typingsJapgolly.typedoc.distLibUtilsMod.Options
import typingsJapgolly.typedoc.typedocStrings.anchor
import typingsJapgolly.typedoc.typedocStrings.bodyDotbegin
import typingsJapgolly.typedoc.typedocStrings.bodyDotend
import typingsJapgolly.typedoc.typedocStrings.checkbox
import typingsJapgolly.typedoc.typedocStrings.chevronDown
import typingsJapgolly.typedoc.typedocStrings.chevronSmall
import typingsJapgolly.typedoc.typedocStrings.contentDotbegin
import typingsJapgolly.typedoc.typedocStrings.contentDotend
import typingsJapgolly.typedoc.typedocStrings.headDotbegin
import typingsJapgolly.typedoc.typedocStrings.headDotend
import typingsJapgolly.typedoc.typedocStrings.menu
import typingsJapgolly.typedoc.typedocStrings.navigationDotbegin
import typingsJapgolly.typedoc.typedocStrings.navigationDotend
import typingsJapgolly.typedoc.typedocStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultDefaultThemeRenderContextMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/DefaultThemeRenderContext", "DefaultThemeRenderContext")
  @js.native
  open class DefaultThemeRenderContext protected () extends StObject {
    def this(theme: DefaultTheme, options: Options) = this()
    
    def analytics(): js.UndefOr[JsxElement] = js.native
    
    /**
      * Using this method will repeat work already done, instead of calling it, use `type.externalUrl`.
      * @deprecated
      * Will be removed in 0.24.
      */
    def attemptExternalResolution(`type`: NeverIfInternal[ReferenceType]): js.UndefOr[String] = js.native
    
    def breadcrumb(props: Reflection): js.UndefOr[JsxElement] = js.native
    
    def comment(props: Reflection): js.UndefOr[JsxElement] = js.native
    
    def defaultLayout(props: PageEvent[Reflection]): JsxElement = js.native
    
    def footer(): js.UndefOr[JsxElement] = js.native
    
    def header(props: PageEvent[Reflection]): JsxElement = js.native
    
    def hierarchy(): js.UndefOr[JsxElement] = js.native
    def hierarchy(props: DeclarationHierarchy): js.UndefOr[JsxElement] = js.native
    
    def hook(
      name: /* keyof typedoc.typedoc/dist/lib/output/renderer.RendererHooks */ headDotbegin | headDotend | bodyDotbegin | bodyDotend | contentDotbegin | contentDotend | navigationDotbegin | navigationDotend
    ): js.Array[JsxElement] = js.native
    
    var icons: Record[
        anchor | ReflectionKind | search | checkbox | chevronDown | menu | chevronSmall, 
        js.Function0[JsxElement]
      ] = js.native
    
    def index(props: ContainerReflection): JsxElement = js.native
    
    def indexTemplate(props: PageEvent[ProjectReflection]): JsxElement = js.native
    
    def markdown(md: js.Array[CommentDisplayPart]): String = js.native
    def markdown(md: NeverIfInternal[js.UndefOr[String]]): String = js.native
    
    def member(props: DeclarationReflection): JsxElement = js.native
    
    def memberDeclaration(props: DeclarationReflection): JsxElement = js.native
    
    def memberGetterSetter(props: DeclarationReflection): JsxElement = js.native
    
    def memberReference(props: ReferenceReflection): JsxElement = js.native
    
    def memberSignatureBody(r_0: SignatureReflection): JsxElement = js.native
    def memberSignatureBody(r_0: SignatureReflection, r_1: HideSources): JsxElement = js.native
    
    def memberSignatureTitle(r_0: SignatureReflection): JsxElement = js.native
    def memberSignatureTitle(r_0: SignatureReflection, r_1: ArrowStyle): JsxElement = js.native
    
    def memberSignatures(props: DeclarationReflection): JsxElement = js.native
    
    def memberSources(props: DeclarationReflection): JsxElement = js.native
    def memberSources(props: SignatureReflection): JsxElement = js.native
    
    def members(props: ContainerReflection): JsxElement = js.native
    
    def membersGroup(group: ReflectionGroup): JsxElement = js.native
    
    def navigation(props: PageEvent[Reflection]): JsxElement = js.native
    
    var options: Options = js.native
    
    def parameter(props: DeclarationReflection): JsxElement = js.native
    
    def primaryNavigation(props: PageEvent[Reflection]): JsxElement = js.native
    
    def reflectionTemplate(props: PageEvent[ContainerReflection]): JsxElement = js.native
    
    /** Avoid this in favor of urlTo if possible */
    def relativeURL(): js.UndefOr[String] = js.native
    def relativeURL(url: String): js.UndefOr[String] = js.native
    
    def secondaryNavigation(props: PageEvent[Reflection]): js.UndefOr[JsxElement] = js.native
    
    def settings(): JsxElement = js.native
    
    /* private */ var theme: Any = js.native
    
    def toolbar(props: PageEvent[Reflection]): JsxElement = js.native
    
    def `type`(): JsxElement = js.native
    def `type`(`type`: Type): JsxElement = js.native
    
    def typeAndParent(props: Type): JsxElement = js.native
    
    def typeParameters(typeParameters: js.Array[TypeParameterReflection]): JsxElement = js.native
    
    def urlTo(reflection: Reflection): js.UndefOr[String] = js.native
  }
}
