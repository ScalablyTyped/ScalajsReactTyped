package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModifierFlags extends js.Object

@JSImport("typescript", "ModifierFlags")
@js.native
object ModifierFlags extends js.Object {
  @js.native
  sealed trait Abstract extends ModifierFlags
  
  @js.native
  sealed trait AccessibilityModifier extends ModifierFlags
  
  @js.native
  sealed trait All extends ModifierFlags
  
  @js.native
  sealed trait Ambient extends ModifierFlags
  
  @js.native
  sealed trait Async extends ModifierFlags
  
  @js.native
  sealed trait Const extends ModifierFlags
  
  @js.native
  sealed trait Default extends ModifierFlags
  
  @js.native
  sealed trait Export extends ModifierFlags
  
  @js.native
  sealed trait ExportDefault extends ModifierFlags
  
  @js.native
  sealed trait HasComputedFlags extends ModifierFlags
  
  @js.native
  sealed trait NonPublicAccessibilityModifier extends ModifierFlags
  
  @js.native
  sealed trait None extends ModifierFlags
  
  @js.native
  sealed trait ParameterPropertyModifier extends ModifierFlags
  
  @js.native
  sealed trait Private extends ModifierFlags
  
  @js.native
  sealed trait Protected extends ModifierFlags
  
  @js.native
  sealed trait Public extends ModifierFlags
  
  @js.native
  sealed trait Readonly extends ModifierFlags
  
  @js.native
  sealed trait Static extends ModifierFlags
  
  @js.native
  sealed trait TypeScriptModifier extends ModifierFlags
  
  /* 128 */ val Abstract: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Abstract with Double = js.native
  /* 28 */ val AccessibilityModifier: typingsJapgolly.typescript.typescriptMod.ModifierFlags.AccessibilityModifier with Double = js.native
  /* 3071 */ val All: typingsJapgolly.typescript.typescriptMod.ModifierFlags.All with Double = js.native
  /* 2 */ val Ambient: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Ambient with Double = js.native
  /* 256 */ val Async: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Async with Double = js.native
  /* 2048 */ val Const: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Const with Double = js.native
  /* 512 */ val Default: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Default with Double = js.native
  /* 1 */ val Export: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Export with Double = js.native
  /* 513 */ val ExportDefault: typingsJapgolly.typescript.typescriptMod.ModifierFlags.ExportDefault with Double = js.native
  /* 536870912 */ val HasComputedFlags: typingsJapgolly.typescript.typescriptMod.ModifierFlags.HasComputedFlags with Double = js.native
  /* 24 */ val NonPublicAccessibilityModifier: typingsJapgolly.typescript.typescriptMod.ModifierFlags.NonPublicAccessibilityModifier with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.ModifierFlags.None with Double = js.native
  /* 92 */ val ParameterPropertyModifier: typingsJapgolly.typescript.typescriptMod.ModifierFlags.ParameterPropertyModifier with Double = js.native
  /* 8 */ val Private: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Private with Double = js.native
  /* 16 */ val Protected: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Protected with Double = js.native
  /* 4 */ val Public: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Public with Double = js.native
  /* 64 */ val Readonly: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Readonly with Double = js.native
  /* 32 */ val Static: typingsJapgolly.typescript.typescriptMod.ModifierFlags.Static with Double = js.native
  /* 2270 */ val TypeScriptModifier: typingsJapgolly.typescript.typescriptMod.ModifierFlags.TypeScriptModifier with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModifierFlags with Double] = js.native
}

