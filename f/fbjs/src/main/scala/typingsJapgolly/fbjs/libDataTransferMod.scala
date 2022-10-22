package typingsJapgolly.fbjs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataTransferMod {
  
  @JSImport("fbjs/lib/DataTransfer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataTransfer {
    def this(data: Any) = this()
    
    /* CompleteClass */
    override def getCount(): Double | Null = js.native
    
    /**
      * Get files.
      */
    /* CompleteClass */
    override def getFiles(): js.Array[Any] = js.native
    
    /**
      * Get HTML paste data
      */
    /* CompleteClass */
    override def getHTML(): js.UndefOr[String | Null] = js.native
    
    /**
      * Get a link url.
      */
    /* CompleteClass */
    override def getLink(): js.UndefOr[String | Null] = js.native
    
    /**
      * Get raw text.
      */
    /* CompleteClass */
    override def getText(): js.UndefOr[String | Null] = js.native
    
    /**
      * Are there any files to fetch?
      */
    /* CompleteClass */
    override def hasFiles(): Boolean = js.native
    
    /**
      * Is this an image data transfer?
      */
    /* CompleteClass */
    override def isImage(): Boolean = js.native
    
    /**
      * Is this a link data transfer?
      */
    /* CompleteClass */
    override def isLink(): Boolean = js.native
    
    /**
      * Is this likely to be a rich text data transfer?
      */
    /* CompleteClass */
    override def isRichText(): Boolean = js.native
  }
  
  trait DataTransfer extends StObject {
    
    def getCount(): Double | Null
    
    /**
      * Get files.
      */
    def getFiles(): js.Array[Any]
    
    /**
      * Get HTML paste data
      */
    def getHTML(): js.UndefOr[String | Null]
    
    /**
      * Get a link url.
      */
    def getLink(): js.UndefOr[String | Null]
    
    /**
      * Get raw text.
      */
    def getText(): js.UndefOr[String | Null]
    
    /**
      * Are there any files to fetch?
      */
    def hasFiles(): Boolean
    
    /**
      * Is this an image data transfer?
      */
    def isImage(): Boolean
    
    /**
      * Is this a link data transfer?
      */
    def isLink(): Boolean
    
    /**
      * Is this likely to be a rich text data transfer?
      */
    def isRichText(): Boolean
  }
  object DataTransfer {
    
    inline def apply(
      getCount: CallbackTo[Double | Null],
      getFiles: CallbackTo[js.Array[Any]],
      getHTML: CallbackTo[js.UndefOr[String | Null]],
      getLink: CallbackTo[js.UndefOr[String | Null]],
      getText: CallbackTo[js.UndefOr[String | Null]],
      hasFiles: CallbackTo[Boolean],
      isImage: CallbackTo[Boolean],
      isLink: CallbackTo[Boolean],
      isRichText: CallbackTo[Boolean]
    ): DataTransfer = {
      val __obj = js.Dynamic.literal(getCount = getCount.toJsFn, getFiles = getFiles.toJsFn, getHTML = getHTML.toJsFn, getLink = getLink.toJsFn, getText = getText.toJsFn, hasFiles = hasFiles.toJsFn, isImage = isImage.toJsFn, isLink = isLink.toJsFn, isRichText = isRichText.toJsFn)
      __obj.asInstanceOf[DataTransfer]
    }
    
    extension [Self <: DataTransfer](x: Self) {
      
      inline def setGetCount(value: CallbackTo[Double | Null]): Self = StObject.set(x, "getCount", value.toJsFn)
      
      inline def setGetFiles(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getFiles", value.toJsFn)
      
      inline def setGetHTML(value: CallbackTo[js.UndefOr[String | Null]]): Self = StObject.set(x, "getHTML", value.toJsFn)
      
      inline def setGetLink(value: CallbackTo[js.UndefOr[String | Null]]): Self = StObject.set(x, "getLink", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.UndefOr[String | Null]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setHasFiles(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFiles", value.toJsFn)
      
      inline def setIsImage(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImage", value.toJsFn)
      
      inline def setIsLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLink", value.toJsFn)
      
      inline def setIsRichText(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRichText", value.toJsFn)
    }
  }
}
