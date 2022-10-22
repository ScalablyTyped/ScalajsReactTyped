package typingsJapgolly.expressFrappe

import japgolly.scalajs.react.Callback
import typingsJapgolly.bodyParser.mod.OptionsJson
import typingsJapgolly.bodyParser.mod.OptionsUrlencoded
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.serveStatic.mod.ServeStaticOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Json extends StObject {
    
    var json: js.UndefOr[Boolean | OptionsJson] = js.undefined
    
    var urlencoded: js.UndefOr[Boolean | OptionsUrlencoded] = js.undefined
  }
  object Json {
    
    inline def apply(): Json = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Json]
    }
    
    extension [Self <: Json](x: Self) {
      
      inline def setJson(value: Boolean | OptionsJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setUrlencoded(value: Boolean | OptionsUrlencoded): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
      
      inline def setUrlencodedUndefined: Self = StObject.set(x, "urlencoded", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var options: js.UndefOr[ServeStaticOptions[ServerResponse[IncomingMessage]]] = js.undefined
    
    var root: String
  }
  object Options {
    
    inline def apply(root: String): Options = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: ServeStaticOptions[ServerResponse[IncomingMessage]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{use (io : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server * / any, socket : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket * / any, next : (err : any | undefined): void): void, onConnect (io : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server * / any, socket : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket * / any): void, onDisconnect (io : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server * / any, socket : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket * / any): void, [eventHandler: string] : (io : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server * / any, socket : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket * / any, data : any, cb : std.Function): void}> */
  trait Partialuseioanysocketanyn extends StObject {
    
    var onConnect: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var onDisconnect: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, 
          Unit
        ]
      ] = js.undefined
    
    var use: js.UndefOr[
        js.Function3[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, 
          /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object Partialuseioanysocketanyn {
    
    inline def apply(): Partialuseioanysocketanyn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Partialuseioanysocketanyn]
    }
    
    extension [Self <: Partialuseioanysocketanyn](x: Self) {
      
      inline def setOnConnect(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any) => Callback
      ): Self = StObject.set(x, "onConnect", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any) => Callback
      ): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
      
      inline def setUse(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => Callback
      ): Self = StObject.set(x, "use", js.Any.fromFunction3((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Server */ /* io */ Any, t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SocketIO.Socket */ /* socket */ Any, t2: /* next */ js.Function1[/* err */ js.UndefOr[Any], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    }
  }
}
