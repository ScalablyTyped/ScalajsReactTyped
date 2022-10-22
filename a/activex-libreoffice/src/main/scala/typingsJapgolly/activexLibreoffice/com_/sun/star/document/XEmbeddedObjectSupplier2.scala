package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XEmbeddedObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that provides an embedded object. */
trait XEmbeddedObjectSupplier2
  extends StObject
     with XEmbeddedObjectSupplier {
  
  /** allows to control the aspect of the object. */
  var Aspect: Double
  
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  val ExtendedControlOverEmbeddedObject: XEmbeddedObject
  
  /** allows to get the replacement image of the object. */
  var ReplacementGraphic: XGraphic
  
  /**
    * returns the object which is embedded into this object.
    *
    * This method does not return the model that is controlled by the embedded object, but the embedded object itself.
    */
  def getExtendedControlOverEmbeddedObject(): XEmbeddedObject
}
object XEmbeddedObjectSupplier2 {
  
  inline def apply(
    Aspect: Double,
    EmbeddedObject: XComponent,
    ExtendedControlOverEmbeddedObject: XEmbeddedObject,
    ReplacementGraphic: XGraphic,
    acquire: Callback,
    getEmbeddedObject: CallbackTo[XComponent],
    getExtendedControlOverEmbeddedObject: CallbackTo[XEmbeddedObject],
    queryInterface: `type` => Any,
    release: Callback
  ): XEmbeddedObjectSupplier2 = {
    val __obj = js.Dynamic.literal(Aspect = Aspect.asInstanceOf[js.Any], EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], ExtendedControlOverEmbeddedObject = ExtendedControlOverEmbeddedObject.asInstanceOf[js.Any], ReplacementGraphic = ReplacementGraphic.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEmbeddedObject = getEmbeddedObject.toJsFn, getExtendedControlOverEmbeddedObject = getExtendedControlOverEmbeddedObject.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEmbeddedObjectSupplier2]
  }
  
  extension [Self <: XEmbeddedObjectSupplier2](x: Self) {
    
    inline def setAspect(value: Double): Self = StObject.set(x, "Aspect", value.asInstanceOf[js.Any])
    
    inline def setExtendedControlOverEmbeddedObject(value: XEmbeddedObject): Self = StObject.set(x, "ExtendedControlOverEmbeddedObject", value.asInstanceOf[js.Any])
    
    inline def setGetExtendedControlOverEmbeddedObject(value: CallbackTo[XEmbeddedObject]): Self = StObject.set(x, "getExtendedControlOverEmbeddedObject", value.toJsFn)
    
    inline def setReplacementGraphic(value: XGraphic): Self = StObject.set(x, "ReplacementGraphic", value.asInstanceOf[js.Any])
  }
}
