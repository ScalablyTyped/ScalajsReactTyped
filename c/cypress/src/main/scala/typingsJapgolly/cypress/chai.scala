package typingsJapgolly.cypress

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.cypress.Chai_.ChaiStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chai")
@js.native
object chai extends TopLevel[ChaiStatic] {
  @js.native
  class AssertionError protected ()
    extends typingsJapgolly.cypress.Chai_.AssertionError {
    def this(message: String) = this()
    def this(message: String, _props: js.Any) = this()
    def this(message: String, _props: js.Any, ssf: js.Function) = this()
  }
  
}

