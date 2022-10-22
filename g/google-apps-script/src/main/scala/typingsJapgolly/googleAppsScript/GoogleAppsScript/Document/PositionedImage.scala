package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fixed position image anchored to a Paragraph. Unlike an InlineImage, a PositionedImage is
  * not an Element. It does not have a
  * parent or sibling Element. Instead,
  * it is anchored to a Paragraph or ListItem, and is placed via offsets from
  * that anchor. A PositionedImage has an ID that can be used to reference it.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Append a new paragraph.
  *     var paragraph = body.appendParagraph("New paragraph to anchor the image to.");
  *     *
  *     // Get an image in Drive from its ID.
  *     var image = DriveApp.getFileById('ENTER_IMAGE_FILE_ID_HERE').getBlob();
  *
  *     // Add the PositionedImage with offsets (in points).
  *     var posImage = paragraph.addPositionedImage(image)
  *         .setTopOffset(60)
  *         .setLeftOffset(40);
  */
trait PositionedImage extends StObject {
  
  def getAs(contentType: String): Blob
  
  def getBlob(): Blob
  
  def getHeight(): Integer
  
  def getId(): String
  
  def getLayout(): PositionedLayout
  
  def getLeftOffset(): Double
  
  def getParagraph(): Paragraph
  
  def getTopOffset(): Double
  
  def getWidth(): Integer
  
  def setHeight(height: Integer): PositionedImage
  
  def setLayout(layout: PositionedLayout): PositionedImage
  
  def setLeftOffset(offset: Double): PositionedImage
  
  def setTopOffset(offset: Double): PositionedImage
  
  def setWidth(width: Integer): PositionedImage
}
object PositionedImage {
  
  inline def apply(
    getAs: String => Blob,
    getBlob: CallbackTo[Blob],
    getHeight: CallbackTo[Integer],
    getId: CallbackTo[String],
    getLayout: CallbackTo[PositionedLayout],
    getLeftOffset: CallbackTo[Double],
    getParagraph: CallbackTo[Paragraph],
    getTopOffset: CallbackTo[Double],
    getWidth: CallbackTo[Integer],
    setHeight: Integer => PositionedImage,
    setLayout: PositionedLayout => PositionedImage,
    setLeftOffset: Double => PositionedImage,
    setTopOffset: Double => PositionedImage,
    setWidth: Integer => PositionedImage
  ): PositionedImage = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = getBlob.toJsFn, getHeight = getHeight.toJsFn, getId = getId.toJsFn, getLayout = getLayout.toJsFn, getLeftOffset = getLeftOffset.toJsFn, getParagraph = getParagraph.toJsFn, getTopOffset = getTopOffset.toJsFn, getWidth = getWidth.toJsFn, setHeight = js.Any.fromFunction1(setHeight), setLayout = js.Any.fromFunction1(setLayout), setLeftOffset = js.Any.fromFunction1(setLeftOffset), setTopOffset = js.Any.fromFunction1(setTopOffset), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[PositionedImage]
  }
  
  extension [Self <: PositionedImage](x: Self) {
    
    inline def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
    
    inline def setGetBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "getBlob", value.toJsFn)
    
    inline def setGetHeight(value: CallbackTo[Integer]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetLayout(value: CallbackTo[PositionedLayout]): Self = StObject.set(x, "getLayout", value.toJsFn)
    
    inline def setGetLeftOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getLeftOffset", value.toJsFn)
    
    inline def setGetParagraph(value: CallbackTo[Paragraph]): Self = StObject.set(x, "getParagraph", value.toJsFn)
    
    inline def setGetTopOffset(value: CallbackTo[Double]): Self = StObject.set(x, "getTopOffset", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Integer]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setSetHeight(value: Integer => PositionedImage): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetLayout(value: PositionedLayout => PositionedImage): Self = StObject.set(x, "setLayout", js.Any.fromFunction1(value))
    
    inline def setSetLeftOffset(value: Double => PositionedImage): Self = StObject.set(x, "setLeftOffset", js.Any.fromFunction1(value))
    
    inline def setSetTopOffset(value: Double => PositionedImage): Self = StObject.set(x, "setTopOffset", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => PositionedImage): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}
