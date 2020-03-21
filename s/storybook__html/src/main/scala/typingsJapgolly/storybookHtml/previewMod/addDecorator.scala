package typingsJapgolly.storybookHtml.previewMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookHtml.typesMod.StoryFnHtmlReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/html/dist/client/preview", "addDecorator")
@js.native
object addDecorator
  extends TopLevel[
      js.Function1[
        /* decorator */ DecoratorFunction[StoryFnHtmlReturnType], 
        StoryApi[StoryFnHtmlReturnType]
      ]
    ]

