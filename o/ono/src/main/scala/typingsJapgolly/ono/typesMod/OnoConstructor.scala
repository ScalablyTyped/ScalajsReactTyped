package typingsJapgolly.ono.typesMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoConstructor
  extends Instantiable1[/* constructor */ ErrorLikeConstructor[ErrorLike], Ono[ErrorLike]]
     with Instantiable2[
      /* constructor */ ErrorLikeConstructor[ErrorLike], 
      /* options */ OnoOptions, 
      Ono[ErrorLike]
    ] {
  def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T]): Ono[T] = js.native
  def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T], options: OnoOptions): Ono[T] = js.native
  def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
  /**
    * Returns an object containing all properties of the given Error object,
    * which can be used with `JSON.stringify()`.
    */
  def toJSON(error: Error): ErrorPOJO with js.Error = js.native
}

