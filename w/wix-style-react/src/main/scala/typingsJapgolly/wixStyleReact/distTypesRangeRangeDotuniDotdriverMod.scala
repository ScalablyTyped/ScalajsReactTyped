package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRangeRangeDotuniDotdriverMod {
  
  trait RangeUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickFirstInput(): js.Promise[Unit]
    
    def clickLastInput(): js.Promise[Unit]
    
    def getInput(): js.Promise[HTMLElement]
    
    def getLabel(): js.Promise[HTMLElement]
    
    def hasInput(): js.Promise[Boolean]
    
    def hasLabel(): js.Promise[Boolean]
  }
  object RangeUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickFirstInput: CallbackTo[js.Promise[Unit]],
      clickLastInput: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getInput: CallbackTo[js.Promise[HTMLElement]],
      getLabel: CallbackTo[js.Promise[HTMLElement]],
      hasInput: CallbackTo[js.Promise[Boolean]],
      hasLabel: CallbackTo[js.Promise[Boolean]]
    ): RangeUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickFirstInput = clickFirstInput.toJsFn, clickLastInput = clickLastInput.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getInput = getInput.toJsFn, getLabel = getLabel.toJsFn, hasInput = hasInput.toJsFn, hasLabel = hasLabel.toJsFn)
      __obj.asInstanceOf[RangeUniDriver]
    }
    
    extension [Self <: RangeUniDriver](x: Self) {
      
      inline def setClickFirstInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickFirstInput", value.toJsFn)
      
      inline def setClickLastInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickLastInput", value.toJsFn)
      
      inline def setGetInput(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getInput", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setHasInput(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasInput", value.toJsFn)
      
      inline def setHasLabel(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasLabel", value.toJsFn)
    }
  }
}
