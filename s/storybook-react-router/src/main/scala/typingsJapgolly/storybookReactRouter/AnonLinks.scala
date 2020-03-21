package typingsJapgolly.storybookReactRouter

import typingsJapgolly.reactRouter.mod.MemoryRouterProps
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLinks extends js.Object {
  var links: js.Object
  var routerProps: MemoryRouterProps
  var story: StoryApi[_]
}

object AnonLinks {
  @scala.inline
  def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[_]): AnonLinks = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLinks]
  }
}

