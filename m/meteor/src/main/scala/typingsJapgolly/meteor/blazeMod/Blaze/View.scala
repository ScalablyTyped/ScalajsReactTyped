package typingsJapgolly.meteor.blazeMod.Blaze

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import typingsJapgolly.meteor.Tracker.Computation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  var isCreated: Boolean
  var isDestroyed: Boolean
  var isRendered: Boolean
  var name: String
  var parentView: View
  var renderCount: Double
  var template: Template
  def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation
  def firstNode(): Node
  def lastNode(): Node
  def onViewCreated(func: js.Function): Unit
  def onViewDestroyed(func: js.Function): Unit
  def onViewReady(func: js.Function): Unit
  def templateInstance(): TemplateInstance
}

@JSImport("meteor/blaze", "Blaze.View")
@js.native
object View extends TopLevel[ViewStatic]

