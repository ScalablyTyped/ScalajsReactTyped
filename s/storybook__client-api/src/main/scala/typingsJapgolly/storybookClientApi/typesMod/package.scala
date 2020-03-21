package typingsJapgolly.storybookClientApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookClientApi.typesMod.ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type LegacyData = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookClientApi.typesMod.LegacyItem]
  type StoreData = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookClientApi.typesMod.StoreItem]
}
