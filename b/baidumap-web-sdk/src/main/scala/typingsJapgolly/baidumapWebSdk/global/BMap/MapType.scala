package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.BMap.MapTypeOptions
import typingsJapgolly.baidumapWebSdk.BMap.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.MapType")
@js.native
open class MapType protected ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.MapType {
  def this(name: String, layers: js.Array[typingsJapgolly.baidumapWebSdk.BMap.TileLayer]) = this()
  def this(name: String, layers: typingsJapgolly.baidumapWebSdk.BMap.TileLayer) = this()
  def this(
    name: String,
    layers: js.Array[typingsJapgolly.baidumapWebSdk.BMap.TileLayer],
    opts: MapTypeOptions
  ) = this()
  def this(name: String, layers: typingsJapgolly.baidumapWebSdk.BMap.TileLayer, opts: MapTypeOptions) = this()
  
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  
  /* CompleteClass */
  override def getName(): String = js.native
  
  /* CompleteClass */
  override def getProjection(): Projection = js.native
  
  /* CompleteClass */
  override def getTextColor(): String = js.native
  
  /* CompleteClass */
  override def getTileLayer(): typingsJapgolly.baidumapWebSdk.BMap.TileLayer = js.native
  
  /* CompleteClass */
  override def getTips(): String = js.native
}
