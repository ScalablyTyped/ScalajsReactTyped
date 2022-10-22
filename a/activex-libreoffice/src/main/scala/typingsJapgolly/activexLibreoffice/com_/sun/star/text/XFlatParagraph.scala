package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XStringKeyMap
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to ...
  * @since OOo 3.0
  */
trait XFlatParagraph
  extends StObject
     with XTextMarkup {
  
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  val LanguagePortions: SafeArray[Double]
  
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  val Text: String
  
  /**
    * replace the attributes of the specific text with the given set of attributes.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param aAttributes the given set of attributes e.g. Language.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeAttributes(nPos: Double, nLen: Double, aAttributes: SeqEquiv[PropertyValue]): Unit
  
  /**
    * replace the specific text with new text.
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @param NewText new text.
    * @param aAttributes the given set of attributes e.g. Language
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def changeText(nPos: Double, nLen: Double, NewText: String, aAttributes: SeqEquiv[PropertyValue]): Unit
  
  /**
    * get the language of the specific text
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified. If no language could be identified, the locale will be empty.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getLanguageOfText(nPos: Double, nLen: Double): Locale
  
  /**
    * get a list of indexes that separate each two different languages
    * @returns a list of indices.
    */
  def getLanguagePortions(): SafeArray[Double]
  
  /**
    * get the single most probable language of the specific text, especially after getLanguageOfText fails
    * @param nPos start index of the text.
    * @param nLen the length of the text.
    * @returns the locale for the language identified.
    * @throws IllegalArgumentException when any argument is wrong.
    */
  def getPrimaryLanguageOfText(nPos: Double, nLen: Double): Locale
  
  /**
    * get the content of the paragraph
    * @returns the content of the paragraph.
    */
  def getText(): String
  
  /**
    * returns whether the respective text node has already been processed
    * @param nType type, see {@link TextMarkupType} .
    * @returns `TRUE` if the respective text node has been checked `FALSE` otherwise.
    */
  def isChecked(nType: Double): Boolean
  
  /**
    * check whether the content has been modified
    * @returns `TRUE` if the content has been modified, `FALSE` otherwise.
    */
  def isModified(): Boolean
  
  /**
    * change the "checked" flag of the respective text node, i.e., mark the text node as "processed"
    * @param nType type, see {@link TextMarkupType} .
    * @param bVal `TRUE` the respective text node has been processed `FALSE` the respective text node needs to be processed again later
    */
  def setChecked(nType: Double, bVal: Boolean): Unit
}
object XFlatParagraph {
  
  inline def apply(
    LanguagePortions: SafeArray[Double],
    MarkupInfoContainer: XStringKeyMap,
    Text: String,
    changeAttributes: (Double, Double, SeqEquiv[PropertyValue]) => Callback,
    changeText: (Double, Double, String, SeqEquiv[PropertyValue]) => Callback,
    commitStringMarkup: (Double, String, Double, Double, XStringKeyMap) => Callback,
    commitTextRangeMarkup: (Double, String, XTextRange, XStringKeyMap) => Callback,
    getLanguageOfText: (Double, Double) => Locale,
    getLanguagePortions: CallbackTo[SafeArray[Double]],
    getMarkupInfoContainer: CallbackTo[XStringKeyMap],
    getPrimaryLanguageOfText: (Double, Double) => Locale,
    getText: CallbackTo[String],
    isChecked: Double => Boolean,
    isModified: CallbackTo[Boolean],
    setChecked: (Double, Boolean) => Callback
  ): XFlatParagraph = {
    val __obj = js.Dynamic.literal(LanguagePortions = LanguagePortions.asInstanceOf[js.Any], MarkupInfoContainer = MarkupInfoContainer.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], changeAttributes = js.Any.fromFunction3((t0: Double, t1: Double, t2: SeqEquiv[PropertyValue]) => (changeAttributes(t0, t1, t2)).runNow()), changeText = js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: SeqEquiv[PropertyValue]) => (changeText(t0, t1, t2, t3)).runNow()), commitStringMarkup = js.Any.fromFunction5((t0: Double, t1: String, t2: Double, t3: Double, t4: XStringKeyMap) => (commitStringMarkup(t0, t1, t2, t3, t4)).runNow()), commitTextRangeMarkup = js.Any.fromFunction4((t0: Double, t1: String, t2: XTextRange, t3: XStringKeyMap) => (commitTextRangeMarkup(t0, t1, t2, t3)).runNow()), getLanguageOfText = js.Any.fromFunction2(getLanguageOfText), getLanguagePortions = getLanguagePortions.toJsFn, getMarkupInfoContainer = getMarkupInfoContainer.toJsFn, getPrimaryLanguageOfText = js.Any.fromFunction2(getPrimaryLanguageOfText), getText = getText.toJsFn, isChecked = js.Any.fromFunction1(isChecked), isModified = isModified.toJsFn, setChecked = js.Any.fromFunction2((t0: Double, t1: Boolean) => (setChecked(t0, t1)).runNow()))
    __obj.asInstanceOf[XFlatParagraph]
  }
  
  extension [Self <: XFlatParagraph](x: Self) {
    
    inline def setChangeAttributes(value: (Double, Double, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "changeAttributes", js.Any.fromFunction3((t0: Double, t1: Double, t2: SeqEquiv[PropertyValue]) => (value(t0, t1, t2)).runNow()))
    
    inline def setChangeText(value: (Double, Double, String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "changeText", js.Any.fromFunction4((t0: Double, t1: Double, t2: String, t3: SeqEquiv[PropertyValue]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setGetLanguageOfText(value: (Double, Double) => Locale): Self = StObject.set(x, "getLanguageOfText", js.Any.fromFunction2(value))
    
    inline def setGetLanguagePortions(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getLanguagePortions", value.toJsFn)
    
    inline def setGetPrimaryLanguageOfText(value: (Double, Double) => Locale): Self = StObject.set(x, "getPrimaryLanguageOfText", js.Any.fromFunction2(value))
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setIsChecked(value: Double => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction1(value))
    
    inline def setIsModified(value: CallbackTo[Boolean]): Self = StObject.set(x, "isModified", value.toJsFn)
    
    inline def setLanguagePortions(value: SafeArray[Double]): Self = StObject.set(x, "LanguagePortions", value.asInstanceOf[js.Any])
    
    inline def setSetChecked(value: (Double, Boolean) => Callback): Self = StObject.set(x, "setChecked", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
