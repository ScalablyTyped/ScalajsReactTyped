package typingsJapgolly.storybookCore

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Element
import typingsJapgolly.storybookCoreClient.anon.Configure
import typingsJapgolly.storybookCoreClient.anon.DecorateStory
import typingsJapgolly.storybookCoreClient.anon.FnCall
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.RenderContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@storybook/core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core", "default.ClientApi")
    @js.native
    open class ClientApi[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
      extends typingsJapgolly.storybookClientApi.mod.ClientApi[TFramework]
    @JSImport("@storybook/core", "default.ClientApi")
    @js.native
    def ClientApi: Instantiable0[
        typingsJapgolly.storybookClientApi.mod.ClientApi[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
        ]
      ] = js.native
    inline def ClientApi_=(
      x: Instantiable0[
          typingsJapgolly.storybookClientApi.mod.ClientApi[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClientApi")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("@storybook/core", "default.StoryStore")
    @js.native
    open class StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
      extends typingsJapgolly.storybookStore.mod.StoryStore[TFramework]
    @JSImport("@storybook/core", "default.StoryStore")
    @js.native
    def StoryStore: Instantiable0[
        typingsJapgolly.storybookStore.mod.StoryStore[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
        ]
      ] = js.native
    inline def StoryStore_=(
      x: Instantiable0[
          typingsJapgolly.storybookStore.mod.StoryStore[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoryStore")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/core", "default.start")
    @js.native
    def start: FnCall = js.native
    inline def start_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
    
    inline def toId(kind: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@storybook/core", "ClientApi")
  @js.native
  open class ClientApi[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typingsJapgolly.storybookCoreClient.mod.ClientApi[TFramework] {
    def this(hasStoryStore: typingsJapgolly.storybookClientApi.anon.StoryStore[TFramework]) = this()
  }
  
  @JSImport("@storybook/core", "StoryStore")
  @js.native
  open class StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typingsJapgolly.storybookCoreClient.mod.StoryStore[TFramework]
  
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](): typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    renderToDOM: js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ]
  ): typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    renderToDOM: js.Function2[
      /* context */ RenderContext[TFramework], 
      /* element */ Element, 
      js.Promise[Unit] | Unit
    ],
    hasDecorateStoryRender: DecorateStory[TFramework]
  ): typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any], hasDecorateStoryRender.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  inline def start[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](renderToDOM: Unit, hasDecorateStoryRender: DecorateStory[TFramework]): typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(renderToDOM.asInstanceOf[js.Any], hasDecorateStoryRender.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.storybookCoreClient.anon.ClientApi | Configure[TFramework]]
  
  inline def toId(kind: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toId")(kind.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
