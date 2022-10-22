package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit
import typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.IStructuralUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "StructuralChildListProperty")
@js.native
open class StructuralChildListProperty[T /* <: IStructuralUnit | IModelUnit */] protected ()
  extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.StructuralChildListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: js.Array[T]
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.StructuralUnit[IAbstractModel],
    name: String,
    value: js.Array[T],
    targetRefType: String
  ) = this()
}
