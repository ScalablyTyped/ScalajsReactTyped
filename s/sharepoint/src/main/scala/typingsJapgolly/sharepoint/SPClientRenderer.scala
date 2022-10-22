package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPClientRenderer extends StObject {
  
  var AddCallStackInfoToErrors: Boolean
  
  def AddPostRenderCallback(context: Any, callback: js.Function0[Unit]): Unit
  
  def CoreRender(): Unit
  
  var GlobalDebugMode: Boolean
  
  def IsDebugMode(): Boolean
  
  def ParseTemplateString(template: String): js.Function0[String]
  
  def ParseTemplateStringWorker(template: String): js.Function0[String]
  
  def Render(): Unit
  
  def RenderCore(): Unit
  
  var RenderErrors: Boolean
  
  def RenderReplace(): Unit
  
  def ReplaceUrlTokens(url: String): js.Function0[String]
  
  def _ExecuteRenderCallbacks(): Unit
  
  def _ExecuteRenderCallbacksWorker(): Unit
}
object SPClientRenderer {
  
  inline def apply(
    AddCallStackInfoToErrors: Boolean,
    AddPostRenderCallback: (Any, js.Function0[Unit]) => Callback,
    CoreRender: Callback,
    GlobalDebugMode: Boolean,
    IsDebugMode: CallbackTo[Boolean],
    ParseTemplateString: String => js.Function0[String],
    ParseTemplateStringWorker: String => js.Function0[String],
    Render: Callback,
    RenderCore: Callback,
    RenderErrors: Boolean,
    RenderReplace: Callback,
    ReplaceUrlTokens: String => js.Function0[String],
    _ExecuteRenderCallbacks: Callback,
    _ExecuteRenderCallbacksWorker: Callback
  ): SPClientRenderer = {
    val __obj = js.Dynamic.literal(AddCallStackInfoToErrors = AddCallStackInfoToErrors.asInstanceOf[js.Any], AddPostRenderCallback = js.Any.fromFunction2((t0: Any, t1: js.Function0[Unit]) => (AddPostRenderCallback(t0, t1)).runNow()), CoreRender = CoreRender.toJsFn, GlobalDebugMode = GlobalDebugMode.asInstanceOf[js.Any], IsDebugMode = IsDebugMode.toJsFn, ParseTemplateString = js.Any.fromFunction1(ParseTemplateString), ParseTemplateStringWorker = js.Any.fromFunction1(ParseTemplateStringWorker), Render = Render.toJsFn, RenderCore = RenderCore.toJsFn, RenderErrors = RenderErrors.asInstanceOf[js.Any], RenderReplace = RenderReplace.toJsFn, ReplaceUrlTokens = js.Any.fromFunction1(ReplaceUrlTokens), _ExecuteRenderCallbacks = _ExecuteRenderCallbacks.toJsFn, _ExecuteRenderCallbacksWorker = _ExecuteRenderCallbacksWorker.toJsFn)
    __obj.asInstanceOf[SPClientRenderer]
  }
  
  extension [Self <: SPClientRenderer](x: Self) {
    
    inline def setAddCallStackInfoToErrors(value: Boolean): Self = StObject.set(x, "AddCallStackInfoToErrors", value.asInstanceOf[js.Any])
    
    inline def setAddPostRenderCallback(value: (Any, js.Function0[Unit]) => Callback): Self = StObject.set(x, "AddPostRenderCallback", js.Any.fromFunction2((t0: Any, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setCoreRender(value: Callback): Self = StObject.set(x, "CoreRender", value.toJsFn)
    
    inline def setGlobalDebugMode(value: Boolean): Self = StObject.set(x, "GlobalDebugMode", value.asInstanceOf[js.Any])
    
    inline def setIsDebugMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsDebugMode", value.toJsFn)
    
    inline def setParseTemplateString(value: String => js.Function0[String]): Self = StObject.set(x, "ParseTemplateString", js.Any.fromFunction1(value))
    
    inline def setParseTemplateStringWorker(value: String => js.Function0[String]): Self = StObject.set(x, "ParseTemplateStringWorker", js.Any.fromFunction1(value))
    
    inline def setRender(value: Callback): Self = StObject.set(x, "Render", value.toJsFn)
    
    inline def setRenderCore(value: Callback): Self = StObject.set(x, "RenderCore", value.toJsFn)
    
    inline def setRenderErrors(value: Boolean): Self = StObject.set(x, "RenderErrors", value.asInstanceOf[js.Any])
    
    inline def setRenderReplace(value: Callback): Self = StObject.set(x, "RenderReplace", value.toJsFn)
    
    inline def setReplaceUrlTokens(value: String => js.Function0[String]): Self = StObject.set(x, "ReplaceUrlTokens", js.Any.fromFunction1(value))
    
    inline def set_ExecuteRenderCallbacks(value: Callback): Self = StObject.set(x, "_ExecuteRenderCallbacks", value.toJsFn)
    
    inline def set_ExecuteRenderCallbacksWorker(value: Callback): Self = StObject.set(x, "_ExecuteRenderCallbacksWorker", value.toJsFn)
  }
}
