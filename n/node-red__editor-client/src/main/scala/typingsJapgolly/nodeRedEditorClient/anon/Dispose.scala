package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.nodeRedEditorClient.mod.global.JQuery
import typingsJapgolly.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typingsJapgolly.nodeRedEditorClient.nodeRedEditorClientStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dispose extends StObject {
  
  var align: js.UndefOr[right | left] = js.undefined
  
  var dispose: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  def onclose(): Unit
  
  var target: JQuery[HTMLElement]
}
object Dispose {
  
  inline def apply(onclose: Callback, target: JQuery[HTMLElement]): Dispose = {
    val __obj = js.Dynamic.literal(onclose = onclose.toJsFn, target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dispose]
  }
  
  extension [Self <: Dispose](x: Self) {
    
    inline def setAlign(value: right | left): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDispose(value: Boolean): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnclose(value: Callback): Self = StObject.set(x, "onclose", value.toJsFn)
    
    inline def setTarget(value: JQuery[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
