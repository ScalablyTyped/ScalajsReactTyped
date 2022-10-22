package typingsJapgolly.tx2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tx2", JSImport.Namespace)
  @js.native
  val ^ : TX2 = js.native
  
  trait Counter extends StObject {
    
    def dec(amount: Double): Unit
    
    def inc(amount: Double): Unit
    
    def reset(): Unit
    
    def `val`(): Double
  }
  object Counter {
    
    inline def apply(dec: Double => Callback, inc: Double => Callback, reset: Callback, `val`: CallbackTo[Double]): Counter = {
      val __obj = js.Dynamic.literal(dec = js.Any.fromFunction1((t0: Double) => dec(t0).runNow()), inc = js.Any.fromFunction1((t0: Double) => inc(t0).runNow()), reset = reset.toJsFn)
      __obj.updateDynamic("val")(`val`.toJsFn)
      __obj.asInstanceOf[Counter]
    }
    
    extension [Self <: Counter](x: Self) {
      
      inline def setDec(value: Double => Callback): Self = StObject.set(x, "dec", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setInc(value: Double => Callback): Self = StObject.set(x, "inc", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setVal(value: CallbackTo[Double]): Self = StObject.set(x, "val", value.toJsFn)
    }
  }
  
  trait CounterOptions extends StObject {
    
    var name: String
    
    var unit: String
  }
  object CounterOptions {
    
    inline def apply(name: String, unit: String): CounterOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[CounterOptions]
    }
    
    extension [Self <: CounterOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorObject extends StObject {
    
    var message: String
    
    var name: String
  }
  object ErrorObject {
    
    inline def apply(message: String, name: String): ErrorObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorObject]
    }
    
    extension [Self <: ErrorObject](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metric[T] extends StObject {
    
    def set(data: T): Unit
    
    def `val`(): T
  }
  object Metric {
    
    inline def apply[T](set: T => Callback, `val`: CallbackTo[T]): Metric[T] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
      __obj.updateDynamic("val")(`val`.toJsFn)
      __obj.asInstanceOf[Metric[T]]
    }
    
    extension [Self <: Metric[?], T](x: Self & Metric[T]) {
      
      inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setVal(value: CallbackTo[T]): Self = StObject.set(x, "val", value.toJsFn)
    }
  }
  
  trait MetricOptions[T] extends StObject {
    
    var name: String
    
    var unit: js.UndefOr[String] = js.undefined
    
    var value: T
  }
  object MetricOptions {
    
    inline def apply[T](name: String, value: T): MetricOptions[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricOptions[T]]
    }
    
    extension [Self <: MetricOptions[?], T](x: Self & MetricOptions[T]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TX2
    extends typingsJapgolly.node.nodeColoneventsMod.^ {
    
    def action(action_name: String, callback: js.Function1[/* cb */ js.Function1[/* data */ Any, Unit], Unit]): Unit = js.native
    def action[T /* <: js.Object */](
      action_name: String,
      options: T,
      callback: js.Function2[/* options */ T, /* cb */ js.Function1[/* data */ Any, Unit], Unit]
    ): Unit = js.native
    
    def counter(name: String): Counter = js.native
    def counter(name: CounterOptions): Counter = js.native
    
    def event(name: String, data: js.Object): Unit = js.native
    
    def issue(err: String): String = js.native
    def issue(err: js.Error): ErrorObject = js.native
    
    def metric(name: String, cb: Double): Metric[Double] = js.native
    def metric(name: String, unit: String, cb: Double): Metric[Double] = js.native
    def metric[T](name: String, cb: js.Function0[T]): Metric[T] = js.native
    def metric[T](name: String, unit: String, cb: js.Function0[T]): Metric[T] = js.native
    def metric[T](options: MetricOptions[T]): Metric[T] = js.native
  }
  
  type _To = TX2
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TX2 = ^
}
