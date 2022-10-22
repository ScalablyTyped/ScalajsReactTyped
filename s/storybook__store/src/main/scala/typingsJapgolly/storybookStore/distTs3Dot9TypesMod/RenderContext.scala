package typingsJapgolly.storybookStore.distTs3Dot9TypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.storybookStore.anon.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryIdentifier * / any */ trait RenderContext[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var forceRemount: Boolean
  
  def showError(error: Description): Unit
  
  def showException(err: js.Error): Unit
  
  def showMain(): Unit
  
  var storyContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
  
  var storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
  
  var unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
}
object RenderContext {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    forceRemount: Boolean,
    showError: Description => Callback,
    showException: js.Error => Callback,
    showMain: Callback,
    storyContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any,
    storyFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any,
    unboundStoryFn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
  ): RenderContext[TFramework] = {
    val __obj = js.Dynamic.literal(forceRemount = forceRemount.asInstanceOf[js.Any], showError = js.Any.fromFunction1((t0: Description) => showError(t0).runNow()), showException = js.Any.fromFunction1((t0: js.Error) => showException(t0).runNow()), showMain = showMain.toJsFn, storyContext = storyContext.asInstanceOf[js.Any], storyFn = storyFn.asInstanceOf[js.Any], unboundStoryFn = unboundStoryFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderContext[TFramework]]
  }
  
  extension [Self <: RenderContext[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & RenderContext[TFramework]) {
    
    inline def setForceRemount(value: Boolean): Self = StObject.set(x, "forceRemount", value.asInstanceOf[js.Any])
    
    inline def setShowError(value: Description => Callback): Self = StObject.set(x, "showError", js.Any.fromFunction1((t0: Description) => value(t0).runNow()))
    
    inline def setShowException(value: js.Error => Callback): Self = StObject.set(x, "showException", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setShowMain(value: Callback): Self = StObject.set(x, "showMain", value.toJsFn)
    
    inline def setStoryContext(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryContext<TFramework> */ Any
    ): Self = StObject.set(x, "storyContext", value.asInstanceOf[js.Any])
    
    inline def setStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "storyFn", value.asInstanceOf[js.Any])
    
    inline def setUnboundStoryFn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any
    ): Self = StObject.set(x, "unboundStoryFn", value.asInstanceOf[js.Any])
  }
}
