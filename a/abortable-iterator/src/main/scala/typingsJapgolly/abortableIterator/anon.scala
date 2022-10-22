package typingsJapgolly.abortableIterator

import typingsJapgolly.itStreamTypes.mod.Source
import typingsJapgolly.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sink[TSink, RSink, TSource] extends StObject {
    
    def sink(source: Source[TSink]): RSink
    @JSName("sink")
    var sink_Original: typingsJapgolly.itStreamTypes.mod.Sink[TSink, RSink]
    
    var source: AsyncGenerator[TSource, Unit, Any]
  }
  object Sink {
    
    inline def apply[TSink, RSink, TSource](sink: /* source */ Source[TSink] => RSink, source: AsyncGenerator[TSource, Unit, Any]): Sink[TSink, RSink, TSource] = {
      val __obj = js.Dynamic.literal(sink = js.Any.fromFunction1(sink), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sink[TSink, RSink, TSource]]
    }
    
    extension [Self <: Sink[?, ?, ?], TSink, RSink, TSource](x: Self & (Sink[TSink, RSink, TSource])) {
      
      inline def setSink(value: /* source */ Source[TSink] => RSink): Self = StObject.set(x, "sink", js.Any.fromFunction1(value))
      
      inline def setSource(value: AsyncGenerator[TSource, Unit, Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
