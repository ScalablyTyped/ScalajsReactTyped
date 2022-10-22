package typingsJapgolly.cordovaPluginCanvascamera

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.cordovaPluginCanvascamera.anon.Width
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.back
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.front
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.landscape
import typingsJapgolly.cordovaPluginCanvascamera.cordovaPluginCanvascameraStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasCamera extends StObject {
  
  def cameraPosition(cameraFacing: front | back): Unit = js.native
  def cameraPosition(cameraFacing: front | back, onError: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = js.native
  def cameraPosition(
    cameraFacing: front | back,
    onError: js.Function1[/* error */ js.UndefOr[Any], Unit],
    onSuccess: js.Function1[/* data */ Any, Unit]
  ): Unit = js.native
  def cameraPosition(cameraFacing: front | back, onError: Unit, onSuccess: js.Function1[/* data */ Any, Unit]): Unit = js.native
  
  def capture(data: Any): Unit = js.native
  
  def createFrame(image: HTMLImageElement, element: HTMLCanvasElement): Frame = js.native
  
  def createRenderer(element: HTMLCanvasElement, parent: CanvasCamera): Renderer = js.native
  
  def disableRenderers(): Unit = js.native
  
  def enableRenderers(): Unit = js.native
  
  def flashMode(flashMode: Boolean): Unit = js.native
  def flashMode(flashMode: Boolean, onError: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = js.native
  def flashMode(
    flashMode: Boolean,
    onError: js.Function1[/* error */ js.UndefOr[Any], Unit],
    onSuccess: js.Function1[/* data */ Any, Unit]
  ): Unit = js.native
  def flashMode(flashMode: Boolean, onError: Unit, onSuccess: js.Function1[/* data */ Any, Unit]): Unit = js.native
  
  def getUIOrientation(): portrait | landscape = js.native
  
  def getUISize(): Width = js.native
  
  def initialize(fcanvas: HTMLCanvasElement, tcanvas: HTMLCanvasElement): Unit = js.native
  
  def setRenderersSize(size: Width): CanvasCamera = js.native
  
  def setRenderingPresets(): CanvasCamera = js.native
  
  def start(options: CanvasCameraOptions): Unit = js.native
  def start(options: CanvasCameraOptions, onError: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = js.native
  def start(
    options: CanvasCameraOptions,
    onError: js.Function1[/* error */ js.UndefOr[Any], Unit],
    onSuccess: js.Function1[/* data */ Any, Unit]
  ): Unit = js.native
  def start(options: CanvasCameraOptions, onError: Unit, onSuccess: js.Function1[/* data */ Any, Unit]): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(onError: js.Function1[/* error */ js.UndefOr[Any], Unit]): Unit = js.native
  def stop(
    onError: js.Function1[/* error */ js.UndefOr[Any], Unit],
    onSuccess: js.Function1[/* data */ Any, Unit]
  ): Unit = js.native
  def stop(onError: Unit, onSuccess: js.Function1[/* data */ Any, Unit]): Unit = js.native
}
