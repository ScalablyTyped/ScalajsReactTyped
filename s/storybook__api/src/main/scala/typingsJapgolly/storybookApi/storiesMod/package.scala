package typingsJapgolly.storybookApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storiesMod {
  type GroupsList = js.Array[typingsJapgolly.storybookApi.storiesMod.Group]
  type ParameterName = java.lang.String
  type StoriesHash = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.storybookApi.storiesMod.Group | typingsJapgolly.storybookApi.storiesMod.Story
  ]
  type StoriesList = js.Array[
    typingsJapgolly.storybookApi.storiesMod.Group | typingsJapgolly.storybookApi.storiesMod.Story
  ]
  type StoriesRaw = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookApi.storiesMod.StoryInput]
  type Story = typingsJapgolly.storybookApi.storiesMod.StoryInput with typingsJapgolly.storybookApi.storiesMod.Group
  type StoryId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookApi.storybookApiStrings.story
    - typingsJapgolly.storybookApi.storybookApiStrings.info
    - typingsJapgolly.storybookApi.storybookApiStrings.settings
    - `js.undefined`
  */
  type ViewMode = js.UndefOr[typingsJapgolly.storybookApi.storiesMod._ViewMode]
}
