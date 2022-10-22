package typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectVisibility extends StObject
@JSImport("vso-node-api/interfaces/CoreInterfaces", "ProjectVisibility")
@js.native
object ProjectVisibility extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProjectVisibility & Double] = js.native
  
  @js.native
  sealed trait Organization
    extends StObject
       with ProjectVisibility
  /* 1 */ val Organization: typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ProjectVisibility.Organization & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with ProjectVisibility
  /* 0 */ val Private: typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ProjectVisibility.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with ProjectVisibility
  /* 2 */ val Public: typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ProjectVisibility.Public & Double = js.native
  
  @js.native
  sealed trait Unchanged
    extends StObject
       with ProjectVisibility
  /* -1 */ val Unchanged: typingsJapgolly.vsoNodeApi.interfacesCoreInterfacesMod.ProjectVisibility.Unchanged & Double = js.native
}
