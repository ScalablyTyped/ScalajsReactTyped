package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ObjectFlags extends js.Object

@JSImport("typescript", "ObjectFlags")
@js.native
object ObjectFlags extends js.Object {
  @js.native
  sealed trait Anonymous extends ObjectFlags
  
  @js.native
  sealed trait ArrayLiteral extends ObjectFlags
  
  @js.native
  sealed trait Class extends ObjectFlags
  
  @js.native
  sealed trait ClassOrInterface extends ObjectFlags
  
  @js.native
  sealed trait ContainsSpread extends ObjectFlags
  
  @js.native
  sealed trait EvolvingArray extends ObjectFlags
  
  @js.native
  sealed trait FreshLiteral extends ObjectFlags
  
  @js.native
  sealed trait Instantiated extends ObjectFlags
  
  @js.native
  sealed trait Interface extends ObjectFlags
  
  @js.native
  sealed trait JSLiteral extends ObjectFlags
  
  @js.native
  sealed trait JsxAttributes extends ObjectFlags
  
  @js.native
  sealed trait Mapped extends ObjectFlags
  
  @js.native
  sealed trait MarkerType extends ObjectFlags
  
  @js.native
  sealed trait ObjectLiteral extends ObjectFlags
  
  @js.native
  sealed trait ObjectLiteralPatternWithComputedProperties extends ObjectFlags
  
  @js.native
  sealed trait Reference extends ObjectFlags
  
  @js.native
  sealed trait ReverseMapped extends ObjectFlags
  
  @js.native
  sealed trait Tuple extends ObjectFlags
  
  /* 16 */ val Anonymous: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Anonymous with Double = js.native
  /* 65536 */ val ArrayLiteral: typingsJapgolly.typescript.typescriptMod.ObjectFlags.ArrayLiteral with Double = js.native
  /* 1 */ val Class: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Class with Double = js.native
  /* 3 */ val ClassOrInterface: typingsJapgolly.typescript.typescriptMod.ObjectFlags.ClassOrInterface with Double = js.native
  /* 1024 */ val ContainsSpread: typingsJapgolly.typescript.typescriptMod.ObjectFlags.ContainsSpread with Double = js.native
  /* 256 */ val EvolvingArray: typingsJapgolly.typescript.typescriptMod.ObjectFlags.EvolvingArray with Double = js.native
  /* 32768 */ val FreshLiteral: typingsJapgolly.typescript.typescriptMod.ObjectFlags.FreshLiteral with Double = js.native
  /* 64 */ val Instantiated: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Instantiated with Double = js.native
  /* 2 */ val Interface: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Interface with Double = js.native
  /* 16384 */ val JSLiteral: typingsJapgolly.typescript.typescriptMod.ObjectFlags.JSLiteral with Double = js.native
  /* 4096 */ val JsxAttributes: typingsJapgolly.typescript.typescriptMod.ObjectFlags.JsxAttributes with Double = js.native
  /* 32 */ val Mapped: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Mapped with Double = js.native
  /* 8192 */ val MarkerType: typingsJapgolly.typescript.typescriptMod.ObjectFlags.MarkerType with Double = js.native
  /* 128 */ val ObjectLiteral: typingsJapgolly.typescript.typescriptMod.ObjectFlags.ObjectLiteral with Double = js.native
  /* 512 */ val ObjectLiteralPatternWithComputedProperties: typingsJapgolly.typescript.typescriptMod.ObjectFlags.ObjectLiteralPatternWithComputedProperties with Double = js.native
  /* 4 */ val Reference: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Reference with Double = js.native
  /* 2048 */ val ReverseMapped: typingsJapgolly.typescript.typescriptMod.ObjectFlags.ReverseMapped with Double = js.native
  /* 8 */ val Tuple: typingsJapgolly.typescript.typescriptMod.ObjectFlags.Tuple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectFlags with Double] = js.native
}

