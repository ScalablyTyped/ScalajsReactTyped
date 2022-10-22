package typingsJapgolly.ampMessage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amp-message", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Message {
    def this(args: js.Array[Buffer]) = this()
    def this(args: Buffer) = this()
    
    /* CompleteClass */
    override def inspect(): String = js.native
    
    /* CompleteClass */
    override def pop(): js.UndefOr[Buffer] = js.native
    
    /* CompleteClass */
    override def push(items: Buffer*): Double = js.native
    
    /* CompleteClass */
    override def shift(): js.UndefOr[Buffer] = js.native
    
    /* CompleteClass */
    override def toBuffer(): Buffer = js.native
    
    /* CompleteClass */
    override def unshift(items: Buffer*): Double = js.native
  }
  
  trait Message extends StObject {
    
    def inspect(): String
    
    def pop(): js.UndefOr[Buffer]
    
    def push(items: Buffer*): Double
    
    def shift(): js.UndefOr[Buffer]
    
    def toBuffer(): Buffer
    
    def unshift(items: Buffer*): Double
  }
  object Message {
    
    inline def apply(
      inspect: CallbackTo[String],
      pop: CallbackTo[js.UndefOr[Buffer]],
      push: /* repeated */ Buffer => Double,
      shift: CallbackTo[js.UndefOr[Buffer]],
      toBuffer: CallbackTo[Buffer],
      unshift: /* repeated */ Buffer => Double
    ): Message = {
      val __obj = js.Dynamic.literal(inspect = inspect.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1(push), shift = shift.toJsFn, toBuffer = toBuffer.toJsFn, unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setInspect(value: CallbackTo[String]): Self = StObject.set(x, "inspect", value.toJsFn)
      
      inline def setPop(value: CallbackTo[js.UndefOr[Buffer]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: /* repeated */ Buffer => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setShift(value: CallbackTo[js.UndefOr[Buffer]]): Self = StObject.set(x, "shift", value.toJsFn)
      
      inline def setToBuffer(value: CallbackTo[Buffer]): Self = StObject.set(x, "toBuffer", value.toJsFn)
      
      inline def setUnshift(value: /* repeated */ Buffer => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
}
