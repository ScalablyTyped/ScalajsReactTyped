package typingsJapgolly.storybookPreviewWeb

import org.scalajs.dom.HTMLElement
import typingsJapgolly.storybookAddons.mod.Channel
import typingsJapgolly.storybookPreviewWeb.anon.ViewModeChanged
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9StoryRenderMod.Render
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9StoryRenderMod.StoryRender
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.Story
import typingsJapgolly.storybookStore.mod.StoryStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9DocsRenderMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/DocsRender", "DocsRender")
  @js.native
  open class DocsRender[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] protected ()
    extends StObject
       with Render[TFramework] {
    def this(
      channel: Channel,
      store: StoryStore[TFramework],
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      story: Story[TFramework]
    ) = this()
    
    /* private */ var canvasElement: Any = js.native
    
    /* private */ var channel: Any = js.native
    
    /* private */ var context: Any = js.native
    
    def render(): js.Promise[Unit] = js.native
    
    @JSName("renderToElement")
    def renderToElement_renderStoryToElement(
      canvasElement: HTMLElement,
      renderStoryToElement: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/preview-web.@storybook/preview-web/dist/ts3.9/PreviewWeb.PreviewWeb</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework * / any>['renderStoryToElement'] */ js.Any
    ): js.Promise[Unit] = js.native
    
    def rerender(isGlobals: Boolean): js.Promise[Unit] = js.native
    
    /* private */ var store: Any = js.native
    
    @JSName("story")
    var story_DocsRender: Story[TFramework] = js.native
    
    def teardown(): js.Promise[Unit] = js.native
    def teardown(hasViewModeChanged: ViewModeChanged): js.Promise[Unit] = js.native
  }
  /* static members */
  object DocsRender {
    
    @JSImport("@storybook/preview-web/dist/ts3.9/DocsRender", "DocsRender")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromStoryRender[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](storyRender: StoryRender[TFramework]): DocsRender[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStoryRender")(storyRender.asInstanceOf[js.Any]).asInstanceOf[DocsRender[TFramework]]
  }
}
