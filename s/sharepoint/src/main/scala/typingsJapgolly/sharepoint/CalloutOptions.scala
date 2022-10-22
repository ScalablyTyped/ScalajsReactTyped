package typingsJapgolly.sharepoint

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutOptions extends StObject {
  
  /** Some unique id for the callout. */
  var ID: String
  
  /** One of the following: "topBottom" (default) or "leftRight". */
  var beakOrientation: String
  
  /** If defined, callout will be inscribed into the bounding element. */
  var boundingBox: HTMLElement
  
  /** String (HTML allowed) that represents contents of the callout window. */
  var content: String
  
  /** HTML element that represents contents of the callout window. */
  var contentElement: HTMLElement
  
  /** Content element's width in pixels. By default = 350. */
  var contentWidth: Double
  
  /** Element on that the callout is shown. */
  var launchPoint: HTMLElement
  
  /** Fires right after the callout is closed */
  def onClosedCallback(callout: Callout): Unit
  
  /** Fires right before the callout is closed */
  def onClosingCallback(callout: Callout): Unit
  
  /** Fires right after the callout is shown */
  def onOpenedCallback(callout: Callout): Unit
  
  /** Fires after the callout is rendered but before it is positioned and shown */
  def onOpeningCallback(callout: Callout): Unit
  
  /** Defines opening behavior */
  var openOptions: CalloutOpenOptions
  
  /** Sets the position of the callout during its opening phase. For an example of a position algorithm function, please explore defaultPositionAlgorithm function from the callout.debug.js file */
  def positionAlgorithm(callout: Callout): Unit
  
  /** Title for the callout */
  var title: String
}
object CalloutOptions {
  
  inline def apply(
    ID: String,
    beakOrientation: String,
    boundingBox: HTMLElement,
    content: String,
    contentElement: HTMLElement,
    contentWidth: Double,
    launchPoint: HTMLElement,
    onClosedCallback: Callout => Callback,
    onClosingCallback: Callout => Callback,
    onOpenedCallback: Callout => Callback,
    onOpeningCallback: Callout => Callback,
    openOptions: CalloutOpenOptions,
    positionAlgorithm: Callout => Callback,
    title: String
  ): CalloutOptions = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], beakOrientation = beakOrientation.asInstanceOf[js.Any], boundingBox = boundingBox.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentElement = contentElement.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], launchPoint = launchPoint.asInstanceOf[js.Any], onClosedCallback = js.Any.fromFunction1((t0: Callout) => onClosedCallback(t0).runNow()), onClosingCallback = js.Any.fromFunction1((t0: Callout) => onClosingCallback(t0).runNow()), onOpenedCallback = js.Any.fromFunction1((t0: Callout) => onOpenedCallback(t0).runNow()), onOpeningCallback = js.Any.fromFunction1((t0: Callout) => onOpeningCallback(t0).runNow()), openOptions = openOptions.asInstanceOf[js.Any], positionAlgorithm = js.Any.fromFunction1((t0: Callout) => positionAlgorithm(t0).runNow()), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutOptions]
  }
  
  extension [Self <: CalloutOptions](x: Self) {
    
    inline def setBeakOrientation(value: String): Self = StObject.set(x, "beakOrientation", value.asInstanceOf[js.Any])
    
    inline def setBoundingBox(value: HTMLElement): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentElement(value: HTMLElement): Self = StObject.set(x, "contentElement", value.asInstanceOf[js.Any])
    
    inline def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setLaunchPoint(value: HTMLElement): Self = StObject.set(x, "launchPoint", value.asInstanceOf[js.Any])
    
    inline def setOnClosedCallback(value: Callout => Callback): Self = StObject.set(x, "onClosedCallback", js.Any.fromFunction1((t0: Callout) => value(t0).runNow()))
    
    inline def setOnClosingCallback(value: Callout => Callback): Self = StObject.set(x, "onClosingCallback", js.Any.fromFunction1((t0: Callout) => value(t0).runNow()))
    
    inline def setOnOpenedCallback(value: Callout => Callback): Self = StObject.set(x, "onOpenedCallback", js.Any.fromFunction1((t0: Callout) => value(t0).runNow()))
    
    inline def setOnOpeningCallback(value: Callout => Callback): Self = StObject.set(x, "onOpeningCallback", js.Any.fromFunction1((t0: Callout) => value(t0).runNow()))
    
    inline def setOpenOptions(value: CalloutOpenOptions): Self = StObject.set(x, "openOptions", value.asInstanceOf[js.Any])
    
    inline def setPositionAlgorithm(value: Callout => Callback): Self = StObject.set(x, "positionAlgorithm", js.Any.fromFunction1((t0: Callout) => value(t0).runNow()))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
