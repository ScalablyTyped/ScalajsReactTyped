package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MailSectionType extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "MailSectionType")
@js.native
object MailSectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MailSectionType & Double] = js.native
  
  @js.native
  sealed trait Details
    extends StObject
       with MailSectionType
  /* 0 */ val Details: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.MailSectionType.Details & Double = js.native
  
  @js.native
  sealed trait Environments
    extends StObject
       with MailSectionType
  /* 1 */ val Environments: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.MailSectionType.Environments & Double = js.native
  
  @js.native
  sealed trait Issues
    extends StObject
       with MailSectionType
  /* 2 */ val Issues: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.MailSectionType.Issues & Double = js.native
  
  @js.native
  sealed trait ReleaseInfo
    extends StObject
       with MailSectionType
  /* 5 */ val ReleaseInfo: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.MailSectionType.ReleaseInfo & Double = js.native
  
  @js.native
  sealed trait TestResults
    extends StObject
       with MailSectionType
  /* 3 */ val TestResults: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.MailSectionType.TestResults & Double = js.native
  
  @js.native
  sealed trait WorkItems
    extends StObject
       with MailSectionType
  /* 4 */ val WorkItems: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.MailSectionType.WorkItems & Double = js.native
}
