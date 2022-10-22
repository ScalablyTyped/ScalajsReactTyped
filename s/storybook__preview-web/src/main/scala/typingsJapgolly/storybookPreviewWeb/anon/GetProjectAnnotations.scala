package typingsJapgolly.storybookPreviewWeb.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9PreviewMod.MaybePromise
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.ModuleImportFn
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.Path
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.PromiseLike
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.StoryIndex
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.WebProjectAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  def getProjectAnnotations(): MaybePromise[WebProjectAnnotations[TFramework]]
  
  var getStoryIndex: js.UndefOr[js.Function0[StoryIndex]] = js.undefined
  
  var importFn: ModuleImportFn
}
object GetProjectAnnotations {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](
    getProjectAnnotations: CallbackTo[MaybePromise[WebProjectAnnotations[TFramework]]],
    importFn: /* path */ Path => PromiseLike[ModuleExports]
  ): GetProjectAnnotations[TFramework] = {
    val __obj = js.Dynamic.literal(getProjectAnnotations = getProjectAnnotations.toJsFn, importFn = js.Any.fromFunction1(importFn))
    __obj.asInstanceOf[GetProjectAnnotations[TFramework]]
  }
  
  extension [Self <: GetProjectAnnotations[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](x: Self & GetProjectAnnotations[TFramework]) {
    
    inline def setGetProjectAnnotations(value: CallbackTo[MaybePromise[WebProjectAnnotations[TFramework]]]): Self = StObject.set(x, "getProjectAnnotations", value.toJsFn)
    
    inline def setGetStoryIndex(value: CallbackTo[StoryIndex]): Self = StObject.set(x, "getStoryIndex", value.toJsFn)
    
    inline def setGetStoryIndexUndefined: Self = StObject.set(x, "getStoryIndex", js.undefined)
    
    inline def setImportFn(value: /* path */ Path => PromiseLike[ModuleExports]): Self = StObject.set(x, "importFn", js.Any.fromFunction1(value))
  }
}
