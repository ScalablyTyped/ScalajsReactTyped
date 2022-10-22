package typingsJapgolly.storybookCoreClient

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.node.NodeModule
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.storybookCoreClient.distTs3Dot9PreviewTypesMod.Loadable
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddDecorator extends StObject {
    
    def addDecorator(): scala.Nothing
    
    def addLoader(): scala.Nothing
    
    def addParameters(): scala.Nothing
    
    def clearDecorators(): scala.Nothing
    
    def getStorybook(): scala.Nothing
    
    def raw(): scala.Nothing
    
    def setAddon(): scala.Nothing
    
    def storiesOf(): scala.Nothing
  }
  object AddDecorator {
    
    inline def apply(
      addDecorator: CallbackTo[scala.Nothing],
      addLoader: CallbackTo[scala.Nothing],
      addParameters: CallbackTo[scala.Nothing],
      clearDecorators: CallbackTo[scala.Nothing],
      getStorybook: CallbackTo[scala.Nothing],
      raw: CallbackTo[scala.Nothing],
      setAddon: CallbackTo[scala.Nothing],
      storiesOf: CallbackTo[scala.Nothing]
    ): AddDecorator = {
      val __obj = js.Dynamic.literal(addDecorator = addDecorator.toJsFn, addLoader = addLoader.toJsFn, addParameters = addParameters.toJsFn, clearDecorators = clearDecorators.toJsFn, getStorybook = getStorybook.toJsFn, raw = raw.toJsFn, setAddon = setAddon.toJsFn, storiesOf = storiesOf.toJsFn)
      __obj.asInstanceOf[AddDecorator]
    }
    
    extension [Self <: AddDecorator](x: Self) {
      
      inline def setAddDecorator(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "addDecorator", value.toJsFn)
      
      inline def setAddLoader(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "addLoader", value.toJsFn)
      
      inline def setAddParameters(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "addParameters", value.toJsFn)
      
      inline def setClearDecorators(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "clearDecorators", value.toJsFn)
      
      inline def setGetStorybook(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "getStorybook", value.toJsFn)
      
      inline def setRaw(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "raw", value.toJsFn)
      
      inline def setSetAddon(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "setAddon", value.toJsFn)
      
      inline def setStoriesOf(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "storiesOf", value.toJsFn)
    }
  }
  
  trait Added extends StObject {
    
    var added: Map[String, Record[String, Any]]
    
    var removed: Map[String, Record[String, Any]]
  }
  object Added {
    
    inline def apply(added: Map[String, Record[String, Any]], removed: Map[String, Record[String, Any]]): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    extension [Self <: Added](x: Self) {
      
      inline def setAdded(value: Map[String, Record[String, Any]]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Map[String, Record[String, Any]]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientApi extends StObject {
    
    var clientApi: AddDecorator
    
    def configure(): scala.Nothing
    
    def forceReRender(): scala.Nothing
    
    def getStorybook(): scala.Nothing
    
    var raw: Unit
  }
  object ClientApi {
    
    inline def apply(
      clientApi: AddDecorator,
      configure: CallbackTo[scala.Nothing],
      forceReRender: CallbackTo[scala.Nothing],
      getStorybook: CallbackTo[scala.Nothing],
      raw: Unit
    ): ClientApi = {
      val __obj = js.Dynamic.literal(clientApi = clientApi.asInstanceOf[js.Any], configure = configure.toJsFn, forceReRender = forceReRender.toJsFn, getStorybook = getStorybook.toJsFn, raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientApi]
    }
    
    extension [Self <: ClientApi](x: Self) {
      
      inline def setClientApi(value: AddDecorator): Self = StObject.set(x, "clientApi", value.asInstanceOf[js.Any])
      
      inline def setConfigure(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "configure", value.toJsFn)
      
      inline def setForceReRender(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "forceReRender", value.toJsFn)
      
      inline def setGetStorybook(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "getStorybook", value.toJsFn)
      
      inline def setRaw(value: Unit): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Configure[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var clientApi: typingsJapgolly.storybookClientApi.mod.ClientApi[TFramework] = js.native
    
    def configure(framework: String, loadable: Loadable): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: Unit, showDeprecationWarning: Boolean): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: NodeModule): Unit = js.native
    def configure(framework: String, loadable: Loadable, m: NodeModule, showDeprecationWarning: Boolean): Unit = js.native
    
    def forceReRender(): Unit = js.native
    
    def getStorybook(): js.Array[Unit] = js.native
    
    def raw(): Unit = js.native
  }
  
  trait DecorateStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var decorateStory: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.WebProjectAnnotations<TFramework>['applyDecorators'] */ js.Any
      ] = js.undefined
    
    var render: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFn<TFramework> */ Any
      ] = js.undefined
  }
  object DecorateStory {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): DecorateStory[TFramework] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecorateStory[TFramework]]
    }
    
    extension [Self <: DecorateStory[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & DecorateStory[TFramework]) {
      
      inline def setDecorateStory(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/store.@storybook/store/dist/ts3.9/types.WebProjectAnnotations<TFramework>['applyDecorators'] */ js.Any
      ): Self = StObject.set(x, "decorateStory", value.asInstanceOf[js.Any])
      
      inline def setDecorateStoryUndefined: Self = StObject.set(x, "decorateStory", js.undefined)
      
      inline def setRender(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArgsStoryFn<TFramework> */ Any
      ): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): ClientApi | Configure[TFramework] = js.native
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      renderToDOM: js.Function2[
          /* context */ RenderContext[TFramework], 
          /* element */ Element, 
          js.Promise[Unit] | Unit
        ]
    ): ClientApi | Configure[TFramework] = js.native
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      renderToDOM: js.Function2[
          /* context */ RenderContext[TFramework], 
          /* element */ Element, 
          js.Promise[Unit] | Unit
        ],
      hasDecorateStoryRender: DecorateStory[TFramework]
    ): ClientApi | Configure[TFramework] = js.native
    def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](renderToDOM: Unit, hasDecorateStoryRender: DecorateStory[TFramework]): ClientApi | Configure[TFramework] = js.native
  }
}
