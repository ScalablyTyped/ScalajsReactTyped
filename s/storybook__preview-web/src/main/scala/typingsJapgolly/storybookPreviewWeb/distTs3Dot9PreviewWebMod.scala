package typingsJapgolly.storybookPreviewWeb

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.storybookPreviewWeb.anon.Description
import typingsJapgolly.storybookPreviewWeb.anon.PersistedArgs
import typingsJapgolly.storybookPreviewWeb.anon.ShowError
import typingsJapgolly.storybookPreviewWeb.anon.ViewModeChanged
import typingsJapgolly.storybookPreviewWeb.anon.`1`
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9PreviewMod.Preview
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9StoryRenderMod.Render
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9UrlStoreMod.UrlStore
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9WebViewMod.WebView
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.Selection
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.StorySpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9PreviewWebMod {
  
  @JSImport("@storybook/preview-web/dist/ts3.9/PreviewWeb", "PreviewWeb")
  @js.native
  open class PreviewWeb[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends Preview[TFramework] {
    
    var currentRender: Render[TFramework] = js.native
    
    var currentSelection: Selection = js.native
    
    def mainStoryCallbacks(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): ShowError = js.native
    
    def onGetProjectAnnotationsChanged(hasGetProjectAnnotations: `1`): js.Promise[Unit] = js.native
    
    def onKeydown(event: KeyboardEvent): Unit = js.native
    
    def onPreloadStories(ids: js.Array[String]): js.Promise[Unit] = js.native
    
    def onSetCurrentStory(selection: Selection): Unit = js.native
    
    def onUpdateQueryParams(queryParams: Any): Unit = js.native
    
    def renderError(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      hasTitleDescription: Description
    ): Unit = js.native
    
    def renderException(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any,
      err: js.Error
    ): Unit = js.native
    
    def renderMissingStory(): Unit = js.native
    
    def renderSelection(): js.Promise[Unit] = js.native
    def renderSelection(hasPersistedArgs: PersistedArgs): js.Promise[Unit] = js.native
    
    def renderStoryLoadingException(storySpecifier: StorySpecifier, err: js.Error): Unit = js.native
    
    def selectSpecifiedStory(): js.Promise[Unit] = js.native
    
    def teardownRender(render: Render[TFramework]): js.Promise[Unit] = js.native
    def teardownRender(render: Render[TFramework], hasViewModeChanged: ViewModeChanged): js.Promise[Unit] = js.native
    
    var urlStore: UrlStore = js.native
    
    var view: WebView = js.native
  }
  
  type MaybePromise[T] = js.Promise[T] | T
}
