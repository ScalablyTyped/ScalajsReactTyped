package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardCommentHistoryItem extends StObject {
  
  def GetCommentAuthor(): String
  
  def GetCommentText(): String
  
  def GetCommentTimestamp(): Any
  
  def GetCommentVersion(): Double
}
object IMetadataCardCommentHistoryItem {
  
  inline def apply(
    GetCommentAuthor: CallbackTo[String],
    GetCommentText: CallbackTo[String],
    GetCommentTimestamp: CallbackTo[Any],
    GetCommentVersion: CallbackTo[Double]
  ): IMetadataCardCommentHistoryItem = {
    val __obj = js.Dynamic.literal(GetCommentAuthor = GetCommentAuthor.toJsFn, GetCommentText = GetCommentText.toJsFn, GetCommentTimestamp = GetCommentTimestamp.toJsFn, GetCommentVersion = GetCommentVersion.toJsFn)
    __obj.asInstanceOf[IMetadataCardCommentHistoryItem]
  }
  
  extension [Self <: IMetadataCardCommentHistoryItem](x: Self) {
    
    inline def setGetCommentAuthor(value: CallbackTo[String]): Self = StObject.set(x, "GetCommentAuthor", value.toJsFn)
    
    inline def setGetCommentText(value: CallbackTo[String]): Self = StObject.set(x, "GetCommentText", value.toJsFn)
    
    inline def setGetCommentTimestamp(value: CallbackTo[Any]): Self = StObject.set(x, "GetCommentTimestamp", value.toJsFn)
    
    inline def setGetCommentVersion(value: CallbackTo[Double]): Self = StObject.set(x, "GetCommentVersion", value.toJsFn)
  }
}
