package typingsJapgolly.minappEnv

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneratorFunction
  extends /**
  * Creates a new Generator object.
  * @param args A list of arguments the function accepts.
  */
Instantiable1[/* args (repeated) */ js.Any, Generator[js.Any, js.Any, js.Any]] {
  /**
    * The length of the arguments.
    */
  val length: Double = js.native
  /**
    * Returns the name of the function.
    */
  val name: java.lang.String = js.native
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: typingsJapgolly.minappEnv.minappEnvStrings.GeneratorFunction = js.native
  /**
    * Creates a new Generator object.
    * @param args A list of arguments the function accepts.
    */
  def apply(args: js.Any*): Generator[_, _, _] = js.native
}

@JSGlobal("GeneratorFunction")
@js.native
object GeneratorFunction extends TopLevel[GeneratorFunctionConstructor]

