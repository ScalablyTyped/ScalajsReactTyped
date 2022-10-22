package typingsJapgolly.storybookReactNative.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookReactNative.distPreviewComponentsStoryViewMod.Props
import typingsJapgolly.storybookReactNative.distPreviewComponentsStoryViewMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StoryView {
  
  inline def apply(stories: Any, url: String): Builder = {
    val __props = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryView", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onDevice(value: Boolean): this.type = set("onDevice", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
