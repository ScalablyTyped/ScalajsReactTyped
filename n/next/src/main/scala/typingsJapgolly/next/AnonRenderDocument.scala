package typingsJapgolly.next

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.next.utilsMod.DocumentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRenderDocument extends js.Object {
  def renderDocument(
    Document: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object,
    props: DocumentProps
  ): Element
}

object AnonRenderDocument {
  @scala.inline
  def apply(
    renderDocument: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, DocumentProps) => CallbackTo[Element]
  ): AnonRenderDocument = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderDocument")(js.Any.fromFunction2((t0: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias next.next/dist/next-server/lib/utils.DocumentType */ js.Object, t1: typingsJapgolly.next.utilsMod.DocumentProps) => renderDocument(t0, t1).runNow()))
    __obj.asInstanceOf[AnonRenderDocument]
  }
}

