package typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod

import typingsJapgolly.reactNavigationStack.anon.OmitSpringAnimationConfig
import typingsJapgolly.reactNavigationStack.anon.OmitTimingAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactNavigationStack.anon.Animation
  - typingsJapgolly.reactNavigationStack.anon.Config
*/
trait TransitionSpec extends StObject
object TransitionSpec {
  
  inline def Animation(config: OmitSpringAnimationConfig): typingsJapgolly.reactNavigationStack.anon.Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNavigationStack.anon.Animation]
  }
  
  inline def Config(config: OmitTimingAnimationConfig): typingsJapgolly.reactNavigationStack.anon.Config = {
    val __obj = js.Dynamic.literal(animation = "timing", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactNavigationStack.anon.Config]
  }
}
