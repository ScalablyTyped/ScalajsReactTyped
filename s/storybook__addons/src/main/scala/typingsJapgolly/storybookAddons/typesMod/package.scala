package typingsJapgolly.storybookAddons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClientApiAddons[StoryFnReturnType] = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.storybookAddons.typesMod.ClientApiAddon[StoryFnReturnType]]
  type ClientApiReturnFn[StoryFnReturnType] = js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.storybookAddons.typesMod.StoryApi[StoryFnReturnType]
  ]
  type DecoratorFunction[StoryFnReturnType] = js.Function2[
    /* fn */ typingsJapgolly.storybookAddons.typesMod.StoryFn[StoryFnReturnType], 
    /* c */ typingsJapgolly.storybookAddons.typesMod.StoryContext, 
    typingsJapgolly.std.ReturnType[typingsJapgolly.storybookAddons.typesMod.StoryFn[StoryFnReturnType]]
  ]
  type LoadFn = js.Function0[js.Any]
  type Loadable = typingsJapgolly.storybookAddons.typesMod.RequireContext | js.Array[typingsJapgolly.storybookAddons.typesMod.RequireContext] | typingsJapgolly.storybookAddons.typesMod.LoadFn
  type MakeDecoratorResult = js.Function1[/* args */ js.Any, js.Any]
  type RequireContext = js.Any
  type StoryFn[ReturnType] = js.Function1[
    /* p */ js.UndefOr[typingsJapgolly.storybookAddons.typesMod.StoryContext], 
    ReturnType
  ]
  type StoryGetter = js.Function1[/* context */ typingsJapgolly.storybookAddons.typesMod.StoryContext, js.Any]
  type StoryWrapper = js.Function3[
    /* getStory */ typingsJapgolly.storybookAddons.typesMod.StoryGetter, 
    /* context */ typingsJapgolly.storybookAddons.typesMod.StoryContext, 
    /* settings */ typingsJapgolly.storybookAddons.typesMod.WrapperSettings, 
    js.Any
  ]
  type Types_ = typingsJapgolly.storybookAddons.typesMod.types | java.lang.String
}
