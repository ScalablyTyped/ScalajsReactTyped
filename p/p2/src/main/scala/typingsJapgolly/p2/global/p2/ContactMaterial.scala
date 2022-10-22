package typingsJapgolly.p2.global.p2

import typingsJapgolly.p2.mod.ContactMaterialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.ContactMaterial")
@js.native
open class ContactMaterial protected ()
  extends typingsJapgolly.p2.mod.ContactMaterial {
  def this(materialA: typingsJapgolly.p2.mod.Material, materialB: typingsJapgolly.p2.mod.Material) = this()
  def this(
    materialA: typingsJapgolly.p2.mod.Material,
    materialB: typingsJapgolly.p2.mod.Material,
    options: ContactMaterialOptions
  ) = this()
}
/* static members */
object ContactMaterial {
  
  @JSGlobal("p2.ContactMaterial")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("p2.ContactMaterial.idCounter")
  @js.native
  def idCounter: Double = js.native
  inline def idCounter_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idCounter")(x.asInstanceOf[js.Any])
}
