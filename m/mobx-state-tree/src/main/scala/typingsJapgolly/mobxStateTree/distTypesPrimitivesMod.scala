package typingsJapgolly.mobxStateTree

import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.ISimpleType
import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrimitivesMod {
  
  @JSImport("mobx-state-tree/dist/types/primitives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "DatePrimitive")
  @js.native
  val DatePrimitive: IType[Double | js.Date, Double, js.Date] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "boolean")
  @js.native
  val boolean: ISimpleType[Boolean] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "integer")
  @js.native
  val integer: ISimpleType[Double] = js.native
  
  inline def isPrimitiveType(
    `type`: IType[
      Boolean | js.Date | Double | String, 
      Boolean | Double | String, 
      Boolean | js.Date | Double | String
    ]
  ): /* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitiveType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string, string, string> */ Boolean]
  
  @JSImport("mobx-state-tree/dist/types/primitives", "nullType")
  @js.native
  val nullType: ISimpleType[Null] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "number")
  @js.native
  val number: ISimpleType[Double] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "string")
  @js.native
  val string: ISimpleType[String] = js.native
  
  @JSImport("mobx-state-tree/dist/types/primitives", "undefinedType")
  @js.native
  val undefinedType: ISimpleType[Unit] = js.native
}
