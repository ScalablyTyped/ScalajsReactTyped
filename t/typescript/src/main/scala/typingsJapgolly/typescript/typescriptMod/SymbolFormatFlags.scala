package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SymbolFormatFlags extends js.Object

@JSImport("typescript", "SymbolFormatFlags")
@js.native
object SymbolFormatFlags extends js.Object {
  @js.native
  sealed trait AllowAnyNodeKind extends SymbolFormatFlags
  
  @js.native
  sealed trait None extends SymbolFormatFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends SymbolFormatFlags
  
  @js.native
  sealed trait UseOnlyExternalAliasing extends SymbolFormatFlags
  
  @js.native
  sealed trait WriteTypeParametersOrArguments extends SymbolFormatFlags
  
  /* 4 */ val AllowAnyNodeKind: typingsJapgolly.typescript.typescriptMod.SymbolFormatFlags.AllowAnyNodeKind with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.SymbolFormatFlags.None with Double = js.native
  /* 8 */ val UseAliasDefinedOutsideCurrentScope: typingsJapgolly.typescript.typescriptMod.SymbolFormatFlags.UseAliasDefinedOutsideCurrentScope with Double = js.native
  /* 2 */ val UseOnlyExternalAliasing: typingsJapgolly.typescript.typescriptMod.SymbolFormatFlags.UseOnlyExternalAliasing with Double = js.native
  /* 1 */ val WriteTypeParametersOrArguments: typingsJapgolly.typescript.typescriptMod.SymbolFormatFlags.WriteTypeParametersOrArguments with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFormatFlags with Double] = js.native
}

