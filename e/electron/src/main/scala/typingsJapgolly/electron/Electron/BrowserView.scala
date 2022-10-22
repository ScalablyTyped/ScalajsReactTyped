package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserView extends StObject {
  
  /**
    * The `bounds` of this BrowserView instance as `Object`.
    *
    * @experimental
    */
  def getBounds(): Rectangle
  
  def setAutoResize(options: AutoResizeOptions): Unit
  
  /**
    * Examples of valid `color` values:
    *
    * * Hex
    *   * #fff (RGB)
    *   * #ffff (ARGB)
    *   * #ffffff (RRGGBB)
    *   * #ffffffff (AARRGGBB)
    * * RGB
    *   * rgb(([\d]+),\s*([\d]+),\s*([\d]+))
    *     * e.g. rgb(255, 255, 255)
    * * RGBA
    *   * rgba(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+))
    *     * e.g. rgba(255, 255, 255, 1.0)
    * * HSL
    *   * hsl((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%)
    *     * e.g. hsl(200, 20%, 50%)
    * * HSLA
    *   * hsla((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+))
    *     * e.g. hsla(200, 20%, 50%, 0.5)
    * * Color name
    *   * Options are listed in SkParseColor.cpp
    *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
    *     * e.g. `blueviolet` or `red`
    *
    * **Note:** Hex format with alpha takes `AARRGGBB` or `ARGB`, _not_ `RRGGBBA` or
    * `RGA`.
    *
    * @experimental
    */
  def setBackgroundColor(color: String): Unit
  
  /**
    * Resizes and moves the view to the supplied bounds relative to the window.
    *
    * @experimental
    */
  def setBounds(bounds: Rectangle): Unit
  
  /**
    * A `WebContents` object owned by this view.
    *
    * @experimental
    */
  var webContents: WebContents_
}
object BrowserView {
  
  inline def apply(
    getBounds: CallbackTo[Rectangle],
    setAutoResize: AutoResizeOptions => Callback,
    setBackgroundColor: String => Callback,
    setBounds: Rectangle => Callback,
    webContents: WebContents_
  ): BrowserView = {
    val __obj = js.Dynamic.literal(getBounds = getBounds.toJsFn, setAutoResize = js.Any.fromFunction1((t0: AutoResizeOptions) => setAutoResize(t0).runNow()), setBackgroundColor = js.Any.fromFunction1((t0: String) => setBackgroundColor(t0).runNow()), setBounds = js.Any.fromFunction1((t0: Rectangle) => setBounds(t0).runNow()), webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserView]
  }
  
  extension [Self <: BrowserView](x: Self) {
    
    inline def setGetBounds(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setSetAutoResize(value: AutoResizeOptions => Callback): Self = StObject.set(x, "setAutoResize", js.Any.fromFunction1((t0: AutoResizeOptions) => value(t0).runNow()))
    
    inline def setSetBackgroundColor(value: String => Callback): Self = StObject.set(x, "setBackgroundColor", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetBounds(value: Rectangle => Callback): Self = StObject.set(x, "setBounds", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setWebContents(value: WebContents_): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
  }
}
