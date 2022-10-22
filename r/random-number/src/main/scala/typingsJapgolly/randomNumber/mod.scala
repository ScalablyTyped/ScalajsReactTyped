package typingsJapgolly.randomNumber

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("random-number", JSImport.Namespace)
  @js.native
  val ^ : RandomNumber = js.native
  
  type Generator = js.Function3[
    /* min */ js.UndefOr[Double | Null], 
    /* max */ js.UndefOr[Double | Null], 
    /* integer */ js.UndefOr[Boolean | Null], 
    Double
  ]
  
  trait Options extends StObject {
    
    var integer: Boolean
    
    var max: Double
    
    var min: Double
  }
  object Options {
    
    inline def apply(integer: Boolean, max: Double, min: Double): Options = {
      val __obj = js.Dynamic.literal(integer = integer.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInteger(value: Boolean): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RandomNumber extends StObject {
    
    def apply(): Double = js.native
    def apply(options: UnparsedOptions): Double = js.native
    
    def defaults(): Options = js.native
    def defaults(options: UnparsedOptions): Options = js.native
    
    def generator(): Generator = js.native
    def generator(options: UnparsedOptions): Generator = js.native
  }
  
  trait UnparsedOptions extends StObject {
    
    var integer: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object UnparsedOptions {
    
    inline def apply(): UnparsedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnparsedOptions]
    }
    
    extension [Self <: UnparsedOptions](x: Self) {
      
      inline def setInteger(value: Boolean): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  type _To = RandomNumber
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RandomNumber = ^
}
