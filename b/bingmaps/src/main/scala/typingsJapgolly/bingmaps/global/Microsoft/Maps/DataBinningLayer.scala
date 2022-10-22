package typingsJapgolly.bingmaps.global.Microsoft.Maps

import typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.DataBinningLayer")
@js.native
/**
  * Initializes the data binning layer.
  * @param pushpins The array of pushpins that are used to generate the data bins.
  * @param options The options used for calculating and rendering the data bins.
  */
open class DataBinningLayer ()
  extends StObject
     with typingsJapgolly.bingmaps.Microsoft.Maps.DataBinningLayer {
  def this(pushpins: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.Pushpin]) = this()
  def this(pushpins: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.Pushpin], options: IDataBinningOptions) = this()
  def this(pushpins: Unit, options: IDataBinningOptions) = this()
  
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): Unit = js.native
}
