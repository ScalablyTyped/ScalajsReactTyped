package typingsJapgolly.javascriptColorGradient

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("javascript-color-gradient", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Gradient {
    def this(gradients: String) = this()
    def this(gradients: String, maxNum: Double) = this()
    def this(gradients: Unit, maxNum: Double) = this()
    def this(gradients: String, maxNum: Double, colors: js.Array[String]) = this()
    def this(gradients: String, maxNum: Unit, colors: js.Array[String]) = this()
    def this(gradients: Unit, maxNum: Double, colors: js.Array[String]) = this()
    def this(gradients: Unit, maxNum: Unit, colors: js.Array[String]) = this()
    def this(gradients: String, maxNum: Double, colors: js.Array[String], intervals: js.Array[Any]) = this()
    def this(gradients: String, maxNum: Double, colors: Unit, intervals: js.Array[Any]) = this()
    def this(gradients: String, maxNum: Unit, colors: js.Array[String], intervals: js.Array[Any]) = this()
    def this(gradients: String, maxNum: Unit, colors: Unit, intervals: js.Array[Any]) = this()
    def this(gradients: Unit, maxNum: Double, colors: js.Array[String], intervals: js.Array[Any]) = this()
    def this(gradients: Unit, maxNum: Double, colors: Unit, intervals: js.Array[Any]) = this()
    def this(gradients: Unit, maxNum: Unit, colors: js.Array[String], intervals: js.Array[Any]) = this()
    def this(gradients: Unit, maxNum: Unit, colors: Unit, intervals: js.Array[Any]) = this()
    
    /* CompleteClass */
    override def getColor(index: Double): String = js.native
    
    /* CompleteClass */
    override def getColors(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def setColorGradient(args: String*): Gradient = js.native
    
    /* CompleteClass */
    override def setMidpoint(maxNumber: Double): this.type = js.native
  }
  
  trait Gradient extends StObject {
    
    def getColor(index: Double): String
    
    def getColors(): js.Array[String]
    
    def setColorGradient(args: String*): Gradient
    
    def setMidpoint(maxNumber: Double): this.type
  }
  object Gradient {
    
    inline def apply(
      getColor: Double => String,
      getColors: CallbackTo[js.Array[String]],
      setColorGradient: /* repeated */ String => Gradient,
      setMidpoint: Double => Gradient
    ): Gradient = {
      val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction1(getColor), getColors = getColors.toJsFn, setColorGradient = js.Any.fromFunction1(setColorGradient), setMidpoint = js.Any.fromFunction1(setMidpoint))
      __obj.asInstanceOf[Gradient]
    }
    
    extension [Self <: Gradient](x: Self) {
      
      inline def setGetColor(value: Double => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
      
      inline def setGetColors(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getColors", value.toJsFn)
      
      inline def setSetColorGradient(value: /* repeated */ String => Gradient): Self = StObject.set(x, "setColorGradient", js.Any.fromFunction1(value))
      
      inline def setSetMidpoint(value: Double => Gradient): Self = StObject.set(x, "setMidpoint", js.Any.fromFunction1(value))
    }
  }
}
