package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typingsJapgolly.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("mendixmodelsdk", "Element")
@js.native
open class Element[TModel /* <: IAbstractModel */] protected ()
  extends typingsJapgolly.mendixmodelsdk.srcSdkInternalMod.Element[TModel] {
  def this(
    model: typingsJapgolly.mendixmodelsdk.srcSdkInternalAbstractModelMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsJapgolly.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit[IAbstractModel],
    container: typingsJapgolly.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement[IAbstractModel, Container]
  ) = this()
}
