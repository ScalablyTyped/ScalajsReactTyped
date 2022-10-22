package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.InternalListener
import typingsJapgolly.xstream.mod.MemoryStream
import typingsJapgolly.xstream.mod.Operator
import typingsJapgolly.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraFlattenSequentiallyMod {
  
  @JSImport("xstream/extra/flattenSequentially", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](ins: Stream[Stream[T] | MemoryStream[T]]): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ins.asInstanceOf[js.Any]).asInstanceOf[Stream[T]]
  
  @JSImport("xstream/extra/flattenSequentially", "FlattenSeqOperator")
  @js.native
  open class FlattenSeqOperator[T] protected ()
    extends StObject
       with Operator[Stream[T], T] {
    def this(ins: Stream[Stream[T]]) = this()
    
    /* CompleteClass */
    override def _c(): Unit = js.native
    
    /* CompleteClass */
    override def _e(err: Any): Unit = js.native
    
    /* CompleteClass */
    override def _n(v: Stream[T]): Unit = js.native
    
    /* CompleteClass */
    override def _start(listener: InternalListener[T]): Unit = js.native
    /* CompleteClass */
    override def _start(out: Stream[T]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    /* private */ var active: Any = js.native
    
    /* private */ var activeIL: Any = js.native
    
    /* CompleteClass */
    var ins: Stream[Stream[T]] = js.native
    
    def less(): Unit = js.native
    
    /* private */ var open: Any = js.native
    
    /* CompleteClass */
    var out: Stream[T] = js.native
    
    /* private */ var seq: Any = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
}
