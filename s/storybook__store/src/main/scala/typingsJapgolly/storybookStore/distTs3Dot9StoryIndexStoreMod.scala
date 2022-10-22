package typingsJapgolly.storybookStore

import typingsJapgolly.std.Record
import typingsJapgolly.storybookAddons.mod.Channel
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.StoryIndex
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.StoryIndexEntry
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.StorySpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9StoryIndexStoreMod {
  
  @JSImport("@storybook/store/dist/ts3.9/StoryIndexStore", "StoryIndexStore")
  @js.native
  open class StoryIndexStore () extends StObject {
    def this(hasStories: StoryIndex) = this()
    
    var channel: Channel = js.native
    
    var stories: Record[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any, 
        StoryIndexEntry
      ] = js.native
    
    def storyIdFromSpecifier(specifier: StorySpecifier): String = js.native
    
    def storyIdToEntry(
      storyId: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any
    ): StoryIndexEntry = js.native
  }
}
