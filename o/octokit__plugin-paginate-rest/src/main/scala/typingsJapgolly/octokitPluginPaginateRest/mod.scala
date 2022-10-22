package typingsJapgolly.octokitPluginPaginateRest

import typingsJapgolly.octokitCore.mod.Octokit
import typingsJapgolly.octokitPluginPaginateRest.anon.Paginate
import typingsJapgolly.octokitPluginPaginateRest.distTypesTypesMod.ComposePaginateInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/plugin-paginate-rest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@octokit/plugin-paginate-rest", "composePaginateRest")
  @js.native
  val composePaginateRest: ComposePaginateInterface = js.native
  
  inline def isPaginatingEndpoint(arg: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPaginatingEndpoint")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object paginateRest {
    
    inline def apply(octokit: Octokit): Paginate = ^.asInstanceOf[js.Dynamic].apply(octokit.asInstanceOf[js.Any]).asInstanceOf[Paginate]
    
    @JSImport("@octokit/plugin-paginate-rest", "paginateRest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@octokit/plugin-paginate-rest", "paginateRest.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@octokit/plugin-paginate-rest", "paginatingEndpoints")
  @js.native
  val paginatingEndpoints: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 185, starting with typingsJapgolly.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashhookSlashdeliveries`, typingsJapgolly.octokitPluginPaginateRest.octokitPluginPaginateRestStrings.`GET SlashappSlashinstallations`, / * GET /enterprises/{enterprise}/actions/permissions/organizations * / java.lang.String */ Any
  ] = js.native
}
