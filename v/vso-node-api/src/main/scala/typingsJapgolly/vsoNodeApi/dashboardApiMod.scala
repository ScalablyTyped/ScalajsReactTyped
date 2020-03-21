package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamContext
import typingsJapgolly.vsoNodeApi.dashboardInterfacesMod.Dashboard
import typingsJapgolly.vsoNodeApi.dashboardInterfacesMod.DashboardGroup
import typingsJapgolly.vsoNodeApi.dashboardInterfacesMod.Widget
import typingsJapgolly.vsoNodeApi.dashboardInterfacesMod.WidgetMetadataResponse
import typingsJapgolly.vsoNodeApi.dashboardInterfacesMod.WidgetScope
import typingsJapgolly.vsoNodeApi.dashboardInterfacesMod.WidgetTypesResponse
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typingsJapgolly.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/DashboardApi", JSImport.Namespace)
@js.native
object dashboardApiMod extends js.Object {
  @js.native
  class DashboardApi protected () extends IDashboardApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  
  @js.native
  trait IDashboardApi extends ClientApiBase {
    def createDashboard(dashboard: Dashboard, teamContext: TeamContext): js.Promise[Dashboard] = js.native
    def createWidget(widget: Widget, teamContext: TeamContext, dashboardId: String): js.Promise[Widget] = js.native
    def deleteDashboard(teamContext: TeamContext, dashboardId: String): js.Promise[Unit] = js.native
    def deleteWidget(teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Dashboard] = js.native
    def getDashboard(teamContext: TeamContext, dashboardId: String): js.Promise[Dashboard] = js.native
    def getDashboards(teamContext: TeamContext): js.Promise[DashboardGroup] = js.native
    def getWidget(teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
    def getWidgetMetadata(contributionId: String): js.Promise[WidgetMetadataResponse] = js.native
    def getWidgetTypes(scope: WidgetScope): js.Promise[WidgetTypesResponse] = js.native
    def replaceDashboard(dashboard: Dashboard, teamContext: TeamContext, dashboardId: String): js.Promise[Dashboard] = js.native
    def replaceDashboards(group: DashboardGroup, teamContext: TeamContext): js.Promise[DashboardGroup] = js.native
    def replaceWidget(widget: Widget, teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
    def updateWidget(widget: Widget, teamContext: TeamContext, dashboardId: String, widgetId: String): js.Promise[Widget] = js.native
  }
  
}

