package typingsJapgolly.devextreme.mod.DevExpress.viz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait baseSeriesObject extends StObject {
  
  /**
    * Switches the series from the hover state back to normal.
    */
  def clearHover(): Unit = js.native
  
  /**
    * Cancels the selection of this particular series. The series is displayed in its initial style.
    */
  def clearSelection(): Unit = js.native
  
  /**
    * Deselects the specified point. The point is displayed in an initial style.
    */
  def deselectPoint(point: basePointObject): Unit = js.native
  
  /**
    * Provides information about the state of the series object.
    */
  var fullState: js.UndefOr[Double] = js.native
  
  /**
    * Gets all points in the series.
    */
  def getAllPoints(): js.Array[basePointObject] = js.native
  
  /**
    * Gets the color of a particular series.
    */
  def getColor(): String = js.native
  
  /**
    * Gets a series point with the specified index.
    */
  def getPointByPos(positionIndex: Double): basePointObject = js.native
  
  def getPointsByArg(pointArg: String): js.Array[basePointObject] = js.native
  def getPointsByArg(pointArg: js.Date): js.Array[basePointObject] = js.native
  /**
    * Gets a series point with the specified argument value.
    */
  def getPointsByArg(pointArg: Double): js.Array[basePointObject] = js.native
  
  /**
    * Gets visible series points.
    */
  def getVisiblePoints(): js.Array[basePointObject] = js.native
  
  /**
    * Hides a series at runtime.
    */
  def hide(): Unit = js.native
  
  /**
    * Switches the series into the hover state, the same as when a user places the mouse pointer on it.
    */
  def hover(): Unit = js.native
  
  /**
    * Provides information about the hover state of a series.
    */
  def isHovered(): Boolean = js.native
  
  /**
    * Provides information about the selection state of a series.
    */
  def isSelected(): Boolean = js.native
  
  /**
    * Provides information about the visibility state of a series.
    */
  def isVisible(): Boolean = js.native
  
  /**
    * Returns the name of the series.
    */
  var name: js.UndefOr[Any] = js.native
  
  /**
    * Selects the series.
    */
  def select(): Unit = js.native
  
  /**
    * Selects the specified point. The point is displayed in a &apos;selected&apos; style.
    */
  def selectPoint(point: basePointObject): Unit = js.native
  
  /**
    * Makes a particular series visible.
    */
  def show(): Unit = js.native
  
  /**
    * Returns the tag of the series.
    */
  var tag: js.UndefOr[Any] = js.native
  
  /**
    * Returns the type of the series.
    */
  var `type`: js.UndefOr[String] = js.native
}
