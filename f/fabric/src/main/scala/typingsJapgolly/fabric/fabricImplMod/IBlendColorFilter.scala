package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBlendColorFilter
  extends StObject
     with IBaseFilter {
  
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * Applies filter to canvas element
    * @param canvasEl Canvas element to apply filter to
    */
  def applyTo(canvasEl: HTMLCanvasElement): Unit = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[String] = js.native
}
