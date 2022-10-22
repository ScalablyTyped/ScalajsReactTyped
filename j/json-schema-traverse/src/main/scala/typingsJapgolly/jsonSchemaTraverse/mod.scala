package typingsJapgolly.jsonSchemaTraverse

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsonSchemaTraverse.anon.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(schema: SchemaObject, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: SchemaObject, opts: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(schema: SchemaObject, opts: Options, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(schema.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("json-schema-traverse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function7[
    /* schema */ SchemaObject, 
    /* jsonPtr */ String, 
    /* rootSchema */ SchemaObject, 
    /* parentJsonPtr */ js.UndefOr[String], 
    /* parentKeyword */ js.UndefOr[String], 
    /* parentSchema */ js.UndefOr[SchemaObject], 
    /* keyIndex */ js.UndefOr[String | Double], 
    Unit
  ]
  
  trait Options extends StObject {
    
    var allKeys: js.UndefOr[Boolean] = js.undefined
    
    var cb: js.UndefOr[Callback | Post] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
      
      inline def setAllKeysUndefined: Self = StObject.set(x, "allKeys", js.undefined)
      
      inline def setCb(value: Callback | Post): Self = StObject.set(x, "cb", value.asInstanceOf[js.Any])
      
      inline def setCbFunction7(
        value: (/* schema */ SchemaObject, /* jsonPtr */ String, /* rootSchema */ SchemaObject, /* parentJsonPtr */ js.UndefOr[String], /* parentKeyword */ js.UndefOr[String], /* parentSchema */ js.UndefOr[SchemaObject], /* keyIndex */ js.UndefOr[String | Double]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "cb", js.Any.fromFunction7((t0: /* schema */ SchemaObject, t1: /* jsonPtr */ String, t2: /* rootSchema */ SchemaObject, t3: /* parentJsonPtr */ js.UndefOr[String], t4: /* parentKeyword */ js.UndefOr[String], t5: /* parentSchema */ js.UndefOr[SchemaObject], t6: /* keyIndex */ js.UndefOr[String | Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
    }
  }
  
  trait SchemaObject
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    @JSName("$id")
    var $id: js.UndefOr[String] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
  }
  object SchemaObject {
    
    inline def apply(): SchemaObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaObject]
    }
    
    extension [Self <: SchemaObject](x: Self) {
      
      inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    }
  }
}
