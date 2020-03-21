package typingsJapgolly.storybookVue.previewMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookVue.typesMod.StoryFnVueReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/vue/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnVueReturnType], 
        StoryApi[StoryFnVueReturnType]
      ]
    ]

