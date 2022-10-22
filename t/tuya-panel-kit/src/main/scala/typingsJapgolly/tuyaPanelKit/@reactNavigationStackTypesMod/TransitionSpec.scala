package typingsJapgolly.tuyaPanelKit.`@reactNavigationStackTypesMod`

import typingsJapgolly.tuyaPanelKit.anon.OmitSpringAnimationConfig
import typingsJapgolly.tuyaPanelKit.anon.OmitTimingAnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tuyaPanelKit.anon.Animation
  - typingsJapgolly.tuyaPanelKit.anon.Config
*/
trait TransitionSpec extends StObject
object TransitionSpec {
  
  inline def Animation(config: OmitSpringAnimationConfig): typingsJapgolly.tuyaPanelKit.anon.Animation = {
    val __obj = js.Dynamic.literal(animation = "spring", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.Animation]
  }
  
  inline def Config(config: OmitTimingAnimationConfig): typingsJapgolly.tuyaPanelKit.anon.Config = {
    val __obj = js.Dynamic.literal(animation = "timing", config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.tuyaPanelKit.anon.Config]
  }
}
