package typingsJapgolly.tapePromise

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.ReturnType
import typingsJapgolly.tapePromise.mod.AsyncTapeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape-promise/tape", JSImport.Namespace)
@js.native
object tapeMod
  extends TopLevel[
      ReturnType[
        js.Function1[
          /* tapeTest */ js.Any, 
          AsyncTapeFunction with (/* import warning: importer.ImportType#apply Failed type conversion: typeof tape */ js.Any)
        ]
      ]
    ] {
  /**
  	 * Options for the createStream function.
  	 */
  type StreamOptions = typingsJapgolly.tape.mod.StreamOptions
  type Test = typingsJapgolly.tapePromise.mod.Test
  type TestCase = typingsJapgolly.tapePromise.mod.TestCase
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = typingsJapgolly.tape.mod.TestOptions
}

