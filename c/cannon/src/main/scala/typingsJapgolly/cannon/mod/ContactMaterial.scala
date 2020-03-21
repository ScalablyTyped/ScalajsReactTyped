package typingsJapgolly.cannon.mod

import typingsJapgolly.cannon.CANNON.IContactMaterialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "ContactMaterial")
@js.native
class ContactMaterial protected ()
  extends typingsJapgolly.cannon.CANNON.ContactMaterial {
  def this(m1: typingsJapgolly.cannon.CANNON.Material, m2: typingsJapgolly.cannon.CANNON.Material) = this()
  def this(
    m1: typingsJapgolly.cannon.CANNON.Material,
    m2: typingsJapgolly.cannon.CANNON.Material,
    options: IContactMaterialOptions
  ) = this()
}

