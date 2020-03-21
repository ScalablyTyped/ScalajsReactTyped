package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  /**
    * The event. The dependency is satisfied when the referenced object emits this event.
    */
  var event: String
  /**
    * The scope. This names the object referenced by the dependency.
    */
  var scope: String
}

object Dependency {
  @scala.inline
  def apply(event: String, scope: String): Dependency = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Dependency]
  }
}

