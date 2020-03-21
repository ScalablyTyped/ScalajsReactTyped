package typingsJapgolly.storybookAddonNotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.storybookAddonNotes.sharedMod.TextParameter
    - typingsJapgolly.storybookAddonNotes.sharedMod.MarkdownParameter
    - typingsJapgolly.storybookAddonNotes.sharedMod.DisabledParameter
    - typingsJapgolly.storybookAddonNotes.sharedMod.TabsParameter
  */
  type Parameters = typingsJapgolly.storybookAddonNotes.sharedMod._Parameters | java.lang.String | typingsJapgolly.storybookAddonNotes.sharedMod.TabsParameter
  type TabsParameter = typingsJapgolly.std.Record[java.lang.String, java.lang.String]
}
