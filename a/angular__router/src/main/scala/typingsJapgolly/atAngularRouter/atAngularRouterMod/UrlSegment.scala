package typingsJapgolly.atAngularRouter.atAngularRouterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "UrlSegment")
@js.native
class UrlSegment protected () extends js.Object {
  def this(
    /** The path part of a URL segment */
  path: String,
    /** The matrix parameters associated with a segment */
  parameters: StringDictionary[String]
  ) = this()
  val parameterMap: ParamMap = js.native
  /** The matrix parameters associated with a segment */
  var parameters: StringDictionary[String] = js.native
  /** The path part of a URL segment */
  var path: String = js.native
}

