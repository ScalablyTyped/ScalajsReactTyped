package typingsJapgolly.mendixmodelsdk.internalMod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.structuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.versionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "EnumListProperty")
@js.native
class EnumListProperty[T /* <: typingsJapgolly.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
  extends typingsJapgolly.mendixmodelsdk.propertiesMod.EnumListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.structuresMod.Structure,
    name: String,
    initialValue: js.Array[T],
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typingsJapgolly.mendixmodelsdk.instancesMod.AbstractEnum
      ]
  ) = this()
}

