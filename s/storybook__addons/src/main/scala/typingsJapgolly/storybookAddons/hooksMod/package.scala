package typingsJapgolly.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  type AbstractFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type Decorator = js.Function2[
    /* getStory */ typingsJapgolly.storybookAddons.typesMod.StoryGetter, 
    /* context */ typingsJapgolly.storybookAddons.typesMod.StoryContext, 
    js.Any
  ]
  type EventMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookAddons.hooksMod.Listener]
}
