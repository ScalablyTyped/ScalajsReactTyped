package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactEventHandler
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesImageViewerMod {
  
  @JSImport("wix-style-react/dist/types/ImageViewer", JSImport.Default)
  @js.native
  open class default () extends ImageViewer
  
  @js.native
  trait ImageViewer
    extends Component[ImageViewerProps, js.Object, Any] {
    
    def focus(): Unit = js.native
  }
  
  trait ImageViewerProps extends StObject {
    
    var addImageInfo: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var downloadImageInfo: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var errorMessage: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var imageUrl: js.UndefOr[String] = js.undefined
    
    var moreImageInfo: js.UndefOr[String] = js.undefined
    
    var onAddImage: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onDownloadImage: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onImageLoad: js.UndefOr[ReactEventHandler[HTMLImageElement]] = js.undefined
    
    var onRemoveImage: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onUpdateImage: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var removeImageInfo: js.UndefOr[String] = js.undefined
    
    var removeRoundedBorders: js.UndefOr[Boolean] = js.undefined
    
    var showDownloadButton: js.UndefOr[Boolean] = js.undefined
    
    var showRemoveButton: js.UndefOr[Boolean] = js.undefined
    
    var showUpdateButton: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var updateImageInfo: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ImageViewerProps {
    
    inline def apply(): ImageViewerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageViewerProps]
    }
    
    extension [Self <: ImageViewerProps](x: Self) {
      
      inline def setAddImageInfo(value: String): Self = StObject.set(x, "addImageInfo", value.asInstanceOf[js.Any])
      
      inline def setAddImageInfoUndefined: Self = StObject.set(x, "addImageInfo", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDownloadImageInfo(value: String): Self = StObject.set(x, "downloadImageInfo", value.asInstanceOf[js.Any])
      
      inline def setDownloadImageInfoUndefined: Self = StObject.set(x, "downloadImageInfo", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      inline def setMoreImageInfo(value: String): Self = StObject.set(x, "moreImageInfo", value.asInstanceOf[js.Any])
      
      inline def setMoreImageInfoUndefined: Self = StObject.set(x, "moreImageInfo", js.undefined)
      
      inline def setOnAddImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onAddImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnAddImageUndefined: Self = StObject.set(x, "onAddImage", js.undefined)
      
      inline def setOnDownloadImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onDownloadImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnDownloadImageUndefined: Self = StObject.set(x, "onDownloadImage", js.undefined)
      
      inline def setOnImageLoad(value: ReactEventFrom[HTMLImageElement & Element] => Callback): Self = StObject.set(x, "onImageLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLImageElement & Element]) => value(t0).runNow()))
      
      inline def setOnImageLoadUndefined: Self = StObject.set(x, "onImageLoad", js.undefined)
      
      inline def setOnRemoveImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onRemoveImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnRemoveImageUndefined: Self = StObject.set(x, "onRemoveImage", js.undefined)
      
      inline def setOnUpdateImage(value: ReactMouseEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onUpdateImage", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnUpdateImageUndefined: Self = StObject.set(x, "onUpdateImage", js.undefined)
      
      inline def setRemoveImageInfo(value: String): Self = StObject.set(x, "removeImageInfo", value.asInstanceOf[js.Any])
      
      inline def setRemoveImageInfoUndefined: Self = StObject.set(x, "removeImageInfo", js.undefined)
      
      inline def setRemoveRoundedBorders(value: Boolean): Self = StObject.set(x, "removeRoundedBorders", value.asInstanceOf[js.Any])
      
      inline def setRemoveRoundedBordersUndefined: Self = StObject.set(x, "removeRoundedBorders", js.undefined)
      
      inline def setShowDownloadButton(value: Boolean): Self = StObject.set(x, "showDownloadButton", value.asInstanceOf[js.Any])
      
      inline def setShowDownloadButtonUndefined: Self = StObject.set(x, "showDownloadButton", js.undefined)
      
      inline def setShowRemoveButton(value: Boolean): Self = StObject.set(x, "showRemoveButton", value.asInstanceOf[js.Any])
      
      inline def setShowRemoveButtonUndefined: Self = StObject.set(x, "showRemoveButton", js.undefined)
      
      inline def setShowUpdateButton(value: Boolean): Self = StObject.set(x, "showUpdateButton", value.asInstanceOf[js.Any])
      
      inline def setShowUpdateButtonUndefined: Self = StObject.set(x, "showUpdateButton", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
      
      inline def setUpdateImageInfo(value: String): Self = StObject.set(x, "updateImageInfo", value.asInstanceOf[js.Any])
      
      inline def setUpdateImageInfoUndefined: Self = StObject.set(x, "updateImageInfo", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
