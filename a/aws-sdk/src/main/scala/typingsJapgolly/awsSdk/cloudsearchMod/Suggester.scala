package typingsJapgolly.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggester extends js.Object {
  var DocumentSuggesterOptions: typingsJapgolly.awsSdk.cloudsearchMod.DocumentSuggesterOptions = js.native
  var SuggesterName: StandardName = js.native
}

object Suggester {
  @scala.inline
  def apply(DocumentSuggesterOptions: DocumentSuggesterOptions, SuggesterName: StandardName): Suggester = {
    val __obj = js.Dynamic.literal(DocumentSuggesterOptions = DocumentSuggesterOptions.asInstanceOf[js.Any], SuggesterName = SuggesterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Suggester]
  }
}

