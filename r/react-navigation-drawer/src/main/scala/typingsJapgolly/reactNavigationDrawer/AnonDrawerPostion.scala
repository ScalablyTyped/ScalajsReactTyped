package typingsJapgolly.reactNavigationDrawer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDrawerPostion extends js.Object {
  var drawerPostion: String
  var drawerType: String
  var gestureEnabled: Boolean
  var hideStatusBar: Boolean
  var keyboardDismissMode: String
  var statusBarAnimation: String
  var swipeEdgeWidth: Double
  var swipeVelocityThreshold: Double
}

object AnonDrawerPostion {
  @scala.inline
  def apply(
    drawerPostion: String,
    drawerType: String,
    gestureEnabled: Boolean,
    hideStatusBar: Boolean,
    keyboardDismissMode: String,
    statusBarAnimation: String,
    swipeEdgeWidth: Double,
    swipeVelocityThreshold: Double
  ): AnonDrawerPostion = {
    val __obj = js.Dynamic.literal(drawerPostion = drawerPostion.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], gestureEnabled = gestureEnabled.asInstanceOf[js.Any], hideStatusBar = hideStatusBar.asInstanceOf[js.Any], keyboardDismissMode = keyboardDismissMode.asInstanceOf[js.Any], statusBarAnimation = statusBarAnimation.asInstanceOf[js.Any], swipeEdgeWidth = swipeEdgeWidth.asInstanceOf[js.Any], swipeVelocityThreshold = swipeVelocityThreshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDrawerPostion]
  }
}

