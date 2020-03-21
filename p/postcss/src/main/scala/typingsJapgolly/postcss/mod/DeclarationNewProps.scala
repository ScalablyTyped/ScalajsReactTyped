package typingsJapgolly.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationNewProps extends js.Object {
  /**
    * The declaration's property name.
    */
  var prop: js.UndefOr[String] = js.undefined
  var raws: js.UndefOr[DeclarationRaws] = js.undefined
  /**
    * The declaration's value. This value will be cleaned of comments. If the
    * source value contained comments, those comments will be available in the
    * _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: js.UndefOr[String] = js.undefined
}

object DeclarationNewProps {
  @scala.inline
  def apply(prop: String = null, raws: DeclarationRaws = null, value: String = null): DeclarationNewProps = {
    val __obj = js.Dynamic.literal()
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationNewProps]
  }
}

