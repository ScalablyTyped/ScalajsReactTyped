package typingsJapgolly.mobxStateTree

import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.ISimpleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesEnumerationMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/enumeration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enumeration[T /* <: String */](name: String, options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ISimpleType[UnionStringArray[js.Array[T]]]]
  inline def enumeration[T /* <: String */](options: js.Array[T]): ISimpleType[UnionStringArray[js.Array[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(options.asInstanceOf[js.Any]).asInstanceOf[ISimpleType[UnionStringArray[js.Array[T]]]]
  
  type UnionStringArray[T /* <: js.Array[String] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
}
