package typingsJapgolly.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEncodingQuality extends js.Object

@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends js.Object {
  @js.native
  sealed trait auto extends AudioEncodingQuality
  
  @js.native
  sealed trait high extends AudioEncodingQuality
  
  @js.native
  sealed trait low extends AudioEncodingQuality
  
  @js.native
  sealed trait medium extends AudioEncodingQuality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncodingQuality with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 3 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 2 */ @js.native
  object medium extends TopLevel[medium with Double]
  
}

