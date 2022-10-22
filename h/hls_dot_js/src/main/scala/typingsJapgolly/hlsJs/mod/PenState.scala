package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hlsJs.anon.PartialPenStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PenState extends StObject {
  
  var background: String
  
  def copy(newPenState: PenState): Unit
  
  def equals(other: PenState): Boolean
  
  var flash: Boolean
  
  var foreground: String
  
  def isDefault(): Boolean
  
  var italics: Boolean
  
  def reset(): Unit
  
  def setStyles(styles: PartialPenStyles): Unit
  
  var underline: Boolean
}
object PenState {
  
  inline def apply(
    background: String,
    copy: PenState => Callback,
    equals_ : PenState => Boolean,
    flash: Boolean,
    foreground: String,
    isDefault: CallbackTo[Boolean],
    italics: Boolean,
    reset: Callback,
    setStyles: PartialPenStyles => Callback,
    underline: Boolean
  ): PenState = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], copy = js.Any.fromFunction1((t0: PenState) => copy(t0).runNow()), flash = flash.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], isDefault = isDefault.toJsFn, italics = italics.asInstanceOf[js.Any], reset = reset.toJsFn, setStyles = js.Any.fromFunction1((t0: PartialPenStyles) => setStyles(t0).runNow()), underline = underline.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[PenState]
  }
  
  extension [Self <: PenState](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: PenState => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction1((t0: PenState) => value(t0).runNow()))
    
    inline def setEquals_(value: PenState => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setFlash(value: Boolean): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
    
    inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefault", value.toJsFn)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setSetStyles(value: PartialPenStyles => Callback): Self = StObject.set(x, "setStyles", js.Any.fromFunction1((t0: PartialPenStyles) => value(t0).runNow()))
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
