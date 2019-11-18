package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HighlightSpanKind extends js.Object

@JSImport("typescript", "HighlightSpanKind")
@js.native
object HighlightSpanKind extends js.Object {
  @js.native
  sealed trait definition extends HighlightSpanKind
  
  @js.native
  sealed trait none extends HighlightSpanKind
  
  @js.native
  sealed trait reference extends HighlightSpanKind
  
  @js.native
  sealed trait writtenReference extends HighlightSpanKind
  
  /* "definition" */ val definition: typingsJapgolly.typescript.typescriptMod.HighlightSpanKind.definition with String = js.native
  /* "none" */ val none: typingsJapgolly.typescript.typescriptMod.HighlightSpanKind.none with String = js.native
  /* "reference" */ val reference: typingsJapgolly.typescript.typescriptMod.HighlightSpanKind.reference with String = js.native
  /* "writtenReference" */ val writtenReference: typingsJapgolly.typescript.typescriptMod.HighlightSpanKind.writtenReference with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HighlightSpanKind with String] = js.native
}

