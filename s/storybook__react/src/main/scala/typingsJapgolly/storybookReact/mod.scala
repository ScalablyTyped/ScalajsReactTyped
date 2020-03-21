package typingsJapgolly.storybookReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.Loadable
import typingsJapgolly.storybookAddons.typesMod.Parameters
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookReact.typesMod.IStorybookSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val addDecorator: js.Function1[/* decorator */ DecoratorFunction[Element], StoryApi[Element]] = js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[Element]] = js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  val forceReRender: js.Function0[Unit] = js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  val raw: js.Function0[js.Any] = js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  val storiesOf: js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[Element]] = js.native
}

