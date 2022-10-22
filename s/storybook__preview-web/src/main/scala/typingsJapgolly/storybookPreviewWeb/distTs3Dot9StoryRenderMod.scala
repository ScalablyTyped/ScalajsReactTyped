package typingsJapgolly.storybookPreviewWeb

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Pick
import typingsJapgolly.storybookAddons.mod.Channel
import typingsJapgolly.storybookPreviewWeb.anon.ForceRemount
import typingsJapgolly.storybookPreviewWeb.anon.ViewModeChangedBoolean
import typingsJapgolly.storybookStore.anon.Description
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.RenderContext
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.Story
import typingsJapgolly.storybookStore.mod.StoryStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9StoryRenderMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/StoryRender", "PREPARE_ABORTED")
  @js.native
  val PREPARE_ABORTED: js.Error = js.native
  
  @JSImport("@storybook/preview-web/dist/ts3.9/StoryRender", "StoryRender")
  @js.native
  open class StoryRender[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] protected ()
    extends StObject
       with Render[TFramework] {
    def this(
      channel: Channel,
      store: StoryStore[TFramework],
      renderToScreen: js.Function2[
            /* renderContext */ RenderContext[TFramework], 
            /* canvasElement */ HTMLElement, 
            Unit | js.Promise[Unit]
          ],
      callbacks: RenderContextCallbacks[TFramework],
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any
    ) = this()
    def this(
      channel: Channel,
      store: StoryStore[TFramework],
      renderToScreen: js.Function2[
            /* renderContext */ RenderContext[TFramework], 
            /* canvasElement */ HTMLElement, 
            Unit | js.Promise[Unit]
          ],
      callbacks: RenderContextCallbacks[TFramework],
      id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any,
      story: Story[TFramework]
    ) = this()
    
    /* private */ var abortController: Any = js.native
    
    /* private */ var callbacks: Any = js.native
    
    def cancelRender(): Unit = js.native
    
    /* private */ var canvasElement: Any = js.native
    
    var channel: Channel = js.native
    
    def context(): Pick[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework, imported_csf.Args> */ Any, 
        String | Double
      ] = js.native
    
    def isEqual(): Boolean = js.native
    def isEqual(other: Render[TFramework]): Boolean = js.native
    
    def isPending(): Boolean = js.native
    
    /* private */ var notYetRendered: Any = js.native
    
    var phase: js.UndefOr[RenderPhase] = js.native
    
    def prepare(): js.Promise[Unit] = js.native
    
    def remount(): js.Promise[Unit] = js.native
    
    def render(): js.Promise[Unit] = js.native
    def render(hasInitialForceRemount: ForceRemount): js.Promise[Unit] = js.native
    
    /* private */ var renderToScreen: Any = js.native
    
    def rerender(): js.Promise[Unit] = js.native
    
    /* private */ var runPhase: Any = js.native
    
    var store: StoryStore[TFramework] = js.native
    
    def teardown(): js.Promise[Unit] = js.native
    def teardown(options: js.Object): js.Promise[Unit] = js.native
    
    var viewMode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ViewMode */ Any = js.native
  }
  
  @js.native
  trait Render[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var disableKeyListeners: Boolean = js.native
    
    var id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any = js.native
    
    def isPreparing(): Boolean = js.native
    
    def renderToElement(canvasElement: HTMLElement): js.Promise[Unit] = js.native
    def renderToElement(canvasElement: HTMLElement, renderStoryToElement: Any): js.Promise[Unit] = js.native
    
    var story: js.UndefOr[Story[TFramework]] = js.native
    
    def teardown(options: ViewModeChangedBoolean): js.Promise[Unit] = js.native
  }
  
  /* Inlined std.Pick<@storybook/store.@storybook/store.RenderContext<TFramework>, 'showMain' | 'showError' | 'showException'> */
  trait RenderContextCallbacks[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
    
    var showError: js.Function1[/* error */ Description, Unit]
    
    var showException: js.Function1[/* err */ js.Error, Unit]
    
    var showMain: js.Function0[Unit]
  }
  object RenderContextCallbacks {
    
    inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
      showError: /* error */ Description => Callback,
      showException: /* err */ js.Error => Callback,
      showMain: Callback
    ): RenderContextCallbacks[TFramework] = {
      val __obj = js.Dynamic.literal(showError = js.Any.fromFunction1((t0: /* error */ Description) => showError(t0).runNow()), showException = js.Any.fromFunction1((t0: /* err */ js.Error) => showException(t0).runNow()), showMain = showMain.toJsFn)
      __obj.asInstanceOf[RenderContextCallbacks[TFramework]]
    }
    
    extension [Self <: RenderContextCallbacks[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & RenderContextCallbacks[TFramework]) {
      
      inline def setShowError(value: /* error */ Description => Callback): Self = StObject.set(x, "showError", js.Any.fromFunction1((t0: /* error */ Description) => value(t0).runNow()))
      
      inline def setShowException(value: /* err */ js.Error => Callback): Self = StObject.set(x, "showException", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setShowMain(value: Callback): Self = StObject.set(x, "showMain", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.preparing
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.loading
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.rendering
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.playing
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.played
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.completed
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.aborted
    - typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.errored
  */
  trait RenderPhase extends StObject
  object RenderPhase {
    
    inline def aborted: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.aborted = "aborted".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.aborted]
    
    inline def completed: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.completed = "completed".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.completed]
    
    inline def errored: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.errored = "errored".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.errored]
    
    inline def loading: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.loading = "loading".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.loading]
    
    inline def played: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.played = "played".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.played]
    
    inline def playing: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.playing = "playing".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.playing]
    
    inline def preparing: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.preparing = "preparing".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.preparing]
    
    inline def rendering: typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.rendering = "rendering".asInstanceOf[typingsJapgolly.storybookPreviewWeb.storybookPreviewWebStrings.rendering]
  }
}
