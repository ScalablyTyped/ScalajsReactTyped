package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsxFlags extends js.Object

@JSImport("typescript", "JsxFlags")
@js.native
object JsxFlags extends js.Object {
  @js.native
  sealed trait IntrinsicElement extends JsxFlags
  
  /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicIndexedElement extends JsxFlags
  
  /** An element from a named property of the JSX.IntrinsicElements interface */
  @js.native
  sealed trait IntrinsicNamedElement extends JsxFlags
  
  @js.native
  sealed trait None extends JsxFlags
  
  /* 3 */ val IntrinsicElement: typingsJapgolly.typescript.typescriptMod.JsxFlags.IntrinsicElement with Double = js.native
  /* 2 */ val IntrinsicIndexedElement: typingsJapgolly.typescript.typescriptMod.JsxFlags.IntrinsicIndexedElement with Double = js.native
  /* 1 */ val IntrinsicNamedElement: typingsJapgolly.typescript.typescriptMod.JsxFlags.IntrinsicNamedElement with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.JsxFlags.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsxFlags with Double] = js.native
}

