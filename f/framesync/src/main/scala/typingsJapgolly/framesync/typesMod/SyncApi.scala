package typingsJapgolly.framesync.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncApi extends js.Object {
  var cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typingsJapgolly.framesync.framesyncStrings.SyncApi with js.Any
  var steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typingsJapgolly.framesync.framesyncStrings.SyncApi with js.Any
  var sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ typingsJapgolly.framesync.framesyncStrings.SyncApi with js.Any
}

object SyncApi {
  @scala.inline
  def apply(
    cancelSync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process): void}
    */ typingsJapgolly.framesync.framesyncStrings.SyncApi with js.Any,
    steps: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: framesync.framesync/lib/types.Step}
    */ typingsJapgolly.framesync.framesyncStrings.SyncApi with js.Any,
    sync: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in framesync.framesync/lib/types.StepId ]: (process : framesync.framesync/lib/types.Process, keepAlive? : boolean, immediate? : boolean): framesync.framesync/lib/types.Process}
    */ typingsJapgolly.framesync.framesyncStrings.SyncApi with js.Any
  ): SyncApi = {
    val __obj = js.Dynamic.literal(cancelSync = cancelSync.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyncApi]
  }
}

