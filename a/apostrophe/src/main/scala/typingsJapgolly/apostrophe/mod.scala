package typingsJapgolly.apostrophe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.apostrophe.anon.Form
import typingsJapgolly.apostrophe.anon.Id
import typingsJapgolly.apostrophe.anon.Projection
import typingsJapgolly.apostrophe.apostropheBooleans.`false`
import typingsJapgolly.apostrophe.apostropheStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: AposConstructor[js.Object, js.Object], args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  @JSImport("apostrophe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object adminBar {
    
    @JSImport("apostrophe", "adminBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def link(name: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def change(arg: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def change(arg: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object contextPiece {
    
    @JSImport("apostrophe", "contextPiece")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "contextPiece._id")
    @js.native
    def id: String = js.native
    
    inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_id")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.slug")
    @js.native
    def slug: String = js.native
    inline def slug_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slug")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.title")
    @js.native
    def title: String = js.native
    inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "contextPiece.type")
    @js.native
    val `type`: String = js.native
  }
  
  inline def create(`type`: String, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def create(`type`: String, options: Any, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def define(`type`: String, definition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(`type`: String, definition: Any, extending: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], extending.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(`type`: js.Array[String], definition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def define(`type`: js.Array[String], definition: Any, extending: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(`type`.asInstanceOf[js.Any], definition.asInstanceOf[js.Any], extending.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object docs {
    
    @JSImport("apostrophe", "docs")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getManager(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getManager")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def lock(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def lock(id: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def lockAndWatch(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("lockAndWatch")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def lockAndWatch(id: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lockAndWatch")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setManager(`type`: String, manager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setManager")(`type`.asInstanceOf[js.Any], manager.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unlock(_id: String, sync: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(_id.asInstanceOf[js.Any], sync.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def unlock(_id: String, sync: Any, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(_id.asInstanceOf[js.Any], sync.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def emit(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def emit(name: String, arg: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("emit")(name.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object modalSupport {
    
    @JSImport("apostrophe", "modalSupport")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "modalSupport.all")
    @js.native
    def all: js.Array[Any] = js.native
    inline def all_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    inline def cancelTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelTopModal")().asInstanceOf[Unit]
    
    inline def closeTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTopModal")().asInstanceOf[Unit]
    
    @JSImport("apostrophe", "modalSupport.depth")
    @js.native
    def depth: Double = js.native
    inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
    
    inline def getLatestModal(): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestModal")().asInstanceOf[Null | String]
    
    inline def getTopModalOrBody(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopModalOrBody")().asInstanceOf[String]
    
    @JSImport("apostrophe", "modalSupport.initialized")
    @js.native
    def initialized: Boolean = js.native
    inline def initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialized")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "modalSupport.stack")
    @js.native
    def stack: js.Array[Any] = js.native
    inline def stack_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stack")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("apostrophe", "modules")
  @js.native
  val modules: js.Object = js.native
  
  object moogBundle {
    
    @JSImport("apostrophe", "moogBundle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "moogBundle.directory")
    @js.native
    def directory: String = js.native
    inline def directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory")(x.asInstanceOf[js.Any])
    
    @JSImport("apostrophe", "moogBundle.modules")
    @js.native
    def modules: js.Array[String] = js.native
    inline def modules_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
  }
  
  inline def notify_(message: String, options: AposObject): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def notify_(message: js.Object, options: AposObject): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def off(eventName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def off(eventName: String, fn: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def on(eventName: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def on(eventName: String, fn: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(eventName.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  object pages {
    
    @JSImport("apostrophe", "pages")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("apostrophe", "pages.page")
    @js.native
    def page: Id = js.native
    inline def page_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
  }
  
  object schemas {
    
    @JSImport("apostrophe", "schemas")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convert($el: HTMLElement, schema: Schema, data: Any, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def convert($el: HTMLElement, schema: Schema, data: Any, options: Any, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def newInstance(schema: Schema): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(schema.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def populate(data: Any, name: String, $field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit], $el: HTMLElement): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit], $el: HTMLElement, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: js.Function0[Unit], $el: Unit, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: Unit, $el: HTMLElement): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: Unit, $el: HTMLElement, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def populate(data: Any, name: String, $field: Any, callback: Unit, $el: Unit, field: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("populate")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any], $field.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def returnToError($el: HTMLElement, schema: Schema, errorPath: Any, error: Any, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("returnToError")($el.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], errorPath.asInstanceOf[js.Any], error.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object ui {
    
    @JSImport("apostrophe", "ui")
    @js.native
    val ^ : js.Any = js.native
    
    inline def globalBusy(state: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("globalBusy")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def link(sel: String, verb: String, `object`: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def link(sel: String, verb: String, `object`: js.Object, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object utils {
    
    @JSImport("apostrophe", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def camelName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def capitalizeFirst(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirst")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generateId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateId")().asInstanceOf[String]
  }
  
  object versions {
    
    @JSImport("apostrophe", "versions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def edit(id: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def edit(id: String, afterRevert: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any], afterRevert.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  // Pass in custom modules as first argument
  // second argument is additional custom options e.g. restApi exposed by apostrophe-headless
  trait AposConstructor[M, O] extends StObject {
    
    var afterInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterListen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var initFailed: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var modules: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O} */ js.Any
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var rootDir: js.UndefOr[String] = js.undefined
    
    var shortName: String
  }
  object AposConstructor {
    
    inline def apply[M, O](
      modules: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O} */ js.Any,
      shortName: String
    ): AposConstructor[M, O] = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], shortName = shortName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposConstructor[M, O]]
    }
    
    extension [Self <: AposConstructor[?, ?], M, O](x: Self & (AposConstructor[M, O])) {
      
      inline def setAfterInit(value: Callback): Self = StObject.set(x, "afterInit", value.toJsFn)
      
      inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
      
      inline def setAfterListen(value: Callback): Self = StObject.set(x, "afterListen", value.toJsFn)
      
      inline def setAfterListenUndefined: Self = StObject.set(x, "afterListen", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setInitFailed(value: /* error */ Any => Callback): Self = StObject.set(x, "initFailed", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setInitFailedUndefined: Self = StObject.set(x, "initFailed", js.undefined)
      
      inline def setModules(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.AposModuleOptions<{}> | O} */ js.Any
      ): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRootDirUndefined: Self = StObject.set(x, "rootDir", js.undefined)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-admin-bar`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-any-page-manager`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-areas`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-assets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-attachments`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-browser-utils`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-caches`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-custom-pages`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-db`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-docs`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-email`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-express`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-files`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-files-widgets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-global`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-groups`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-html-widgets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-i18n`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-images`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-images-widgets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-jobs`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-launder`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-locks`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-login`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-migrations`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-modal`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-module`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-notifications`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-oembed`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pager`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pages`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-permissions`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces-pages`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-push`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-schemas`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-search`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-service-bridge`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-soft-redirects`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-tags`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-tasks`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-templates`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-ui`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-urls`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-users`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-utils`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-versions`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-video-fields`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-video-widgets`
    - typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-widgets`
  */
  trait AposCoreModules extends StObject
  object AposCoreModules {
    
    inline def `apostrophe-admin-bar`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-admin-bar` = "apostrophe-admin-bar".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-admin-bar`]
    
    inline def `apostrophe-any-page-manager`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-any-page-manager` = "apostrophe-any-page-manager".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-any-page-manager`]
    
    inline def `apostrophe-areas`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-areas` = "apostrophe-areas".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-areas`]
    
    inline def `apostrophe-assets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-assets` = "apostrophe-assets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-assets`]
    
    inline def `apostrophe-attachments`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-attachments` = "apostrophe-attachments".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-attachments`]
    
    inline def `apostrophe-browser-utils`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-browser-utils` = "apostrophe-browser-utils".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-browser-utils`]
    
    inline def `apostrophe-caches`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-caches` = "apostrophe-caches".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-caches`]
    
    inline def `apostrophe-custom-pages`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-custom-pages` = "apostrophe-custom-pages".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-custom-pages`]
    
    inline def `apostrophe-db`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-db` = "apostrophe-db".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-db`]
    
    inline def `apostrophe-doc-type-manager`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-doc-type-manager` = "apostrophe-doc-type-manager".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-doc-type-manager`]
    
    inline def `apostrophe-docs`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-docs` = "apostrophe-docs".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-docs`]
    
    inline def `apostrophe-email`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-email` = "apostrophe-email".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-email`]
    
    inline def `apostrophe-express`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-express` = "apostrophe-express".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-express`]
    
    inline def `apostrophe-files`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-files` = "apostrophe-files".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-files`]
    
    inline def `apostrophe-files-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-files-widgets` = "apostrophe-files-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-files-widgets`]
    
    inline def `apostrophe-global`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-global` = "apostrophe-global".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-global`]
    
    inline def `apostrophe-groups`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-groups` = "apostrophe-groups".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-groups`]
    
    inline def `apostrophe-html-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-html-widgets` = "apostrophe-html-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-html-widgets`]
    
    inline def `apostrophe-i18n`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-i18n` = "apostrophe-i18n".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-i18n`]
    
    inline def `apostrophe-images`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-images` = "apostrophe-images".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-images`]
    
    inline def `apostrophe-images-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-images-widgets` = "apostrophe-images-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-images-widgets`]
    
    inline def `apostrophe-jobs`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-jobs` = "apostrophe-jobs".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-jobs`]
    
    inline def `apostrophe-launder`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-launder` = "apostrophe-launder".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-launder`]
    
    inline def `apostrophe-locks`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-locks` = "apostrophe-locks".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-locks`]
    
    inline def `apostrophe-login`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-login` = "apostrophe-login".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-login`]
    
    inline def `apostrophe-migrations`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-migrations` = "apostrophe-migrations".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-migrations`]
    
    inline def `apostrophe-modal`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-modal` = "apostrophe-modal".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-modal`]
    
    inline def `apostrophe-module`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-module` = "apostrophe-module".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-module`]
    
    inline def `apostrophe-notifications`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-notifications` = "apostrophe-notifications".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-notifications`]
    
    inline def `apostrophe-oembed`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-oembed` = "apostrophe-oembed".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-oembed`]
    
    inline def `apostrophe-pager`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pager` = "apostrophe-pager".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pager`]
    
    inline def `apostrophe-pages`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pages` = "apostrophe-pages".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pages`]
    
    inline def `apostrophe-permissions`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-permissions` = "apostrophe-permissions".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-permissions`]
    
    inline def `apostrophe-pieces`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces` = "apostrophe-pieces".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces`]
    
    inline def `apostrophe-pieces-pages`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces-pages` = "apostrophe-pieces-pages".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces-pages`]
    
    inline def `apostrophe-pieces-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces-widgets` = "apostrophe-pieces-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-pieces-widgets`]
    
    inline def `apostrophe-polymorphic-manager`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager` = "apostrophe-polymorphic-manager".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-polymorphic-manager`]
    
    inline def `apostrophe-push`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-push` = "apostrophe-push".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-push`]
    
    inline def `apostrophe-rich-text-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets` = "apostrophe-rich-text-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-rich-text-widgets`]
    
    inline def `apostrophe-schemas`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-schemas` = "apostrophe-schemas".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-schemas`]
    
    inline def `apostrophe-search`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-search` = "apostrophe-search".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-search`]
    
    inline def `apostrophe-service-bridge`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-service-bridge` = "apostrophe-service-bridge".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-service-bridge`]
    
    inline def `apostrophe-soft-redirects`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-soft-redirects` = "apostrophe-soft-redirects".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-soft-redirects`]
    
    inline def `apostrophe-tags`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-tags` = "apostrophe-tags".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-tags`]
    
    inline def `apostrophe-tasks`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-tasks` = "apostrophe-tasks".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-tasks`]
    
    inline def `apostrophe-templates`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-templates` = "apostrophe-templates".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-templates`]
    
    inline def `apostrophe-ui`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-ui` = "apostrophe-ui".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-ui`]
    
    inline def `apostrophe-urls`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-urls` = "apostrophe-urls".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-urls`]
    
    inline def `apostrophe-users`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-users` = "apostrophe-users".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-users`]
    
    inline def `apostrophe-utils`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-utils` = "apostrophe-utils".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-utils`]
    
    inline def `apostrophe-versions`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-versions` = "apostrophe-versions".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-versions`]
    
    inline def `apostrophe-video-fields`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-video-fields` = "apostrophe-video-fields".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-video-fields`]
    
    inline def `apostrophe-video-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-video-widgets` = "apostrophe-video-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-video-widgets`]
    
    inline def `apostrophe-widgets`: typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-widgets` = "apostrophe-widgets".asInstanceOf[typingsJapgolly.apostrophe.apostropheStrings.`apostrophe-widgets`]
  }
  
  trait AposModule extends StObject {
    
    def emit(name: String): Unit
    
    def on(name: String, methodName: Any, fn: js.Function0[Any]): Unit
  }
  object AposModule {
    
    inline def apply(emit: String => Callback, on: (String, Any, js.Function0[Any]) => Callback): AposModule = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1((t0: String) => emit(t0).runNow()), on = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function0[Any]) => (on(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[AposModule]
    }
    
    extension [Self <: AposModule](x: Self) {
      
      inline def setEmit(value: String => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOn(value: (String, Any, js.Function0[Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function0[Any]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  // Pass in custom modules to AposModuleOptions to allow them in extend
  trait AposModuleOptions[C] extends StObject {
    
    var addFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    var arrangeFields: js.UndefOr[js.Array[typingsJapgolly.apostrophe.anon.Fields]] = js.undefined
    
    var beforeConstruct: js.UndefOr[js.Function2[/* self */ Any, /* options */ Any, Any]] = js.undefined
    
    var defer: js.UndefOr[Boolean] = js.undefined
    
    var extend: AposCoreModules | C
    
    var filters: js.UndefOr[Projection] = js.undefined
    
    var label: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var playerData: js.UndefOr[`false` | js.Array[String]] = js.undefined
    
    var pluralLabel: js.UndefOr[String] = js.undefined
    
    var removeFields: js.UndefOr[js.Array[Field]] = js.undefined
    
    var scene: js.UndefOr[user] = js.undefined
  }
  object AposModuleOptions {
    
    inline def apply[C](extend: AposCoreModules | C, label: String): AposModuleOptions[C] = {
      val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposModuleOptions[C]]
    }
    
    extension [Self <: AposModuleOptions[?], C](x: Self & AposModuleOptions[C]) {
      
      inline def setAddFields(value: js.Array[Field]): Self = StObject.set(x, "addFields", value.asInstanceOf[js.Any])
      
      inline def setAddFieldsUndefined: Self = StObject.set(x, "addFields", js.undefined)
      
      inline def setAddFieldsVarargs(value: Field*): Self = StObject.set(x, "addFields", js.Array(value*))
      
      inline def setArrangeFields(value: js.Array[typingsJapgolly.apostrophe.anon.Fields]): Self = StObject.set(x, "arrangeFields", value.asInstanceOf[js.Any])
      
      inline def setArrangeFieldsUndefined: Self = StObject.set(x, "arrangeFields", js.undefined)
      
      inline def setArrangeFieldsVarargs(value: typingsJapgolly.apostrophe.anon.Fields*): Self = StObject.set(x, "arrangeFields", js.Array(value*))
      
      inline def setBeforeConstruct(value: (/* self */ Any, /* options */ Any) => Any): Self = StObject.set(x, "beforeConstruct", js.Any.fromFunction2(value))
      
      inline def setBeforeConstructUndefined: Self = StObject.set(x, "beforeConstruct", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setExtend(value: AposCoreModules | C): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: Projection): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPlayerData(value: `false` | js.Array[String]): Self = StObject.set(x, "playerData", value.asInstanceOf[js.Any])
      
      inline def setPlayerDataUndefined: Self = StObject.set(x, "playerData", js.undefined)
      
      inline def setPlayerDataVarargs(value: String*): Self = StObject.set(x, "playerData", js.Array(value*))
      
      inline def setPluralLabel(value: String): Self = StObject.set(x, "pluralLabel", value.asInstanceOf[js.Any])
      
      inline def setPluralLabelUndefined: Self = StObject.set(x, "pluralLabel", js.undefined)
      
      inline def setRemoveFields(value: js.Array[Field]): Self = StObject.set(x, "removeFields", value.asInstanceOf[js.Any])
      
      inline def setRemoveFieldsUndefined: Self = StObject.set(x, "removeFields", js.undefined)
      
      inline def setRemoveFieldsVarargs(value: Field*): Self = StObject.set(x, "removeFields", js.Array(value*))
      
      inline def setScene(value: user): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setSceneUndefined: Self = StObject.set(x, "scene", js.undefined)
    }
  }
  
  type AposObject = StringDictionary[Any]
  
  trait AposType extends StObject {
    
    var bless: js.UndefOr[js.Function2[/* req */ Any, /* field */ Any, Unit]] = js.undefined
    
    var converters: Form
    
    var empty: js.UndefOr[js.Function2[/* field */ Any, /* value */ Any, Unit]] = js.undefined
    
    def index(value: Any, field: Any, texts: Any): Unit
    
    var name: String
  }
  object AposType {
    
    inline def apply(converters: Form, index: (Any, Any, Any) => Callback, name: String): AposType = {
      val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (index(t0, t1, t2)).runNow()), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AposType]
    }
    
    extension [Self <: AposType](x: Self) {
      
      inline def setBless(value: (/* req */ Any, /* field */ Any) => Callback): Self = StObject.set(x, "bless", js.Any.fromFunction2((t0: /* req */ Any, t1: /* field */ Any) => (value(t0, t1)).runNow()))
      
      inline def setBlessUndefined: Self = StObject.set(x, "bless", js.undefined)
      
      inline def setConverters(value: Form): Self = StObject.set(x, "converters", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: (/* field */ Any, /* value */ Any) => Callback): Self = StObject.set(x, "empty", js.Any.fromFunction2((t0: /* field */ Any, t1: /* value */ Any) => (value(t0, t1)).runNow()))
      
      inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      inline def setIndex(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "index", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var choices: js.UndefOr[js.Array[SelectChoice]] = js.undefined
    
    var help: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var name: String
    
    var options: js.UndefOr[AposObject] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var schema: js.UndefOr[js.Array[Field]] = js.undefined
    
    var titleField: js.UndefOr[String] = js.undefined
    
    var `type`: String
    
    var widgetType: js.UndefOr[String] = js.undefined
  }
  object Field {
    
    inline def apply(label: String, name: String, `type`: String): Field = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setChoices(value: js.Array[SelectChoice]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: SelectChoice*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: AposObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSchema(value: js.Array[Field]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSchemaVarargs(value: Field*): Self = StObject.set(x, "schema", js.Array(value*))
      
      inline def setTitleField(value: String): Self = StObject.set(x, "titleField", value.asInstanceOf[js.Any])
      
      inline def setTitleFieldUndefined: Self = StObject.set(x, "titleField", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidgetType(value: String): Self = StObject.set(x, "widgetType", value.asInstanceOf[js.Any])
      
      inline def setWidgetTypeUndefined: Self = StObject.set(x, "widgetType", js.undefined)
    }
  }
  
  type Fields = js.Array[Field]
  
  trait Schema extends StObject {
    
    def addFieldType(`type`: AposType): Unit
    
    def addFilters(schema: Schema, options: Any, cursor: Any): Unit
    
    def addJoinSlugFilter(field: Any, cursor: Any, suffix: Any): Unit
    
    def afterInit(): Unit
    
    def compose(options: AposObject): Unit
    
    def convert(req: Any, schema: Schema, to: Any, `object`: AposObject, output: Any, callback: js.Function0[Any]): Unit
    
    def createRoutes(): js.Array[Any]
    
    def cursorFilterInterested(cursor: Any, name: String): Unit
    
    def empty(schema: Schema, `object`: AposObject): Unit
    
    def `export`(req: Any, schema: Schema, to: Any, `object`: AposObject, output: Any, callback: js.Function0[Any]): Unit
    
    def getFieldType(typeName: String): Unit
    
    def indexFields(schema: Schema, `object`: AposObject, texts: Any): Unit
    
    def isVisible(schema: Schema, `object`: AposObject, name: String): Unit
    
    def join(req: Any, schema: Schema, objectOrArray: Any, withJoins: Any, callback: js.Function0[Any]): Unit
    
    def joinDriver(
      req: Any,
      method: Any,
      reverse: Any,
      items: Any,
      idField: Any,
      relationshipsField: Any,
      objectField: Any,
      options: Any,
      callback: js.Function0[Any]
    ): Unit
    
    def joinFilterChoices(field: Any, cursor: Any, valueField: Any): Unit
    
    def newInstance(schema: Schema): Any
    
    def pageServe(req: Any): Unit
    
    def pushAssets(): Unit
    
    def pushCreateSingleton(): Unit
    
    def refine(schema: Schema, options: AposObject): Unit
    
    def sortedDistinct(property: Any, cursor: Any, callback: js.Function0[Any]): Unit
    
    def subset(schema: Schema, fields: Fields): Schema
    
    def subsetInstance(schema: Schema, instance: AposObject): Any
    
    def toGroups(fields: Fields): Unit
    
    def validate(schema: Schema, options: Any): Unit
  }
  object Schema {
    
    inline def apply(
      addFieldType: AposType => Callback,
      addFilters: (Schema, Any, Any) => Callback,
      addJoinSlugFilter: (Any, Any, Any) => Callback,
      afterInit: Callback,
      compose: AposObject => Callback,
      convert: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Callback,
      createRoutes: CallbackTo[js.Array[Any]],
      cursorFilterInterested: (Any, String) => Callback,
      empty: (Schema, AposObject) => Callback,
      `export`: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Callback,
      getFieldType: String => Callback,
      indexFields: (Schema, AposObject, Any) => Callback,
      isVisible: (Schema, AposObject, String) => Callback,
      join: (Any, Schema, Any, Any, js.Function0[Any]) => Callback,
      joinDriver: (Any, Any, Any, Any, Any, Any, Any, Any, js.Function0[Any]) => Callback,
      joinFilterChoices: (Any, Any, Any) => Callback,
      newInstance: Schema => Any,
      pageServe: Any => Callback,
      pushAssets: Callback,
      pushCreateSingleton: Callback,
      refine: (Schema, AposObject) => Callback,
      sortedDistinct: (Any, Any, js.Function0[Any]) => Callback,
      subset: (Schema, Fields) => Schema,
      subsetInstance: (Schema, AposObject) => Any,
      toGroups: Fields => Callback,
      validate: (Schema, Any) => Callback
    ): Schema = {
      val __obj = js.Dynamic.literal(addFieldType = js.Any.fromFunction1((t0: AposType) => addFieldType(t0).runNow()), addFilters = js.Any.fromFunction3((t0: Schema, t1: Any, t2: Any) => (addFilters(t0, t1, t2)).runNow()), addJoinSlugFilter = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (addJoinSlugFilter(t0, t1, t2)).runNow()), afterInit = afterInit.toJsFn, compose = js.Any.fromFunction1((t0: AposObject) => compose(t0).runNow()), convert = js.Any.fromFunction6((t0: Any, t1: Schema, t2: Any, t3: AposObject, t4: Any, t5: js.Function0[Any]) => (convert(t0, t1, t2, t3, t4, t5)).runNow()), createRoutes = createRoutes.toJsFn, cursorFilterInterested = js.Any.fromFunction2((t0: Any, t1: String) => (cursorFilterInterested(t0, t1)).runNow()), empty = js.Any.fromFunction2((t0: Schema, t1: AposObject) => (empty(t0, t1)).runNow()), getFieldType = js.Any.fromFunction1((t0: String) => getFieldType(t0).runNow()), indexFields = js.Any.fromFunction3((t0: Schema, t1: AposObject, t2: Any) => (indexFields(t0, t1, t2)).runNow()), isVisible = js.Any.fromFunction3((t0: Schema, t1: AposObject, t2: String) => (isVisible(t0, t1, t2)).runNow()), join = js.Any.fromFunction5((t0: Any, t1: Schema, t2: Any, t3: Any, t4: js.Function0[Any]) => (join(t0, t1, t2, t3, t4)).runNow()), joinDriver = js.Any.fromFunction9((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any, t8: js.Function0[Any]) => (joinDriver(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()), joinFilterChoices = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (joinFilterChoices(t0, t1, t2)).runNow()), newInstance = js.Any.fromFunction1(newInstance), pageServe = js.Any.fromFunction1((t0: Any) => pageServe(t0).runNow()), pushAssets = pushAssets.toJsFn, pushCreateSingleton = pushCreateSingleton.toJsFn, refine = js.Any.fromFunction2((t0: Schema, t1: AposObject) => (refine(t0, t1)).runNow()), sortedDistinct = js.Any.fromFunction3((t0: Any, t1: Any, t2: js.Function0[Any]) => (sortedDistinct(t0, t1, t2)).runNow()), subset = js.Any.fromFunction2(subset), subsetInstance = js.Any.fromFunction2(subsetInstance), toGroups = js.Any.fromFunction1((t0: Fields) => toGroups(t0).runNow()), validate = js.Any.fromFunction2((t0: Schema, t1: Any) => (validate(t0, t1)).runNow()))
      __obj.updateDynamic("export")(js.Any.fromFunction6((t0: Any, t1: Schema, t2: Any, t3: AposObject, t4: Any, t5: js.Function0[Any]) => (`export`(t0, t1, t2, t3, t4, t5)).runNow()))
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setAddFieldType(value: AposType => Callback): Self = StObject.set(x, "addFieldType", js.Any.fromFunction1((t0: AposType) => value(t0).runNow()))
      
      inline def setAddFilters(value: (Schema, Any, Any) => Callback): Self = StObject.set(x, "addFilters", js.Any.fromFunction3((t0: Schema, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddJoinSlugFilter(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "addJoinSlugFilter", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setAfterInit(value: Callback): Self = StObject.set(x, "afterInit", value.toJsFn)
      
      inline def setCompose(value: AposObject => Callback): Self = StObject.set(x, "compose", js.Any.fromFunction1((t0: AposObject) => value(t0).runNow()))
      
      inline def setConvert(value: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Callback): Self = StObject.set(x, "convert", js.Any.fromFunction6((t0: Any, t1: Schema, t2: Any, t3: AposObject, t4: Any, t5: js.Function0[Any]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setCreateRoutes(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "createRoutes", value.toJsFn)
      
      inline def setCursorFilterInterested(value: (Any, String) => Callback): Self = StObject.set(x, "cursorFilterInterested", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setEmpty(value: (Schema, AposObject) => Callback): Self = StObject.set(x, "empty", js.Any.fromFunction2((t0: Schema, t1: AposObject) => (value(t0, t1)).runNow()))
      
      inline def setExport(value: (Any, Schema, Any, AposObject, Any, js.Function0[Any]) => Callback): Self = StObject.set(x, "export", js.Any.fromFunction6((t0: Any, t1: Schema, t2: Any, t3: AposObject, t4: Any, t5: js.Function0[Any]) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setGetFieldType(value: String => Callback): Self = StObject.set(x, "getFieldType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setIndexFields(value: (Schema, AposObject, Any) => Callback): Self = StObject.set(x, "indexFields", js.Any.fromFunction3((t0: Schema, t1: AposObject, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setIsVisible(value: (Schema, AposObject, String) => Callback): Self = StObject.set(x, "isVisible", js.Any.fromFunction3((t0: Schema, t1: AposObject, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setJoin(value: (Any, Schema, Any, Any, js.Function0[Any]) => Callback): Self = StObject.set(x, "join", js.Any.fromFunction5((t0: Any, t1: Schema, t2: Any, t3: Any, t4: js.Function0[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
      
      inline def setJoinDriver(value: (Any, Any, Any, Any, Any, Any, Any, Any, js.Function0[Any]) => Callback): Self = StObject.set(x, "joinDriver", js.Any.fromFunction9((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any, t8: js.Function0[Any]) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8)).runNow()))
      
      inline def setJoinFilterChoices(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "joinFilterChoices", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setNewInstance(value: Schema => Any): Self = StObject.set(x, "newInstance", js.Any.fromFunction1(value))
      
      inline def setPageServe(value: Any => Callback): Self = StObject.set(x, "pageServe", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setPushAssets(value: Callback): Self = StObject.set(x, "pushAssets", value.toJsFn)
      
      inline def setPushCreateSingleton(value: Callback): Self = StObject.set(x, "pushCreateSingleton", value.toJsFn)
      
      inline def setRefine(value: (Schema, AposObject) => Callback): Self = StObject.set(x, "refine", js.Any.fromFunction2((t0: Schema, t1: AposObject) => (value(t0, t1)).runNow()))
      
      inline def setSortedDistinct(value: (Any, Any, js.Function0[Any]) => Callback): Self = StObject.set(x, "sortedDistinct", js.Any.fromFunction3((t0: Any, t1: Any, t2: js.Function0[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setSubset(value: (Schema, Fields) => Schema): Self = StObject.set(x, "subset", js.Any.fromFunction2(value))
      
      inline def setSubsetInstance(value: (Schema, AposObject) => Any): Self = StObject.set(x, "subsetInstance", js.Any.fromFunction2(value))
      
      inline def setToGroups(value: Fields => Callback): Self = StObject.set(x, "toGroups", js.Any.fromFunction1((t0: Fields) => value(t0).runNow()))
      
      inline def setValidate(value: (Schema, Any) => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction2((t0: Schema, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  trait SelectChoice extends StObject {
    
    var label: String
    
    var value: String
  }
  object SelectChoice {
    
    inline def apply(label: String, value: String): SelectChoice = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChoice]
    }
    
    extension [Self <: SelectChoice](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
