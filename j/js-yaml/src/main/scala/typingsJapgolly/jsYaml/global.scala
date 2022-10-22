package typingsJapgolly.jsYaml

import typingsJapgolly.jsYaml.mod.DumpOptions
import typingsJapgolly.jsYaml.mod.LoadOptions
import typingsJapgolly.jsYaml.mod.Mark
import typingsJapgolly.jsYaml.mod.SchemaDefinition
import typingsJapgolly.jsYaml.mod.TypeConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object jsyaml {
    
    @JSGlobal("jsyaml")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("jsyaml.CORE_SCHEMA")
    @js.native
    def CORE_SCHEMA: typingsJapgolly.jsYaml.mod.Schema = js.native
    inline def CORE_SCHEMA_=(x: typingsJapgolly.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.DEFAULT_SCHEMA")
    @js.native
    def DEFAULT_SCHEMA: typingsJapgolly.jsYaml.mod.Schema = js.native
    inline def DEFAULT_SCHEMA_=(x: typingsJapgolly.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.FAILSAFE_SCHEMA")
    @js.native
    def FAILSAFE_SCHEMA: typingsJapgolly.jsYaml.mod.Schema = js.native
    inline def FAILSAFE_SCHEMA_=(x: typingsJapgolly.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILSAFE_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.JSON_SCHEMA")
    @js.native
    def JSON_SCHEMA: typingsJapgolly.jsYaml.mod.Schema = js.native
    inline def JSON_SCHEMA_=(x: typingsJapgolly.jsYaml.mod.Schema): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSON_SCHEMA")(x.asInstanceOf[js.Any])
    
    @JSGlobal("jsyaml.Schema")
    @js.native
    open class Schema protected ()
      extends typingsJapgolly.jsYaml.mod.Schema {
      def this(definition: js.Array[typingsJapgolly.jsYaml.mod.Type]) = this()
      def this(definition: SchemaDefinition) = this()
      def this(definition: typingsJapgolly.jsYaml.mod.Type) = this()
    }
    
    @JSGlobal("jsyaml.Type")
    @js.native
    open class Type protected ()
      extends typingsJapgolly.jsYaml.mod.Type {
      def this(tag: String) = this()
      def this(tag: String, opts: TypeConstructorOptions) = this()
    }
    
    @JSGlobal("jsyaml.YAMLException")
    @js.native
    open class YAMLException ()
      extends typingsJapgolly.jsYaml.mod.YAMLException {
      def this(reason: String) = this()
      def this(reason: String, mark: Mark) = this()
      def this(reason: Unit, mark: Mark) = this()
    }
    
    inline def dump(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def dump(obj: Any, opts: DumpOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dump")(obj.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def load(str: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def load(str: String, opts: LoadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(str.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def loadAll(str: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def loadAll(str: String, iterator: js.Function1[/* doc */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAll(str: String, iterator: js.Function1[/* doc */ Any, Unit], opts: LoadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAll(str: String, iterator: Null, opts: LoadOptions): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def loadAll(str: String, iterator: Unit, opts: LoadOptions): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAll")(str.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  }
}
