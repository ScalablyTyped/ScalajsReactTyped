package typingsJapgolly.meteorUniverseI18n.mod

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactComponentProps extends js.Object {
  var _containerType: js.UndefOr[String] = js.undefined
  var _locale: js.UndefOr[String] = js.undefined
  var _namespace: js.UndefOr[String] = js.undefined
  var _props: js.UndefOr[HTMLAttributes[Component[js.Object, js.Object]]] = js.undefined
  var _tagType: js.UndefOr[String] = js.undefined
  var _translateProps: js.UndefOr[js.Array[String]] = js.undefined
}

object ReactComponentProps {
  @scala.inline
  def apply(
    _containerType: String = null,
    _locale: String = null,
    _namespace: String = null,
    _props: HTMLAttributes[Component[js.Object, js.Object]] = null,
    _tagType: String = null,
    _translateProps: js.Array[String] = null
  ): ReactComponentProps = {
    val __obj = js.Dynamic.literal()
    if (_containerType != null) __obj.updateDynamic("_containerType")(_containerType.asInstanceOf[js.Any])
    if (_locale != null) __obj.updateDynamic("_locale")(_locale.asInstanceOf[js.Any])
    if (_namespace != null) __obj.updateDynamic("_namespace")(_namespace.asInstanceOf[js.Any])
    if (_props != null) __obj.updateDynamic("_props")(_props.asInstanceOf[js.Any])
    if (_tagType != null) __obj.updateDynamic("_tagType")(_tagType.asInstanceOf[js.Any])
    if (_translateProps != null) __obj.updateDynamic("_translateProps")(_translateProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactComponentProps]
  }
}

