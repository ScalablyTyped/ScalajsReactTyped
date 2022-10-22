package typingsJapgolly.devexpressUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  type CmpFunc[T] = js.Function2[/* a */ T, /* b */ T, Double]
  
  type EqualFunc[T] = js.Function2[/* a */ T, /* b */ T, Boolean]
  
  trait ICloneable[T] extends StObject
  
  trait IDisposable extends StObject {
    
    def dispose(): Any
  }
  object IDisposable {
    
    inline def apply(dispose: CallbackTo[Any]): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[IDisposable]
    }
    
    extension [Self <: IDisposable](x: Self) {
      
      inline def setDispose(value: CallbackTo[Any]): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  trait IEquatable[T] extends StObject
  
  trait ISupportConverting[T] extends StObject {
    
    def applyConverter(converter: SimpleConverter[T]): this.type
  }
  object ISupportConverting {
    
    inline def apply[T](applyConverter: SimpleConverter[T] => ISupportConverting[T]): ISupportConverting[T] = {
      val __obj = js.Dynamic.literal(applyConverter = js.Any.fromFunction1(applyConverter))
      __obj.asInstanceOf[ISupportConverting[T]]
    }
    
    extension [Self <: ISupportConverting[?], T](x: Self & ISupportConverting[T]) {
      
      inline def setApplyConverter(value: SimpleConverter[T] => ISupportConverting[T]): Self = StObject.set(x, "applyConverter", js.Any.fromFunction1(value))
    }
  }
  
  trait ISupportCopyFrom[T] extends StObject {
    
    def copyFrom(obj: T): Unit
  }
  object ISupportCopyFrom {
    
    inline def apply[T](copyFrom: T => Callback): ISupportCopyFrom[T] = {
      val __obj = js.Dynamic.literal(copyFrom = js.Any.fromFunction1((t0: T) => copyFrom(t0).runNow()))
      __obj.asInstanceOf[ISupportCopyFrom[T]]
    }
    
    extension [Self <: ISupportCopyFrom[?], T](x: Self & ISupportCopyFrom[T]) {
      
      inline def setCopyFrom(value: T => Callback): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  type SimpleConverter[T] = js.Function1[/* value */ T, T]
}
