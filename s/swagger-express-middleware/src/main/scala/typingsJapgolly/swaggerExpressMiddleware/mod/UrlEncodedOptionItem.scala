package typingsJapgolly.swaggerExpressMiddleware.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlEncodedOptionItem extends StObject {
  
  /**
    * parse extended syntax with the qs module.
    */
  var extended: js.UndefOr[Boolean] = js.undefined
  
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes;
    * if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'.
    */
  var limit: js.UndefOr[String | Double] = js.undefined
  
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like urlencoded), a mime type (like application/x-www-form-urlencoded),
    * or a mime type with a wildcard (like * /x-www-form-urlencoded). If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value.
    * Defaults to application/x-www-form-urlencoded.
    */
  var `type`: js.UndefOr[
    (js.Function1[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      String
    ]) | String
  ] = js.undefined
  
  /**
    * function to verify body content, the parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ], 
      /* res */ Response, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.undefined
}
object UrlEncodedOptionItem {
  
  inline def apply(): UrlEncodedOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlEncodedOptionItem]
  }
  
  extension [Self <: UrlEncodedOptionItem](x: Self) {
    
    inline def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
    
    inline def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
    
    inline def setInflate(value: Boolean): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
    
    inline def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
    
    inline def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setType(
      value: (js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          String
        ]) | String
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeFunction1(
      value: /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ] => String
    ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerify(
      value: (/* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], /* res */ Response, /* buf */ Buffer, /* encoding */ String) => Callback
    ): Self = StObject.set(x, "verify", js.Any.fromFunction4((t0: /* req */ Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], t1: /* res */ Response, t2: /* buf */ Buffer, t3: /* encoding */ String) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
