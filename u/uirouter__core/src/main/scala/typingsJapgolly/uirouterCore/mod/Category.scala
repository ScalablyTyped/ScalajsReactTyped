package typingsJapgolly.uirouterCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Trace categories Enum
  *
  * Enable or disable a category using [[Trace.enable]] or [[Trace.disable]]
  *
  * `trace.enable(Category.TRANSITION)`
  *
  * These can also be provided using a matching string, or position ordinal
  *
  * `trace.enable("TRANSITION")`
  *
  * `trace.enable(1)`
  */
@JSImport("@uirouter/core", "Category")
@js.native
object Category extends js.Object {
  /* 2 */ val HOOK: typingsJapgolly.uirouterCore.traceMod.Category.HOOK with Double = js.native
  /* 0 */ val RESOLVE: typingsJapgolly.uirouterCore.traceMod.Category.RESOLVE with Double = js.native
  /* 1 */ val TRANSITION: typingsJapgolly.uirouterCore.traceMod.Category.TRANSITION with Double = js.native
  /* 3 */ val UIVIEW: typingsJapgolly.uirouterCore.traceMod.Category.UIVIEW with Double = js.native
  /* 4 */ val VIEWCONFIG: typingsJapgolly.uirouterCore.traceMod.Category.VIEWCONFIG with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.uirouterCore.traceMod.Category with Double] = js.native
}

