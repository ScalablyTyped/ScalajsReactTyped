package typingsJapgolly.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for a text token, such as a word, keyword, or variable.
  */
trait IToken extends js.Object {
  /**
    * The offset of the token in the code editor.
    */
  var offset: Double
  /**
    * An optional type for the token.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * The value of the token.
    */
  var value: String
}

object IToken {
  @scala.inline
  def apply(offset: Double, value: String, `type`: String = null): IToken = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToken]
  }
}

