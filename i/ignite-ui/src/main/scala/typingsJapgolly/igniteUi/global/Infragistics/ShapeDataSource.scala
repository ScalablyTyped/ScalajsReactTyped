package typingsJapgolly.igniteUi.global.Infragistics

import typingsJapgolly.igniteUi.ShapeDataSourceSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Infragistics.ShapeDataSource")
@js.native
open class ShapeDataSource protected ()
  extends StObject
     with typingsJapgolly.igniteUi.Infragistics.ShapeDataSource {
  def this(settings: ShapeDataSourceSettings) = this()
  
  /**
    * Returns the current converter instance
    */
  /* CompleteClass */
  override def converter(): js.Object = js.native
  
  /**
    * Loads to the current data source
    */
  /* CompleteClass */
  override def dataBind(): Unit = js.native
  
  /* CompleteClass */
  override def dataView(): Unit = js.native
  
  /**
    * Returns true if data is loaded
    */
  /* CompleteClass */
  override def isBound(): Boolean = js.native
}
