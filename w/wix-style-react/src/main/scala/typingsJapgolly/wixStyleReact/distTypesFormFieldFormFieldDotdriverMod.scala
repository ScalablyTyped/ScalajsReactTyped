package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixStyleReact.distTypesFormFieldMod.LabelSize
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldFormFieldDotdriverMod {
  
  trait FormFieldDriver
    extends StObject
       with BaseDriver {
    
    def element(): HTMLElement
    
    def getChildren(): HTMLElement | Null
    
    def getInfoContent(): String
    
    def getLabel(): HTMLElement | Null
    
    def getLabelSize(): LabelSize
    
    def getLengthLeft(): Double | Null
    
    def getStatusMessage(): String
    
    def getSuffix(): HTMLElement | Null
    
    def hasStatus(status: StatusIndications): Boolean
    
    def hasTooltip(): Boolean
    
    def hoverInfoIcon(): js.Promise[Unit]
    
    def isLengthExceeded(): Boolean
    
    def isRequired(): Boolean
  }
  object FormFieldDriver {
    
    inline def apply(
      element: CallbackTo[HTMLElement],
      exists: CallbackTo[Boolean],
      getChildren: CallbackTo[HTMLElement | Null],
      getInfoContent: CallbackTo[String],
      getLabel: CallbackTo[HTMLElement | Null],
      getLabelSize: CallbackTo[LabelSize],
      getLengthLeft: CallbackTo[Double | Null],
      getStatusMessage: CallbackTo[String],
      getSuffix: CallbackTo[HTMLElement | Null],
      hasStatus: StatusIndications => Boolean,
      hasTooltip: CallbackTo[Boolean],
      hoverInfoIcon: CallbackTo[js.Promise[Unit]],
      isLengthExceeded: CallbackTo[Boolean],
      isRequired: CallbackTo[Boolean]
    ): FormFieldDriver = {
      val __obj = js.Dynamic.literal(element = element.toJsFn, exists = exists.toJsFn, getChildren = getChildren.toJsFn, getInfoContent = getInfoContent.toJsFn, getLabel = getLabel.toJsFn, getLabelSize = getLabelSize.toJsFn, getLengthLeft = getLengthLeft.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getSuffix = getSuffix.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), hasTooltip = hasTooltip.toJsFn, hoverInfoIcon = hoverInfoIcon.toJsFn, isLengthExceeded = isLengthExceeded.toJsFn, isRequired = isRequired.toJsFn)
      __obj.asInstanceOf[FormFieldDriver]
    }
    
    extension [Self <: FormFieldDriver](x: Self) {
      
      inline def setElement(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setGetChildren(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getChildren", value.toJsFn)
      
      inline def setGetInfoContent(value: CallbackTo[String]): Self = StObject.set(x, "getInfoContent", value.toJsFn)
      
      inline def setGetLabel(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getLabel", value.toJsFn)
      
      inline def setGetLabelSize(value: CallbackTo[LabelSize]): Self = StObject.set(x, "getLabelSize", value.toJsFn)
      
      inline def setGetLengthLeft(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getLengthLeft", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[String]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetSuffix(value: CallbackTo[HTMLElement | Null]): Self = StObject.set(x, "getSuffix", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => Boolean): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHasTooltip(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTooltip", value.toJsFn)
      
      inline def setHoverInfoIcon(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hoverInfoIcon", value.toJsFn)
      
      inline def setIsLengthExceeded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLengthExceeded", value.toJsFn)
      
      inline def setIsRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRequired", value.toJsFn)
    }
  }
}
