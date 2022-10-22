package typingsJapgolly.reactSketchapp

import typingsJapgolly.propTypes.mod.InferProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactSketchapp.anon.ChildrenStyle
import typingsJapgolly.reactSketchapp.anon.Scale
import typingsJapgolly.reactSketchapp.anon.State
import typingsJapgolly.reactSketchapp.anon.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextMod {
  
  @JSImport("react-sketchapp/lib/context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/context", "ArtboardContext")
  @js.native
  val ArtboardContext: Context[State] = js.native
  
  inline def ArtboardProvider(hasChildrenViewportStyle: ArtboardProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ArtboardProvider")(hasChildrenViewportStyle.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useWindowDimensions(): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowDimensions")().asInstanceOf[Scale]
  
  type ArtboardProps = InferProps[Viewport] & ChildrenStyle
}
