package typingsJapgolly.matrixAppserviceBridge.mod

import typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.ChangesCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "UserActivityTracker")
@js.native
open class UserActivityTracker protected ()
  extends typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTracker {
  def this(
    config: typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTrackerConfig,
    dataSet: typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivitySet
  ) = this()
  def this(
    config: typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivityTrackerConfig,
    dataSet: typingsJapgolly.matrixAppserviceBridge.libComponentsUserActivityMod.UserActivitySet,
    onChanges: ChangesCallback
  ) = this()
}
