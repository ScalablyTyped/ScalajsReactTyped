package typingsJapgolly.reactFileUtils

import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFileUtils.distComponentsFileIconFileIconMod.FileIconProps
import typingsJapgolly.reactFileUtils.distComponentsFilePreviewerMod.FilePreviewerProps
import typingsJapgolly.reactFileUtils.distComponentsFileUploadButtonMod.FileUploadButtonProps
import typingsJapgolly.reactFileUtils.distComponentsIconButtonMod.IconButtonProps
import typingsJapgolly.reactFileUtils.distComponentsImageDropzoneMod.ImageDropzoneProps
import typingsJapgolly.reactFileUtils.distComponentsImagePreviewerMod.ImagePreviewerProps
import typingsJapgolly.reactFileUtils.distComponentsImageUploadButtonMod.ImageUploadButtonProps
import typingsJapgolly.reactFileUtils.distComponentsLoadingIndicatorMod.LoadingIndicatorProps
import typingsJapgolly.reactFileUtils.distComponentsThumbnailMod.ThumbnailProps
import typingsJapgolly.reactFileUtils.distComponentsThumbnailPlaceholderMod.ThumbnailPlaceholderProps
import typingsJapgolly.reactFileUtils.distComponentsUploadButtonMod.UploadButtonProps
import typingsJapgolly.reactFileUtils.distTypesMod.FileLike
import typingsJapgolly.std.DataTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AttachmentIcon(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AttachmentIcon")().asInstanceOf[Element]
  
  inline def FileIcon(props: FileIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FilePreviewer(hasFileIconPropsUploadsHandleRemoveHandleRetry: FilePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilePreviewer")(hasFileIconPropsUploadsHandleRemoveHandleRetry.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FileUploadButton(
    hasDisabledMultipleChildrenHandleFilesAcceptsResetOnChange: PropsWithChildren[FileUploadButtonProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FileUploadButton")(hasDisabledMultipleChildrenHandleFilesAcceptsResetOnChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def IconButton(hasOnClickChildren: PropsWithChildren[IconButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("IconButton")(hasOnClickChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImageDropzone(
    hasHandleFilesMaxNumberOfFilesChildrenAcceptMultipleDisabled: PropsWithChildren[ImageDropzoneProps]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageDropzone")(hasHandleFilesMaxNumberOfFilesChildrenAcceptMultipleDisabled.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImagePreviewer(hasMultipleDisabledImageUploadsHandleRemoveHandleRetryHandleFiles: ImagePreviewerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImagePreviewer")(hasMultipleDisabledImageUploadsHandleRemoveHandleRetryHandleFiles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ImageUploadButton(hasMultipleDisabledHandleFilesChildrenResetOnChange: PropsWithChildren[ImageUploadButtonProps]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ImageUploadButton")(hasMultipleDisabledHandleFilesChildrenResetOnChange.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def LoadingIndicator(hasSizeWidthBackgroundColorColor: LoadingIndicatorProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadingIndicator")(hasSizeWidthBackgroundColorColor.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def PictureIcon(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("PictureIcon")().asInstanceOf[Element]
  
  inline def Thumbnail(hasImageSizeHandleCloseAlt: ThumbnailProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Thumbnail")(hasImageSizeHandleCloseAlt.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ThumbnailPlaceholder(hasMultipleHandleFiles: ThumbnailPlaceholderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThumbnailPlaceholder")(hasMultipleHandleFiles.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def UploadButton(hasResetOnChangeOnFileChangeRest: UploadButtonProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("UploadButton")(hasResetOnChangeOnFileChangeRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def dataTransferItemsHaveFiles(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")().asInstanceOf[Boolean]
  inline def dataTransferItemsHaveFiles(items: js.Array[DataTransferItem]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsHaveFiles")(items.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def dataTransferItemsToFiles(): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")().asInstanceOf[js.Promise[js.Array[FileLike]]]
  inline def dataTransferItemsToFiles(items: js.Array[DataTransferItem]): js.Promise[js.Array[FileLike]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataTransferItemsToFiles")(items.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[FileLike]]]
}
