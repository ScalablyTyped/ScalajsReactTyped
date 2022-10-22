package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.node.NodeModule
import typingsJapgolly.std.Parameters
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typingsJapgolly.storybookClientApi.anon.GlobalTypes
import typingsJapgolly.storybookClientApi.distTs3Dot9ClientApiMod.GetStorybookKind
import typingsJapgolly.storybookReactNative.anon.Instantiable
import typingsJapgolly.storybookReactNative.anon.PartialParams
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.BoundStory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@storybook/react-native/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react-native/dist", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ /* decorator */ Any, 
    Unit
  ] = js.native
  
  @JSImport("@storybook/react-native/dist", "addParameters")
  @js.native
  val addParameters: js.Function1[
    /* hasGlobalsGlobalTypesParameters */ (Parameters[js.Function1[/* args */ Any, Any]]) & GlobalTypes, 
    Unit
  ] = js.native
  
  @JSImport("@storybook/react-native/dist", "clearDecorators")
  @js.native
  val clearDecorators: js.Function0[Unit] = js.native
  
  inline def configure(loadStories: js.Function0[Unit], module: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(loadStories.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@storybook/react-native/dist", "getStorybook")
  @js.native
  val getStorybook: js.Function0[
    js.Array[
      GetStorybookKind[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ]
    ]
  ] = js.native
  
  inline def getStorybookUI(): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookUI")().asInstanceOf[Instantiable]
  inline def getStorybookUI(params: PartialParams): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("getStorybookUI")(params.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  
  @JSImport("@storybook/react-native/dist", "raw")
  @js.native
  val raw: js.Function0[
    js.Array[
      BoundStory[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
      ]
    ]
  ] = js.native
  
  @JSImport("@storybook/react-native/dist", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ Any, Unit] = js.native
  
  inline def storiesOf(kind: String, module: NodeModule): StoryApi[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("storiesOf")(kind.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[StoryApi[Node]]
}
