package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApprovalType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ApprovalType")
@js.native
object ApprovalType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApprovalType & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ApprovalType
  /* 3 */ val All: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalType.All & Double = js.native
  
  @js.native
  sealed trait PostDeploy
    extends StObject
       with ApprovalType
  /* 2 */ val PostDeploy: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalType.PostDeploy & Double = js.native
  
  @js.native
  sealed trait PreDeploy
    extends StObject
       with ApprovalType
  /* 1 */ val PreDeploy: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalType.PreDeploy & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ApprovalType
  /* 0 */ val Undefined: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.ApprovalType.Undefined & Double = js.native
}
