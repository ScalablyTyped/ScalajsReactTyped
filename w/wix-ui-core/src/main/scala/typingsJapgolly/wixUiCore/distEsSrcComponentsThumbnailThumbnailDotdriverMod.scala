package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.DriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsThumbnailThumbnailDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/thumbnail/Thumbnail.driver", "thumbnailDriverFactory")
  @js.native
  val thumbnailDriverFactory: DriverFactory[ThumbnailDriver] = js.native
  
  trait ThumbnailDriver
    extends StObject
       with BaseDriver {
    
    def click(): Unit
    
    def getContent(): HTMLElement
    
    def getSelectedIcon(): HTMLElement
    
    def hasSelectedIcon(): Boolean
    
    def isDisabled(): Boolean
    
    def isSelected(): Boolean
  }
  object ThumbnailDriver {
    
    inline def apply(
      click: Callback,
      exists: CallbackTo[Boolean],
      getContent: CallbackTo[HTMLElement],
      getSelectedIcon: CallbackTo[HTMLElement],
      hasSelectedIcon: CallbackTo[Boolean],
      isDisabled: CallbackTo[Boolean],
      isSelected: CallbackTo[Boolean]
    ): ThumbnailDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, exists = exists.toJsFn, getContent = getContent.toJsFn, getSelectedIcon = getSelectedIcon.toJsFn, hasSelectedIcon = hasSelectedIcon.toJsFn, isDisabled = isDisabled.toJsFn, isSelected = isSelected.toJsFn)
      __obj.asInstanceOf[ThumbnailDriver]
    }
    
    extension [Self <: ThumbnailDriver](x: Self) {
      
      inline def setClick(value: Callback): Self = StObject.set(x, "click", value.toJsFn)
      
      inline def setGetContent(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContent", value.toJsFn)
      
      inline def setGetSelectedIcon(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getSelectedIcon", value.toJsFn)
      
      inline def setHasSelectedIcon(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSelectedIcon", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSelected", value.toJsFn)
    }
  }
}
