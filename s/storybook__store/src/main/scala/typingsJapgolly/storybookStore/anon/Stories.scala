package typingsJapgolly.storybookStore.anon

import typingsJapgolly.std.Record
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.StoryIndexEntry
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.V2CompatIndexEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stories extends StObject {
  
  var stories: Record[String, StoryIndexEntry | V2CompatIndexEntry]
  
  var v: Double
}
object Stories {
  
  inline def apply(stories: Record[String, StoryIndexEntry | V2CompatIndexEntry], v: Double): Stories = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories]
  }
  
  extension [Self <: Stories](x: Self) {
    
    inline def setStories(value: Record[String, StoryIndexEntry | V2CompatIndexEntry]): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
  }
}
