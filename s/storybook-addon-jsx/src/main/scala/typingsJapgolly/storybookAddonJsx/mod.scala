package typingsJapgolly.storybookAddonJsx

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddonJsx.anon.AddWithJSX
import typingsJapgolly.storybookAddonJsx.anon.ParametersjsxAddonParamet
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.StoryApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storybook-addon-jsx", "jsxDecorator")
  @js.native
  val jsxDecorator: DecoratorFunction[Element] = js.native
  
  type AddWithJSXFunc[StoryFnReturnType] = js.Function3[
    /* kind */ String, 
    /* fn */ js.Function0[Node], 
    /* options */ js.UndefOr[AddonParameters], 
    StoryApi[StoryFnReturnType]
  ]
  
  trait AddonParameters extends StObject {
    
    var displayName: js.UndefOr[String | displayNameFunc] = js.undefined
    
    var enableBeautify: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeRender: js.UndefOr[js.Function1[/* domString */ String, String]] = js.undefined
    
    var skip: js.UndefOr[Double] = js.undefined
  }
  object AddonParameters {
    
    inline def apply(): AddonParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddonParameters]
    }
    
    extension [Self <: AddonParameters](x: Self) {
      
      inline def setDisplayName(value: String | displayNameFunc): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameFunction1(value: /* element */ Element => String): Self = StObject.set(x, "displayName", js.Any.fromFunction1(value))
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnableBeautify(value: Boolean): Self = StObject.set(x, "enableBeautify", value.asInstanceOf[js.Any])
      
      inline def setEnableBeautifyUndefined: Self = StObject.set(x, "enableBeautify", js.undefined)
      
      inline def setOnBeforeRender(value: /* domString */ String => String): Self = StObject.set(x, "onBeforeRender", js.Any.fromFunction1(value))
      
      inline def setOnBeforeRenderUndefined: Self = StObject.set(x, "onBeforeRender", js.undefined)
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  type displayNameFunc = js.Function1[/* element */ Element, String]
  
  /* augmented module */
  object storybookAddonsAugmentingMod {
    
    trait ClientStoryApi[StoryFnReturnType] extends StObject {
      
      def addDecorator(decorator: DecoratorFunction[StoryFnReturnType]): StoryApi[StoryFnReturnType]
      
      def addParameters(parameter: ParametersjsxAddonParamet): StoryApi[StoryFnReturnType]
      
      def storiesOf(kind: String, module: NodeModule): StoryApi[StoryFnReturnType] & AddWithJSX[StoryFnReturnType]
    }
    object ClientStoryApi {
      
      inline def apply[StoryFnReturnType](
        addDecorator: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType],
        addParameters: ParametersjsxAddonParamet => StoryApi[StoryFnReturnType],
        storiesOf: (String, NodeModule) => StoryApi[StoryFnReturnType] & AddWithJSX[StoryFnReturnType]
      ): ClientStoryApi[StoryFnReturnType] = {
        val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), storiesOf = js.Any.fromFunction2(storiesOf))
        __obj.asInstanceOf[ClientStoryApi[StoryFnReturnType]]
      }
      
      extension [Self <: ClientStoryApi[?], StoryFnReturnType](x: Self & ClientStoryApi[StoryFnReturnType]) {
        
        inline def setAddDecorator(value: DecoratorFunction[StoryFnReturnType] => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addDecorator", js.Any.fromFunction1(value))
        
        inline def setAddParameters(value: ParametersjsxAddonParamet => StoryApi[StoryFnReturnType]): Self = StObject.set(x, "addParameters", js.Any.fromFunction1(value))
        
        inline def setStoriesOf(value: (String, NodeModule) => StoryApi[StoryFnReturnType] & AddWithJSX[StoryFnReturnType]): Self = StObject.set(x, "storiesOf", js.Any.fromFunction2(value))
      }
    }
  }
}
