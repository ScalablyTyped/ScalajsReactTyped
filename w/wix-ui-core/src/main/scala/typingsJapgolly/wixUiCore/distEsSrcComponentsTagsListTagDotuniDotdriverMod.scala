package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTagsListTagDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/tags-list/Tag.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeTagUniDriver(base: UniDriver[Any]): TagUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagUniDriver")(base.asInstanceOf[js.Any]).asInstanceOf[TagUniDriver]
  
  trait TagUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getInput(): UniDriver[Any]
    
    def getText(): js.Promise[String]
    
    def getValue(): js.Promise[String]
    
    def isChecked(): js.Promise[Boolean]
    
    def simulateClick(): js.Promise[Unit]
  }
  object TagUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getInput: CallbackTo[UniDriver[Any]],
      getText: CallbackTo[js.Promise[String]],
      getValue: CallbackTo[js.Promise[String]],
      isChecked: CallbackTo[js.Promise[Boolean]],
      simulateClick: CallbackTo[js.Promise[Unit]]
    ): TagUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getInput = getInput.toJsFn, getText = getText.toJsFn, getValue = getValue.toJsFn, isChecked = isChecked.toJsFn, simulateClick = simulateClick.toJsFn)
      __obj.asInstanceOf[TagUniDriver]
    }
    
    extension [Self <: TagUniDriver](x: Self) {
      
      inline def setGetInput(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getInput", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setIsChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isChecked", value.toJsFn)
      
      inline def setSimulateClick(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "simulateClick", value.toJsFn)
    }
  }
}
