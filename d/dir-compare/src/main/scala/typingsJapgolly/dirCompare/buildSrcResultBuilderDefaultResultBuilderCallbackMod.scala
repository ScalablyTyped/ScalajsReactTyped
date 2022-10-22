package typingsJapgolly.dirCompare

import typingsJapgolly.dirCompare.buildSrcExtOptionsMod.ExtOptions
import typingsJapgolly.dirCompare.buildSrcTypesMod.DiffSet
import typingsJapgolly.dirCompare.buildSrcTypesMod.DifferenceState
import typingsJapgolly.dirCompare.buildSrcTypesMod.Entry
import typingsJapgolly.dirCompare.buildSrcTypesMod.PermissionDeniedState
import typingsJapgolly.dirCompare.buildSrcTypesMod.Reason
import typingsJapgolly.dirCompare.buildSrcTypesMod.Statistics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcResultBuilderDefaultResultBuilderCallbackMod {
  
  @JSImport("dir-compare/build/src/ResultBuilder/defaultResultBuilderCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultResultBuilderCallback(
    entry1: Entry,
    entry2: Entry,
    state: DifferenceState,
    level: Double,
    relativePath: String,
    options: ExtOptions,
    statistics: Statistics,
    diffSet: DiffSet,
    reason: Reason,
    permissionDeniedState: PermissionDeniedState
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultResultBuilderCallback")(entry1.asInstanceOf[js.Any], entry2.asInstanceOf[js.Any], state.asInstanceOf[js.Any], level.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], statistics.asInstanceOf[js.Any], diffSet.asInstanceOf[js.Any], reason.asInstanceOf[js.Any], permissionDeniedState.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
