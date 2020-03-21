package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.intlMessageformat.mod.PrimitiveType
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.reactIntl.htmlMessageMod.default
import typingsJapgolly.reactIntl.messageMod.Props
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HtmlMessage {
  def apply(
    defaultMessage: String = null,
    description: String | js.Object = null,
    id: String | Double = null,
    tagName: ElementType = null,
    values: Record[String, PrimitiveType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* nodes */ ReactNodeArray => CallbackTo[Node] = null
  ): UnmountedWithRoot[
    Props[Record[String, PrimitiveType]], 
    default, 
    Unit, 
    Props[Record[String, PrimitiveType]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* nodes */ typingsJapgolly.react.mod.ReactNodeArray) => children(t0).runNow()))
    if (defaultMessage != null) __obj.updateDynamic("defaultMessage")(defaultMessage.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactIntl.messageMod.Props[
    typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.intlMessageformat.mod.PrimitiveType]
  ], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactIntl.htmlMessageMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactIntl.messageMod.Props[
  typingsJapgolly.std.Record[java.lang.String, typingsJapgolly.intlMessageformat.mod.PrimitiveType]]])
  }
  @JSImport("react-intl/lib/components/html-message", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

