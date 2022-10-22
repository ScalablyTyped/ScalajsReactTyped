package typingsJapgolly.vegaLite

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.vegaLite.buildSrcCompileSelectionMod.SelectionCompiler
import typingsJapgolly.vegaLite.vegaLiteStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileSelectionNearestMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/nearest", JSImport.Default)
  @js.native
  val default: SelectionCompiler[point] = js.native
  
  type _To = SelectionCompiler[point]
  
  /* This means you don't have to write `default`, but can instead just say `buildSrcCompileSelectionNearestMod.foo` */
  override def _to: SelectionCompiler[point] = default
}
