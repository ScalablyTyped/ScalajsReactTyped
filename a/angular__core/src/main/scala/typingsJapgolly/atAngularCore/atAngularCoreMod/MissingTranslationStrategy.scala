package typingsJapgolly.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MissingTranslationStrategy extends js.Object

@JSImport("@angular/core", "MissingTranslationStrategy")
@js.native
object MissingTranslationStrategy extends js.Object {
  @js.native
  sealed trait Error extends MissingTranslationStrategy
  
  @js.native
  sealed trait Ignore extends MissingTranslationStrategy
  
  @js.native
  sealed trait Warning extends MissingTranslationStrategy
  
  /* 0 */ val Error: typingsJapgolly.atAngularCore.atAngularCoreMod.MissingTranslationStrategy.Error with Double = js.native
  /* 2 */ val Ignore: typingsJapgolly.atAngularCore.atAngularCoreMod.MissingTranslationStrategy.Ignore with Double = js.native
  /* 1 */ val Warning: typingsJapgolly.atAngularCore.atAngularCoreMod.MissingTranslationStrategy.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MissingTranslationStrategy with Double] = js.native
}

