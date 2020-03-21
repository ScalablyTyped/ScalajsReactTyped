package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineSuggesterRequest extends js.Object {
  var DomainName: typingsJapgolly.awsSdk.cloudsearchMod.DomainName = js.native
  var Suggester: typingsJapgolly.awsSdk.cloudsearchMod.Suggester = js.native
}

object DefineSuggesterRequest {
  @scala.inline
  def apply(DomainName: DomainName, Suggester: Suggester): DefineSuggesterRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Suggester = Suggester.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefineSuggesterRequest]
  }
}

