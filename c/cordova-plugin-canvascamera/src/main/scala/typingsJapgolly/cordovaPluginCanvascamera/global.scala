package typingsJapgolly.cordovaPluginCanvascamera

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("CanvasCamera")
  @js.native
  open class CanvasCamera ()
    extends StObject
       with typingsJapgolly.cordovaPluginCanvascamera.CanvasCamera
  
  @JSGlobal("Frame")
  @js.native
  /* private */ open class Frame ()
    extends StObject
       with typingsJapgolly.cordovaPluginCanvascamera.Frame {
    
    /* CompleteClass */
    var dHeight: Double = js.native
    
    /* CompleteClass */
    var dWidth: Double = js.native
    
    /* CompleteClass */
    var dx: Double = js.native
    
    /* CompleteClass */
    var dy: Double = js.native
    
    /* CompleteClass */
    var element: HTMLCanvasElement = js.native
    
    /* CompleteClass */
    var image: HTMLImageElement = js.native
    
    /* CompleteClass */
    override def initialize(): typingsJapgolly.cordovaPluginCanvascamera.Frame = js.native
    
    /* CompleteClass */
    override def recycle(): Unit = js.native
    
    /* CompleteClass */
    var sHeight: Double = js.native
    
    /* CompleteClass */
    var sWidth: Double = js.native
    
    /* CompleteClass */
    var sx: Double = js.native
    
    /* CompleteClass */
    var sy: Double = js.native
  }
  
  @JSGlobal("Renderer")
  @js.native
  /* private */ open class Renderer ()
    extends StObject
       with typingsJapgolly.cordovaPluginCanvascamera.Renderer
}
