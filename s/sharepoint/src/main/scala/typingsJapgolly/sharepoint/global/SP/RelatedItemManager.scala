package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.RelatedItemManager")
@js.native
open class RelatedItemManager ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ClientObject
object RelatedItemManager {
  
  @JSGlobal("SP.RelatedItemManager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def addSingleLink(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingleLink")(context.asInstanceOf[js.Any], SourceListName.asInstanceOf[js.Any], SourceItemID.asInstanceOf[js.Any], SourceWebUrl.asInstanceOf[js.Any], TargetListName.asInstanceOf[js.Any], TargetItemID.asInstanceOf[js.Any], TargetWebUrl.asInstanceOf[js.Any], TryAddReverseLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addSingleLinkFromUrl(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    SourceItemUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TryAddReverseLink: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingleLinkFromUrl")(context.asInstanceOf[js.Any], SourceItemUrl.asInstanceOf[js.Any], TargetListName.asInstanceOf[js.Any], TargetItemID.asInstanceOf[js.Any], TryAddReverseLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def addSingleLinkToUrl(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    TargetItemUrl: String,
    TryAddReverseLink: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSingleLinkToUrl")(context.asInstanceOf[js.Any], SourceListName.asInstanceOf[js.Any], SourceItemID.asInstanceOf[js.Any], TargetItemUrl.asInstanceOf[js.Any], TryAddReverseLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def deleteSingleLink(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double,
    SourceWebUrl: String,
    TargetListName: String,
    TargetItemID: Double,
    TargetWebUrl: String,
    TryDeleteReverseLink: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSingleLink")(context.asInstanceOf[js.Any], SourceListName.asInstanceOf[js.Any], SourceItemID.asInstanceOf[js.Any], SourceWebUrl.asInstanceOf[js.Any], TargetListName.asInstanceOf[js.Any], TargetItemID.asInstanceOf[js.Any], TargetWebUrl.asInstanceOf[js.Any], TryDeleteReverseLink.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def getPageOneRelatedItems(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double
  ): js.Array[typingsJapgolly.sharepoint.SP.RelatedItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageOneRelatedItems")(context.asInstanceOf[js.Any], SourceListName.asInstanceOf[js.Any], SourceItemID.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.sharepoint.SP.RelatedItem]]
  
  /* static member */
  inline def getRelatedItems(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    SourceListName: String,
    SourceItemID: Double
  ): js.Array[typingsJapgolly.sharepoint.SP.RelatedItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelatedItems")(context.asInstanceOf[js.Any], SourceListName.asInstanceOf[js.Any], SourceItemID.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.sharepoint.SP.RelatedItem]]
}
