package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a template for a style (aka style sheet). */
trait XStyle
  extends StObject
     with XNamed {
  
  /** @returns the name of the parent style, probably empty. */
  var ParentStyle: String
  
  /** @returns the name of the parent style, probably empty. */
  def getParentStyle(): String
  
  /** @returns `TRUE` if this type is used in the document. */
  def isInUse(): Boolean
  
  /** identifies a style as defined by the user. */
  def isUserDefined(): Boolean
  
  /** sets the name of the parent style. */
  def setParentStyle(aParentStyle: String): Unit
}
object XStyle {
  
  inline def apply(
    Name: String,
    ParentStyle: String,
    acquire: Callback,
    getName: CallbackTo[String],
    getParentStyle: CallbackTo[String],
    isInUse: CallbackTo[Boolean],
    isUserDefined: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback,
    setParentStyle: String => Callback
  ): XStyle = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], acquire = acquire.toJsFn, getName = getName.toJsFn, getParentStyle = getParentStyle.toJsFn, isInUse = isInUse.toJsFn, isUserDefined = isUserDefined.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setParentStyle = js.Any.fromFunction1((t0: String) => setParentStyle(t0).runNow()))
    __obj.asInstanceOf[XStyle]
  }
  
  extension [Self <: XStyle](x: Self) {
    
    inline def setGetParentStyle(value: CallbackTo[String]): Self = StObject.set(x, "getParentStyle", value.toJsFn)
    
    inline def setIsInUse(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInUse", value.toJsFn)
    
    inline def setIsUserDefined(value: CallbackTo[Boolean]): Self = StObject.set(x, "isUserDefined", value.toJsFn)
    
    inline def setParentStyle(value: String): Self = StObject.set(x, "ParentStyle", value.asInstanceOf[js.Any])
    
    inline def setSetParentStyle(value: String => Callback): Self = StObject.set(x, "setParentStyle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
