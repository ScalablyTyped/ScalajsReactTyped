package typingsJapgolly.mendixmodelsdk.mod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "EnumProperty")
@js.native
open class EnumProperty[T /* <: typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum */] protected ()
  extends typingsJapgolly.mendixmodelsdk.srcSdkInternalPropertiesMod.EnumProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: T,
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typingsJapgolly.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
      ]
  ) = this()
}
