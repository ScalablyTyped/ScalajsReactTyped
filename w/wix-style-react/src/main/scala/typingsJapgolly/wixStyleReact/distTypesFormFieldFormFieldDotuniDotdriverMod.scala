package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.LabelSize
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldFormFieldDotuniDotdriverMod {
  
  trait FormFieldUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getChildren(): js.Promise[HTMLElement | Null]
    
    def getInfoContent(): js.Promise[String]
    
    def getLabel(): js.Promise[HTMLElement | Null]
    
    def getLabelSize(): js.Promise[LabelSize]
    
    def getLengthLeft(): js.Promise[Double | Null]
    
    def getStatusMessage(): js.Promise[String]
    
    def getSuffix(): js.Promise[HTMLElement | Null]
    
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def hasTooltip(): js.Promise[Boolean]
    
    def hoverInfoIcon(): js.Promise[Unit]
    
    def isLengthExceeded(): js.Promise[Boolean]
    
    def isRequired(): js.Promise[Boolean]
  }
  object FormFieldUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getChildren: CallbackTo[js.Promise[HTMLElement | Null]],
      getInfoContent: CallbackTo[js.Promise[String]],
      getLabel: CallbackTo[js.Promise[HTMLElement | Null]],
      getLabelSize: CallbackTo[js.Promise[LabelSize]],
      getLengthLeft: CallbackTo[js.Promise[Double | Null]],
      getStatusMessage: CallbackTo[js.Promise[String]],
      getSuffix: CallbackTo[js.Promise[HTMLElement | Null]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      hasTooltip: CallbackTo[js.Promise[Boolean]],
      hoverInfoIcon: CallbackTo[js.Promise[Unit]],
      isLengthExceeded: CallbackTo[js.Promise[Boolean]],
      isRequired: CallbackTo[js.Promise[Boolean]]
    ): FormFieldUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getChildren = getChildren.toJsFn, getInfoContent = getInfoContent.toJsFn, getLabel = getLabel.toJsFn, getLabelSize = getLabelSize.toJsFn, getLengthLeft = getLengthLeft.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getSuffix = getSuffix.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), hasTooltip = hasTooltip.toJsFn, hoverInfoIcon = hoverInfoIcon.toJsFn, isLengthExceeded = isLengthExceeded.toJsFn, isRequired = isRequired.toJsFn)
      __obj.asInstanceOf[FormFieldUniDriver]
    }
    
    extension [Self <: FormFieldUniDriver](x: Self) {
      
      inline def setGetChildren(value: CallbackTo[js.Promise[HTMLElement | Null]]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetInfoContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getInfoContent", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[js.Promise[HTMLElement | Null]]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetLabelSize(value: CallbackTo[js.Promise[LabelSize]]): Self = StObject.set(x, "getLabelSize", value.toJsFn)
      
      inline def setGetLengthLeft(value: CallbackTo[js.Promise[Double | Null]]): Self = StObject.set(x, "getLengthLeft", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetSuffix(value: CallbackTo[js.Promise[HTMLElement | Null]]): Self = StObject.set(x, "getSuffix", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHasTooltip(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTooltip", value.toJsFn)
      
      inline def setHoverInfoIcon(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hoverInfoIcon", value.toJsFn)
      
      inline def setIsLengthExceeded(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLengthExceeded", value.toJsFn)
      
      inline def setIsRequired(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isRequired", value.toJsFn)
    }
  }
}
