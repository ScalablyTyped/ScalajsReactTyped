package typingsJapgolly.bingmaps.global.Microsoft.Maps

import org.scalajs.dom.HTMLElement
import typingsJapgolly.bingmaps.Microsoft.Maps.ICustomOverlayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.CustomOverlay")
@js.native
/**
  * @constructor
  * @param options The options to use when initializing the custom overlay.
  */
open class CustomOverlay ()
  extends StObject
     with typingsJapgolly.bingmaps.Microsoft.Maps.CustomOverlay {
  def this(options: ICustomOverlayOptions) = this()
  
  /** A reference the the map instance that the overlay was added to. This will be null until the onLoad function has fired. **/
  /* CompleteClass */
  var _map: typingsJapgolly.bingmaps.Microsoft.Maps.Map = js.native
  
  /**
    * Gets the html element of this custom overlay.
    * @returns The htmlElement of this overlay.
    */
  /* CompleteClass */
  override def getHtmlElement(): HTMLElement = js.native
  
  /**
    * Gets the map that this overlay is attached to.
    * @returns The map that this overlay is attached to.
    */
  /* CompleteClass */
  override def getMap(): typingsJapgolly.bingmaps.Microsoft.Maps.Map = js.native
  
  /**
    * Implement this method to perform any task that should be done when the overlay is added to the map.
    */
  /* CompleteClass */
  override def onAdd(): Unit = js.native
  
  /**
    * Implement this method to perform any tasks that should be done when the overlay is removed from the map.
    */
  /* CompleteClass */
  override def onLoad(): Unit = js.native
  
  /**
    * Implement this methof to perform any task that should be done after the overlay has been added to the map.
    */
  /* CompleteClass */
  override def onRemove(): Unit = js.native
  
  /**
    * Updates the html element of this custom overlay.
    * @param htmlElement The new htmlElement to set for the overlay.
    */
  /* CompleteClass */
  override def setHtmlElement(htmlElement: HTMLElement): Unit = js.native
}
