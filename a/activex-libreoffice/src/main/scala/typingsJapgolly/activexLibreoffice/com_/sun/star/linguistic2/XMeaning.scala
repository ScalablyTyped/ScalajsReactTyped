package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * one of the possible meanings for a word.
  *
  * Represents one of the possible meanings that may be returned from a {@link com.sun.star.linguistic2.XThesaurus.queryMeanings()} call and allows for
  * retrieval of its synonyms.
  * @see com.sun.star.linguistic2.XThesaurus
  */
trait XMeaning
  extends StObject
     with XInterface {
  
  /** @returns the meaning represented by this object. */
  val Meaning: String
  
  /** @returns the meaning represented by this object. */
  def getMeaning(): String
  
  /** @returns a sequence of strings where each entry is a synonym of the current objects meaning. */
  def querySynonyms(): SafeArray[String]
}
object XMeaning {
  
  inline def apply(
    Meaning: String,
    acquire: Callback,
    getMeaning: CallbackTo[String],
    queryInterface: `type` => Any,
    querySynonyms: CallbackTo[SafeArray[String]],
    release: Callback
  ): XMeaning = {
    val __obj = js.Dynamic.literal(Meaning = Meaning.asInstanceOf[js.Any], acquire = acquire.toJsFn, getMeaning = getMeaning.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), querySynonyms = querySynonyms.toJsFn, release = release.toJsFn)
    __obj.asInstanceOf[XMeaning]
  }
  
  extension [Self <: XMeaning](x: Self) {
    
    inline def setGetMeaning(value: CallbackTo[String]): Self = StObject.set(x, "getMeaning", value.toJsFn)
    
    inline def setMeaning(value: String): Self = StObject.set(x, "Meaning", value.asInstanceOf[js.Any])
    
    inline def setQuerySynonyms(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "querySynonyms", value.toJsFn)
  }
}
