package typingsJapgolly.playcanvas.mod

import typingsJapgolly.playcanvas.anon.Cameras
import typingsJapgolly.playcanvas.anon.CompileTime
import typingsJapgolly.playcanvas.anon.Depth
import typingsJapgolly.playcanvas.anon.FrameTime
import typingsJapgolly.playcanvas.anon.Ib
import typingsJapgolly.playcanvas.anon.RenderTargetCreationTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../graphics/graphics-device.js').GraphicsDevice} GraphicsDevice */
/**
  * Records performance-related statistics related to the application.
  *
  * @ignore
  */
@js.native
trait ApplicationStats extends StObject {
  
  def batcher: Any = js.native
  
  var drawCalls: Depth = js.native
  
  var frame: Cameras = js.native
  
  def lightmapper: Any = js.native
  
  var misc: RenderTargetCreationTime = js.native
  
  var particles: FrameTime = js.native
  
  def scene: Any = js.native
  
  var shaders: CompileTime = js.native
  
  var vram: Ib = js.native
}
