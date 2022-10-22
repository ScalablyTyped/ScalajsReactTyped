package typingsJapgolly.vexflow.Vex.Flow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vexflow.anon.Extraleftpx
import typingsJapgolly.vexflow.anon.Leftshift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifierContext extends StObject {
  
  def addModifier(modifier: Modifier): ModifierContext
  
  def getExtraLeftPx(): Double
  
  def getExtraRightPx(): Double
  
  def getMetrics(): Extraleftpx
  
  def getModifiers(`type`: String): js.Array[Modifier]
  
  def getState(): Leftshift
  
  def getWidth(): Double
  
  def postFormat(): Unit
  
  def preFormat(): Unit
}
object ModifierContext {
  
  inline def apply(
    addModifier: Modifier => ModifierContext,
    getExtraLeftPx: CallbackTo[Double],
    getExtraRightPx: CallbackTo[Double],
    getMetrics: CallbackTo[Extraleftpx],
    getModifiers: String => js.Array[Modifier],
    getState: CallbackTo[Leftshift],
    getWidth: CallbackTo[Double],
    postFormat: Callback,
    preFormat: Callback
  ): ModifierContext = {
    val __obj = js.Dynamic.literal(addModifier = js.Any.fromFunction1(addModifier), getExtraLeftPx = getExtraLeftPx.toJsFn, getExtraRightPx = getExtraRightPx.toJsFn, getMetrics = getMetrics.toJsFn, getModifiers = js.Any.fromFunction1(getModifiers), getState = getState.toJsFn, getWidth = getWidth.toJsFn, postFormat = postFormat.toJsFn, preFormat = preFormat.toJsFn)
    __obj.asInstanceOf[ModifierContext]
  }
  
  extension [Self <: ModifierContext](x: Self) {
    
    inline def setAddModifier(value: Modifier => ModifierContext): Self = StObject.set(x, "addModifier", js.Any.fromFunction1(value))
    
    inline def setGetExtraLeftPx(value: CallbackTo[Double]): Self = StObject.set(x, "getExtraLeftPx", value.toJsFn)
    
    inline def setGetExtraRightPx(value: CallbackTo[Double]): Self = StObject.set(x, "getExtraRightPx", value.toJsFn)
    
    inline def setGetMetrics(value: CallbackTo[Extraleftpx]): Self = StObject.set(x, "getMetrics", value.toJsFn)
    
    inline def setGetModifiers(value: String => js.Array[Modifier]): Self = StObject.set(x, "getModifiers", js.Any.fromFunction1(value))
    
    inline def setGetState(value: CallbackTo[Leftshift]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setPostFormat(value: Callback): Self = StObject.set(x, "postFormat", value.toJsFn)
    
    inline def setPreFormat(value: Callback): Self = StObject.set(x, "preFormat", value.toJsFn)
  }
}
