package typingsJapgolly.nginstackEngine

import typingsJapgolly.nginstackEngine.anon.DeletedIds
import typingsJapgolly.nginstackEngine.anon.IdFieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetSyncRecordsMod {
  
  inline def apply(
    source: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
    target: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  ): DeletedIds = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DeletedIds]
  inline def apply(
    source: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
    target: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
    opt_options: IdFieldName
  ): DeletedIds = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[DeletedIds]
  
  @JSImport("@nginstack/engine/lib/dataset/syncRecords", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
