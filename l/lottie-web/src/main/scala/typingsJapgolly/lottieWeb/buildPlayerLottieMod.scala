package typingsJapgolly.lottieWeb

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.lottieWeb.mod.LottiePlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPlayerLottieMod extends Shortcut {
  
  @JSImport("lottie-web/build/player/lottie", JSImport.Default)
  @js.native
  val default: LottiePlayer = js.native
  
  type _To = LottiePlayer
  
  /* This means you don't have to write `default`, but can instead just say `buildPlayerLottieMod.foo` */
  override def _to: LottiePlayer = default
}
