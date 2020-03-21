package typingsJapgolly.storybookAddons.hooksMod

import typingsJapgolly.std.Set
import typingsJapgolly.std.WeakMap
import typingsJapgolly.storybookAddons.storybookAddonsStrings.MOUNT
import typingsJapgolly.storybookAddons.storybookAddonsStrings.NONE
import typingsJapgolly.storybookAddons.storybookAddonsStrings.UPDATE
import typingsJapgolly.storybookAddons.typesMod.StoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/hooks", "HooksContext")
@js.native
class HooksContext () extends js.Object {
  var currentContext: StoryContext | Null = js.native
  var currentDecoratorName: String | Null = js.native
  var currentEffects: js.Array[Effect] = js.native
  var currentHooks: js.Array[Hook] = js.native
  var currentPhase: MOUNT | UPDATE | NONE = js.native
  var hasUpdates: Boolean = js.native
  var hookListsMap: WeakMap[AbstractFunction, js.Array[Hook]] = js.native
  var mountedDecorators: Set[AbstractFunction] = js.native
  var nextHookIndex: Double = js.native
  var prevEffects: js.Array[Effect] = js.native
  var prevMountedDecorators: Set[AbstractFunction] = js.native
  def addRenderListeners(): Unit = js.native
  def clean(): Unit = js.native
  def getNextHook(): Hook = js.native
  def init(): Unit = js.native
  def removeRenderListeners(): Unit = js.native
  def renderListener(): Unit = js.native
  def triggerEffects(): Unit = js.native
}

