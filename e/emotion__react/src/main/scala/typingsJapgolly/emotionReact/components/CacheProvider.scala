package typingsJapgolly.emotionReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.emotionUtils.mod.EmotionCache
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CacheProvider {
  
  inline def apply(value: EmotionCache): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[EmotionCache]]))
  }
  
  @JSImport("@emotion/react", "CacheProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[EmotionCache]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
