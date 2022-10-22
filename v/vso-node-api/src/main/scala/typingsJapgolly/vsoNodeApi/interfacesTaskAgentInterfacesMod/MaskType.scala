package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MaskType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MaskType")
@js.native
object MaskType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MaskType & Double] = js.native
  
  @js.native
  sealed trait Regex
    extends StObject
       with MaskType
  /* 2 */ val Regex: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.MaskType.Regex & Double = js.native
  
  @js.native
  sealed trait Variable
    extends StObject
       with MaskType
  /* 1 */ val Variable: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.MaskType.Variable & Double = js.native
}
