package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layout item that displays a video. Items can be accessed or created from a Form.
  *
  *     // Open a form by ID and add three new video items, using a long URL,
  *     // a short URL, and a video ID.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('www.youtube.com/watch?v=1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('youtu.be/1234abcdxyz');
  *
  *     form.addVideoItem()
  *         .setTitle('Video Title')
  *         .setHelpText('Video Caption')
  *         .setVideoUrl('1234abcdxyz');
  */
trait VideoItem extends StObject {
  
  def duplicate(): VideoItem
  
  def getAlignment(): Alignment
  
  def getHelpText(): String
  
  def getId(): Integer
  
  def getIndex(): Integer
  
  def getTitle(): String
  
  def getType(): ItemType
  
  def getWidth(): Integer
  
  def setAlignment(alignment: Alignment): VideoItem
  
  def setHelpText(text: String): VideoItem
  
  def setTitle(title: String): VideoItem
  
  def setVideoUrl(youtubeUrl: String): VideoItem
  
  def setWidth(width: Integer): VideoItem
}
object VideoItem {
  
  inline def apply(
    duplicate: CallbackTo[VideoItem],
    getAlignment: CallbackTo[Alignment],
    getHelpText: CallbackTo[String],
    getId: CallbackTo[Integer],
    getIndex: CallbackTo[Integer],
    getTitle: CallbackTo[String],
    getType: CallbackTo[ItemType],
    getWidth: CallbackTo[Integer],
    setAlignment: Alignment => VideoItem,
    setHelpText: String => VideoItem,
    setTitle: String => VideoItem,
    setVideoUrl: String => VideoItem,
    setWidth: Integer => VideoItem
  ): VideoItem = {
    val __obj = js.Dynamic.literal(duplicate = duplicate.toJsFn, getAlignment = getAlignment.toJsFn, getHelpText = getHelpText.toJsFn, getId = getId.toJsFn, getIndex = getIndex.toJsFn, getTitle = getTitle.toJsFn, getType = getType.toJsFn, getWidth = getWidth.toJsFn, setAlignment = js.Any.fromFunction1(setAlignment), setHelpText = js.Any.fromFunction1(setHelpText), setTitle = js.Any.fromFunction1(setTitle), setVideoUrl = js.Any.fromFunction1(setVideoUrl), setWidth = js.Any.fromFunction1(setWidth))
    __obj.asInstanceOf[VideoItem]
  }
  
  extension [Self <: VideoItem](x: Self) {
    
    inline def setDuplicate(value: CallbackTo[VideoItem]): Self = StObject.set(x, "duplicate", value.toJsFn)
    
    inline def setGetAlignment(value: CallbackTo[Alignment]): Self = StObject.set(x, "getAlignment", value.toJsFn)
    
    inline def setGetHelpText(value: CallbackTo[String]): Self = StObject.set(x, "getHelpText", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Integer]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetIndex(value: CallbackTo[Integer]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[ItemType]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Integer]): Self = StObject.set(x, "getWidth", value.toJsFn)
    
    inline def setSetAlignment(value: Alignment => VideoItem): Self = StObject.set(x, "setAlignment", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => VideoItem): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetTitle(value: String => VideoItem): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    inline def setSetVideoUrl(value: String => VideoItem): Self = StObject.set(x, "setVideoUrl", js.Any.fromFunction1(value))
    
    inline def setSetWidth(value: Integer => VideoItem): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
  }
}
