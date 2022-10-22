package typingsJapgolly.storybookReact

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ClientPreviewTypes60Mod {
  
  type Meta[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentAnnotations<ReactFramework, TArgs> */ Any
  
  trait ReactFramework extends StObject {
    
    var component: ComponentType[Any]
    
    var storyResult: Element
  }
  object ReactFramework {
    
    inline def apply(component: ComponentType[Any], storyResult: VdomElement): ReactFramework = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], storyResult = storyResult.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactFramework]
    }
    
    extension [Self <: ReactFramework](x: Self) {
      
      inline def setComponent(value: ComponentType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setStoryResult(value: VdomElement): Self = StObject.set(x, "storyResult", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type Story[TArgs] = StoryFn[TArgs]
  
  type StoryFn[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotatedStoryFn<ReactFramework, TArgs> */ Any
  
  type StoryObj[TArgs] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<ReactFramework, TArgs> */ Any
}
