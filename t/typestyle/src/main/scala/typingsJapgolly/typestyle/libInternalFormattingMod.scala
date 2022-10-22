package typingsJapgolly.typestyle

import typingsJapgolly.freeStyle.mod.Styles
import typingsJapgolly.typestyle.libTypesMod.KeyFrames
import typingsJapgolly.typestyle.libTypesMod.NestedCSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInternalFormattingMod {
  
  @JSImport("typestyle/lib/internal/formatting", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertToKeyframes(frames: KeyFrames): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToKeyframes")(frames.asInstanceOf[js.Any]).asInstanceOf[Styles]
  
  inline def convertToStyles(`object`: NestedCSSProperties): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToStyles")(`object`.asInstanceOf[js.Any]).asInstanceOf[Styles]
}
