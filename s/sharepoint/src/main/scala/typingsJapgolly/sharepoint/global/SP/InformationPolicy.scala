package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InformationPolicy {
  
  @JSGlobal("SP.InformationPolicy.ProjectPolicy")
  @js.native
  open class ProjectPolicy protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.InformationPolicy.ProjectPolicy {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      objectPath: typingsJapgolly.sharepoint.SP.ObjectPath
    ) = this()
  }
  object ProjectPolicy {
    
    @JSGlobal("SP.InformationPolicy.ProjectPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def applyProjectPolicy(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web,
      projectPolicy: typingsJapgolly.sharepoint.SP.InformationPolicy.ProjectPolicy
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyProjectPolicy")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any], projectPolicy.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def closeProject(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("closeProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def doesProjectHavePolicy(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("doesProjectHavePolicy")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BooleanResult]
    
    /* static member */
    inline def getCurrentlyAppliedProject(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.InformationPolicy.ProjectPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentlyAppliedProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.InformationPolicy.ProjectPolicy]
    
    /* static member */
    inline def getProjectCloseDate(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.DateTimeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectCloseDate")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.DateTimeResult]
    
    /* static member */
    inline def getProjectExpirationDate(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.DateTimeResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectExpirationDate")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.DateTimeResult]
    
    /* static member */
    inline def getProjectPolicies(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.InformationPolicy.ProjectPolicy] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProjectPolicies")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.InformationPolicy.ProjectPolicy]]
    
    /* static member */
    inline def isProjectClosed(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): typingsJapgolly.sharepoint.SP.BooleanResult = (^.asInstanceOf[js.Dynamic].applyDynamic("isProjectClosed")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.BooleanResult]
    
    /* static member */
    inline def openProject(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def postponeProject(
      context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
      web: typingsJapgolly.sharepoint.SP.Web
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("postponeProject")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
