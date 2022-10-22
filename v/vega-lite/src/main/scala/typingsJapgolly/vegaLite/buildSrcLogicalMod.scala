package typingsJapgolly.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcLogicalMod {
  
  @JSImport("vega-lite/build/src/logical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forEachLeaf[T](op: LogicalComposition[T], fn: js.Function1[/* op */ T, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLeaf")(op.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isLogicalAnd(op: LogicalComposition[Any]): /* is vega-lite.vega-lite/build/src/logical.LogicalAnd<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalAnd")(op.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/logical.LogicalAnd<any> */ Boolean]
  
  inline def isLogicalNot(op: LogicalComposition[Any]): /* is vega-lite.vega-lite/build/src/logical.LogicalNot<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalNot")(op.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/logical.LogicalNot<any> */ Boolean]
  
  inline def isLogicalOr(op: LogicalComposition[Any]): /* is vega-lite.vega-lite/build/src/logical.LogicalOr<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLogicalOr")(op.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/logical.LogicalOr<any> */ Boolean]
  
  inline def normalizeLogicalComposition[T](op: LogicalComposition[T], normalizer: js.Function1[/* o */ T, T]): LogicalComposition[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeLogicalComposition")(op.asInstanceOf[js.Any], normalizer.asInstanceOf[js.Any])).asInstanceOf[LogicalComposition[T]]
  
  trait LogicalAnd[T]
    extends StObject
       with _LogicalComposition[T] {
    
    var and: js.Array[LogicalComposition[T]]
  }
  object LogicalAnd {
    
    inline def apply[T](and: js.Array[LogicalComposition[T]]): LogicalAnd[T] = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalAnd[T]]
    }
    
    extension [Self <: LogicalAnd[?], T](x: Self & LogicalAnd[T]) {
      
      inline def setAnd(value: js.Array[LogicalComposition[T]]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAndVarargs(value: LogicalComposition[T]*): Self = StObject.set(x, "and", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalNot[T]
    - typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalAnd[T]
    - typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalOr[T]
    - T
  */
  type LogicalComposition[T] = _LogicalComposition[T] | T
  
  trait LogicalNot[T]
    extends StObject
       with _LogicalComposition[T] {
    
    var not: LogicalComposition[T]
  }
  object LogicalNot {
    
    inline def apply[T](not: LogicalComposition[T]): LogicalNot[T] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalNot[T]]
    }
    
    extension [Self <: LogicalNot[?], T](x: Self & LogicalNot[T]) {
      
      inline def setNot(value: LogicalComposition[T]): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogicalOr[T]
    extends StObject
       with _LogicalComposition[T] {
    
    var or: js.Array[LogicalComposition[T]]
  }
  object LogicalOr {
    
    inline def apply[T](or: js.Array[LogicalComposition[T]]): LogicalOr[T] = {
      val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogicalOr[T]]
    }
    
    extension [Self <: LogicalOr[?], T](x: Self & LogicalOr[T]) {
      
      inline def setOr(value: js.Array[LogicalComposition[T]]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      inline def setOrVarargs(value: LogicalComposition[T]*): Self = StObject.set(x, "or", js.Array(value*))
    }
  }
  
  trait _LogicalComposition[T] extends StObject
  object _LogicalComposition {
    
    inline def LogicalAnd[T](and: js.Array[LogicalComposition[T]]): typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalAnd[T] = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalAnd[T]]
    }
    
    inline def LogicalNot[T](not: LogicalComposition[T]): typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalNot[T] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalNot[T]]
    }
    
    inline def LogicalOr[T](or: js.Array[LogicalComposition[T]]): typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalOr[T] = {
      val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcLogicalMod.LogicalOr[T]]
    }
  }
}
