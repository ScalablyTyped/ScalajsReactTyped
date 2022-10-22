package typingsJapgolly.typedoc

import typingsJapgolly.std.Record
import typingsJapgolly.typedoc.distLibModelsMod.ContainerReflection
import typingsJapgolly.typedoc.distLibModelsMod.DeclarationReflection
import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import typingsJapgolly.typedoc.distLibModelsMod.Reflection
import typingsJapgolly.typedoc.distLibOutputEventsMod.PageEvent
import typingsJapgolly.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typingsJapgolly.typedoc.distLibOutputPluginsMod.MarkedPlugin
import typingsJapgolly.typedoc.distLibOutputRendererMod.Renderer
import typingsJapgolly.typedoc.distLibOutputThemeMod.Theme
import typingsJapgolly.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputThemesDefaultDefaultThemeMod {
  
  @JSImport("typedoc/dist/lib/output/themes/default/DefaultTheme", "DefaultTheme")
  @js.native
  open class DefaultTheme protected () extends Theme {
    /**
      * Create a new DefaultTheme instance.
      *
      * @param renderer  The renderer this theme is attached to.
      * @param basePath  The base path of this theme.
      */
    def this(renderer: Renderer) = this()
    
    /* private */ var _renderContext: Any = js.native
    
    /**
      * Build the url for the the given reflection and all of its children.
      *
      * @param reflection  The reflection the url should be created for.
      * @param urls        The array the url should be appended to.
      * @returns           The altered urls array.
      */
    def buildUrls(reflection: DeclarationReflection, urls: js.Array[UrlMapping[Any]]): js.Array[UrlMapping[Any]] = js.native
    
    def defaultLayoutTemplate(pageEvent: PageEvent[Reflection]): JsxElement = js.native
    
    /**
      * Return the template mapping for the given reflection.
      *
      * @param reflection  The reflection whose mapping should be resolved.
      * @returns           The found mapping or undefined if no mapping could be found.
      */
    /* private */ var getMapping: Any = js.native
    
    def getRenderContext(_pageEvent: PageEvent[Any]): DefaultThemeRenderContext = js.native
    
    /**
      * Map the models of the given project to the desired output files.
      *
      * @param project  The project whose urls should be generated.
      * @returns        A list of {@link UrlMapping} instances defining which models
      *                 should be rendered to which files.
      */
    def getUrls(project: ProjectReflection): js.Array[UrlMapping[Any]] = js.native
    
    def indexTemplate(pageEvent: PageEvent[ProjectReflection]): JsxElement = js.native
    
    /**
      * Mappings of reflections kinds to templates used by this theme.
      */
    /* private */ var mappings: Any = js.native
    
    /** @internal */
    var markedPlugin: MarkedPlugin = js.native
    
    /**
      * Triggered before the renderer starts rendering a project.
      *
      * @param event  An event object describing the current render operation.
      */
    /* private */ var onRendererBegin: Any = js.native
    
    def reflectionTemplate(pageEvent: PageEvent[ContainerReflection]): JsxElement = js.native
  }
  /* static members */
  object DefaultTheme {
    
    @JSImport("typedoc/dist/lib/output/themes/default/DefaultTheme", "DefaultTheme")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/themes/default/DefaultTheme", "DefaultTheme.URL_PREFIX")
    @js.native
    def URL_PREFIX: js.RegExp = js.native
    inline def URL_PREFIX_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
    
    /**
      * Generate an anchor url for the given reflection and all of its children.
      *
      * @param reflection  The reflection an anchor url should be created for.
      * @param container   The nearest reflection having an own document.
      */
    inline def applyAnchorUrl(reflection: Reflection, container: Reflection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnchorUrl")(reflection.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Generate the css classes for the given reflection and apply them to the
      * {@link DeclarationReflection.cssClasses} property.
      *
      * @param reflection  The reflection whose cssClasses property should be generated.
      */
    inline def applyReflectionClasses(reflection: DeclarationReflection, filters: Record[String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyReflectionClasses")(reflection.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Return a url for the given reflection.
      *
      * @param reflection  The reflection the url should be generated for.
      * @param relative    The parent reflection the url generation should stop on.
      * @param separator   The separator used to generate the url.
      * @returns           The generated url.
      */
    inline def getUrl(reflection: Reflection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Reflection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Reflection, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Transform a space separated string into a string suitable to be used as a
      * css class, e.g. "constructor method" > "constructor-method".
      */
    inline def toStyleClass(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStyleClass")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
