package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ModuleKind extends js.Object

@JSImport("typescript", "ModuleKind")
@js.native
object ModuleKind extends js.Object {
  @js.native
  sealed trait AMD extends ModuleKind
  
  @js.native
  sealed trait CommonJS extends ModuleKind
  
  @js.native
  sealed trait ES2015 extends ModuleKind
  
  @js.native
  sealed trait ESNext extends ModuleKind
  
  @js.native
  sealed trait None extends ModuleKind
  
  @js.native
  sealed trait System extends ModuleKind
  
  @js.native
  sealed trait UMD extends ModuleKind
  
  /* 2 */ val AMD: typingsJapgolly.typescript.typescriptMod.ModuleKind.AMD with Double = js.native
  /* 1 */ val CommonJS: typingsJapgolly.typescript.typescriptMod.ModuleKind.CommonJS with Double = js.native
  /* 5 */ val ES2015: typingsJapgolly.typescript.typescriptMod.ModuleKind.ES2015 with Double = js.native
  /* 99 */ val ESNext: typingsJapgolly.typescript.typescriptMod.ModuleKind.ESNext with Double = js.native
  /* 0 */ val None: typingsJapgolly.typescript.typescriptMod.ModuleKind.None with Double = js.native
  /* 4 */ val System: typingsJapgolly.typescript.typescriptMod.ModuleKind.System with Double = js.native
  /* 3 */ val UMD: typingsJapgolly.typescript.typescriptMod.ModuleKind.UMD with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ModuleKind with Double] = js.native
}

