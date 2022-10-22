package typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FrameworkIdentityType extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "FrameworkIdentityType")
@js.native
object FrameworkIdentityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameworkIdentityType & Double] = js.native
  
  @js.native
  sealed trait AggregateIdentity
    extends StObject
       with FrameworkIdentityType
  /* 2 */ val AggregateIdentity: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.AggregateIdentity & Double = js.native
  
  @js.native
  sealed trait ImportedIdentity
    extends StObject
       with FrameworkIdentityType
  /* 3 */ val ImportedIdentity: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.ImportedIdentity & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with FrameworkIdentityType
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.None & Double = js.native
  
  @js.native
  sealed trait ServiceIdentity
    extends StObject
       with FrameworkIdentityType
  /* 1 */ val ServiceIdentity: typingsJapgolly.vsoNodeApi.interfacesIdentitiesInterfacesMod.FrameworkIdentityType.ServiceIdentity & Double = js.native
}
