package typingsJapgolly.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.node
  - typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.browser
  - typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.universal
*/
trait RuntimeTarget extends js.Object

object RuntimeTarget {
  @scala.inline
  def browser: typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def node: typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.node = this.cast("node")
  @scala.inline
  def universal: typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.universal = this.cast("universal")
}

