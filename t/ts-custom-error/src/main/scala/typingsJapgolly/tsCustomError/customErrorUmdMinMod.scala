package typingsJapgolly.tsCustomError

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Error
import typingsJapgolly.std.ErrorConstructor
import typingsJapgolly.std.EvalErrorConstructor
import typingsJapgolly.std.RangeErrorConstructor
import typingsJapgolly.std.ReferenceErrorConstructor
import typingsJapgolly.std.SyntaxErrorConstructor
import typingsJapgolly.std.TypeErrorConstructor
import typingsJapgolly.std.URIErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-custom-error/dist/custom-error.umd.min", JSImport.Namespace)
@js.native
object customErrorUmdMinMod extends js.Object {
  @js.native
  class CustomError () extends Error {
    def this(message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  trait CustomErrorConstructor[Properties /* <: CustomErrorProperties */] extends ErrorConstructor {
    def apply(args: js.Any*): js.Error with Properties = js.native
  }
  
  def customErrorFactory[Properties](fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit]): CustomErrorConstructor[Properties] = js.native
  def customErrorFactory[Properties](
    fn: js.ThisFunction1[/* this */ Properties, /* repeated */ js.Any, Unit],
    parent: GenericErrorConstructor
  ): CustomErrorConstructor[Properties] = js.native
  type CustomErrorInterface = js.Error
  type CustomErrorProperties = StringDictionary[js.Any]
  type GenericErrorConstructor = ErrorConstructor | EvalErrorConstructor | RangeErrorConstructor | ReferenceErrorConstructor | SyntaxErrorConstructor | TypeErrorConstructor | URIErrorConstructor | CustomErrorConstructor[CustomErrorProperties]
}

