package typingsJapgolly.microsoftAjax.Sys

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the propertyChanged event to indicate which property has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310957(v=vs.100).aspx}
  */
trait PropertyChangedEventArgs
  extends StObject
     with EventArgs {
  
  //#endregion
  //#region Methods
  /**
    * Gets the name of the property that changed.
    * Use the propertyName property to determine the name of the property that changed.
    * @return A string that contains the name of the property that changed.
    */
  def propertyName(): String
}
object PropertyChangedEventArgs {
  
  inline def apply(Empty: EventArgs, propertyName: CallbackTo[String]): PropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], propertyName = propertyName.toJsFn)
    __obj.asInstanceOf[PropertyChangedEventArgs]
  }
  
  extension [Self <: PropertyChangedEventArgs](x: Self) {
    
    inline def setPropertyName(value: CallbackTo[String]): Self = StObject.set(x, "propertyName", value.toJsFn)
  }
}
