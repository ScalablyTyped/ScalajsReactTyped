package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLabelledElementLabelledElementDotuniDotdriverMod {
  
  trait LabelledElementUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildrenDriver(): BaseUniDriver
    
    def getLabelForAttribute(): js.Promise[String]
    
    def getLabelText(): js.Promise[String]
    
    def isLabelAtTop(): js.Promise[Boolean]
  }
  object LabelledElementUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getChildrenDriver: CallbackTo[BaseUniDriver],
      getLabelForAttribute: CallbackTo[js.Promise[String]],
      getLabelText: CallbackTo[js.Promise[String]],
      isLabelAtTop: CallbackTo[js.Promise[Boolean]]
    ): LabelledElementUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getChildrenDriver = getChildrenDriver.toJsFn, getLabelForAttribute = getLabelForAttribute.toJsFn, getLabelText = getLabelText.toJsFn, isLabelAtTop = isLabelAtTop.toJsFn)
      __obj.asInstanceOf[LabelledElementUniDriver]
    }
    
    extension [Self <: LabelledElementUniDriver](x: Self) {
      
      inline def setGetChildrenDriver(value: CallbackTo[BaseUniDriver]): Self = StObject.set(x, "getChildrenDriver", value.toJsFn)
      
      inline def setGetLabelForAttribute(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelForAttribute", value.toJsFn)
      
      inline def setGetLabelText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getLabelText", value.toJsFn)
      
      inline def setIsLabelAtTop(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLabelAtTop", value.toJsFn)
    }
  }
}
