package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface acts as the main interface to handle graphic content. It is used to load graphics, store graphics and to get information about unloaded
  * graphics
  */
trait XGraphicProvider
  extends StObject
     with XInterface {
  
  /**
    * Calling this method returns a {@link XGraphic} interface that holds the graphic content after loading the graphic
    * @param MediaProperties A sequence of property values to describe the location of the graphic from which the graphic is to be loaded
    * @returns The {@link XGraphic} interface
    * @see MediaProperties
    * @see XGraphic
    * @see com.sun.star.beans.PropertyValues
    */
  def queryGraphic(MediaProperties: PropertyValues): XGraphic
  
  /**
    * Calling this method returns a {@link com.sun.star.beans.XPropertySet} interface that gives access to the properties of the unloaded graphic
    *
    * In most cases, this method will be used to query the mime type of the graphic and, in the case of pixel graphics, the resulting size after loading
    * @param MediaProperties A sequence of property values to describe the location of the graphic, for which the attributes should be returned
    * @returns A {@link com.sun.star.beans.XPropertySet} interface to get access to the different graphic properties
    * @see MediaProperties
    * @see GraphicDescriptor
    * @see com.sun.star.beans.PropertyValues
    */
  def queryGraphicDescriptor(MediaProperties: PropertyValues): XPropertySet
  
  /**
    * Store the graphic content, represented through the {@link XGraphic} interface at the specified location
    * @param Graphic The graphic that should be stored
    * @param MediaProperties A sequence of property values to describe the destination location of the graphic
    * @see XGraphic
    * @see MediaProperties
    * @see com.sun.star.beans.PropertyValues
    */
  def storeGraphic(Graphic: XGraphic, MediaProperties: PropertyValues): Unit
}
object XGraphicProvider {
  
  inline def apply(
    acquire: Callback,
    queryGraphic: PropertyValues => XGraphic,
    queryGraphicDescriptor: PropertyValues => XPropertySet,
    queryInterface: `type` => Any,
    release: Callback,
    storeGraphic: (XGraphic, PropertyValues) => Callback
  ): XGraphicProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryGraphic = js.Any.fromFunction1(queryGraphic), queryGraphicDescriptor = js.Any.fromFunction1(queryGraphicDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, storeGraphic = js.Any.fromFunction2((t0: XGraphic, t1: PropertyValues) => (storeGraphic(t0, t1)).runNow()))
    __obj.asInstanceOf[XGraphicProvider]
  }
  
  extension [Self <: XGraphicProvider](x: Self) {
    
    inline def setQueryGraphic(value: PropertyValues => XGraphic): Self = StObject.set(x, "queryGraphic", js.Any.fromFunction1(value))
    
    inline def setQueryGraphicDescriptor(value: PropertyValues => XPropertySet): Self = StObject.set(x, "queryGraphicDescriptor", js.Any.fromFunction1(value))
    
    inline def setStoreGraphic(value: (XGraphic, PropertyValues) => Callback): Self = StObject.set(x, "storeGraphic", js.Any.fromFunction2((t0: XGraphic, t1: PropertyValues) => (value(t0, t1)).runNow()))
  }
}
