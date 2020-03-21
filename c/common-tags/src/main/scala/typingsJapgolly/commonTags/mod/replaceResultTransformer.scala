package typingsJapgolly.commonTags.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("common-tags", "replaceResultTransformer")
@js.native
object replaceResultTransformer extends js.Object {
  def apply(replaceWhat: String, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def apply(
    replaceWhat: String,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
  def apply(replaceWhat: RegExp, replaceWith: String): TemplateTransformer[StringDictionary[_]] = js.native
  def apply(
    replaceWhat: RegExp,
    replaceWith: js.Function2[/* substring */ String, /* repeated */ js.Any, String]
  ): TemplateTransformer[StringDictionary[_]] = js.native
}

