package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout item that displays an image. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add a new image item
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var img = UrlFetchApp.fetch('https://www.google.com/images/srpr/logo4w.png');
  *     form.addImageItem()
  *         .setTitle('Google')
  *         .setHelpText('Google Logo') // The help text is the image description
  *         .setImage(img);
  */
trait ImageItem extends StObject {
  
  def duplicate(): ImageItem
  
  def getAlignment(): Alignment
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getImage(): Blob
  
  def getIndex(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def getWidth(): Integer
  
  def setAlignment(alignment: Alignment): ImageItem
  
  def setHelpText(text: String): ImageItem
  
  def setImage(image: BlobSource): ImageItem
  
  def setTitle(title: String): ImageItem
  
  def setWidth(width: Integer): ImageItem
}
object ImageItem {
  
  inline def apply(
    duplicate: CallbackTo[ImageItem],
    getAlignment: CallbackTo[Alignment],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getImage: CallbackTo[Blob],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    getWidth: CallbackTo[Integer],
    setAlignment: Alignment => ImageItem,
    setHelpText: String => ImageItem,
    setImage: BlobSource => ImageItem,
    setTitle: String => ImageItem,
    setWidth: Integer => ImageItem
  ): ImageItem = {
    val __obj = js.Dynamic.literal(duplicate = duplicate.toJsFn, getAlignment = getAlignment.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getImage = getImage.toJsFn, getIndex = getIndex.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, getWidth = getWidth.toJsFn, setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setImage = js.Any.fromFunction1(setImage), setTitle = js.Any.fromFunction1(setTitle), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[ImageItem]
  }
  
  extension [Self <: ImageItem](x: Self) {
    
    inline def setDuplicate(value: CallbackTo[ImageItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetAlignment(value: CallbackTo[Alignment]): Self = StObject.set(x, "getAlignment", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetImage(value: CallbackTo[Blob]): Self = StObject.set(x, "getImage", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Integer]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setSetAlignment(value: Alignment => ImageItem): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => ImageItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetImage(value: BlobSource => ImageItem): Self = StObject.set(x, "setImage", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => ImageItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => ImageItem): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}
