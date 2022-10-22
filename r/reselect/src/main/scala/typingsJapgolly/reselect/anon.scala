package typingsJapgolly.reselect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reselect.esDefaultMemoizeMod.DefaultMemoizeOptions
import typingsJapgolly.reselect.esTypesMod.EqualityFn
import typingsJapgolly.reselect.esTypesMod.Obj
import typingsJapgolly.reselect.reselectStrings.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `0`: `1`
    
    var `1`: typingsJapgolly.reselect.reselectStrings.`0`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")("1")
      __obj.updateDynamic("1")("0")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def set0(value: `1`): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: typingsJapgolly.reselect.reselectStrings.`0`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  1 :{  1 :'1'} & reselect.reselect/es/types.Obj<'0'>} & reselect.reselect/es/types.Obj<reselect.reselect/es/types.Obj<'0'>> */
  trait `111Obj0ObjObj0`
    extends StObject
       with /* k */ StringDictionary[Obj[typingsJapgolly.reselect.reselectStrings.`0`]] {
    
    var `1`: `11Obj0`
  }
  object `111Obj0ObjObj0` {
    
    inline def apply(`1`: `11Obj0`): `111Obj0ObjObj0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`111Obj0ObjObj0`]
    }
    
    extension [Self <: `111Obj0ObjObj0`](x: Self) {
      
      inline def set1(value: `11Obj0`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  1 :'1'} & reselect.reselect/es/types.Obj<'0'> */
  trait `11Obj0`
    extends StObject
       with /* k */ StringDictionary[typingsJapgolly.reselect.reselectStrings.`0`] {
    
    var `1`: typingsJapgolly.reselect.reselectStrings.`1`
  }
  object `11Obj0` {
    
    inline def apply(): `11Obj0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")("1")
      __obj.asInstanceOf[`11Obj0`]
    }
    
    extension [Self <: `11Obj0`](x: Self) {
      
      inline def set1(value: `1`): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClearCache extends StObject {
    
    def clearCache(): Unit
  }
  object ClearCache {
    
    inline def apply(clearCache: Callback): ClearCache = {
      val __obj = js.Dynamic.literal(clearCache = clearCache.toJsFn)
      __obj.asInstanceOf[ClearCache]
    }
    
    extension [Self <: ClearCache](x: Self) {
      
      inline def setClearCache(value: Callback): Self = StObject.set(x, "clearCache", value.toJsFn)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F): F & ClearCache = js.native
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: DefaultMemoizeOptions): F & ClearCache = js.native
    def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](func: F, equalityCheckOrOptions: EqualityFn): F & ClearCache = js.native
  }
  
  trait Length extends StObject {
    
    var length: Double
  }
  object Length {
    
    inline def apply(length: Double): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    extension [Self <: Length](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToStringTag extends StObject {
    
    @JSName(js.Symbol.toStringTag)
    val toStringTag: String = js.native
  }
}
