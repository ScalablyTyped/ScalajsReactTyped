package typingsJapgolly.cannon.mod

import typingsJapgolly.cannon.CANNON.IContactMaterialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "ContactMaterial")
@js.native
open class ContactMaterial protected ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.ContactMaterial {
  def this(m1: typingsJapgolly.cannon.CANNON.Material, m2: typingsJapgolly.cannon.CANNON.Material) = this()
  def this(
    m1: typingsJapgolly.cannon.CANNON.Material,
    m2: typingsJapgolly.cannon.CANNON.Material,
    options: IContactMaterialOptions
  ) = this()
  
  /* CompleteClass */
  var contactEquationRelaxation: Double = js.native
  
  /* CompleteClass */
  var contactEquationStiffness: Double = js.native
  
  /* CompleteClass */
  var friction: Double = js.native
  
  /* CompleteClass */
  var frictionEquationRelaxation: Double = js.native
  
  /* CompleteClass */
  var frictionEquationStiffness: Double = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var materials: js.Array[typingsJapgolly.cannon.CANNON.Material] = js.native
  
  /* CompleteClass */
  var restitution: Double = js.native
}
