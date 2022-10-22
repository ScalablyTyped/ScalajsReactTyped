package typingsJapgolly.arrayPrototypeFlat

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`0`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`1`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`2`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`3`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`4`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`5`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`6`
import typingsJapgolly.arrayPrototypeFlat.arrayPrototypeFlatInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("array.prototype.flat", JSImport.Namespace)
  @js.native
  val ^ : Flat = js.native
  
  @js.native
  trait Flat
    extends StObject
       with FlatImpl {
    
    def getPolyfill(): FlatImpl = js.native
    
    def implementation(receiver: ReadonlyArray[Any]): Array[Any] = js.native
    def implementation(receiver: ReadonlyArray[Any], depth: Double): Array[Any] = js.native
    @JSName("implementation")
    def implementation_0[U](receiver: ReadonlyArray[U], depth: `0`): Array[U] = js.native
    @JSName("implementation")
    def implementation_1[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = js.native
    @JSName("implementation")
    def implementation_2[U](
      receiver: ReadonlyArray[
          (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
        ],
      depth: `2`
    ): Array[U] = js.native
    @JSName("implementation")
    def implementation_3[U](
      receiver: ReadonlyArray[
          (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
            (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
          ])
        ],
      depth: `3`
    ): Array[U] = js.native
    @JSName("implementation")
    def implementation_4[U](
      receiver: ReadonlyArray[
          (Array[
            (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[Array[Array[U]] | ReadonlyArray[ReadonlyArray[U]]])
          ]) | (ReadonlyArray[
            (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
              (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
            ])
          ])
        ],
      depth: `4`
    ): Array[U] = js.native
    @JSName("implementation")
    def implementation_5[U](receiver: Array[Array[Array[Array[Array[Array[U]]]]]], depth: `5`): Array[U] = js.native
    @JSName("implementation")
    def implementation_6[U](receiver: Array[Array[Array[Array[Array[Array[Array[U]]]]]]], depth: `6`): Array[U] = js.native
    @JSName("implementation")
    def implementation_7[U](receiver: Array[Array[Array[Array[Array[Array[Array[Array[U]]]]]]]], depth: `7`): Array[U] = js.native
    @JSName("implementation")
    var implementation_Original: FlatImpl = js.native
    @JSName("implementation")
    def implementation_U[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]]): Array[U] = js.native
    
    def shim(): FlatImpl = js.native
  }
  
  @js.native
  trait FlatImpl extends StObject {
    
    def apply(receiver: ReadonlyArray[Any]): Array[Any] = js.native
    def apply(receiver: ReadonlyArray[Any], depth: Double): Array[Any] = js.native
    def apply[U](receiver: Array[Array[Array[Array[Array[Array[U]]]]]], depth: `5`): Array[U] = js.native
    def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[U]]]]]]], depth: `6`): Array[U] = js.native
    def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[Array[U]]]]]]]], depth: `7`): Array[U] = js.native
    def apply[U](receiver: ReadonlyArray[U], depth: `0`): Array[U] = js.native
    def apply[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = js.native
    def apply[U](
      receiver: ReadonlyArray[
          (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
        ],
      depth: `2`
    ): Array[U] = js.native
    def apply[U](
      receiver: ReadonlyArray[
          (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
            (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
          ])
        ],
      depth: `3`
    ): Array[U] = js.native
    def apply[U](
      receiver: ReadonlyArray[
          (Array[
            (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[Array[Array[U]] | ReadonlyArray[ReadonlyArray[U]]])
          ]) | (ReadonlyArray[
            (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
              (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
            ])
          ])
        ],
      depth: `4`
    ): Array[U] = js.native
  }
  
  type _To = Flat
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Flat = ^
}
