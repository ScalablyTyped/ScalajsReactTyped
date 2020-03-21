package typingsJapgolly.apolloLink

import typingsJapgolly.apolloLink.mockLinkMod.default
import typingsJapgolly.apolloLink.testingUtilsMod.TestResultType
import typingsJapgolly.apolloLink.typesMod.RequestHandler
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  @js.native
  class MockLink () extends default {
    def this(handleRequest: RequestHandler) = this()
  }
  
  @js.native
  class SetContextLink ()
    extends typingsJapgolly.apolloLink.setContextMod.default {
    def this(setContext: js.Function1[/* context */ Record[String, _], Record[String, _]]) = this()
  }
  
  def checkCalls[T](calls: js.Array[_], results: js.Array[T]): Unit = js.native
  def testLinkResults(params: TestResultType): Unit = js.native
}

