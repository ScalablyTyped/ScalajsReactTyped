package typingsJapgolly.mustache

import typingsJapgolly.mustache.mod.EscapeFunction
import typingsJapgolly.mustache.mod.OpeningAndClosingTags
import typingsJapgolly.mustache.mod.PartialsOrLookupFn
import typingsJapgolly.mustache.mod.RenderOptions
import typingsJapgolly.mustache.mod.TemplateCache_
import typingsJapgolly.mustache.mod.TemplateSpans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Mustache {
    
    @JSGlobal("Mustache")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Mustache.Context")
    @js.native
    open class Context protected ()
      extends typingsJapgolly.mustache.mod.Context {
      /**
        * Initializes a new instance of the {@link Context `Context`} class.
        */
      def this(view: Any) = this()
      def this(view: Any, parentContext: typingsJapgolly.mustache.mod.Context) = this()
    }
    
    @JSGlobal("Mustache.Scanner")
    @js.native
    open class Scanner protected ()
      extends typingsJapgolly.mustache.mod.Scanner {
      /**
        * Initializes a new instance of the {@link Scanner `Scanner`} class.
        */
      def this(string: String) = this()
    }
    
    @JSGlobal("Mustache.Writer")
    @js.native
    /**
      * Initializes a new instance of the {@link Writer `Writer`} class.
      */
    open class Writer ()
      extends typingsJapgolly.mustache.mod.Writer
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    @JSGlobal("Mustache.escape")
    @js.native
    val escape: EscapeFunction = js.native
    
    @JSGlobal("Mustache.name")
    @js.native
    val name: String = js.native
    
    inline def parse(template: String): TemplateSpans = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateSpans]
    inline def parse(template: String, tags: OpeningAndClosingTags): TemplateSpans = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[TemplateSpans]
    
    inline def render(template: String, view: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: Any, partials: Unit, tagsOrOptions: OpeningAndClosingTags): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: Any, partials: Unit, tagsOrOptions: RenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: Any, partials: PartialsOrLookupFn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: Any, partials: PartialsOrLookupFn, tagsOrOptions: OpeningAndClosingTags): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: Any, partials: PartialsOrLookupFn, tagsOrOptions: RenderOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: typingsJapgolly.mustache.mod.Context): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(
      template: String,
      view: typingsJapgolly.mustache.mod.Context,
      partials: Unit,
      tagsOrOptions: OpeningAndClosingTags
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(
      template: String,
      view: typingsJapgolly.mustache.mod.Context,
      partials: Unit,
      tagsOrOptions: RenderOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, view: typingsJapgolly.mustache.mod.Context, partials: PartialsOrLookupFn): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(
      template: String,
      view: typingsJapgolly.mustache.mod.Context,
      partials: PartialsOrLookupFn,
      tagsOrOptions: OpeningAndClosingTags
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(
      template: String,
      view: typingsJapgolly.mustache.mod.Context,
      partials: PartialsOrLookupFn,
      tagsOrOptions: RenderOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], view.asInstanceOf[js.Any], partials.asInstanceOf[js.Any], tagsOrOptions.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("Mustache.tags")
    @js.native
    def tags: OpeningAndClosingTags = js.native
    inline def tags_=(x: OpeningAndClosingTags): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tags")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mustache.templateCache")
    @js.native
    def templateCache: js.UndefOr[TemplateCache_] = js.native
    inline def templateCache_=(x: js.UndefOr[TemplateCache_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("templateCache")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mustache.version")
    @js.native
    val version: String = js.native
  }
}
