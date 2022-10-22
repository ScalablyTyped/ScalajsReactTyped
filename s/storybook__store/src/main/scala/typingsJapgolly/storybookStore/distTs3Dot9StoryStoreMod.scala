package typingsJapgolly.storybookStore

import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.storybookStore.anon.Cache
import typingsJapgolly.storybookStore.anon.CsfFile
import typingsJapgolly.storybookStore.anon.CsfFileCSFFile
import typingsJapgolly.storybookStore.anon.FnCall
import typingsJapgolly.storybookStore.anon.FnCallStoryAnnotationsComponentAnnotationsProjectAnnotations
import typingsJapgolly.storybookStore.anon.GlobalParameters
import typingsJapgolly.storybookStore.anon.ImportFn
import typingsJapgolly.storybookStore.anon.Stories
import typingsJapgolly.storybookStore.anon.StoryId
import typingsJapgolly.storybookStore.distTs3Dot9ArgsStoreMod.ArgsStore
import typingsJapgolly.storybookStore.distTs3Dot9GlobalsStoreMod.GlobalsStore
import typingsJapgolly.storybookStore.distTs3Dot9HooksMod.HooksContext
import typingsJapgolly.storybookStore.distTs3Dot9StoryIndexStoreMod.StoryIndexStore
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.BoundStory
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.CSFFile
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.ExtractOptions
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.NormalizedProjectAnnotations
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.Path
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.Story
import typingsJapgolly.storybookStore.storybookStoreStrings.viewMode
import typingsJapgolly.synchronousPromise.mod.SynchronousPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9StoryStoreMod {
  
  @JSImport("@storybook/store/dist/ts3.9/StoryStore", "StoryStore")
  @js.native
  open class StoryStore[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] () extends StObject {
    
    var args: ArgsStore = js.native
    
    def cacheAllCSFFiles(): PromiseLike[Unit] = js.native
    
    var cachedCSFFiles: js.UndefOr[Record[Path, CSFFile[TFramework]]] = js.native
    
    def cleanupStory(story: Story[TFramework]): Unit = js.native
    
    def componentStoriesFromCSFFile(hasCsfFile: CsfFileCSFFile[TFramework]): js.Array[Story[TFramework]] = js.native
    
    def extract(): Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework> */ Any
      ] = js.native
    def extract(options: ExtractOptions): Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForEnhancers<TFramework> */ Any
      ] = js.native
    
    def fromId(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): BoundStory[TFramework] = js.native
    
    def getSetStoriesPayload(): GlobalParameters = js.native
    
    def getStoriesJsonData(): Stories = js.native
    
    def getStoryContext(story: Story[TFramework]): Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContextForLoaders<TFramework> */ Any, 
        viewMode
      ] = js.native
    
    var globals: GlobalsStore = js.native
    
    var hooks: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        HooksContext[TFramework]
      ] = js.native
    
    var importFn: ModuleImportFn = js.native
    
    var initializationPromise: SynchronousPromise[Unit] = js.native
    
    def initialize(hasStoryIndexImportFnCache: Cache): PromiseLike[Unit] = js.native
    
    def loadAllCSFFiles(): PromiseLike[js.UndefOr[Record[Path, CSFFile[TFramework]]]] = js.native
    
    def loadCSFFileByStoryId(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): PromiseLike[CSFFile[TFramework]] = js.native
    
    def loadStory(hasStoryId: StoryId): js.Promise[Story[TFramework]] = js.native
    
    def onStoriesChanged(hasImportFnStoryIndex: ImportFn): js.Promise[Unit] = js.native
    
    var prepareStoryWithCache: FnCallStoryAnnotationsComponentAnnotationsProjectAnnotations = js.native
    
    var processCSFFileWithCache: FnCall = js.native
    
    var projectAnnotations: NormalizedProjectAnnotations[TFramework] = js.native
    
    def raw(): js.Array[BoundStory[TFramework]] = js.native
    
    def resolveInitializationPromise(): Unit = js.native
    
    def setProjectAnnotations(
      projectAnnotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ): Unit = js.native
    
    def storyFromCSFFile(hasStoryIdCsfFile: CsfFile[TFramework]): Story[TFramework] = js.native
    
    var storyIndex: StoryIndexStore = js.native
  }
}
