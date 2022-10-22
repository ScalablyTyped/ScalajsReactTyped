package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterBackend_ extends StObject {
  
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement
  ): Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLCanvasElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement,
    cacheKey: String
  ): Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement
  ): Any = js.native
  def applyFilters(
    filters: js.Array[IBaseFilter],
    sourceElement: HTMLImageElement,
    sourceWidth: Double,
    sourceHeight: Double,
    targetCanvas: HTMLCanvasElement,
    cacheKey: String
  ): Any = js.native
  
  def clearWebGLCaches(): Unit = js.native
  
  def dispose(): Unit = js.native
  
  def evictCachesForKey(cacheKey: String): Unit = js.native
  
  var resources: Resources = js.native
}
