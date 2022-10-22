package typingsJapgolly.jsonSchemaTraverse

import typingsJapgolly.jsonSchemaTraverse.mod.Callback
import typingsJapgolly.jsonSchemaTraverse.mod.SchemaObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Post extends StObject {
    
    var post: js.UndefOr[Callback] = js.undefined
    
    var pre: js.UndefOr[Callback] = js.undefined
  }
  object Post {
    
    inline def apply(): Post = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Post]
    }
    
    extension [Self <: Post](x: Self) {
      
      inline def setPost(
        value: (/* schema */ SchemaObject, /* jsonPtr */ String, /* rootSchema */ SchemaObject, /* parentJsonPtr */ js.UndefOr[String], /* parentKeyword */ js.UndefOr[String], /* parentSchema */ js.UndefOr[SchemaObject], /* keyIndex */ js.UndefOr[String | Double]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "post", js.Any.fromFunction7((t0: /* schema */ SchemaObject, t1: /* jsonPtr */ String, t2: /* rootSchema */ SchemaObject, t3: /* parentJsonPtr */ js.UndefOr[String], t4: /* parentKeyword */ js.UndefOr[String], t5: /* parentSchema */ js.UndefOr[SchemaObject], t6: /* keyIndex */ js.UndefOr[String | Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
      
      inline def setPre(
        value: (/* schema */ SchemaObject, /* jsonPtr */ String, /* rootSchema */ SchemaObject, /* parentJsonPtr */ js.UndefOr[String], /* parentKeyword */ js.UndefOr[String], /* parentSchema */ js.UndefOr[SchemaObject], /* keyIndex */ js.UndefOr[String | Double]) => japgolly.scalajs.react.Callback
      ): Self = StObject.set(x, "pre", js.Any.fromFunction7((t0: /* schema */ SchemaObject, t1: /* jsonPtr */ String, t2: /* rootSchema */ SchemaObject, t3: /* parentJsonPtr */ js.UndefOr[String], t4: /* parentKeyword */ js.UndefOr[String], t5: /* parentSchema */ js.UndefOr[SchemaObject], t6: /* keyIndex */ js.UndefOr[String | Double]) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
      
      inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
    }
  }
}
