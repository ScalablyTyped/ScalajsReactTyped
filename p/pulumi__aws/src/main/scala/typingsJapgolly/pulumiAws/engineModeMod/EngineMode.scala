package typingsJapgolly.pulumiAws.engineModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.provisioned
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.serverless
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.parallelquery
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.global
*/
trait EngineMode extends js.Object

object EngineMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def global: typingsJapgolly.pulumiAws.pulumiAwsStrings.global = this.cast("global")
  @scala.inline
  def parallelquery: typingsJapgolly.pulumiAws.pulumiAwsStrings.parallelquery = this.cast("parallelquery")
  @scala.inline
  def provisioned: typingsJapgolly.pulumiAws.pulumiAwsStrings.provisioned = this.cast("provisioned")
  @scala.inline
  def serverless: typingsJapgolly.pulumiAws.pulumiAwsStrings.serverless = this.cast("serverless")
}

