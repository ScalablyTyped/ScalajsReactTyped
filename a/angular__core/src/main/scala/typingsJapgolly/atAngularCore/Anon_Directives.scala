package typingsJapgolly.atAngularCore

import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directives extends js.Object {
  var directives: Set[_]
  var pipes: Set[_]
}

object Anon_Directives {
  @scala.inline
  def apply(directives: Set[_], pipes: Set[_]): Anon_Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], pipes = pipes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Directives]
  }
}

