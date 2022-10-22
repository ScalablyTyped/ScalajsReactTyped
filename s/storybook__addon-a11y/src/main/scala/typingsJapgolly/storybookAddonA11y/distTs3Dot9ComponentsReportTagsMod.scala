package typingsJapgolly.storybookAddonA11y

import typingsJapgolly.axeCore.mod.TagValue
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportTagsMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Tags", "Tags")
  @js.native
  val Tags: FunctionComponent[TagsProps] = js.native
  
  trait TagsProps extends StObject {
    
    var tags: js.Array[TagValue]
  }
  object TagsProps {
    
    inline def apply(tags: js.Array[TagValue]): TagsProps = {
      val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagsProps]
    }
    
    extension [Self <: TagsProps](x: Self) {
      
      inline def setTags(value: js.Array[TagValue]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: TagValue*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
