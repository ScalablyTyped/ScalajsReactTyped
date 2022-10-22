package typingsJapgolly.makerjs.MakerJs.exporter

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for an XML tag.
  * @private
  */
trait XmlTag extends StObject {
  
  var attrs: js.UndefOr[IXmlTagAttrs] = js.undefined
  
  /**
    * Flag to explicitly close XML tags.
    */
  var closingTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Get the closing tag.
    */
  def getClosingTag(): String
  
  /**
    * Get the inner text.
    */
  def getInnerText(): String
  
  /**
    * Get the opening tag.
    *
    * @param selfClose Flag to determine if opening tag should be self closing.
    */
  def getOpeningTag(selfClose: Boolean): String
  
  /**
    * Text between the opening and closing tags.
    */
  var innerText: String
  
  /**
    * Boolean to indicate that the innerText has been escaped.
    */
  var innerTextEscaped: Boolean
  
  var name: String
}
object XmlTag {
  
  inline def apply(
    getClosingTag: CallbackTo[String],
    getInnerText: CallbackTo[String],
    getOpeningTag: Boolean => String,
    innerText: String,
    innerTextEscaped: Boolean,
    name: String
  ): XmlTag = {
    val __obj = js.Dynamic.literal(getClosingTag = getClosingTag.toJsFn, getInnerText = getInnerText.toJsFn, getOpeningTag = js.Any.fromFunction1(getOpeningTag), innerText = innerText.asInstanceOf[js.Any], innerTextEscaped = innerTextEscaped.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlTag]
  }
  
  extension [Self <: XmlTag](x: Self) {
    
    inline def setAttrs(value: IXmlTagAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setClosingTags(value: Boolean): Self = StObject.set(x, "closingTags", value.asInstanceOf[js.Any])
    
    inline def setClosingTagsUndefined: Self = StObject.set(x, "closingTags", js.undefined)
    
    inline def setGetClosingTag(value: CallbackTo[String]): Self = StObject.set(x, "getClosingTag", value.toJsFn)
    
    inline def setGetInnerText(value: CallbackTo[String]): Self = StObject.set(x, "getInnerText", value.toJsFn)
    
    inline def setGetOpeningTag(value: Boolean => String): Self = StObject.set(x, "getOpeningTag", js.Any.fromFunction1(value))
    
    inline def setInnerText(value: String): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
    
    inline def setInnerTextEscaped(value: Boolean): Self = StObject.set(x, "innerTextEscaped", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
