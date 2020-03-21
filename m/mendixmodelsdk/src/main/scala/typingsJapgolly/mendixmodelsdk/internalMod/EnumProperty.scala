package typingsJapgolly.mendixmodelsdk.internalMod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.versionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "EnumProperty")
@js.native
class EnumProperty[T /* <: typingsJapgolly.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.EnumProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.structuresMod.Structure,
    name: String,
    initialValue: T,
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typingsJapgolly.mendixmodelsdk.instancesMod.AbstractEnum
      ]
  ) = this()
}

