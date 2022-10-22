package typingsJapgolly.crocks

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.crocks.internalTypesMod.UnaryFunction
import typingsJapgolly.crocks.internalTypesMod.VariadicFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowArrowMod {
  
  @JSImport("crocks/Arrow/Arrow", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Arrow {
    
    /* CompleteClass */
    override def both(): Arrow = js.native
    
    /* CompleteClass */
    override def compose(`val`: Arrow): Arrow = js.native
    
    /* CompleteClass */
    override def contramap(fn: UnaryFunction): Arrow = js.native
    
    /* CompleteClass */
    override def first(): Arrow = js.native
    
    /* CompleteClass */
    override def map(fn: UnaryFunction): Arrow = js.native
    
    /* CompleteClass */
    override def promap(fn1: UnaryFunction, fn2: UnaryFunction): Arrow = js.native
    
    /* CompleteClass */
    override def runWith(`val`: Any): Any = js.native
    
    /* CompleteClass */
    override def second(): Arrow = js.native
  }
  object default {
    
    inline def apply(fn: VariadicFunction): Arrow = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Arrow]
    
    @JSImport("crocks/Arrow/Arrow", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def id(): Arrow = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Arrow]
  }
  
  trait Arrow extends StObject {
    
    def both(): Arrow
    
    def compose(`val`: Arrow): Arrow
    
    def contramap(fn: UnaryFunction): Arrow
    
    def first(): Arrow
    
    def map(fn: UnaryFunction): Arrow
    
    def promap(fn1: UnaryFunction, fn2: UnaryFunction): Arrow
    
    def runWith(`val`: Any): Any
    
    def second(): Arrow
  }
  object Arrow {
    
    inline def apply(
      both: CallbackTo[Arrow],
      compose: Arrow => Arrow,
      contramap: UnaryFunction => Arrow,
      first: CallbackTo[Arrow],
      map: UnaryFunction => Arrow,
      promap: (UnaryFunction, UnaryFunction) => Arrow,
      runWith: Any => Any,
      second: CallbackTo[Arrow]
    ): Arrow = {
      val __obj = js.Dynamic.literal(both = both.toJsFn, compose = js.Any.fromFunction1(compose), contramap = js.Any.fromFunction1(contramap), first = first.toJsFn, map = js.Any.fromFunction1(map), promap = js.Any.fromFunction2(promap), runWith = js.Any.fromFunction1(runWith), second = second.toJsFn)
      __obj.asInstanceOf[Arrow]
    }
    
    extension [Self <: Arrow](x: Self) {
      
      inline def setBoth(value: CallbackTo[Arrow]): Self = StObject.set(x, "both", value.toJsFn)
      
      inline def setCompose(value: Arrow => Arrow): Self = StObject.set(x, "compose", js.Any.fromFunction1(value))
      
      inline def setContramap(value: UnaryFunction => Arrow): Self = StObject.set(x, "contramap", js.Any.fromFunction1(value))
      
      inline def setFirst(value: CallbackTo[Arrow]): Self = StObject.set(x, "first", value.toJsFn)
      
      inline def setMap(value: UnaryFunction => Arrow): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setPromap(value: (UnaryFunction, UnaryFunction) => Arrow): Self = StObject.set(x, "promap", js.Any.fromFunction2(value))
      
      inline def setRunWith(value: Any => Any): Self = StObject.set(x, "runWith", js.Any.fromFunction1(value))
      
      inline def setSecond(value: CallbackTo[Arrow]): Self = StObject.set(x, "second", value.toJsFn)
    }
  }
}
