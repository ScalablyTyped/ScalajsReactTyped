package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.anon.IsFlippedHorizontal
import typingsJapgolly.reactSketchapp.libTypesMod.LayoutInfo
import typingsJapgolly.reactSketchapp.libTypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsProcessTransformMod {
  
  @JSImport("react-sketchapp/lib/utils/processTransform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processTransform(layout: LayoutInfo, props: ViewStyle): IsFlippedHorizontal = (^.asInstanceOf[js.Dynamic].applyDynamic("processTransform")(layout.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[IsFlippedHorizontal]
}
