package typingsJapgolly.googleEarth.global.google.earth

import typingsJapgolly.googleEarth.google.earth.GEVisibilityEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.GETimeControl")
@js.native
open class GETimeControl ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.GETimeControl {
  
  /**
    * Returns an array containing the KmlTimeStamp objects associated with the historical imagery available in this view.
    */
  /* CompleteClass */
  override def getAvailableImageDates(): typingsJapgolly.googleEarth.google.earth.KmlObjectList[typingsJapgolly.googleEarth.google.earth.KmlTimeStamp] = js.native
  
  /**
    * Returns the clock rate that the plugin would use, if the play button on the time slider UI was pressed.
    * This rate is calculated by the plugin based on the time range currently present in the slider.
    */
  /* CompleteClass */
  override def getCalculatedRate(): Double = js.native
  
  /**
    * Returns a KmlTimeSpan object encompassing the earliest and latest times present in the time slider.
    * For more information, refer to the Time chapter of the Developer's Guide.
    */
  /* CompleteClass */
  override def getExtents(): typingsJapgolly.googleEarth.google.earth.KmlTimeSpan = js.native
  
  /**
    * Whether the time slider is visible or not.
    */
  /* CompleteClass */
  override def getVisibility(): GEVisibilityEnum = js.native
  
  /**
    * Specifies whether the control is visible or hidden.
    */
  /* CompleteClass */
  override def setVisibility(visibility: GEVisibilityEnum): Unit = js.native
}
