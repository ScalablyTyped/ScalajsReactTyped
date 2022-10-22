package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageViewerImageViewerDotdriverMod {
  
  trait ImageViewerDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickAdd(): Unit
    
    def clickDownload(): Unit
    
    def clickRemove(): Unit
    
    def clickUpdate(): Unit
    
    def downloadButtonExists(): Boolean
    
    def element(): T
    
    def getAddTooltipContent(): String
    
    def getContainerStyles(): String | Null
    
    def getDownloadTooltipContent(): String
    
    def getElement(): T
    
    def getImageUrl(): String | Null
    
    def getMoreTooltipContent(): String
    
    def getPreviousImageUrl(): String | Null
    
    def getRemoveTooltipContent(): String
    
    def getStatusMessage(): String | Null
    
    def getUpdateTooltipContent(): String
    
    // Status
    def hasStatus(status: StatusIndications): Boolean
    
    def hover(): Unit
    
    def isAddItemVisible(): Boolean
    
    def isDisabled(): Boolean
    
    def isImageLoaded(): Boolean
    
    def isImageVisible(): Boolean
    
    def isLoaderVisible(): Boolean
    
    def isPreviousImageVisible(): Boolean
    
    def moreButtonExists(): Boolean
    
    def removeButtonExists(): Boolean
    
    def updateButtonExists(): Boolean
    
    def updateExists(): Boolean
  }
  object ImageViewerDriver {
    
    inline def apply[T](
      clickAdd: Callback,
      clickDownload: Callback,
      clickRemove: Callback,
      clickUpdate: Callback,
      downloadButtonExists: CallbackTo[Boolean],
      element: CallbackTo[T],
      exists: CallbackTo[Boolean],
      getAddTooltipContent: CallbackTo[String],
      getContainerStyles: CallbackTo[String | Null],
      getDownloadTooltipContent: CallbackTo[String],
      getElement: CallbackTo[T],
      getImageUrl: CallbackTo[String | Null],
      getMoreTooltipContent: CallbackTo[String],
      getPreviousImageUrl: CallbackTo[String | Null],
      getRemoveTooltipContent: CallbackTo[String],
      getStatusMessage: CallbackTo[String | Null],
      getUpdateTooltipContent: CallbackTo[String],
      hasStatus: StatusIndications => Boolean,
      hover: Callback,
      isAddItemVisible: CallbackTo[Boolean],
      isDisabled: CallbackTo[Boolean],
      isImageLoaded: CallbackTo[Boolean],
      isImageVisible: CallbackTo[Boolean],
      isLoaderVisible: CallbackTo[Boolean],
      isPreviousImageVisible: CallbackTo[Boolean],
      moreButtonExists: CallbackTo[Boolean],
      removeButtonExists: CallbackTo[Boolean],
      updateButtonExists: CallbackTo[Boolean],
      updateExists: CallbackTo[Boolean]
    ): ImageViewerDriver[T] = {
      val __obj = js.Dynamic.literal(clickAdd = clickAdd.toJsFn, clickDownload = clickDownload.toJsFn, clickRemove = clickRemove.toJsFn, clickUpdate = clickUpdate.toJsFn, downloadButtonExists = downloadButtonExists.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAddTooltipContent = getAddTooltipContent.toJsFn, getContainerStyles = getContainerStyles.toJsFn, getDownloadTooltipContent = getDownloadTooltipContent.toJsFn, getElement = getElement.toJsFn, getImageUrl = getImageUrl.toJsFn, getMoreTooltipContent = getMoreTooltipContent.toJsFn, getPreviousImageUrl = getPreviousImageUrl.toJsFn, getRemoveTooltipContent = getRemoveTooltipContent.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getUpdateTooltipContent = getUpdateTooltipContent.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), hover = hover.toJsFn, isAddItemVisible = isAddItemVisible.toJsFn, isDisabled = isDisabled.toJsFn, isImageLoaded = isImageLoaded.toJsFn, isImageVisible = isImageVisible.toJsFn, isLoaderVisible = isLoaderVisible.toJsFn, isPreviousImageVisible = isPreviousImageVisible.toJsFn, moreButtonExists = moreButtonExists.toJsFn, removeButtonExists = removeButtonExists.toJsFn, updateButtonExists = updateButtonExists.toJsFn, updateExists = updateExists.toJsFn)
      __obj.asInstanceOf[ImageViewerDriver[T]]
    }
    
    extension [Self <: ImageViewerDriver[?], T](x: Self & ImageViewerDriver[T]) {
      
      inline def setClickAdd(value: Callback): Self = StObject.set(x, "clickAdd", value.toJsFn)
      
      inline def setClickDownload(value: Callback): Self = StObject.set(x, "clickDownload", value.toJsFn)
      
      inline def setClickRemove(value: Callback): Self = StObject.set(x, "clickRemove", value.toJsFn)
      
      inline def setClickUpdate(value: Callback): Self = StObject.set(x, "clickUpdate", value.toJsFn)
      
      inline def setDownloadButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "downloadButtonExists", value.toJsFn)
      
      inline def setElement(value: CallbackTo[T]): Self = StObject.set(x, "element", value.toJsFn)
      
      inline def setGetAddTooltipContent(value: CallbackTo[String]): Self = StObject.set(x, "getAddTooltipContent", value.toJsFn)
      
      inline def setGetContainerStyles(value: CallbackTo[String | Null]): Self = StObject.set(x, "getContainerStyles", value.toJsFn)
      
      inline def setGetDownloadTooltipContent(value: CallbackTo[String]): Self = StObject.set(x, "getDownloadTooltipContent", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[T]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setGetImageUrl(value: CallbackTo[String | Null]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
      
      inline def setGetMoreTooltipContent(value: CallbackTo[String]): Self = StObject.set(x, "getMoreTooltipContent", value.toJsFn)
      
      inline def setGetPreviousImageUrl(value: CallbackTo[String | Null]): Self = StObject.set(x, "getPreviousImageUrl", value.toJsFn)
      
      inline def setGetRemoveTooltipContent(value: CallbackTo[String]): Self = StObject.set(x, "getRemoveTooltipContent", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[String | Null]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetUpdateTooltipContent(value: CallbackTo[String]): Self = StObject.set(x, "getUpdateTooltipContent", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => Boolean): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHover(value: Callback): Self = StObject.set(x, "hover", value.toJsFn)
      
      inline def setIsAddItemVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAddItemVisible", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsImageLoaded(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageLoaded", value.toJsFn)
      
      inline def setIsImageVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImageVisible", value.toJsFn)
      
      inline def setIsLoaderVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoaderVisible", value.toJsFn)
      
      inline def setIsPreviousImageVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPreviousImageVisible", value.toJsFn)
      
      inline def setMoreButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "moreButtonExists", value.toJsFn)
      
      inline def setRemoveButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "removeButtonExists", value.toJsFn)
      
      inline def setUpdateButtonExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "updateButtonExists", value.toJsFn)
      
      inline def setUpdateExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "updateExists", value.toJsFn)
    }
  }
}
