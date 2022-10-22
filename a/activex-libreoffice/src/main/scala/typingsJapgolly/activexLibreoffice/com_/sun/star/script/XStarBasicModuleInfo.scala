package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Script Module containing some scripting code in a certain scripting language
  * @deprecated Deprecated
  */
trait XStarBasicModuleInfo
  extends StObject
     with XInterface {
  
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  val Language: String
  
  /** returns the name of the module */
  val Name: String
  
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  val Source: String
  
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  def getLanguage(): String
  
  /** returns the name of the module */
  def getName(): String
  
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  def getSource(): String
}
object XStarBasicModuleInfo {
  
  inline def apply(
    Language: String,
    Name: String,
    Source: String,
    acquire: Callback,
    getLanguage: CallbackTo[String],
    getName: CallbackTo[String],
    getSource: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XStarBasicModuleInfo = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLanguage = getLanguage.toJsFn, getName = getName.toJsFn, getSource = getSource.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XStarBasicModuleInfo]
  }
  
  extension [Self <: XStarBasicModuleInfo](x: Self) {
    
    inline def setGetLanguage(value: CallbackTo[String]): Self = StObject.set(x, "getLanguage", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSource(value: CallbackTo[String]): Self = StObject.set(x, "getSource", value.toJsFn)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
  }
}
