package typingsJapgolly.atStorybookApi

import typingsJapgolly.atStorybookApi.distModulesStoriesMod.Direction
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.Group
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.StoriesRaw
import typingsJapgolly.atStorybookApi.distModulesStoriesMod.Story
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Direction extends js.Object {
  def getCurrentParameter[S](parameterName: String): S = js.native
  def getCurrentStoryData(): Group | Story = js.native
  def getData(storyId: String): Group | Story = js.native
  def getParameters(storyId: String): js.Any = js.native
  def getParameters(storyId: String, parameterName: String): js.Any = js.native
  def jumpToComponent(direction: Direction): Unit = js.native
  def jumpToStory(direction: Direction): Unit = js.native
  def selectStory(kindOrId: String): Unit = js.native
  def selectStory(kindOrId: String, story: String): Unit = js.native
  def setStories(input: StoriesRaw): Unit = js.native
  def storyId(kind: String, name: String): String = js.native
}

