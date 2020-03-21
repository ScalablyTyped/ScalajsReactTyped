package typingsJapgolly.storybookAddonStoryshots

import typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod.RenderTree
import typingsJapgolly.storybookAddonStoryshots.stories2SnapsConverterMod.Stories2SnapsConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAsyncJest extends js.Object {
  var asyncJest: Boolean = js.native
  var integrityOptions: Boolean | AnonAbsolute = js.native
  var snapshotSerializers: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.SnapshotSerializerPlugin */ _
  ] = js.native
  var stories2snapsConverter: Stories2SnapsConverter = js.native
  var storyKindRegex: String | js.RegExp = js.native
  var storyNameRegex: String | js.RegExp = js.native
  var suite: String = js.native
  def testMethod(story: js.Any, context: js.Any, renderTree: RenderTree): js.Any = js.native
  def testMethod(story: js.Any, context: js.Any, renderTree: RenderTree, options: js.Any): js.Any = js.native
}

