package typingsJapgolly.storybookReactNative

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsStoryViewMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/StoryView", JSImport.Default)
  @js.native
  open class default () extends StoryView
  
  trait Props extends StObject {
    
    var onDevice: js.UndefOr[Boolean] = js.undefined
    
    var stories: Any
    
    var url: String
  }
  object Props {
    
    inline def apply(stories: Any, url: String): Props = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnDevice(value: Boolean): Self = StObject.set(x, "onDevice", value.asInstanceOf[js.Any])
      
      inline def setOnDeviceUndefined: Self = StObject.set(x, "onDevice", js.undefined)
      
      inline def setStories(value: Any): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoryView
    extends Component[Props, js.Object, Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MStoryView(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MStoryView(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MStoryView(): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def renderHelp(): Element = js.native
    
    def renderOnDeviceUIHelp(): Element = js.native
  }
}
