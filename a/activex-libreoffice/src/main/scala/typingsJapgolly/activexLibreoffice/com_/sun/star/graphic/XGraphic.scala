package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface acts as a container for the loaded graphic.
  *
  * The interface itself can be retrieved by using the appropriate methods of {@link XGraphicProvider} interface. {@link XGraphicProvider} also offers a
  * method to store the graphic content at a specific location
  *
  * To render the graphic content onto a specific device, you have to create a {@link XGraphicRenderer} interface and pass this interface appropriately
  * @see XGraphicProvider
  * @see XGraphicRenderer
  */
trait XGraphic
  extends StObject
     with XInterface {
  
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  val Type: Double
  
  /**
    * Get the type of the contained graphic
    * @returns The type of the contained graphic
    * @see GraphicType
    */
  def getType(): Double
}
object XGraphic {
  
  inline def apply(
    Type: Double,
    acquire: Callback,
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback
  ): XGraphic = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGraphic]
  }
  
  extension [Self <: XGraphic](x: Self) {
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
