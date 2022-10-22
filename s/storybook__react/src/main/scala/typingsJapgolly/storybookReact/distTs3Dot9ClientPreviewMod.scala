package typingsJapgolly.storybookReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.ClientStoryApi
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.Loadable
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.Parameters
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typingsJapgolly.storybookReact.distTs3Dot9ClientPreviewTypesMod.IStorybookSection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ], 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "addParameters")
  @js.native
  val addParameters: js.Function1[
    /* parameter */ Parameters, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "raw")
  @js.native
  val raw: js.Function0[Any] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ Any, Unit] = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/preview", "storiesOf")
  @js.native
  val storiesOf: js.Function2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ /* kind */ Any, 
    /* module */ NodeModule, 
    StoryApi[
      /* import warning: importer.ImportType#apply Failed type conversion: @storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult'] */ js.Any
    ]
  ] = js.native
  
  trait ClientApi
    extends StObject
       with ClientStoryApi[Element] {
    
    def clearDecorators(): Unit
    
    def configure(loader: Loadable, module: NodeModule): Unit
    
    def forceReRender(): Unit
    
    def getStorybook(): js.Array[IStorybookSection]
    
    def raw(): Any
    
    def setAddon(addon: Any): Unit
  }
  object ClientApi {
    
    inline def apply(
      addDecorator: DecoratorFunction[Element] => StoryApi[Element],
      addParameters: Parameters => StoryApi[Element],
      clearDecorators: Callback,
      configure: (Loadable, NodeModule) => Callback,
      forceReRender: Callback,
      getStorybook: CallbackTo[js.Array[IStorybookSection]],
      raw: CallbackTo[Any],
      setAddon: Any => Callback,
      storiesOf: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryKind */ Any, NodeModule) => StoryApi[Element]
    ): ClientApi = {
      val __obj = js.Dynamic.literal(addDecorator = js.Any.fromFunction1(addDecorator), addParameters = js.Any.fromFunction1(addParameters), clearDecorators = clearDecorators.toJsFn, configure = js.Any.fromFunction2((t0: Loadable, t1: NodeModule) => (configure(t0, t1)).runNow()), forceReRender = forceReRender.toJsFn, getStorybook = getStorybook.toJsFn, raw = raw.toJsFn, setAddon = js.Any.fromFunction1((t0: Any) => setAddon(t0).runNow()), storiesOf = js.Any.fromFunction2(storiesOf))
      __obj.asInstanceOf[ClientApi]
    }
    
    extension [Self <: ClientApi](x: Self) {
      
      inline def setClearDecorators(value: Callback): Self = StObject.set(x, "clearDecorators", value.toJsFn)
      
      inline def setConfigure(value: (Loadable, NodeModule) => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction2((t0: Loadable, t1: NodeModule) => (value(t0, t1)).runNow()))
      
      inline def setForceReRender(value: Callback): Self = StObject.set(x, "forceReRender", value.toJsFn)
      
      inline def setGetStorybook(value: CallbackTo[js.Array[IStorybookSection]]): Self = StObject.set(x, "getStorybook", value.toJsFn)
      
      inline def setRaw(value: CallbackTo[Any]): Self = StObject.set(x, "raw", value.toJsFn)
      
      inline def setSetAddon(value: Any => Callback): Self = StObject.set(x, "setAddon", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  type DecoratorFn = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(decorator : @storybook/addons.@storybook/addons/dist/ts3.9/types.DecoratorFunction<@storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult']>): @storybook/addons.@storybook/addons/dist/ts3.9/types.StoryApi<@storybook/react.@storybook/react/dist/ts3.9/client/preview/types-6-0.ReactFramework['storyResult']>>[0] */ js.Any
}
