package typingsJapgolly.ejs

import typingsJapgolly.ejs.anon.Optionsasyncfalse
import typingsJapgolly.ejs.anon.Optionsasyncfalseundefine
import typingsJapgolly.ejs.anon.OptionsasyncfalseundefineAsync
import typingsJapgolly.ejs.anon.Optionsasyncneverundefine
import typingsJapgolly.ejs.anon.Optionsasynctrue
import typingsJapgolly.ejs.anon.Optionsasynctrueclientfal
import typingsJapgolly.ejs.anon.Optionsasynctrueclienttru
import typingsJapgolly.ejs.mod.AsyncClientFunction
import typingsJapgolly.ejs.mod.AsyncTemplateFunction
import typingsJapgolly.ejs.mod.Cache_
import typingsJapgolly.ejs.mod.ClientFunction
import typingsJapgolly.ejs.mod.Data
import typingsJapgolly.ejs.mod.Options
import typingsJapgolly.ejs.mod.RenderFileCallback
import typingsJapgolly.ejs.mod.TemplateFunction
import typingsJapgolly.ejs.mod.fileLoader
import typingsJapgolly.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ejs {
    
    @JSGlobal("ejs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ejs.Template")
    @js.native
    open class Template protected ()
      extends typingsJapgolly.ejs.mod.Template {
      def this(text: String) = this()
      def this(text: String, opts: Options) = this()
    }
    object Template {
      
      @JSGlobal("ejs.Template.modes")
      @js.native
      object modes extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typingsJapgolly.ejs.mod.Template.modes & String] = js.native
        
        /* "comment" */ val COMMENT: typingsJapgolly.ejs.mod.Template.modes.COMMENT & String = js.native
        
        /* "escaped" */ val ESCAPED: typingsJapgolly.ejs.mod.Template.modes.ESCAPED & String = js.native
        
        /* "eval" */ val EVAL: typingsJapgolly.ejs.mod.Template.modes.EVAL & String = js.native
        
        /* "literal" */ val LITERAL: typingsJapgolly.ejs.mod.Template.modes.LITERAL & String = js.native
        
        /* "raw" */ val RAW: typingsJapgolly.ejs.mod.Template.modes.RAW & String = js.native
      }
    }
    
    @JSGlobal("ejs.VERSION")
    @js.native
    val VERSION: String = js.native
    
    @JSGlobal("ejs.cache")
    @js.native
    def cache: Cache_ = js.native
    inline def cache_=(x: Cache_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cache")(x.asInstanceOf[js.Any])
    
    inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
    
    @JSGlobal("ejs.closeDelimiter")
    @js.native
    def closeDelimiter: String = js.native
    inline def closeDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeDelimiter")(x.asInstanceOf[js.Any])
    
    inline def compile(template: String): TemplateFunction | AsyncTemplateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFunction | AsyncTemplateFunction]
    inline def compile(template: String, opts: Optionsasyncfalseundefine): TemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TemplateFunction]
    inline def compile(template: String, opts: OptionsasyncfalseundefineAsync): ClientFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ClientFunction]
    inline def compile(template: String, opts: Optionsasynctrueclientfal): AsyncTemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncTemplateFunction]
    inline def compile(template: String, opts: Optionsasynctrueclienttru): AsyncClientFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AsyncClientFunction]
    inline def compile(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TemplateFunction | AsyncTemplateFunction]
    
    inline def compile_ClientFunction(template: String): ClientFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[ClientFunction]
    
    inline def compile_TemplateFunction(template: String): TemplateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[TemplateFunction]
    
    @JSGlobal("ejs.delimiter")
    @js.native
    def delimiter: js.UndefOr[String] = js.native
    inline def delimiter_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    inline def escapeXML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")().asInstanceOf[String]
    inline def escapeXML(markup: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(markup.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("ejs.fileLoader")
    @js.native
    def fileLoader: typingsJapgolly.ejs.mod.fileLoader = js.native
    inline def fileLoader_=(x: fileLoader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fileLoader")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ejs.localsName")
    @js.native
    def localsName: String = js.native
    inline def localsName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localsName")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ejs.name")
    @js.native
    val name: typingsJapgolly.ejs.ejsStrings.ejs = js.native
    
    @JSGlobal("ejs.openDelimiter")
    @js.native
    def openDelimiter: String = js.native
    inline def openDelimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openDelimiter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ejs.promiseImpl")
    @js.native
    def promiseImpl: js.UndefOr[PromiseConstructorLike] = js.native
    inline def promiseImpl_=(x: js.UndefOr[PromiseConstructorLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promiseImpl")(x.asInstanceOf[js.Any])
    
    inline def render(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def render(template: String, data: Unit, opts: Optionsasyncfalse): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Unit, opts: Optionsasyncneverundefine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Unit, opts: Optionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def render(template: String, data: Unit, opts: Options): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    inline def render(template: String, data: Data): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Data, opts: Optionsasyncfalse): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Data, opts: Optionsasyncneverundefine): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def render(template: String, data: Data, opts: Optionsasynctrue): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def render(template: String, data: Data, opts: Options): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    
    inline def renderFile(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def renderFile(path: String, data: Unit, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def renderFile(path: String, data: Data): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def renderFile(path: String, data: Data, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    inline def renderFile[T](path: String, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def renderFile[T](path: String, data: Data, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def renderFile[T](path: String, data: Data, opts: Options, cb: RenderFileCallback[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def render_Union(template: String): String | js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any]).asInstanceOf[String | js.Promise[String]]
    inline def render_Union(template: String, data: Data): String | js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String | js.Promise[String]]
    
    inline def resolveInclude(name: String, filename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInclude")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def resolveInclude(name: String, filename: String, isDir: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveInclude")(name.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], isDir.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
