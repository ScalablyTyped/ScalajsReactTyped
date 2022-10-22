package typingsJapgolly.lezerLr

import typingsJapgolly.lezerCommon.distTreeMod.BufferCursor
import typingsJapgolly.lezerLr.distParseMod.LRParser
import typingsJapgolly.lezerLr.lezerLrInts.`100`
import typingsJapgolly.lezerLr.lezerLrInts.`120`
import typingsJapgolly.lezerLr.lezerLrInts.`190`
import typingsJapgolly.lezerLr.lezerLrInts.`200`
import typingsJapgolly.lezerLr.lezerLrInts.`300`
import typingsJapgolly.lezerLr.lezerLrInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStackMod {
  
  @JSImport("@lezer/lr/dist/stack", "Stack")
  @js.native
  open class Stack () extends StObject {
    
    def canShift(term: Double): Boolean = js.native
    
    def context: Any = js.native
    
    def dialectEnabled(dialectID: Double): Boolean = js.native
    
    def parser: LRParser = js.native
    
    var pos: Double = js.native
    
    /* private */ var reduceContext: Any = js.native
    
    /* private */ var shiftContext: Any = js.native
    
    /* private */ var updateContext: Any = js.native
  }
  
  @JSImport("@lezer/lr/dist/stack", "StackBufferCursor")
  @js.native
  open class StackBufferCursor protected ()
    extends StObject
       with BufferCursor {
    def this(stack: Stack, pos: Double, index: Double) = this()
    
    var buffer: js.Array[Double] = js.native
    
    /* CompleteClass */
    var end: Double = js.native
    @JSName("end")
    def end_MStackBufferCursor: Double = js.native
    
    /* CompleteClass */
    override def fork(): BufferCursor = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    @JSName("id")
    def id_MStackBufferCursor: Double = js.native
    
    var index: Double = js.native
    
    def maybeNext(): Unit = js.native
    
    /* CompleteClass */
    override def next(): Unit = js.native
    
    /* CompleteClass */
    var pos: Double = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    @JSName("size")
    def size_MStackBufferCursor: Double = js.native
    
    var stack: Stack = js.native
    
    /* CompleteClass */
    var start: Double = js.native
    @JSName("start")
    def start_MStackBufferCursor: Double = js.native
  }
  /* static members */
  object StackBufferCursor {
    
    @JSImport("@lezer/lr/dist/stack", "StackBufferCursor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(stack: Stack): StackBufferCursor = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(stack.asInstanceOf[js.Any]).asInstanceOf[StackBufferCursor]
    inline def create(stack: Stack, pos: Double): StackBufferCursor = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(stack.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[StackBufferCursor]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`200`
    - typingsJapgolly.lezerLr.lezerLrInts.`190`
    - typingsJapgolly.lezerLr.lezerLrInts.`100`
    - typingsJapgolly.lezerLr.lezerLrInts.`4`
    - typingsJapgolly.lezerLr.lezerLrInts.`300`
    - typingsJapgolly.lezerLr.lezerLrInts.`120`
  */
  trait Recover extends StObject
  object Recover {
    
    inline def DampenInsertStackDepth: `120` = 120.asInstanceOf[`120`]
    
    inline def Delete: `190` = 190.asInstanceOf[`190`]
    
    inline def Insert: `200` = 200.asInstanceOf[`200`]
    
    inline def MaxInsertStackDepth: `300` = 300.asInstanceOf[`300`]
    
    inline def MaxNext: `4` = 4.asInstanceOf[`4`]
    
    inline def Reduce: `100` = 100.asInstanceOf[`100`]
  }
}
