package typingsJapgolly.apostrophe

import org.scalajs.dom.HTMLElement
import typingsJapgolly.apostrophe.anon.Id
import typingsJapgolly.apostrophe.mod.AposConstructor
import typingsJapgolly.apostrophe.mod.AposObject
import typingsJapgolly.apostrophe.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object apos {
    
    inline def apply(options: AposConstructor[js.Object, js.Object], args: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    @JSGlobal("apos")
    @js.native
    val ^ : js.Any = js.native
    
    object adminBar {
      
      @JSGlobal("apos.adminBar")
      @js.native
      val ^ : js.Any = js.native
      
      inline def link(name: String, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    inline def change(arg: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def change(arg: js.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("change")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    object contextPiece {
      
      @JSGlobal("apos.contextPiece")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("apos.contextPiece._id")
      @js.native
      def id: String = js.native
      
      inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_id")(x.asInstanceOf[js.Any])
      
      @JSGlobal("apos.contextPiece.slug")
      @js.native
      def slug: String = js.native
      inline def slug_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("slug")(x.asInstanceOf[js.Any])
      
      @JSGlobal("apos.contextPiece.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSGlobal("apos.contextPiece.type")
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
      
      @JSGlobal("apos.docs")
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
      
      @JSGlobal("apos.modalSupport")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("apos.modalSupport.all")
      @js.native
      def all: js.Array[Any] = js.native
      inline def all_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
      
      inline def cancelTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelTopModal")().asInstanceOf[Unit]
      
      inline def closeTopModal(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeTopModal")().asInstanceOf[Unit]
      
      @JSGlobal("apos.modalSupport.depth")
      @js.native
      def depth: Double = js.native
      inline def depth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("depth")(x.asInstanceOf[js.Any])
      
      inline def getLatestModal(): Null | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatestModal")().asInstanceOf[Null | String]
      
      inline def getTopModalOrBody(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopModalOrBody")().asInstanceOf[String]
      
      @JSGlobal("apos.modalSupport.initialized")
      @js.native
      def initialized: Boolean = js.native
      inline def initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialized")(x.asInstanceOf[js.Any])
      
      @JSGlobal("apos.modalSupport.stack")
      @js.native
      def stack: js.Array[Any] = js.native
      inline def stack_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stack")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("apos.modules")
    @js.native
    val modules: js.Object = js.native
    
    object moogBundle {
      
      @JSGlobal("apos.moogBundle")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("apos.moogBundle.directory")
      @js.native
      def directory: String = js.native
      inline def directory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("directory")(x.asInstanceOf[js.Any])
      
      @JSGlobal("apos.moogBundle.modules")
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
      
      @JSGlobal("apos.pages")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("apos.pages.page")
      @js.native
      def page: Id = js.native
      inline def page_=(x: Id): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("page")(x.asInstanceOf[js.Any])
    }
    
    object schemas {
      
      @JSGlobal("apos.schemas")
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
      
      @JSGlobal("apos.ui")
      @js.native
      val ^ : js.Any = js.native
      
      inline def globalBusy(state: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("globalBusy")(state.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def link(sel: String, verb: String, `object`: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Any]
      inline def link(sel: String, verb: String, `object`: js.Object, callback: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(sel.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
    
    object utils {
      
      @JSGlobal("apos.utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def camelName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def capitalizeFirst(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalizeFirst")(s.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def generateId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateId")().asInstanceOf[String]
    }
    
    object versions {
      
      @JSGlobal("apos.versions")
      @js.native
      val ^ : js.Any = js.native
      
      inline def edit(id: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def edit(id: String, afterRevert: js.Function0[Unit]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(id.asInstanceOf[js.Any], afterRevert.asInstanceOf[js.Any])).asInstanceOf[Any]
    }
  }
}
