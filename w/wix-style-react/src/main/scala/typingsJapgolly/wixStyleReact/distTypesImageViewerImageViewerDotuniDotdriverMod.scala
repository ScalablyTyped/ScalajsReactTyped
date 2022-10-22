package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCommonMod.StatusIndications
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageViewerImageViewerDotuniDotdriverMod {
  
  trait ImageViewerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickAdd(): js.Promise[Unit]
    
    def clickDownload(): js.Promise[Unit]
    
    def clickRemove(): js.Promise[Unit]
    
    def clickUpdate(): js.Promise[Unit]
    
    def downloadButtonExists(): js.Promise[Boolean]
    
    def getAddTooltipContent(): js.Promise[String]
    
    def getContainerStyles(): js.Promise[String | Null]
    
    def getDownloadTooltipContent(): js.Promise[String]
    
    def getImageUrl(): js.Promise[String | Null]
    
    def getMoreTooltipContent(): js.Promise[String]
    
    def getPreviousImageUrl(): js.Promise[String | Null]
    
    def getRemoveTooltipContent(): js.Promise[String]
    
    def getStatusMessage(): js.Promise[String | Null]
    
    def getUpdateTooltipContent(): js.Promise[String]
    
    // Status
    def hasStatus(status: StatusIndications): js.Promise[Boolean]
    
    def hover(): js.Promise[Unit]
    
    def isAddItemVisible(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isImageLoaded(): js.Promise[Boolean]
    
    var isImageVisible: js.Promise[Boolean]
    
    def isLoaderVisible(): js.Promise[Boolean]
    
    def isPreviousImageVisible(): js.Promise[Boolean]
    
    def moreButtonExists(): js.Promise[Boolean]
    
    def removeButtonExists(): js.Promise[Boolean]
    
    def updateButtonExists(): js.Promise[Boolean]
    
    def updateExists(): js.Promise[Boolean]
  }
  object ImageViewerUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickAdd: CallbackTo[js.Promise[Unit]],
      clickDownload: CallbackTo[js.Promise[Unit]],
      clickRemove: CallbackTo[js.Promise[Unit]],
      clickUpdate: CallbackTo[js.Promise[Unit]],
      downloadButtonExists: CallbackTo[js.Promise[Boolean]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getAddTooltipContent: CallbackTo[js.Promise[String]],
      getContainerStyles: CallbackTo[js.Promise[String | Null]],
      getDownloadTooltipContent: CallbackTo[js.Promise[String]],
      getImageUrl: CallbackTo[js.Promise[String | Null]],
      getMoreTooltipContent: CallbackTo[js.Promise[String]],
      getPreviousImageUrl: CallbackTo[js.Promise[String | Null]],
      getRemoveTooltipContent: CallbackTo[js.Promise[String]],
      getStatusMessage: CallbackTo[js.Promise[String | Null]],
      getUpdateTooltipContent: CallbackTo[js.Promise[String]],
      hasStatus: StatusIndications => js.Promise[Boolean],
      hover: CallbackTo[js.Promise[Unit]],
      isAddItemVisible: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isImageLoaded: CallbackTo[js.Promise[Boolean]],
      isImageVisible: js.Promise[Boolean],
      isLoaderVisible: CallbackTo[js.Promise[Boolean]],
      isPreviousImageVisible: CallbackTo[js.Promise[Boolean]],
      moreButtonExists: CallbackTo[js.Promise[Boolean]],
      removeButtonExists: CallbackTo[js.Promise[Boolean]],
      updateButtonExists: CallbackTo[js.Promise[Boolean]],
      updateExists: CallbackTo[js.Promise[Boolean]]
    ): ImageViewerUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickAdd = clickAdd.toJsFn, clickDownload = clickDownload.toJsFn, clickRemove = clickRemove.toJsFn, clickUpdate = clickUpdate.toJsFn, downloadButtonExists = downloadButtonExists.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getAddTooltipContent = getAddTooltipContent.toJsFn, getContainerStyles = getContainerStyles.toJsFn, getDownloadTooltipContent = getDownloadTooltipContent.toJsFn, getImageUrl = getImageUrl.toJsFn, getMoreTooltipContent = getMoreTooltipContent.toJsFn, getPreviousImageUrl = getPreviousImageUrl.toJsFn, getRemoveTooltipContent = getRemoveTooltipContent.toJsFn, getStatusMessage = getStatusMessage.toJsFn, getUpdateTooltipContent = getUpdateTooltipContent.toJsFn, hasStatus = js.Any.fromFunction1(hasStatus), hover = hover.toJsFn, isAddItemVisible = isAddItemVisible.toJsFn, isDisabled = isDisabled.toJsFn, isImageLoaded = isImageLoaded.toJsFn, isImageVisible = isImageVisible.asInstanceOf[js.Any], isLoaderVisible = isLoaderVisible.toJsFn, isPreviousImageVisible = isPreviousImageVisible.toJsFn, moreButtonExists = moreButtonExists.toJsFn, removeButtonExists = removeButtonExists.toJsFn, updateButtonExists = updateButtonExists.toJsFn, updateExists = updateExists.toJsFn)
      __obj.asInstanceOf[ImageViewerUniDriver]
    }
    
    extension [Self <: ImageViewerUniDriver](x: Self) {
      
      inline def setClickAdd(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickAdd", value.toJsFn)
      
      inline def setClickDownload(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickDownload", value.toJsFn)
      
      inline def setClickRemove(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickRemove", value.toJsFn)
      
      inline def setClickUpdate(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickUpdate", value.toJsFn)
      
      inline def setDownloadButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "downloadButtonExists", value.toJsFn)
      
      inline def setGetAddTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getAddTooltipContent", value.toJsFn)
      
      inline def setGetContainerStyles(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getContainerStyles", value.toJsFn)
      
      inline def setGetDownloadTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getDownloadTooltipContent", value.toJsFn)
      
      inline def setGetImageUrl(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getImageUrl", value.toJsFn)
      
      inline def setGetMoreTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMoreTooltipContent", value.toJsFn)
      
      inline def setGetPreviousImageUrl(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getPreviousImageUrl", value.toJsFn)
      
      inline def setGetRemoveTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getRemoveTooltipContent", value.toJsFn)
      
      inline def setGetStatusMessage(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getStatusMessage", value.toJsFn)
      
      inline def setGetUpdateTooltipContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getUpdateTooltipContent", value.toJsFn)
      
      inline def setHasStatus(value: StatusIndications => js.Promise[Boolean]): Self = StObject.set(x, "hasStatus", js.Any.fromFunction1(value))
      
      inline def setHover(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hover", value.toJsFn)
      
      inline def setIsAddItemVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isAddItemVisible", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsImageLoaded(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isImageLoaded", value.toJsFn)
      
      inline def setIsImageVisible(value: js.Promise[Boolean]): Self = StObject.set(x, "isImageVisible", value.asInstanceOf[js.Any])
      
      inline def setIsLoaderVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isLoaderVisible", value.toJsFn)
      
      inline def setIsPreviousImageVisible(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPreviousImageVisible", value.toJsFn)
      
      inline def setMoreButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "moreButtonExists", value.toJsFn)
      
      inline def setRemoveButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "removeButtonExists", value.toJsFn)
      
      inline def setUpdateButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "updateButtonExists", value.toJsFn)
      
      inline def setUpdateExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "updateExists", value.toJsFn)
    }
  }
}
