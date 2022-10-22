package typingsJapgolly.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GEHtmlStringBalloon")
@js.native
open class GEHtmlStringBalloon ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.GEHtmlStringBalloon {
  
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  /* CompleteClass */
  override def getBackgroundColor(): String = js.native
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  /* CompleteClass */
  override def getCloseButtonEnabled(): Boolean = js.native
  
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  /* CompleteClass */
  override def getContentString(): String = js.native
  
  /**
    * Determines what the balloon is attached to.
    */
  /* CompleteClass */
  override def getFeature(): typingsJapgolly.googleEarth.google.earth.KmlFeature = js.native
  
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  /* CompleteClass */
  override def getForegroundColor(): String = js.native
  
  /**
    * The ID of the balloon.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * Maximum height of the balloon.
    */
  /* CompleteClass */
  override def getMaxHeight(): Double = js.native
  
  /**
    * Maximum width of the balloon.
    */
  /* CompleteClass */
  override def getMaxWidth(): Double = js.native
  
  /**
    * Minimum height of the balloon.
    */
  /* CompleteClass */
  override def getMinHeight(): Double = js.native
  
  /**
    * Minimum width of the balloon.
    */
  /* CompleteClass */
  override def getMinWidth(): Double = js.native
  
  /**
    * The background color of the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, the default is interpreted as #FFFFFF.
    */
  /* CompleteClass */
  override def setBackgroundColor(backgroundColor: String): Unit = js.native
  
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  /* CompleteClass */
  override def setCloseButtonEnabled(closeButtonEnabled: Boolean): Unit = js.native
  
  /**
    * You can include any HTML using the contentString property.
    * When the balloon is visible, the content specified in contentString property,
    * is inserted directly into the balloon element in the web page.
    */
  /* CompleteClass */
  override def setContentString(contentString: String): Unit = js.native
  
  /**
    * Determines what the balloon is attached to.
    */
  /* CompleteClass */
  override def setFeature(feature: typingsJapgolly.googleEarth.google.earth.KmlFeature): Unit = js.native
  
  /**
    * The color of the text in the balloon.
    * This must be set using the HTML hex format #RRGGBB.
    * If not set, it is interpreted as #000000.
    */
  /* CompleteClass */
  override def setForegroundColor(foregroundColor: String): Unit = js.native
  
  /**
    * The ID of the balloon.
    */
  /* CompleteClass */
  override def setId(id: String): Unit = js.native
  
  /**
    * Maximum height of the balloon.
    */
  /* CompleteClass */
  override def setMaxHeight(maxHeight: Double): Unit = js.native
  
  /**
    * Maximum width of the balloon.
    */
  /* CompleteClass */
  override def setMaxWidth(maxWidth: Double): Unit = js.native
  
  /**
    * Minimum height of the balloon.
    */
  /* CompleteClass */
  override def setMinHeight(minHeight: Double): Unit = js.native
  
  /**
    * Minimum width of the balloon.
    */
  /* CompleteClass */
  override def setMinWidth(minWidth: Double): Unit = js.native
}
