package typingsJapgolly.hlsJs.mod

import typingsJapgolly.hlsJs.anon.Bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "Level")
@js.native
open class Level protected () extends StObject {
  def this(data: LevelParsed) = this()
  
  /* private */ var _urlId: Any = js.native
  
  val attrs: LevelAttributes = js.native
  
  val audioCodec: js.UndefOr[String] = js.native
  
  var audioGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  val bitrate: Double = js.native
  
  val codecSet: String = js.native
  
  var details: js.UndefOr[LevelDetails] = js.native
  
  var fragmentError: Double = js.native
  
  val height: Double = js.native
  
  val id: Double = js.native
  
  var loadError: Double = js.native
  
  var loaded: js.UndefOr[Bytes] = js.native
  
  def maxBitrate: Double = js.native
  
  val name: js.UndefOr[String] = js.native
  
  var realBitrate: Double = js.native
  
  var textGroupIds: js.UndefOr[js.Array[String]] = js.native
  
  val unknownCodecs: js.UndefOr[js.Array[String]] = js.native
  
  def uri: String = js.native
  
  var url: js.Array[String] = js.native
  
  def urlId: Double = js.native
  def urlId_=(value: Double): Unit = js.native
  
  val videoCodec: js.UndefOr[String] = js.native
  
  val width: Double = js.native
}
