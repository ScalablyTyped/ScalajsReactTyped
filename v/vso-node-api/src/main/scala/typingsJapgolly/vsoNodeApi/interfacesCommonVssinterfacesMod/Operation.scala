package typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Operation extends StObject
@JSImport("vso-node-api/interfaces/common/VSSInterfaces", "Operation")
@js.native
object Operation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Operation & Double] = js.native
  
  @js.native
  sealed trait Add
    extends StObject
       with Operation
  /* 0 */ val Add: typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.Operation.Add & Double = js.native
  
  @js.native
  sealed trait Copy
    extends StObject
       with Operation
  /* 4 */ val Copy: typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.Operation.Copy & Double = js.native
  
  @js.native
  sealed trait Move
    extends StObject
       with Operation
  /* 3 */ val Move: typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.Operation.Move & Double = js.native
  
  @js.native
  sealed trait Remove
    extends StObject
       with Operation
  /* 1 */ val Remove: typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.Operation.Remove & Double = js.native
  
  @js.native
  sealed trait Replace
    extends StObject
       with Operation
  /* 2 */ val Replace: typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.Operation.Replace & Double = js.native
  
  @js.native
  sealed trait Test
    extends StObject
       with Operation
  /* 5 */ val Test: typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.Operation.Test & Double = js.native
}
