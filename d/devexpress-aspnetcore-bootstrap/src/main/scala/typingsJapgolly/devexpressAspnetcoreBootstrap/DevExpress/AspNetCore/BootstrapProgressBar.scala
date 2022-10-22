package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapProgressBar
  extends StObject
     with Control {
  
  def getCaption(): String = js.native
  
  def getDisplayText(): String = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getMaximum(): Double = js.native
  
  def getMinimum(): Double = js.native
  
  def getPercent(): Double = js.native
  
  def getPosition(): Double = js.native
  
  def getValue(): Any = js.native
  
  def off(
    eventName: Unit,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  
  def setCaption(caption: String): Unit = js.native
  
  def setCustomDisplayFormat(text: String): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setMaximum(max: Double): Unit = js.native
  
  def setMinMaxValues(minValue: Double, maxValue: Double): Unit = js.native
  
  def setMinimum(min: Double): Unit = js.native
  
  def setPosition(position: Double): Unit = js.native
  
  def setValue(value: Any): Unit = js.native
}
