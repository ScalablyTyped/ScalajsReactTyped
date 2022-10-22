package typingsJapgolly.uirouterAngularjs.mod.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("@uirouter/angularjs", "core.Category")
@js.native
object Category extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.uirouterCore.libCommonTraceMod.Category & Double] = js.native
  
  /* 2 */ val HOOK: typingsJapgolly.uirouterCore.libCommonTraceMod.Category.HOOK & Double = js.native
  
  /* 0 */ val RESOLVE: typingsJapgolly.uirouterCore.libCommonTraceMod.Category.RESOLVE & Double = js.native
  
  /* 1 */ val TRANSITION: typingsJapgolly.uirouterCore.libCommonTraceMod.Category.TRANSITION & Double = js.native
  
  /* 3 */ val UIVIEW: typingsJapgolly.uirouterCore.libCommonTraceMod.Category.UIVIEW & Double = js.native
  
  /* 4 */ val VIEWCONFIG: typingsJapgolly.uirouterCore.libCommonTraceMod.Category.VIEWCONFIG & Double = js.native
}
