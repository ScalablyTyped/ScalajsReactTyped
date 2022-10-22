package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Size
import typingsJapgolly.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLayoutsizeInitMod {
  
  @JSImport("vega-lite/build/src/compile/layoutsize/init", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initLayoutSize(hasEncodingSize: Size): LayoutSizeMixins = ^.asInstanceOf[js.Dynamic].applyDynamic("initLayoutSize")(hasEncodingSize.asInstanceOf[js.Any]).asInstanceOf[LayoutSizeMixins]
}
