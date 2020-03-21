package typingsJapgolly.awsSdkMiddlewareHeaderDefault

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-header-default", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def headerDefault(headerBag: HeaderDefaultArgs): BuildMiddleware[_, _, _] = js.native
  type HeaderDefaultArgs = StringDictionary[String]
}

