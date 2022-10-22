package typingsJapgolly.styledComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistModelsServerStyleSheetMod {
  
  @JSImport("styled-components/native/dist/models/ServerStyleSheet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ServerStyleSheet {
    
    /* CompleteClass */
    override def _emitSheetCSS(): String = js.native
    
    /* CompleteClass */
    override def collectStyles(children: Any): Element = js.native
    
    /* CompleteClass */
    override def getStyleElement(): js.Array[Element] = js.native
    
    /* CompleteClass */
    override def getStyleTags(): String = js.native
    
    /* CompleteClass */
    var instance: typingsJapgolly.styledComponents.nativeDistSheetMod.default = js.native
    
    /* CompleteClass */
    override def interleaveWithNodeStream(input: Readable): Transform = js.native
    
    /* CompleteClass */
    override def seal(): Unit = js.native
    
    /* CompleteClass */
    var `sealed`: Boolean = js.native
  }
  
  trait ServerStyleSheet extends StObject {
    
    def _emitSheetCSS(): String
    
    def collectStyles(children: Any): Element
    
    def getStyleElement(): js.Array[Element]
    
    def getStyleTags(): String
    
    var instance: typingsJapgolly.styledComponents.nativeDistSheetMod.default
    
    def interleaveWithNodeStream(input: Readable): Transform
    
    def seal(): Unit
    
    var `sealed`: Boolean
  }
  object ServerStyleSheet {
    
    inline def apply(
      _emitSheetCSS: CallbackTo[String],
      collectStyles: Any => Element,
      getStyleElement: CallbackTo[js.Array[Element]],
      getStyleTags: CallbackTo[String],
      instance: typingsJapgolly.styledComponents.nativeDistSheetMod.default,
      interleaveWithNodeStream: Readable => Transform,
      seal: Callback,
      `sealed`: Boolean
    ): ServerStyleSheet = {
      val __obj = js.Dynamic.literal(_emitSheetCSS = _emitSheetCSS.toJsFn, collectStyles = js.Any.fromFunction1(collectStyles), getStyleElement = getStyleElement.toJsFn, getStyleTags = getStyleTags.toJsFn, instance = instance.asInstanceOf[js.Any], interleaveWithNodeStream = js.Any.fromFunction1(interleaveWithNodeStream), seal = seal.toJsFn)
      __obj.updateDynamic("sealed")(`sealed`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStyleSheet]
    }
    
    extension [Self <: ServerStyleSheet](x: Self) {
      
      inline def setCollectStyles(value: Any => Element): Self = StObject.set(x, "collectStyles", js.Any.fromFunction1(value))
      
      inline def setGetStyleElement(value: CallbackTo[js.Array[Element]]): Self = StObject.set(x, "getStyleElement", value.toJsFn)
      
      inline def setGetStyleTags(value: CallbackTo[String]): Self = StObject.set(x, "getStyleTags", value.toJsFn)
      
      inline def setInstance(value: typingsJapgolly.styledComponents.nativeDistSheetMod.default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInterleaveWithNodeStream(value: Readable => Transform): Self = StObject.set(x, "interleaveWithNodeStream", js.Any.fromFunction1(value))
      
      inline def setSeal(value: Callback): Self = StObject.set(x, "seal", value.toJsFn)
      
      inline def setSealed(value: Boolean): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
      
      inline def set_emitSheetCSS(value: CallbackTo[String]): Self = StObject.set(x, "_emitSheetCSS", value.toJsFn)
    }
  }
}
