package typingsJapgolly.atAngularCompiler.srcCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewEncapsulation extends js.Object

@JSImport("@angular/compiler/src/core", "ViewEncapsulation")
@js.native
object ViewEncapsulation extends js.Object {
  @js.native
  sealed trait Emulated extends ViewEncapsulation
  
  @js.native
  sealed trait Native extends ViewEncapsulation
  
  @js.native
  sealed trait None extends ViewEncapsulation
  
  @js.native
  sealed trait ShadowDom extends ViewEncapsulation
  
  /* 0 */ val Emulated: typingsJapgolly.atAngularCompiler.srcCoreMod.ViewEncapsulation.Emulated with Double = js.native
  /* 1 */ val Native: typingsJapgolly.atAngularCompiler.srcCoreMod.ViewEncapsulation.Native with Double = js.native
  /* 2 */ val None: typingsJapgolly.atAngularCompiler.srcCoreMod.ViewEncapsulation.None with Double = js.native
  /* 3 */ val ShadowDom: typingsJapgolly.atAngularCompiler.srcCoreMod.ViewEncapsulation.ShadowDom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewEncapsulation with Double] = js.native
}

