package typingsJapgolly.body

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def parse(queryString: String, cb: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit
  }
  object `0` {
    
    inline def apply(parse: (String, js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback): `0` = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (parse(t0, t1)).runNow()))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setParse(value: (String, js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback): Self = StObject.set(x, "parse", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Cache extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object Cache {
    
    inline def apply(): Cache = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cache]
    }
    
    extension [Self <: Cache](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
  
  trait Encoding extends StObject {
    
    var JSON: js.UndefOr[Parse] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var querystring: `0`
    
    var reviver: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object Encoding {
    
    inline def apply(querystring: `0`): Encoding = {
      val __obj = js.Dynamic.literal(querystring = querystring.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setJSON(value: Parse): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setQuerystring(value: `0`): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      inline def setReviver(value: /* repeated */ Any => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction1(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  trait JSON extends StObject {
    
    var JSON: js.UndefOr[Parse] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var reviver: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  }
  object JSON {
    
    inline def apply(): JSON = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSON]
    }
    
    extension [Self <: JSON](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setJSON(value: Parse): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
      
      inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setReviver(value: /* repeated */ Any => Any): Self = StObject.set(x, "reviver", js.Any.fromFunction1(value))
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  trait Limit extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var querystring: `0`
  }
  object Limit {
    
    inline def apply(querystring: `0`): Limit = {
      val __obj = js.Dynamic.literal(querystring = querystring.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    extension [Self <: Limit](x: Self) {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setQuerystring(value: `0`): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parse extends StObject {
    
    def parse(
      queryString: String,
      reviver: js.Function1[/* repeated */ Any, Any],
      cb: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit
  }
  object Parse {
    
    inline def apply(
      parse: (String, js.Function1[/* repeated */ Any, Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback
    ): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction3((t0: String, t1: js.Function1[/* repeated */ Any, Any], t2: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (parse(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Parse]
    }
    
    extension [Self <: Parse](x: Self) {
      
      inline def setParse(
        value: (String, js.Function1[/* repeated */ Any, Any], js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => Callback
      ): Self = StObject.set(x, "parse", js.Any.fromFunction3((t0: String, t1: js.Function1[/* repeated */ Any, Any], t2: js.Function2[/* err */ js.Error, /* result */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
}
