package typingsJapgolly.storybookClientApi.clientApiMod

import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookClientApi.AnonFileName
import typingsJapgolly.storybookClientApi.AnonHierarchyRootSeparator
import typingsJapgolly.storybookClientApi.AnonHierarchySeparator
import typingsJapgolly.storybookClientApi.typesMod.ClientApiParams
import typingsJapgolly.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/client_api", JSImport.Default)
@js.native
class default protected () extends ClientApi {
  def this(hasStoryStoreDecorateStory: ClientApiParams) = this()
  /* CompleteClass */
  override var _addons: js.Any = js.native
  /* CompleteClass */
  override var _decorateStory: js.Any = js.native
  /* CompleteClass */
  override var _storyStore: js.Any = js.native
  /* CompleteClass */
  override def addDecorator(decorator: DecoratorFunction[_]): Unit = js.native
  /* CompleteClass */
  override def addParameters(parameters: Parameters): Unit = js.native
  /* CompleteClass */
  override def clearDecorators(): Unit = js.native
  /* CompleteClass */
  override def clearParameters(): Unit = js.native
  /* CompleteClass */
  override def getSeparators(): AnonHierarchyRootSeparator | AnonHierarchySeparator = js.native
  /* CompleteClass */
  override def getStorybook(): js.Array[AnonFileName] = js.native
  /* CompleteClass */
  override def raw(): js.Array[StoreItem] = js.native
  /* CompleteClass */
  override def setAddon(addon: js.Any): Unit = js.native
  /* CompleteClass */
  override def store(): typingsJapgolly.storybookClientApi.storyStoreMod.default = js.native
  /* CompleteClass */
  override def storiesOf[StoryFnReturnType](kind: String, m: NodeModule): StoryApi[StoryFnReturnType] = js.native
}

