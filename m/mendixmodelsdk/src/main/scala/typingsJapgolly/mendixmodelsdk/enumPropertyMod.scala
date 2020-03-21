package typingsJapgolly.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.instancesMod.AbstractEnum
import typingsJapgolly.mendixmodelsdk.primitivePropertyMod.PrimitiveProperty
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.structuresMod.Structure
import typingsJapgolly.mendixmodelsdk.versionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/EnumProperty", JSImport.Namespace)
@js.native
object enumPropertyMod extends js.Object {
  @js.native
  class EnumProperty[T /* <: AbstractEnum */] protected () extends PrimitiveProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure,
      name: String,
      initialValue: T,
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    var initialValue: js.Any = js.native
  }
  
}

