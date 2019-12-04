package typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVisitor extends js.Object {
  def visitDeclaration(decl: Declaration): js.Any
  def visitDoctype(doctype: Doctype): js.Any
  def visitTag(tag: Tag): js.Any
  def visitText(text: Text): js.Any
}

object IVisitor {
  @scala.inline
  def apply(
    visitDeclaration: Declaration => CallbackTo[js.Any],
    visitDoctype: Doctype => CallbackTo[js.Any],
    visitTag: Tag => CallbackTo[js.Any],
    visitText: Text => CallbackTo[js.Any]
  ): IVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visitDeclaration")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod.Declaration) => visitDeclaration(t0).runNow()))
    __obj.updateDynamic("visitDoctype")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod.Doctype) => visitDoctype(t0).runNow()))
    __obj.updateDynamic("visitTag")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod.Tag) => visitTag(t0).runNow()))
    __obj.updateDynamic("visitText")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCompiler.srcI18nSerializersXmlUnderscoreHelperMod.Text) => visitText(t0).runNow()))
    __obj.asInstanceOf[IVisitor]
  }
}

