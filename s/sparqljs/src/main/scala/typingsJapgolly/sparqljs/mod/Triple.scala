package typingsJapgolly.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triple extends js.Object {
  var `object`: Term
  var predicate: PropertyPath | Term
  var subject: Term
}

object Triple {
  @scala.inline
  def apply(`object`: Term, predicate: PropertyPath | Term, subject: Term): Triple = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Triple]
  }
}

