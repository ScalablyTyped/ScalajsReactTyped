package typingsJapgolly.mobxStateTree

import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesMaybeMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/maybe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def maybe[IT /* <: IAnyType */](`type`: IT): IMaybe[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybe")(`type`.asInstanceOf[js.Any]).asInstanceOf[IMaybe[IT]]
  
  inline def maybeNull[IT /* <: IAnyType */](`type`: IT): IMaybeNull[IT] = ^.asInstanceOf[js.Dynamic].applyDynamic("maybeNull")(`type`.asInstanceOf[js.Any]).asInstanceOf[IMaybeNull[IT]]
  
  type IMaybe[IT /* <: IAnyType */] = IMaybeIType[IT, Unit, Unit]
  
  type IMaybeIType[IT /* <: IAnyType */, C, O] = IType[
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any) | C, 
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any) | O, 
    (/* import warning: importer.ImportType#apply Failed type conversion: IT['TypeWithoutSTN'] */ js.Any) | O
  ]
  
  type IMaybeNull[IT /* <: IAnyType */] = IMaybeIType[IT, js.UndefOr[Null], Null]
}
