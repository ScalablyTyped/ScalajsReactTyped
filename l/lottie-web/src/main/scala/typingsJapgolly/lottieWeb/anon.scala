package typingsJapgolly.lottieWeb

import japgolly.scalajs.react.Callback
import typingsJapgolly.lottieWeb.mod.CanvasRendererConfig
import typingsJapgolly.lottieWeb.mod.HTMLRendererConfig
import typingsJapgolly.lottieWeb.mod.SVGRendererConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Canvas extends StObject {
    
    var canvas: CanvasRendererConfig
    
    var html: HTMLRendererConfig
    
    var svg: SVGRendererConfig
  }
  object Canvas {
    
    inline def apply(canvas: CanvasRendererConfig, html: HTMLRendererConfig, svg: SVGRendererConfig): Canvas = {
      val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Canvas]
    }
    
    extension [Self <: Canvas](x: Self) {
      
      inline def setCanvas(value: CanvasRendererConfig): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: HTMLRendererConfig): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: SVGRendererConfig): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Play extends StObject {
    
    def play(): Unit
    
    def playing(): Unit
    
    def rate(): Unit
    
    def seek(): Unit
    
    def setVolume(): Unit
  }
  object Play {
    
    inline def apply(play: Callback, playing: Callback, rate: Callback, seek: Callback, setVolume: Callback): Play = {
      val __obj = js.Dynamic.literal(play = play.toJsFn, playing = playing.toJsFn, rate = rate.toJsFn, seek = seek.toJsFn, setVolume = setVolume.toJsFn)
      __obj.asInstanceOf[Play]
    }
    
    extension [Self <: Play](x: Self) {
      
      inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
      
      inline def setPlaying(value: Callback): Self = StObject.set(x, "playing", value.toJsFn)
      
      inline def setRate(value: Callback): Self = StObject.set(x, "rate", value.toJsFn)
      
      inline def setSeek(value: Callback): Self = StObject.set(x, "seek", value.toJsFn)
      
      inline def setSetVolume(value: Callback): Self = StObject.set(x, "setVolume", value.toJsFn)
    }
  }
}
