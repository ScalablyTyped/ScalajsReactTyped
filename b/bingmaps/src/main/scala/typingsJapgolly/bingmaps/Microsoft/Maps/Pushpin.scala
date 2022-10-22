package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pushpin
  extends StObject
     with IPrimitive {
  
  /**
    * Gets the point on the Pushpin icon which is anchored to the pushpin location.
    * An anchor of (0,0) is the top left corner of the icon.
    * @returns The point on the Pushpin icon which is anchored to the pushpin location.
    */
  def getAnchor(): Point
  
  /**
    * Gets whether the pushpin clicked style is enabled
    * @returns Whether the pushpin clicked style is enabled.
    */
  def getClickedStyleEnabled(): Boolean
  
  /**
    * Gets the color option of the pushpin.
    * @returns The color option of the pushpin.
    */
  def getColor(): String | Color
  
  /**
    * Gets a boolean indicating if the pushpin is draggable or not.
    * @returns A boolean indicating if the pushpin is draggable or not.
    */
  def getDraggable(): Boolean
  
  /**
    * Gets whether the pushpin hover style is enabled
    * @returns Whether the pushpin hover style is enabled.
    */
  def getHoverStyleEnabled(): Boolean
  
  /**
    * Gets the custom Pushpin source icon string which can be a url to an image or SVG, inline SVG string, or data URI.
    * @returns the custom Pushpin icon source string, which can be a url to an image or SVG, inline SVG string, or data URI.
    */
  def getIcon(): String
  
  /**
    * Returns the location of the pushpin.
    * @returns The location of the pushpin.
    */
  def getLocation(): Location
  
  /**
    * Returns whether the clickable area of the pushpin is an ellipse.
    * @returns A boolean indicating whether the clickable area of the pushpin is an ellipse.
    */
  def getRoundClickableArea(): Boolean
  
  /**
    * Gets the subtitle label of the Pushpin.
    * @returns The subtitle label of the Pushpin.
    */
  def getSubTitle(): String
  
  /**
    * Gets the text within the Pushpin icon.
    * @returns The text within the Pushpin icon.
    */
  def getText(): String
  
  /**
    * Gets the amount the text is shifted from the Pushpin icon.
    * @returns the amount the text is shifted from the Pushpin icon.
    */
  def getTextOffset(): Point
  
  /**
    * Gets the title label of the Pushpin.
    * @returns the title label of the Pushpin.
    */
  def getTitle(): String
  
  /**
    * Sets the location of the Pushpin.
    * @param location The location of the Pushpin.
    */
  def setLocation(location: Location): Unit
  
  /**
    * Sets the properties for the pushpin.
    * @param options The IPushpinOptions object containing the options to customize the pushpin.
    */
  def setOptions(options: IPushpinOptions): Unit
}
object Pushpin {
  
  inline def apply(
    getAnchor: CallbackTo[Point],
    getClickedStyleEnabled: CallbackTo[Boolean],
    getColor: CallbackTo[String | Color],
    getCursor: CallbackTo[String],
    getDraggable: CallbackTo[Boolean],
    getHoverStyleEnabled: CallbackTo[Boolean],
    getIcon: CallbackTo[String],
    getLocation: CallbackTo[Location],
    getRoundClickableArea: CallbackTo[Boolean],
    getSubTitle: CallbackTo[String],
    getText: CallbackTo[String],
    getTextOffset: CallbackTo[Point],
    getTitle: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLocation: Location => Callback,
    setOptions: IPushpinOptions => Callback
  ): Pushpin = {
    val __obj = js.Dynamic.literal(getAnchor = getAnchor.toJsFn, getClickedStyleEnabled = getClickedStyleEnabled.toJsFn, getColor = getColor.toJsFn, getCursor = getCursor.toJsFn, getDraggable = getDraggable.toJsFn, getHoverStyleEnabled = getHoverStyleEnabled.toJsFn, getIcon = getIcon.toJsFn, getLocation = getLocation.toJsFn, getRoundClickableArea = getRoundClickableArea.toJsFn, getSubTitle = getSubTitle.toJsFn, getText = getText.toJsFn, getTextOffset = getTextOffset.toJsFn, getTitle = getTitle.toJsFn, getVisible = getVisible.toJsFn, setLocation = js.Any.fromFunction1((t0: Location) => setLocation(t0).runNow()), setOptions = js.Any.fromFunction1((t0: IPushpinOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Pushpin]
  }
  
  extension [Self <: Pushpin](x: Self) {
    
    inline def setGetAnchor(value: CallbackTo[Point]): Self = StObject.set(x, "getAnchor", value.toJsFn)
    
    inline def setGetClickedStyleEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getClickedStyleEnabled", value.toJsFn)
    
    inline def setGetColor(value: CallbackTo[String | Color]): Self = StObject.set(x, "getColor", value.toJsFn)
    
    inline def setGetDraggable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDraggable", value.toJsFn)
    
    inline def setGetHoverStyleEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getHoverStyleEnabled", value.toJsFn)
    
    inline def setGetIcon(value: CallbackTo[String]): Self = StObject.set(x, "getIcon", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[Location]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setGetRoundClickableArea(value: CallbackTo[Boolean]): Self = StObject.set(x, "getRoundClickableArea", value.toJsFn)
    
    inline def setGetSubTitle(value: CallbackTo[String]): Self = StObject.set(x, "getSubTitle", value.toJsFn)
    
    inline def setGetText(value: CallbackTo[String]): Self = StObject.set(x, "getText", value.toJsFn)
    
    inline def setGetTextOffset(value: CallbackTo[Point]): Self = StObject.set(x, "getTextOffset", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[String]): Self = StObject.set(x, "getTitle", value.toJsFn)
    
    inline def setSetLocation(value: Location => Callback): Self = StObject.set(x, "setLocation", js.Any.fromFunction1((t0: Location) => value(t0).runNow()))
    
    inline def setSetOptions(value: IPushpinOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IPushpinOptions) => value(t0).runNow()))
  }
}
