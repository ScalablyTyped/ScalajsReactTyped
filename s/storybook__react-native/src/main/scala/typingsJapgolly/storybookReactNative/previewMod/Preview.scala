package typingsJapgolly.storybookReactNative.previewMod

import typingsJapgolly.storybookClientApi.mod.ClientApi
import typingsJapgolly.storybookClientApi.mod.StoryStore
import typingsJapgolly.storybookClientApi.typesMod.StoreItem
import typingsJapgolly.storybookReactNative.AnonInstantiable
import typingsJapgolly.storybookReactNative.AnonStoryId
import typingsJapgolly.storybookReactNative.PartialParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Preview extends js.Object {
  var _addons: js.Any = js.native
  var _asyncStorage: AsyncStorage | Null = js.native
  var _asyncStorageStoryId: String = js.native
  var _clientApi: ClientApi = js.native
  var _decorators: js.Array[_] = js.native
  var _stories: StoryStore = js.native
  def _checkStory(storyId: String): StoreItem = js.native
  def _getInitialStory(initialSelection: js.Any): js.Function0[js.Promise[StoreItem]] = js.native
  def _getInitialStory(initialSelection: js.Any, shouldPersistSelection: Boolean): js.Function0[js.Promise[StoreItem]] = js.native
  def _getStory(storyId: String): StoreItem = js.native
  def _selectStory(story: js.Any): Unit = js.native
  def _selectStoryEvent(hasStoryId: AnonStoryId): Unit = js.native
  def _sendSetStories(): Unit = js.native
  def _setInitialStory(initialSelection: js.Any): js.Promise[Unit] = js.native
  def _setInitialStory(initialSelection: js.Any, shouldPersistSelection: Boolean): js.Promise[Unit] = js.native
  def api(): ClientApi = js.native
  def configure(loadStories: js.Function0[Unit], module: js.Any): Unit = js.native
  def getStorybookUI(): AnonInstantiable = js.native
  def getStorybookUI(params: PartialParams): AnonInstantiable = js.native
}

