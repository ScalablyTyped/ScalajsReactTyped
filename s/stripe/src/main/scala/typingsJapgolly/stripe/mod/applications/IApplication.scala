package typingsJapgolly.stripe.mod.applications

import typingsJapgolly.stripe.mod.IResourceObject
import typingsJapgolly.stripe.stripeStrings.application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends IResourceObject {
  /**
    * String representing the application’s name.
    */
  var name: String
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IApplication: application
}

object IApplication {
  @scala.inline
  def apply(id: String, name: String, `object`: application): IApplication = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplication]
  }
}

