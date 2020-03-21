package typingsJapgolly.sodiumjs.mod

import typingsJapgolly.sodiumjs.vertexMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "Cell")
@js.native
class Cell[A] protected ()
  extends typingsJapgolly.sodiumjs.cellMod.Cell[A] {
  def this(initValue: A) = this()
  def this(initValue: A, str: typingsJapgolly.sodiumjs.streamMod.Stream[A]) = this()
}

/* static members */
@JSImport("sodiumjs", "Cell")
@js.native
object Cell extends js.Object {
  var _liftArray: js.Any = js.native
  /**
    * Apply a value inside a cell to a function inside a cell. This is the
    * primitive for all function lifting.
    */
  @JSName("apply")
  def apply[A, B](
    cf: typingsJapgolly.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typingsJapgolly.sodiumjs.cellMod.Cell[A]
  ): typingsJapgolly.sodiumjs.cellMod.Cell[B] = js.native
  @JSName("apply")
  def apply[A, B](
    cf: typingsJapgolly.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
    ca: typingsJapgolly.sodiumjs.cellMod.Cell[A],
    sources: js.Array[Source]
  ): typingsJapgolly.sodiumjs.cellMod.Cell[B] = js.native
  /**
    * Fantasy-land Algebraic Data Type Compatability.
    * Cell satisfies the Functor, Apply, Applicative categories
    * @see {@link https://github.com/fantasyland/fantasy-land} for more info
    */
  @JSName("fantasy-land/of")
  def `fantasy-landSlashof`[A](a: A): typingsJapgolly.sodiumjs.cellMod.Cell[A] = js.native
  /**
    * Lift an array of cells into a cell of an array.
    */
  def liftArray[A](ca: js.Array[typingsJapgolly.sodiumjs.cellMod.Cell[A]]): typingsJapgolly.sodiumjs.cellMod.Cell[js.Array[A]] = js.native
  /**
    * Unwrap a cell inside another cell to give a time-varying cell implementation.
    */
  def switchC[A](cca: typingsJapgolly.sodiumjs.cellMod.Cell[typingsJapgolly.sodiumjs.cellMod.Cell[A]]): typingsJapgolly.sodiumjs.cellMod.Cell[A] = js.native
  /**
    * Unwrap a stream inside a cell to give a time-varying stream implementation.
    */
  def switchS[A](csa: typingsJapgolly.sodiumjs.cellMod.Cell[typingsJapgolly.sodiumjs.streamMod.Stream[A]]): typingsJapgolly.sodiumjs.streamMod.Stream[A] = js.native
}

