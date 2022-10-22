package typingsJapgolly.djv

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("djv", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DjvStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("djv", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with typingsJapgolly.djv.mod.djv {
    def this(options: DjvConfig) = this()
  }
  
  trait DjvConfig extends StObject {
    
    /** a handler to use for generating custom error messages */
    var errorHandler: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** an object containing list of formatters to add for environment */
    var formats: js.UndefOr[Record[String, js.Function1[/* repeated */ String, String]]] = js.undefined
    
    /**
      * generating object should be considered as inner
      *
      * Default value is `false`/`undefined`. If `true`, then it avoid creating variables in a
      * generated function body, however without proper wrapper function approach will not work.
      */
    var inner: js.UndefOr[Boolean] = js.undefined
    
    /** defines which version of json-schema draft to use, draft-04 by default */
    var version: js.UndefOr[String] = js.undefined
    
    /** handler to apply for environment version */
    var versionConfigure: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.undefined
  }
  object DjvConfig {
    
    inline def apply(): DjvConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DjvConfig]
    }
    
    extension [Self <: DjvConfig](x: Self) {
      
      inline def setErrorHandler(value: Callback): Self = StObject.set(x, "errorHandler", value.toJsFn)
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setFormats(value: Record[String, js.Function1[/* repeated */ String, String]]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setInner(value: Boolean): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionConfigure(value: /* object */ js.Object => Callback): Self = StObject.set(x, "versionConfigure", js.Any.fromFunction1((t0: /* object */ js.Object) => value(t0).runNow()))
      
      inline def setVersionConfigureUndefined: Self = StObject.set(x, "versionConfigure", js.undefined)
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait DjvStatic
    extends StObject
       with Instantiable0[typingsJapgolly.djv.mod.djv]
       with Instantiable1[/* options */ DjvConfig, typingsJapgolly.djv.mod.djv] {
    
    def apply(): typingsJapgolly.djv.mod.djv = js.native
    def apply(options: DjvConfig): typingsJapgolly.djv.mod.djv = js.native
    
    def expression(strings: js.Array[String], keys: String*): js.Function1[/* repeated */ String, String] = js.native
  }
  
  trait Resolved extends StObject {
    
    def fn(args: Any*): Any
    
    var schema: js.Object
  }
  object Resolved {
    
    inline def apply(fn: /* repeated */ Any => Any, schema: js.Object): Resolved = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn), schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resolved]
    }
    
    extension [Self <: Resolved](x: Self) {
      
      inline def setFn(value: /* repeated */ Any => Any): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
      
      inline def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & DjvStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & DjvStatic = ^
  
  @js.native
  trait djv extends StObject {
    
    def addFormat(name: String, formatter: String): Unit = js.native
    def addFormat(name: String, formatter: js.Function2[/* schema */ js.Object, /* tpl */ Any, Unit]): Unit = js.native
    
    def addSchema(nameOrSchema: String): Resolved = js.native
    def addSchema(nameOrSchema: String, schema: js.Object): Resolved = js.native
    def addSchema(nameOrSchema: js.Object): Resolved = js.native
    def addSchema(nameOrSchema: js.Object, schema: js.Object): Resolved = js.native
    
    def `export`(): String = js.native
    def `export`(name: String): String = js.native
    
    def `import`(config: js.Object): Unit = js.native
    
    def removeSchema(name: String): Unit = js.native
    
    def resolve(name: String): Resolved = js.native
    def resolve(name: js.Object): Resolved = js.native
    
    var resolved: Resolved = js.native
    
    def setErrorHandler(errorHandler: js.Function2[/* errorType */ String, /* property */ Any, String]): Unit = js.native
    
    def useVersion(version: String): Unit = js.native
    def useVersion(version: String, configure: Any): Unit = js.native
    
    def validate(name: String, `object`: js.Object): js.UndefOr[String] = js.native
  }
}
