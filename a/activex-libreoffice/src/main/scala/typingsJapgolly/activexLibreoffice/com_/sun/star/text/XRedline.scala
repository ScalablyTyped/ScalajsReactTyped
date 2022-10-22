package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enables creation of redlines (change tracking). */
trait XRedline extends StObject {
  
  /**
    * @param RedlineType  Valid type names are:    Insert - marks an insertion    Delete - marks an deletion    Format - marks an attribute change    {@link T
    * @param RedlineProperties contains the following parameters [readonly, property] string RedlineAuthor; [readonly, property] {@link com.sun.star.util.Date
    */
  def makeRedline(RedlineType: String, RedlineProperties: PropertyValues): Unit
}
object XRedline {
  
  inline def apply(makeRedline: (String, PropertyValues) => Callback): XRedline = {
    val __obj = js.Dynamic.literal(makeRedline = js.Any.fromFunction2((t0: String, t1: PropertyValues) => (makeRedline(t0, t1)).runNow()))
    __obj.asInstanceOf[XRedline]
  }
  
  extension [Self <: XRedline](x: Self) {
    
    inline def setMakeRedline(value: (String, PropertyValues) => Callback): Self = StObject.set(x, "makeRedline", js.Any.fromFunction2((t0: String, t1: PropertyValues) => (value(t0, t1)).runNow()))
  }
}
