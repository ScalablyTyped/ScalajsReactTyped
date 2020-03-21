package typingsJapgolly.mendixmodelsdk.structuresMod

import typingsJapgolly.mendixmodelsdk.elementsMod.IAbstractElement
import typingsJapgolly.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/structures", "aliases")
@js.native
object aliases extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.unitsMod.StructuralUnit
    - typingsJapgolly.mendixmodelsdk.elementsMod.AbstractElement
  */
  trait Container extends js.Object
  
  type IContainer = IStructuralUnit | IAbstractElement
}

